package de.atruvia.simplewebapp.application;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import de.atruvia.simplewebapp.YamlPropertySourceFactory;
import de.atruvia.simplewebapp.demo.PersonAusgabe;
import lombok.Setter;

@Configuration
@PropertySource(value = "classpath:person.yml", factory = YamlPropertySourceFactory.class)
@ConfigurationProperties(prefix = "person")
@Setter
public class PersonConfig {

	private String name;
	private String vorname;
	private String adresse;
	private String ort;
	
	@Bean
	public PersonAusgabe createPersAusgabe() {
		return PersonAusgabe.builder()
			.name(name)
			.vorname (vorname)
			.adresse(adresse)
			.ort(ort)
			.build();
	}
}
