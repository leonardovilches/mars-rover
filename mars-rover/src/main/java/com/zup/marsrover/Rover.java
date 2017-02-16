package com.zup.marsrover;

import java.util.ArrayList;

import com.zup.marsrover.command.Command;
import com.zup.marsrover.command.Move;
import com.zup.marsrover.command.TurnLeft;
import com.zup.marsrover.command.TurnRight;
import com.zup.marsrover.direction.Direction;
import com.zup.marsrover.direction.EastDirection;
import com.zup.marsrover.direction.NorthDirection;
import com.zup.marsrover.direction.SouthDirection;
import com.zup.marsrover.direction.WestDirection;
import com.zup.marsrover.exceptions.CommandException;
import com.zup.marsrover.exceptions.DirectionException;
import com.zup.marsrover.exceptions.RoverException;

/**
 * @author leonardo
 *
 */
public class Rover {

	private int coordinateX, coordinateY;
	private Direction direction;
	private Plateau plateau;

	public Rover() {
	}

	public Rover(int coordinateX, int coordinateY, Direction direction, Plateau plateau) {
		this.plateau = plateau;
		this.coordinateX = coordinateX;
		this.coordinateY = coordinateY;
		this.direction = direction;
	}

	public Direction getDirectionSymbol(String direction) {
		Direction d = null;
		if (direction.equalsIgnoreCase("N"))
			d = new NorthDirection();
		else if (direction.equalsIgnoreCase("S"))
			d = new SouthDirection();
		else if (direction.equalsIgnoreCase("E"))
			d = new EastDirection();
		else
			d = new WestDirection();
		return d;
	}

	public String executeCommandList(String command) {
		ArrayList<Command> commands = this.buildCommandList(command.trim().toCharArray());
		for (Command c : commands)
			c.execute(this);

		return String.format("%d %d %s", coordinateX, coordinateY, direction.toString());
	}

	public ArrayList<Command> buildCommandList(char[] array) {
		ArrayList<Command> command = new ArrayList<Command>();
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 'L' || array[i] == 'l')
				command.add(new TurnLeft());
			else if (array[i] == 'R' || array[i] == 'r')
				command.add(new TurnRight());
			else
				command.add(new Move());
		}
		return command;
	}

	public void validateCoordinates() {
		if (this.getCoordinateX() > this.getPlateau().getUpperBoundCoordinateX()
				|| this.getCoordinateY() > this.getPlateau().getUpperBoundCoordinateY()
				|| this.getCoordinateX() < this.getPlateau().getLowerBoundCoordinateX()
				|| this.getCoordinateY() < this.getPlateau().getLowerBoundCoordinateY())
			throw new RoverException();
	}

	public void validateDirection() {
		throw new DirectionException();
	}

	public void validateCommand() {
		throw new CommandException();
	}

	public void turnRight() {
		direction = this.getDirection().turnRight();
	}

	public void turnLeft() {
		direction = this.getDirection().turnLeft();
	}

	public void move() {
		this.getDirection().move(this);
	}

	public int getCoordinateX() {
		return coordinateX;
	}

	public void setCoordinateX(int coordinateX) {
		this.coordinateX = coordinateX;
		this.validateCoordinates();
	}

	public int getCoordinateY() {
		return coordinateY;
	}

	public void setCoordinateY(int coordinateY) {
		this.coordinateY = coordinateY;
		this.validateCoordinates();
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public Plateau getPlateau() {
		return plateau;
	}

	public void setPlateau(Plateau plateau) {
		this.plateau = plateau;
	}
}
