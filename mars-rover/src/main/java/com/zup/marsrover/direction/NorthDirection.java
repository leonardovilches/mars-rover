package com.zup.marsrover.direction;

import com.zup.marsrover.Rover;

/**
 * @author leonardo
 *
 */
public class NorthDirection implements Direction{

	@Override
	public Direction turnLeft() {
		return new WestDirection();
	}

	@Override
	public Direction turnRight() {
		return new EastDirection();
	}

	@Override
	public void move(Rover rover) {
		rover.setCoordinateY(rover.getCoordinateY() + 1);
	}

	@Override
	public String toString() {
		return "N";
	}
}
