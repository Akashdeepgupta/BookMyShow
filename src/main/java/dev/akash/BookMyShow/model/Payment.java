package dev.akash.BookMyShow.model;

import dev.akash.BookMyShow.model.constants.PaymentMode;
import dev.akash.BookMyShow.model.constants.PaymentStatus;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

public class Payment extends BaseModel{
    private LocalDateTime paymentTime;
    private String refernceId;
    @ManyToOne
    private Ticket ticket;
    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;
    @Enumerated(EnumType.STRING)
    private PaymentMode paymentMode;
}
