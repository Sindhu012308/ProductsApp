package com.example.springmvc.springmvc.boot;

import com.example.springmvc.springmvc.model.Product;
import com.example.springmvc.springmvc.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    //To save Products
    @Override
    public void run(String... args) throws Exception {
        //Details of Product1
        Product product1 = new Product();
        product1.setName("Milky Bar");
        product1.setDescription("Milky Bar with chocolate and hazzlenut");
        product1.setType("CANDIES");
        product1.setCategory("BARS");
        product1.setPrice(1.99);
        //Saving Product1
        productRepository.save(product1);

        //Details of Product2
        Product product2 = new Product();
        product2.setName("Almond Bar");
        product2.setDescription("Almond Bar with chocolate and honey");
        product2.setType("CANDIES");
        product2.setCategory("BARS");
        product2.setPrice(2.99);
        //Saving Product2
        productRepository.save(product2);

        //Details of Product3
        Product product3 = new Product();
        product3.setName("Dairy Milky");
        product3.setDescription("Dairy Milky with chocolate and Milk");
        product3.setType("CANDIES");
        product3.setCategory("BARS");
        product3.setPrice(3.99);
        //Saving Product3
        productRepository.save(product3);

    }
}
