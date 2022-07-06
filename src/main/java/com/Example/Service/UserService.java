package com.Example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.Example.Entity.User;
import com.Example.Repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public User saveUser(User user) {

		User save = userRepository.save(user);

		return save;

	}

	public String getpostal() {

		String s = "https://api.postalpincode.in/pincode/401105";

		WebClient webClient = WebClient.create();

		String string = webClient.get().uri(s).accept(MediaType.APPLICATION_JSON).retrieve().bodyToMono(String.class)
				.block();
		return string;


	}
}
