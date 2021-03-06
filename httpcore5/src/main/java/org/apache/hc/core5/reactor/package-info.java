/*
 * ====================================================================
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Apache Software Foundation.  For more
 * information on the Apache Software Foundation, please see
 * <http://www.apache.org/>.
 *
 */

/**
 * Event driven network communication APIs loosely based on
 <a href="http://gee.cs.oswego.edu/dl/">Doug Lea</a>'s
 <a href="http://gee.cs.oswego.edu/dl/cpjslides/nio.pdf">reactor pattern</a>.
 <p>
 This API is not specific to HTTP communication. However, it is minimal
 in the sense that it defines only what is required within the scope
 of HTTP protocol.
 */
package org.apache.hc.core5.reactor;
