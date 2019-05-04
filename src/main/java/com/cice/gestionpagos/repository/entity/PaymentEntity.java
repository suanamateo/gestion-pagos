package com.cice.gestionpagos.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "payment")
@NoArgsConstructor
@AllArgsConstructor
//@@Accessors - para poder concatenar metodos al objeto creado
@Accessors(chain = true)
public class PaymentEntity {

    //@Id - Clave primaria
    @Id
    //@GeneratedValue - Valor autogenrado por la bbdd
    @GeneratedValue
    private Long paymentId;
    private String userId;
    private String paymentTransactionId;
    private Double paymentAmount;
    private String createDate;
    private String updateDate;
    private Boolean paymentStatus;

}
