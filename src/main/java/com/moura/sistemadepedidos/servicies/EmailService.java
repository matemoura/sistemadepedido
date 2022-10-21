package com.moura.sistemadepedidos.servicies;

import org.springframework.mail.SimpleMailMessage;

import com.moura.sistemadepedidos.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
