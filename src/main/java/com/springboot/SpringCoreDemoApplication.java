package com.springboot;

import com.springboot.couple.Animal;
import com.springboot.couple.Cat;
import com.springboot.couple.Dog;
import com.springboot.couple.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCoreDemoApplication {

	public static void main(String[] args) {
		Animal animal=new Cat();
		Person p=new Person(animal);
		p.playWithAnimal();
		SpringApplication.run(SpringCoreDemoApplication.class, args);
	}

}
