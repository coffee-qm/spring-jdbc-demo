package com.coffee.common.db.demo;

import java.io.File;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coffee.common.common.exp.SvcException;
import com.coffee.common.db.demo.service.impl.DemoSvcImpl;

public class Demo {

	public static void main(final String[] args) {
		final String path = "classpath:conf/spring/applicationContext.xml";
		System.out.println("path:" + path);
		System.out.println("exists:" + new File(path).exists());
		final String[] configLocations = new String[] { path };
		@SuppressWarnings("resource")
		final ApplicationContext ctx = new ClassPathXmlApplicationContext(
				configLocations);
		final DemoSvcImpl demoSvc = (DemoSvcImpl) ctx.getBean("demoSvc");
		try {
			demoSvc.query();
		} catch (final SvcException e) {
			e.printStackTrace();
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}
}
