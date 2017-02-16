package com.zup.marsrover.exceptions;

public class CommandException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public CommandException() {
		super("Command invalid. Please enter a valid command. The valid commands are L(Left), R(Right), M(Move).");
	}
}
