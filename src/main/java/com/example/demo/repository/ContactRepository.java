package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Contacts;

@Repository
public interface ContactRepository extends CrudRepository<Contacts, Integer> {

}
