package com.hospitalDetails.prmDemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospitalDetails.prmDemo.entities.Appointment;
@Repository
public interface AppointmentDao extends JpaRepository<Appointment, Integer> {

}
