package com.Caso1Backend.back.security.controller;

import com.Caso1Backend.back.security.models.TallerSolicitud;
import com.Caso1Backend.back.service.TallerSolicitudService;
import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/solicitud/")
@CrossOrigin()
public class TallerSolicitudController {
	@Autowired
	TallerSolicitudService solicitudService;
	
	@PostMapping()
    private ResponseEntity<TallerSolicitud> saveSolicitud(@RequestBody TallerSolicitud tallersolicitud){
        try {
           TallerSolicitud solicitud = solicitudService.save(tallersolicitud);
            return ResponseEntity.created(new URI("/solicitud/"+ solicitud.getId_solicitud())).body(solicitud);
            		
            		
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
