package org.springframework.boot.study.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @Author huxiaohua
 * @Date 2022/3/16 21:43
 * @Version 1.0
 */
@Configuration
public class StudyConfig {
	@Value("${study.config.name}")
	private String name;
}
