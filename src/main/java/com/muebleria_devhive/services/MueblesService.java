package com.muebleria_devhive.services;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.muebleria_devhive.models.Mueble;

import reactor.core.publisher.Mono;

@Service
public class MueblesService {
	
	private final String uri = "http://localhost:8080/inmuebles/";
	
	private final WebClient webClient;
	
	public MueblesService(WebClient.Builder webClientBuilder) {
		this.webClient = webClientBuilder.baseUrl(uri).build();
	}
	
	public List<Mueble> getMuebles() {
		Mono<Object[]> response = this.webClient.get().accept(MediaType.APPLICATION_JSON)
				  .retrieve().bodyToMono(Object[].class).log();
		
		Object[] objects = response.block();
		
		ObjectMapper mapper = new ObjectMapper();
		
		return Arrays.stream(objects)
				  .map(object -> mapper.convertValue(object, Mueble.class))
				  .collect(Collectors.toList());
	}
	
}
