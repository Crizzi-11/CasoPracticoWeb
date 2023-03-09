
package com.Humanos.Humanos.service;

import com.Humanos.Humanos.entity.Continente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Humanos.Humanos.repository.ContinenteRepository;

/**
 *
 * @author Cristofer
 */

@Service

public class ContinenteService implements IContinenteService{
    
    @Autowired
    private ContinenteRepository continenteRepository;
    
    @Override
    public List<Continente> listCountry() {
        return (List<Continente>)continenteRepository.findAll();
    }
    
}
