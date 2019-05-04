package com.cice.gestionpagos.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

//@Data - genera Setters y Getters, hashcode, equals, en base a los parametros q
//tiene definida la clase
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class PaymentDTO {

    private Long operationId;
    private String studentId;
    private String transactionId;
    private Double amount;
    private Boolean paymentStatus;
}
