package com.nourish1709.homework17;

import com.nourish1709.homework17.entities.Laptop;
import com.nourish1709.homework17.services.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Homework17Application implements CommandLineRunner {

    @Autowired
    private LaptopService laptopService;

    public static void main(String[] args) {
        SpringApplication.run(Homework17Application.class, args);
    }

    @Override
    public void run(String... args) {
        laptopService.addLaptops(20);

        System.out.println("\n\t[...all laptops in database...]\n");
        for (Laptop laptop : laptopService.getAll()) {
            System.out.println(laptop);
        }

        System.out.println("\n\t[...all laptops ordered by manufacturer in descending order...]\n");
        for (Laptop laptop : laptopService.getAllSorted()) {
            System.out.println(laptop);
        }

        System.out.println("\n\t[...all laptops with a memory greater than or equals 16GB...]\n");
        for (Laptop laptop : laptopService.getAllWithLargeMemory()) {
            System.out.println(laptop);
        }

        System.out.println("\n\t[...all laptops that were used before...]\n");
        for (Laptop laptop : laptopService.getAllUsed()) {
            System.out.println(laptop);
        }

        System.out.println();
    }
}
