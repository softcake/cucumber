/*
 * Copyright 2018 softcake.org.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.softcake.cucumber.documentation.example;

// tag::exampleDemo[]
/**
 * Demo class
 */
public final class Demo {

    private Demo() {

        throw new IllegalStateException("No instances!");
    }

    public static void checkNotNull(final Object obj) {

        if (obj == null) {
            throw new IllegalArgumentException("Parameter must not be null!");
        }
    }

}
// end::exampleDemo[]