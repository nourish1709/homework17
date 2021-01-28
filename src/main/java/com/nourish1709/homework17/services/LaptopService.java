package com.nourish1709.homework17.services;

import com.nourish1709.homework17.dao.LaptopRepository;
import com.nourish1709.homework17.entities.Laptop;
import com.nourish1709.homework17.utils.Generator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository laptopRepository;

    public void addLaptops(int amount) {
        for (int i = 0; i < amount; i++) {
            laptopRepository.save(
                    new Laptop(Generator.getModel(), Generator.getManufacturer(), Generator.getCpu(),
                            Generator.getMemory(), Generator.getUsed(), Generator.getMaterial(),
                            Generator.getPrice(), Generator.getDate()));
        }
    }

    public Iterable<Laptop> getAll() {
        return laptopRepository.findAll();
    }

    public Iterable<Laptop> getAllSorted() {
        return laptopRepository.findLaptopByOrderByManufacturerDesc();
    }

    public Iterable<Laptop> getAllWithLargeMemory() {
        return laptopRepository.findLaptopByMemoryGreaterThanEqual(16);
    }

    public Iterable<Laptop> getAllUsed() {
        return laptopRepository.findLaptopByUsedEquals(true);
    }
}
