package de.atruvia.simplewebapp.demo;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Builder
public class PersonAusgabe {

	private String name;
	private String vorname;
	private String adresse;
	private String ort;
	
	@PostConstruct
	public void init() {
		System.out.println(toString());
	}
}
