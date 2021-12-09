package com.Caso1Backend.back.security.repository;

import com.Caso1Backend.back.security.models.TallerSolicitud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface TallerSolicitudRepository extends JpaRepository<TallerSolicitud, Integer>{

}
