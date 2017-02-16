package com.zup.marsrover.direction;

import com.zup.marsrover.Rover;

/**
 * @author leonardo
 *
 */
public class WestDirection implements Direction{

	@Override
	public Direction turnLeft() {
		return new SouthDirection();
	}

	@Override
	public Direction turnRight() {
		return new NorthDirection();
	}

	@Override
	public void move(Rover rover) {
		rover.setCoordinateX(rover.getCoordinateX() - 1);
	}

	@Override
	public String toString() {
		return "W";
	}
}
