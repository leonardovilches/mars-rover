package com.zup.marsrover.direction;

import com.zup.marsrover.Rover;

/**
 * @author leonardo
 *
 */
public class EastDirection implements Direction{

	@Override
	public Direction turnLeft() {
		return new NorthDirection();
	}

	@Override
	public Direction turnRight() {
		return new SouthDirection();
	}

	@Override
	public void move(Rover rover) {
		rover.setCoordinateX(rover.getCoordinateX() + 1);
	}

	@Override
	public String toString() {
		return "E";
	}
}
