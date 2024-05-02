package com.telescoping.constr.anti.pattern.flavors.of.object;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum CarrotsAndPeas {
	
	CARROTS("carrots"),
	PEAS("peas"),
	PATTY("Carrots&Peas Patty");
	
	private final String title;
	
	private CarrotsAndPeas(String title) {
		this.title = title;
	}

	
	
}
