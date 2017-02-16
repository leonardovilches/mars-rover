package com.zup.marsrover.command;

import com.zup.marsrover.Rover;

/**
 * @author leonardo
 *
 */
public interface Command {

	public abstract void execute(Rover rover);
}
