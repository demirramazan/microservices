package com.udacity.dogmicroservice.repository;

import com.udacity.dogmicroservice.entity.Dog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DogRepository extends JpaRepository<Dog, Long> {
}
