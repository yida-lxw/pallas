/**
 * Copyright 2019 vip.com.
 * <p>
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
 * </p>
 */

package com.vip.pallas.search.exception;

/**
 * 需要直接返回对应的httpcode
 * @author freeman.he
 *
 */
@SuppressWarnings("serial")
public class HttpCodeErrorPallasException extends NotPrintStackPallasException {
	private int httpCode;

	//通过设置className和method,可以减少堆栈信息的输出，提升性能
	public HttpCodeErrorPallasException(String message, int httpCode,String className,String method) {
		super(message, Integer.toString(httpCode), className, method);
		this.httpCode = httpCode;
	}
	
	public int getHttpCode() {
		return httpCode;
	}

	
}
