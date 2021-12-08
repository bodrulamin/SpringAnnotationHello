/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.annotation.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainClass {

	public static void main(String[] args) {
//		MessageProvider messageProvider = new ProviderImpl();
//
//		MessagePrinter messagePrinter = new PrinterImpl();
//		messagePrinter.setProvider(messageProvider);
//		messagePrinter.printTheMessage();

//		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:beanconfig.xml");
//		MessagePrinter messagePrinter = (MessagePrinter) context.getBean("printerMachine");
//		messagePrinter.printTheMessage();

ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
context.getBean("Printerx",PrinterImpl.class).printTheMessage();
context.getBean("Printerx",PrinterImpl.class).printTheMessage();

	}

}
