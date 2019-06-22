package com.scope;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Service;
@Service
@Scope("prototype")   //prototype表示每次调用新建一个Bean实例,这解释了结果中p1为什么不同于p2
public class Prototype {
	public String saya(String word) {
		return ("hello" + word + " ?");
		
	}
}
