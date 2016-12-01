/*
 * Copyright (c) OSGi Alliance (2012, 2015). All Rights Reserved.
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

package org.osgi.service.jaxrs.whiteboard;

import java.nio.file.DirectoryStream.Filter;
import org.osgi.service.jaxrs.runtime.JaxRSServiceRuntimeConstants;

/**
 * Defines standard constants for the JAX-RS Whiteboard services.
 * 
 * @author $Id: e94aefad35bbbaf2b3918b0af9361742ad2c9a7b $
 */
public final class JaxRSWhiteboardConstants {
	private JaxRSWhiteboardConstants() {
		// non-instantiable
	}

	/**
	 * Service property specifying the name of a JAX-RS resource.
	 * 
	 * <p>
	 * This name is provided as a property on the registered Endpoint service so
	 * that the URI for a particular JAX-RS service can be identified. If this
	 * service property is not specified, then no Endpoint information will be
	 * registered for this resource.
	 * 
	 * <p>
	 * Resource names should be unique among all resource service associated
	 * with a single Whiteboard implementation.
	 * 
	 * <p>
	 * The value of this service property must be of type {@code String}.
	 */
	public static final String	JAX_RS_RESOURCE_NAME		= "osgi.jaxrs.name";

	/**
	 * Service property specifying the base URI mapping for a JAX-RS resource
	 * service.
	 * 
	 * <p>
	 * The specified uri is used to determine whether a request should be mapped
	 * to the resource. Services without this service property are ignored.
	 * 
	 * <p>
	 * The value of this service property must be of type {@code String}, and
	 * will have a "/" prepended if no "/" exists.
	 */
	public static final String	JAX_RS_RESOURCE_BASE		= "osgi.jaxrs.resource.base";

	/**
	 * Service property specifying the request mappings for a JAX-RS filter
	 * service.
	 * 
	 * <p>
	 * The specified patterns are used to determine whether a request should be
	 * mapped to the filter. Filter services without this service property are
	 * ignored.
	 * 
	 * <p>
	 * The value of this service property must be of type {@code String},
	 * {@code String[]}, or {@code Collection<String>}.
	 */
	public static final String	JAX_RS_FILTER_BASE			= "osgi.jaxrs.filter.base";

	/**
	 * Service property specifying the request mappings for a JAX-RS interceptor
	 * service.
	 * 
	 * <p>
	 * The specified patterns are used to determine whether a request should be
	 * mapped to the interceptor. Interceptor services without this service
	 * property are ignored.
	 * 
	 * <p>
	 * The value of this service property must be of type {@code String},
	 * {@code String[]}, or {@code Collection<String>}.
	 */
	public static final String	JAX_RS_INTERCEPTOR_BASE		= "osgi.jaxrs.interceptor.base";

	/**
	 * Service property specifying the target filter to select the JAX-RS
	 * Whiteboard implementation to process the service.
	 * 
	 * <p>
	 * A JAX-RS Whiteboard implementation can define any number of service
	 * properties which can be referenced by the target filter. The service
	 * properties should always include the
	 * {@link JaxRSServiceRuntimeConstants#JAX_RS_SERVICE_ENDPOINT
	 * osgi.http.endpoint} service property if the endpoint information is
	 * known.
	 * 
	 * <p>
	 * If this service property is not specified, then all JAX-RS Whiteboard
	 * implementations can process the service.
	 * 
	 * <p>
	 * The value of this service property must be of type {@code String} and be
	 * a valid {@link Filter filter string}.
	 */
	public static final String	JAX_RS_WHITEBOARD_TARGET	= "osgi.jaxrs.whiteboard.target";
}
