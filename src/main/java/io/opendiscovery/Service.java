/**
 * Copyright 2016 The OpenDiscovery Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package io.opendiscovery;

import java.util.Map;

/**
 * @author Spencer Gibb
 */
//ServiceInstance? Instance?
public interface Service {
	/**
	 * @return the Name as registered
	 */
	String getName();

	/**
	 * @return the hostname of the registered ServiceInstance
	 */
	String getHostname();

	/**
	 * @return the port of the registered ServiceInstance
	 */
	int getPort();

	/**
	 * @return the key value pair metadata associated with the service instance
	 */
	Map<String, String> getMetadata();
}
