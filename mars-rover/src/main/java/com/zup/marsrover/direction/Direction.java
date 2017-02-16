package com.zup.marsrover.direction;

import com.zup.marsrover.Rover;

/**
 * @author leonardo
 *
 */
public interface Direction {

	public abstract Direction turnLeft();
	
	public abstract Direction turnRight();
	
	public abstract void move(Rover rover);
	
}
