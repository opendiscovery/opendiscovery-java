/*
 Copyright 2016 The OpenCoordination Authors

 Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 in compliance with the License. You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software distributed under the License
 is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 or implied. See the License for the specific language governing permissions and limitations under
 the License.
 */

//TODO: move to separate modules?
package io.opencoordination.loadbalancer;

import io.opencoordination.Service;

/**
 * Represents a client side load balancer
 * @author Spencer Gibb
 */
public interface LoadBalancer {
	/**
	 * Choose a ServiceInstance from the LoadBalancer for the specified service
	 * @param name the service name to look up the LoadBalancer
	 * @return a ServiceInstance that matches the serviceId
	 */
	Service choose(String name);
}
