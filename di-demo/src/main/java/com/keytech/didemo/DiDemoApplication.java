package com.keytech.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.keytech.didemo.Controllers.ConstructorInjector;
import com.keytech.didemo.Controllers.MyController;
import com.keytech.didemo.Controllers.PropertyInjectedController;
import com.keytech.didemo.Controllers.SetterInjectedController;
import com.keytech.didemo.ExampleBeans.FakeDataSource;

@SpringBootApplication
@ComponentScan(basePackages = {"com.keytech", "com.keytech.didemo.ExampleBeans"})
public class DiDemoApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
		
		MyController controller = (MyController) ctx.getBean("myController");
		
		FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUser());
		
	}

}
