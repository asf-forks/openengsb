/**
 * Licensed to the Austrian Association for Software Tool Integration (AASTI)
 * under one or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information regarding copyright
 * ownership. The AASTI licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openengsb.core.common.communication;

/**
 * Since there's always the propability that a remote service fails because e.g. the network is down or the remote side
 * does not answer this exception is used during the ports implementation to indicate serious problems in that way.
 */
@SuppressWarnings("serial")
public class RemoteCommunicationException extends RuntimeException {

    public RemoteCommunicationException() {
        super();
    }

    public RemoteCommunicationException(String message, Throwable cause) {
        super(message, cause);
    }

    public RemoteCommunicationException(String message) {
        super(message);
    }

    public RemoteCommunicationException(Throwable cause) {
        super(cause);
    }

}