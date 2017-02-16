package com.zup.marsrover.command;

/**
 * @author leonardo
 *
 */
public enum FindCommand {

	R(new TurnLeft()),
	
	L(new TurnRight()),
	
	M(new Move());
	
	private final Command command;

	public Command getCommand() {
		return command;
	}

	private FindCommand(Command command) {
		this.command = command;
	}
}
