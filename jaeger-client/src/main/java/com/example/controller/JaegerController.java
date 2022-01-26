package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.JaegerClientService;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/jaeger/client")
public class JaegerController {

	private JaegerClientService jaegerClientService;

	public JaegerController(JaegerClientService jaegerClientService) {
		super();
		this.jaegerClientService = jaegerClientService;
	}

	@GetMapping("/{id}")
	public Mono<String> get(@PathVariable("id") Integer id) {
		return jaegerClientService.get(id);
	}
}
