package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.JaegerServerService;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/jaeger/server")
public class JaegerController {

	private JaegerServerService jaegerServerService;

	public JaegerController(JaegerServerService  jaegerServerService) {
		super();
		this.jaegerServerService=jaegerServerService;
	}

	@GetMapping("/{id}")
	public Mono<String> get(@PathVariable("id") Integer id) {
		return jaegerServerService.get(id);
	}
}
