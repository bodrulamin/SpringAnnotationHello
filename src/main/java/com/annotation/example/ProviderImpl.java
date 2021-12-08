/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.annotation.example;

/**
 *
 * @author b
 */
public class ProviderImpl implements MessageProvider{
 int count = 0;
	@Override
	public String getMessage() {
		count++;
		return "this the message you want " + count;
	}
	
}
