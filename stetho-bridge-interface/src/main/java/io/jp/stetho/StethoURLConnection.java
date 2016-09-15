/*
 * Copyright (c) 2016, JP Wang
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */
package io.jp.stetho;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/**
 * @author jpwang
 * @since 09/15/2016
 *
 * Source code - https://github.com/jp-wang/
 */
public interface StethoURLConnection {
    void preConnect(HttpURLConnection urlConnection, byte[] request);

    void postConnect(HttpURLConnection urlConnection);

    void postFailed(IOException e);

    InputStream interpretResponseStream(InputStream inputStream);
}
