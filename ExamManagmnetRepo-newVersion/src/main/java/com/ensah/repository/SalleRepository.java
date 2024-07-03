package com.ensah.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ensah.bo.Departement;
import com.ensah.bo.Salle;
@Repository

public interface SalleRepository extends JpaRepository<Salle, Long> {

}
