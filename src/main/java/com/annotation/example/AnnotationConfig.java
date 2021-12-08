/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.annotation.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnotationConfig {

	@Bean
	public MessageProvider getProvider() {

 return new ProviderImpl();
	}

	@Bean
	public MessagePrinter Printerx() {

		MessagePrinter printer = new PrinterImpl();
		printer.setProvider(getProvider());
		return printer;
	}

}
