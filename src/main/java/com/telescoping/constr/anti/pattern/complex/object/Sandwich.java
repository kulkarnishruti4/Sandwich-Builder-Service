package com.telescoping.constr.anti.pattern.complex.object;

import com.telescoping.constr.anti.pattern.flavors.of.object.CarrotsAndPeas;
import com.telescoping.constr.anti.pattern.flavors.of.object.Cheese;
import com.telescoping.constr.anti.pattern.flavors.of.object.Chicken;
import com.telescoping.constr.anti.pattern.flavors.of.object.Lettuce;
import com.telescoping.constr.anti.pattern.flavors.of.object.Onion;
import com.telescoping.constr.anti.pattern.flavors.of.object.Tomato;

 public record Sandwich (String name, Lettuce lettuce, CarrotsAndPeas carrotsPeas, Cheese cheese, Tomato tomato, Onion onion, Chicken chicken) {

	
	 Sandwich(Builder builder) {

		this(builder.name, builder.lettuce, builder.carrotsPeas, builder.cheese, builder.tomato, builder.onion, builder.chicken);
	
	}
	

	 @Override
	  public String toString() {

	    var sb = new StringBuilder();
	    sb.append("This is a Sandwich")
	        .append(" named ")
	        .append(name)
	        .append(" with Lettuce and ");
	    	if (cheese != null) 
	    		sb.append("  Cheese and ");
	    	if (chicken != null) 
	    		sb.append("  chicken and ");
	    	if (tomato != null) 
	    		sb.append("  tomato and ");
	    	if (onion != null) 
	    	    sb.append("  onion and ");
	    	if (carrotsPeas != null) 
	    		sb.append("  carrots & peas ");
	    sb.append('.');
	    return sb.toString();
	  }


public static class Builder {

	
	 final String name; 
	 final Lettuce lettuce; 
	
	  CarrotsAndPeas carrotsPeas; 
	  Cheese cheese; 
	  Tomato tomato; 
	  Onion onion; 
	  Chicken chicken;
	
	/*
	 * mandatory fields constructor, sandwich name & lettuce - minimum order
	 */
	public Builder (String name, Lettuce lettuce) {
		
		if(name == null || lettuce == null) {
			throw new IllegalArgumentException("Cannot make a Sandwich");
		}
		this.name = name;
		this.lettuce = lettuce;
	}
	
	public Builder withCarrotsAndPeas(CarrotsAndPeas carrotsPeas) {
		this.carrotsPeas = carrotsPeas;
		return this;
	}
	
	public Builder withCheese (Cheese cheese) {
		this.cheese = cheese;
		return this;
	}
	
	public Builder withTomatoes (Tomato tomato) {
		this.tomato = tomato;
		return this;
	}
	
	public Builder withOnion (Onion onion) {
		this.onion = onion;
		return this;
	}
	
	public Builder withChicken (Chicken chicken) {
		this.chicken = chicken;
		return this;
	}
	
	
	public Sandwich buildMySandwich() {
		
		return new Sandwich(this);
		
		}
	

	
	}
}
