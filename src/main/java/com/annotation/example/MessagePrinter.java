/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.annotation.example;

/**
 *
 * @author b
 */
public interface MessagePrinter {

	void printTheMessage();

	void setProvider(MessageProvider provider);

	MessageProvider getProvider();
}

