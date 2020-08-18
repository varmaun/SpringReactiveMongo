package com.springwebflux.rmongo.dao;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.springwebflux.rmongo.model.Employee;

import reactor.core.publisher.Flux;
 
public interface EmployeeRepository extends ReactiveMongoRepository<Employee, Integer> {
    @Query("{ 'name': ?0 }")
    Flux<Employee> findByName(final String name);
}