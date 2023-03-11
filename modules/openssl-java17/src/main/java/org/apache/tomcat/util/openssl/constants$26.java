/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by jextract

package org.apache.tomcat.util.openssl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$26 {

    static final FunctionDescriptor ENGINE_free$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle ENGINE_free$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "ENGINE_free",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$26.ENGINE_free$FUNC, false
    );
    static final FunctionDescriptor ENGINE_load_private_key$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle ENGINE_load_private_key$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "ENGINE_load_private_key",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$26.ENGINE_load_private_key$FUNC, false
    );
    static final FunctionDescriptor ENGINE_set_default$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle ENGINE_set_default$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "ENGINE_set_default",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$26.ENGINE_set_default$FUNC, false
    );
    static final FunctionDescriptor OCSP_cert_to_id$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle OCSP_cert_to_id$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "OCSP_cert_to_id",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$26.OCSP_cert_to_id$FUNC, false
    );
    static final FunctionDescriptor OCSP_request_add0_id$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle OCSP_request_add0_id$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "OCSP_request_add0_id",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$26.OCSP_request_add0_id$FUNC, false
    );
    static final FunctionDescriptor OCSP_response_status$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle OCSP_response_status$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "OCSP_response_status",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$26.OCSP_response_status$FUNC, false
    );
}


