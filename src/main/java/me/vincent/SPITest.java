package me.vincent;

import java.util.Iterator;
import java.util.ServiceLoader;

public class SPITest {

	public static void main(String[] args) {
		ServiceLoader<IGreetingsService> serviceLoader = ServiceLoader.load(IGreetingsService.class);
		Iterator<IGreetingsService> greetingsServiceIterator = serviceLoader.iterator();
		while(greetingsServiceIterator.hasNext()) {
			IGreetingsService greetingService = greetingsServiceIterator.next();
			System.out.println(greetingService.say("Vincent"));
		}
	}

}
