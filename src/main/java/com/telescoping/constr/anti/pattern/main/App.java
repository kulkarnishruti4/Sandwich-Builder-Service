package com.telescoping.constr.anti.pattern.main;

import java.util.logging.Logger;

import com.telescoping.constr.anti.pattern.complex.object.Sandwich;
import com.telescoping.constr.anti.pattern.flavors.of.object.CarrotsAndPeas;
import com.telescoping.constr.anti.pattern.flavors.of.object.Cheese;
import com.telescoping.constr.anti.pattern.flavors.of.object.Chicken;
import com.telescoping.constr.anti.pattern.flavors.of.object.Lettuce;
import com.telescoping.constr.anti.pattern.flavors.of.object.Onion;
import com.telescoping.constr.anti.pattern.flavors.of.object.Tomato;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * Program Entry Point
 * 
 * 
 */

@Slf4j
public class App {
	
	
	public static void main(String[] args) {
		
		final Logger logger = Logger.getLogger(App.class.getName());
		
		
		var veggieDelight = new Sandwich.Builder("Veggie Delight", Lettuce.REGULAR)
					.withCarrotsAndPeas(CarrotsAndPeas.PATTY)
					.withCheese(Cheese.TOASTED)
					.withTomatoes(Tomato.REGULAR)
					.withOnion(Onion.EXTRA)
					.buildMySandwich();
		
		logger.info(veggieDelight.toString());
		
		
		var chickenMaharaja = new Sandwich.Builder("Chicken Maharaja", Lettuce.REGULAR)
					.withChicken(Chicken.FRIED)
					.withCheese(Cheese.EXTRA)
					.withOnion(Onion.EXTRA)
					.buildMySandwich();
		
		
		logger.info(chickenMaharaja.toString());
		
	}
	

}
