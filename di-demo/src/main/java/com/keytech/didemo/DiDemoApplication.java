package com.keytech.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.keytech.didemo.Controllers.MyController;
import com.keytech.didemo.Controllers.PropertyInjectedController;
import com.keytech.didemo.Controllers.SetterInjectedController;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
		
		MyController controller = (MyController) ctx.getBean("myController");
		
		controller.hello();
		
		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
		//System.out.println(ctx.getBean("propertyInjectedController").sayHello());
		
		PropertyInjectedController pController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		String preacherString = pController.sayHello();
		System.out.println(preacherString+" there there");
		
		
		
	}

}
