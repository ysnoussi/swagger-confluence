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
package net.slkdev.swagger.confluence.exception;

public class SwaggerConfluenceInternalSystemException extends RuntimeException {

    public SwaggerConfluenceInternalSystemException() {
        super();
    }

    public SwaggerConfluenceInternalSystemException(String message) {
        super(message);
    }

    public SwaggerConfluenceInternalSystemException(String message, Throwable cause) {
        super(message, cause);
    }

    public SwaggerConfluenceInternalSystemException(Throwable cause) {
        super(cause);
    }

    protected SwaggerConfluenceInternalSystemException(String message, Throwable cause,
                                               boolean enableSuppression,
                                               boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
