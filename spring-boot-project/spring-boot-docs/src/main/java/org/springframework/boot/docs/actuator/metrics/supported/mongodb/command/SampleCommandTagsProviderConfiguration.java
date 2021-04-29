/*
 * Copyright 2012-2021 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.boot.docs.actuator.metrics.supported.mongodb.command;

import com.mongodb.event.CommandEvent;
import io.micrometer.core.instrument.Tag;
import io.micrometer.core.instrument.binder.mongodb.MongoCommandTagsProvider;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
public class SampleCommandTagsProviderConfiguration {

	@Bean
	MongoCommandTagsProvider customCommandTagsProvider() {
		return new CustomCommandTagsProvider();
	}

}
// @chomp:file

class CustomCommandTagsProvider implements MongoCommandTagsProvider {

	@Override
	public Iterable<Tag> commandTags(CommandEvent commandEvent) {
		return java.util.Collections.emptyList();
	}

}