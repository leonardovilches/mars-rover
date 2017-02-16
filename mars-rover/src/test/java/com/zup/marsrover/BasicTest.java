package com.zup.marsrover;

import com.zup.marsrover.direction.Direction;

public abstract class BasicTest {
	
	protected Rover roverExpected = new Rover();
	protected Plateau plateauExpected = new Plateau(5, 5);
	protected String commandsExpected = "LMLMLMLMM";
	protected Direction direction;
	protected int coordinateX = 1;
	protected int coordinateY = 2;
	protected String outPutExpected = "1 3 N";
	
	protected Rover roverExpected2 = new Rover();
	protected Plateau plateauExpected2 = new Plateau(5, 5);
	protected String commandsExpected2 = "MMRMMRMRRM";
	protected Direction direction2;
	protected int coordinateX2 = 3;
	protected int coordinateY2 = 3;
	protected String outPutExpected2 = "5 1 E";
}
