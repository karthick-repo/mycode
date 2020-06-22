package com.wipro.application;

import org.springframework.data.repository.CrudRepository;

public interface CardsDao extends CrudRepository<CardDetails, String> {

}
