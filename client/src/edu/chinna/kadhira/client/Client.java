package edu.chinna.kadhira.client;

import edu.chinna.kadhira.api.Calculator;
import java.util.ServiceLoader;
import java.util.ServiceConfigurationError;
import java.util.Iterator;
import static java.lang.System.out;
import static java.util.ServiceLoader.load;

class Client {
	public static void main(String[] args){
		
		var calcServiceLoader  = load(Calculator.class);
		
		calcServiceLoader.stream()
		.map(ServiceLoader.Provider::get)
		.forEach( a -> out.println(" "+ a.add(8,4)));
				
		calcServiceLoader.stream()
		.map(ServiceLoader.Provider::get)
		.forEach( a -> out.println(" "+ a.add(2,4)));
	}
}