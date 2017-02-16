package com.zup.marsrover.direction;

import com.zup.marsrover.Rover;

/**
 * @author leonardo
 *
 */
public class SouthDirection implements Direction{

	@Override
	public Direction turnLeft() {
		return new EastDirection();
	}

	@Override
	public Direction turnRight() {
		return new WestDirection();
	}

	@Override
	public void move(Rover rover) {
		rover.setCoordinateY(rover.getCoordinateY() - 1);
	} 
	
	@Override
	public String toString() {
		return "S";
	}
}
