package com.zup.marsrover.exceptions;

public class DirectionException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public DirectionException() {
		super("Please enter a valid direction: The valid direction are N(North), S(South), E(East), W(West)");
	}
}
