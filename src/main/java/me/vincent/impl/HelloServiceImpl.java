package me.vincent.impl;

import me.vincent.IGreetingsService;

public class HelloServiceImpl implements IGreetingsService {

	public String say(String name) {
		// TODO Auto-generated method stub
		return String.format("Hello %s!", name);
	}

}
