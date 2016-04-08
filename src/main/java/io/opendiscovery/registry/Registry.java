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

package io.opendiscovery.registry;

import java.util.List;

import io.opendiscovery.Service;

/**
 */
//TODO: name: DiscoveryClient?
public interface Registry {
	/**
	 * Register a service instance
	 * @param service
	 */
	//TODO: options parameter? <? extends Service>?
	//TODO: throw exception if unable to register?
	void register(Service service);

	/**
	 * Deregister a service instance
	 * @param service
	 */
	//TODO: throw exception if unable to deregister?
	void deregister(Service service);

	/**
	 * Retrieve instances of a service
	 * @param name
	 * @return
	 */
	//TODO: name: discover?
	//TODO: reactive? streaming?
	List<Service> getService(String name);

	/**
	 * Return the names of all registered services
	 * @return
	 */
	List<String> getServices();
}
