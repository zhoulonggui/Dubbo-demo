package com.zlg.test.provider;

import java.util.ArrayList;
import java.util.List;

import com.zlg.test.po.User;

/**
 * @Title: DemoServiceImpl.java
 * @Package: com.zlg.test.provider
 * @Description: TODO
 * @author: zhoulonggui
 * @date: 2017年6月17日 下午8:21:26
 * @version: V1.0
 */
public class DemoServiceImpl implements DemoService {

	@Override
	public String sayHello(String name) {
		return "Hello, " + name + ". Welcome!";
	}

	@Override
	@SuppressWarnings("rawtypes")
	public List getUsers() {
		
		List<User> users = new ArrayList<User>(3);
		
		User user1 = new User(1, "张三");
		User user2 = new User(1, "李四");
		User user3 = new User(1, "麻子");
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
		
		return users;
	}

}
