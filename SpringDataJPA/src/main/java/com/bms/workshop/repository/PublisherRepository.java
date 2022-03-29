package com.bms.workshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bms.workshop.model.Publisher;

public interface PublisherRepository extends JpaRepository<Publisher, Integer> {

}
