package com.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
public static void main(String[] args) {
	AnnotationConfigApplicationContext context = 
			new AnnotationConfigApplicationContext(ScopeConfig.class);
	
	Single s1 = context.getBean(Single.class);
	Single s2 = context.getBean(Single.class);

	Prototype p1 = context.getBean(Prototype.class);
	Prototype p2 = context.getBean(Prototype.class);
	
	System.out.println("Does s1 equal to s2: " + s1.equals(s2));
	System.out.println("Does p1 equal to p2: " + p1.equals(p2));

	context.close();
}
}