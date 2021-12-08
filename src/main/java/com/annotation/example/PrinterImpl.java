/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.annotation.example;

/**
 *
 * @author b
 */
public class PrinterImpl implements MessagePrinter {

	private MessageProvider provider;

	@Override
	public void printTheMessage() {

		System.out.println(provider.getMessage());
	}

	@Override
	public void setProvider(MessageProvider provider) {
		this.provider = provider;
	}

	@Override
	public MessageProvider getProvider() {
		return provider;
	}

}
