package com.nourish1709.homework17.dao;

import com.nourish1709.homework17.entities.Laptop;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LaptopRepository extends CrudRepository<Laptop, Integer> {

    List<Laptop> findLaptopByOrderByManufacturerDesc();

    List<Laptop> findLaptopByMemoryGreaterThanEqual(int memory);

    List<Laptop> findLaptopByUsedEquals(boolean used);

}
