
package com.Humanos.Humanos.controller;



import com.Humanos.Humanos.entity.Dato;
import com.Humanos.Humanos.entity.Continente;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.Humanos.Humanos.service.IDatoService;
import com.Humanos.Humanos.service.IContinenteService;

/**
 *
 * @author Cristofer
 */

@Controller
public class DatoController {
    
    @Autowired
    private IDatoService datoService;
    
    @Autowired
    private IContinenteService continenteService;
    
    @GetMapping("/dato")
    public String index(Model model){
        List<Dato> listaDato = datoService.getAllDato();
        model.addAttribute("titulo", "Tabla Dato");
        model.addAttribute("datos", listaDato);
        return "datos";
    }
    
    @GetMapping("/datoN")
    public String crearDato(Model model){
        List<Continente> listaContinentes = continenteService.listCountry();
        model.addAttribute("datos", new Dato());
        model.addAttribute("continentes", listaContinentes);
        return "crear";
    }
    
    
     @GetMapping("/delete/{id}")
    public String eliminarDato(@PathVariable("id") Long idDato){
        datoService.delete(idDato);
        return  "redirect:/dato";
    }
    
    
    @PostMapping("/save")
    public String guardarDato(@ModelAttribute Dato dato){
    datoService.saveDato(dato);
    return "redirect:/dato";
    }
    
    @GetMapping("/editDato/{id}")
    public String editarDato(@PathVariable("id") Long idDato, Model model){
    Dato dato = datoService.getDatoById(idDato);
    List<Continente> listaContinentes = continenteService.listCountry();
    model.addAttribute("datos", dato);
    model.addAttribute("continentes", listaContinentes);
    return  "crear";
    }
    
    
    
    
    
    
    
    
    
    
}
