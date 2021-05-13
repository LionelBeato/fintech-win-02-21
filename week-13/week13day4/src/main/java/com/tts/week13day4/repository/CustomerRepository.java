package com.tts.week13day4.repository;

import com.tts.week13day4.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    // we can make a method that finds by last name

}
