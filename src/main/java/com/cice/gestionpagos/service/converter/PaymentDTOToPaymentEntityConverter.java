package com.cice.gestionpagos.service.converter;

import com.cice.gestionpagos.controller.dto.PaymentDTO;
import com.cice.gestionpagos.repository.entity.PaymentEntity;

import java.util.Date;
import java.util.UUID;

//recibir un DTO y devolver una entidad y para ello creamos un método
public class PaymentDTOToPaymentEntityConverter {

    public static PaymentEntity convert(PaymentDTO paymentDTO){
        PaymentEntity paymentEntity = null;
        paymentEntity = new PaymentEntity()
                .setCreateDate(new Date().toString())
                .setPaymentTransactionId(UUID.randomUUID().toString())
                .setUserId(paymentDTO.getStudentId())
                .setPaymentAmount(paymentDTO.getAmount());
        return paymentEntity;
    }

}
