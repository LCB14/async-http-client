/*
 * Copyright 2013 Ray Tsang
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.asynchttpclient.extra;

import org.asynchttpclient.HttpResponseBodyPart;

public class HttpResponseBodyPartProgress implements HttpProgress {
    private final HttpResponseBodyPart part;

    public HttpResponseBodyPartProgress(HttpResponseBodyPart part) {
        this.part = part;
    }

    public HttpResponseBodyPart getPart() {
        return part;
    }

    @Override
    public String toString() {
        return "HttpResponseBodyPartProgress [part=" + part + "]";
    }
}
