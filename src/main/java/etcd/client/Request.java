/*
 *   Copyright (c) 2014 Intellectual Reserve, Inc.  All rights reserved.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */
package etcd.client;

/**
 * Represents a request to the etcd cluster.
 */
public interface Request {

	// TODO Add a send method that has a timeout.

	/**
	 * Sends the request to the etcd cluster and blocks until the response is received. This method may be invoked
	 * multiple times and will send multiple requests to the etcd cluster.
	 *
	 * @return the result of the request.
	 */
	Result send();

	/**
	 * Sends the request to the etcd cluster and invokes the {@code consumer} callback when the response is received.
	 * This method does not block. This method may be invoked multiple times and will send multiple requests to the
	 * etcd cluster.
	 *
	 * @param listeners optional list of listeners that will be invoked when the request completes.
	 */
	EtcdFuture sendAsync(EtcdListener... listeners);

}
