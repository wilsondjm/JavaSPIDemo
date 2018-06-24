package me.vincent.impl;

import me.vincent.IGreetingsService;

public class ByeByeServiceImpl implements IGreetingsService {

	@Override
	public String say(String name) {
		return String.format("ByeBye %s!", name);
	}

}
