/*
 * Copyright (C) 2015 Samsung Electronics Co., Ltd.
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
 */

package io.samsungsami.example.samiiotsimplemonitor;

import org.java_websocket.handshake.ServerHandshake;

public interface WebsocketEvents {

    public void onOpen(ServerHandshake handshakedata);

    public void onMessage(String message);

    public void onClose(int code, String reason, boolean remote);

    public void onError(Exception ex);
}
