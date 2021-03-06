package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

@Controller
@SpringBootApplication
@EnableWebSocket
public class SampleController {

	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Hello World! 8081";
	}
	@GetMapping("/show")
	String show() {
		return "show";
	}

	@GetMapping("/index")
	String index() {
		return "index";
	}

	@GetMapping("/test")
	String test() {
		return "test";
	}

	@GetMapping("/xiu")
	String xiu() {
		return "xiu";
	}

	@GetMapping("/live")
	String live() {
		return "live";
	}

	@GetMapping("/ball")
	String ball() {
		return "ball";
	}

	@GetMapping("/shoot")
	String shoot() {
		return "shoot";
	}

	@GetMapping("/snake")
	String snake() {
		return "snake";
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SampleController.class, args);
	}

	@Bean
	public ServerEndpointExporter serverEndpointExporter() {
		return new ServerEndpointExporter();
	}

	@Bean
    public OnlineServer onlienServerEndpoint() {
        return new OnlineServer();
    }

    @Bean
    public ChatRoom chatRoomEndpoint() {
        return new ChatRoom();
    }
}