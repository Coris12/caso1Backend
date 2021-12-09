package com.Caso1Backend.back.service;

import com.Caso1Backend.back.security.models.TallerInforme;
import com.Caso1Backend.back.security.repository.TallerInformeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TallerInformeService {
@Autowired
TallerInformeRepository informe;
public <S extends TallerInforme> S save(S entity) {
    return informe.save(entity);
}
}
