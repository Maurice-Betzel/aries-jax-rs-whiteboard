/*
 * Copyright (c) OSGi Alliance (2012, 2014). All Rights Reserved.
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

package org.osgi.service.jaxrs.runtime.dto;

import org.osgi.dto.DTO;

/**
 * Represents the services used to process a specific request.
 * 
 * @NotThreadSafe
 * @author $Id: f4057465a154262be95874eda521be22f20626ff $
 */
public class RequestInfoDTO extends DTO {
	/**
	 * The path of the request relative to the root.
	 */
	public String			path;

	/**
	 * The service id of the servlet context processing the request represented
	 * by this DTO.
	 */
	public long				servletContextId;

	/**
	 * The JAX-RS filters processing this request. If no filters are called for
	 * processing this request, an empty array is returned.
	 */
	public FilterDTO[]		filterDTOs;

	/**
	 * The JAX-RS interceptors processing this request. If no interceptors are
	 * called for processing this request, an empty array is returned.
	 */
	public InterceptorDTO[]	interceptorDTOs;

	/**
	 * The resource processing this request.
	 */
	public ResourceDTO		servletDTO;
}
