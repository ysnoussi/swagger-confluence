/*
 * Copyright 2016 Aaron Knight
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.slkdev.swagger.confluence.gradle.plugin;

import net.slkdev.swagger.confluence.config.SwaggerConfluenceConfig;
import net.slkdev.swagger.confluence.context.SwaggerConfluenceContextConfig;
import net.slkdev.swagger.confluence.service.SwaggerToConfluenceService;
import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwaggerConfluenceGradleTask extends DefaultTask {

    @TaskAction
    public void swaggerConfluence() {
        final AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(SwaggerConfluenceContextConfig.class);
        final SwaggerToConfluenceService swaggerToConfluenceService =
                annotationConfigApplicationContext.getBean(SwaggerToConfluenceService.class);
        final SwaggerConfluenceConfig swaggerConfluenceConfig = getProject().getExtensions().findByType(SwaggerConfluenceConfig.class);
        swaggerToConfluenceService.convertSwaggerToConfluence(swaggerConfluenceConfig);
        annotationConfigApplicationContext.close();
    }

}
