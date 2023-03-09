/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Humanos.Humanos.service;

import com.Humanos.Humanos.entity.Dato;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Humanos.Humanos.repository.DatoRepository;

/**
 *
 * @author Cristofer
 */
@Service
public class DatoService implements IDatoService{
    
    @Autowired
    private DatoRepository datoRepository;
    
    @Override
    public List<Dato> getAllDato(){
    return (List<Dato>)datoRepository.findAll();
    }
    
    @Override
    public  Dato getDatoById(long id){
    return datoRepository.findById(id).orElse(null);
    }
    
    @Override
    public void  saveDato(Dato dato){
    datoRepository.save(dato);
    }
    
    @Override
    public void delete(long id){
    datoRepository.deleteById(id);
    }

   
    
}
