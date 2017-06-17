package com.zlg.test.provider;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title: TestProvider.java
 * @Package: com.zlg.test.provider
 * @Description: TODO
 * @author: zhoulonggui
 * @date: 2017年6月17日 下午8:33:58
 * @version: V1.0
 */
public class TestProvider {

	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(  
                new String[] { "applicationContext.xml" });  
        context.start();  
        System.in.read(); // 为保证服务一直开着，利用输入流的阻塞来模拟  
	}
}
