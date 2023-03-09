/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Humanos.Humanos.repository;
import com.Humanos.Humanos.entity.Continente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Cristofer
 * paisRepository
 */
@Repository
public interface ContinenteRepository extends CrudRepository<Continente,Long >{
    
    
}
