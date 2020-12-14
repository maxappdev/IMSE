package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;





@Configuration
@PropertySource(value = { "classpath:application.properties" })
@EnableJpaRepositories
@EnableAutoConfiguration
class DemoApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(
                DemoApplication.class);

        ProductRepository repository = context
                .getBean(ProductRepository.class);

        Product product = new Product();
        product.setDescription("HDD");
        repository.save(product);

        Iterable<Product> products = repository.findAll();

        System.out.println("Products found with findAll():");
        System.out.println("-------------------------------");
        for (Product pr : products) {
            System.out.println(pr);
        }
        context.close();
    }
}
/*package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
       // SpringApplication.run(DemoApplication.class, args);

        ConfigurableApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
        ProductRepository repo = ctx.getBean(ProductRepository.class);
        Product product = new Product();
        product.setDescription("HDD");
        repo.save(product);

    }

   // @CrossOrigin
    //@RequestMapping("/helloworld")
    //public String hello(){return "Hello World, from your Rest-Api. Please implement me!";
    //}

}

*/