package com.springboot;

import com.springboot.couple.Animal;
import com.springboot.couple.Cat;
import com.springboot.couple.Dog;
import com.springboot.couple.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import test.Test;

@SpringBootApplication
@ComponentScan(basePackages = {"com.springboot","test"})
public class SpringCoreDemoApplication {

	public static void main(String[] args) {
		// 1. about the beans
		// 2. about dependency
		// 3. where to search the beans

		/*Animal animal=new Cat();
		Person p=new Person(animal);
		p.playWithAnimal();*/
		ApplicationContext context = SpringApplication.run(SpringCoreDemoApplication.class, args);
		Person personBean=context.getBean(Person.class);
		personBean.playWithAnimal();
		Test testBean=context.getBean(Test.class);
		testBean.testing();
	}

}
