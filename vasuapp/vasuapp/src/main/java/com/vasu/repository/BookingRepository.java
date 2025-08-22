package com.vasu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vasu.entities.CustomerDetailEntity;

@Repository
public interface BookingRepository extends JpaRepository<CustomerDetailEntity, Long>{

}
