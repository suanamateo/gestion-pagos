package com.cice.gestionpagos.service.impl;

import com.cice.gestionpagos.controller.dto.PaymentDTO;
import com.cice.gestionpagos.repository.PaymentRepository;
import com.cice.gestionpagos.repository.entity.PaymentEntity;
import com.cice.gestionpagos.service.PaymentService;
import com.cice.gestionpagos.service.converter.PaymentDTOToPaymentEntityConverter;
import com.cice.gestionpagos.service.converter.PaymentEntityToPaymentDTOConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Esta clase hay q anotarla como un servicio @Service y se genera la lógica en
//el método
@Service
public class PaymentServiceImpl implements PaymentService {

    //@Autowired - Spring con esta anotación buscará una clase q meter dentro
    //de este contenedor
    //Una de las cosas que hace es - generar instancias de objetos
    @Autowired
    PaymentRepository paymentRepository;

    @Override
    public PaymentDTO generatePayment(PaymentDTO paymentDTO) {
        PaymentDTO generatedPaymentDTO = null;

        PaymentEntity paymentEntity = PaymentDTOToPaymentEntityConverter.convert(paymentDTO);
        paymentEntity = paymentRepository.save(paymentEntity);

        generatedPaymentDTO = PaymentEntityToPaymentDTOConverter.convert(paymentEntity);

        return generatedPaymentDTO;
    }
}
