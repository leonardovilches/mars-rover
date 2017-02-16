package com.zup.marsrover.command;

import com.zup.marsrover.Rover;

/**
 * @author leonardo
 *
 */
public class TurnRight implements Command{

	@Override
	public void execute(Rover rover) {
		rover.turnRight();
	}

}
