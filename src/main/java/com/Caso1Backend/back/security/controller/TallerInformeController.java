package com.Caso1Backend.back.security.controller;

import com.Caso1Backend.back.security.models.TallerInforme;
import com.Caso1Backend.back.service.TallerInformeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.net.URI;
@RestController

@RequestMapping("/informe/")
@CrossOrigin()
public class TallerInformeController  {
	@Autowired
	TallerInformeService taller;
	
	@PostMapping()
    private ResponseEntity<TallerInforme> saveInforme(@RequestBody TallerInforme tallerinforme){
        try {
            TallerInforme informe = taller.save(tallerinforme);
            return ResponseEntity.created(new URI("/informe/"+ informe.getId_InformeTaller())).body(informe);
            		
            		
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
