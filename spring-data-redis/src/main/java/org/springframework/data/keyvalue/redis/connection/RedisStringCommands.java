/*
 * Copyright 2010 the original author or authors.
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

package org.springframework.data.keyvalue.redis.connection;

import java.util.List;
import java.util.Map;

/**
 * String specific commands supported by Redis.
 * 
 * @author Costin Leau
 */
public interface RedisStringCommands {

	void set(byte[] key, byte[] value);

	byte[] get(byte[] key);

	byte[] getSet(byte[] key, byte[] value);

	List<byte[]> mGet(byte[]... keys);

	Boolean setNX(byte[] key, byte[] value);

	void setEx(byte[] key, long seconds, byte[] value);

	void mSet(Map<byte[], byte[]> tuple);

	void mSetNX(Map<byte[], byte[]> tuple);

	Long incr(byte[] key);

	Long incrBy(byte[] key, long value);

	Long decr(byte[] key);

	Long decrBy(byte[] key, long value);

	Long append(byte[] key, byte[] value);

	byte[] substr(byte[] key, long start, long end);
}
