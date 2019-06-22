package com.scope;
import org.springframework.stereotype.Service;
@Service  // 相当于@Scope("Singleton")。Singleton表示一个Spring容器中只有一个Bean实例，全容器共享。
public class Single {
public String say(String word) {
	return ("hello" + word + " !");
	
}
}

