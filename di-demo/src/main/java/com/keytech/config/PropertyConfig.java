package com.keytech.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

import com.keytech.didemo.ExampleBeans.FakeDataSource;

@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

	@Autowired
	Environment env;
	
	@Value("${keyman.username}")
	String user;
	@Value("${keyman.password}")
	String password;
	@Value("${keyman.dburl}")
	String url;
	
	@Bean
	public FakeDataSource fakeDataSource() {
		FakeDataSource fakeDataSource = new FakeDataSource();
		fakeDataSource.setUser(env.getProperty("USERNAME"));
		fakeDataSource.setPassword(password);
		fakeDataSource.setUrl(url);
		return fakeDataSource;
	}
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
		PropertySourcesPlaceholderConfigurer placeholderConfigurer = new PropertySourcesPlaceholderConfigurer();
		return placeholderConfigurer;
	}
	
}
