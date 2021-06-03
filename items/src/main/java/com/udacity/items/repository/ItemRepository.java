package com.udacity.items.repository;

import com.udacity.items.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource
public interface ItemRepository extends JpaRepository<Item, Integer> {
}
