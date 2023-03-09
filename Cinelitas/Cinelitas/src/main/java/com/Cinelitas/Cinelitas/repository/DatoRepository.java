/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Humanos.Humanos.repository;

import com.Humanos.Humanos.entity.Dato;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Cristofer
 */
@Repository
public interface DatoRepository extends CrudRepository<Dato, Long>{
    
}
