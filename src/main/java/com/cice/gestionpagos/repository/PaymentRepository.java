package com.cice.gestionpagos.repository;

import com.cice.gestionpagos.repository.entity.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//JpaRopository - extender interfaz de jpa - implementacion hecha en spring,
//Metódos tienen declarados pero no definidos esas interfaces generando beans

@Repository
public interface PaymentRepository extends JpaRepository<PaymentEntity, Long> {

}
