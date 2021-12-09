package com.Caso1Backend.back.service;

import com.Caso1Backend.back.security.models.TallerSolicitud;
import com.Caso1Backend.back.security.repository.TallerSolicitudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class TallerSolicitudService {
	@Autowired
	TallerSolicitudRepository solicitud;
	public <S extends TallerSolicitud> S save(S entity) {
	    return solicitud.save(entity);
	}
}
