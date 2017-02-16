package com.zup.marsrover.exceptions;

public class RoverException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public RoverException(){
		super("The Rover can't out of the plateau. Please enter a valid coordinate.");
	}
	
}
