package com.zup.marsrover;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.zup.marsrover.command.Command;
import com.zup.marsrover.direction.EastDirection;
import com.zup.marsrover.direction.NorthDirection;
import com.zup.marsrover.direction.SouthDirection;
import com.zup.marsrover.direction.WestDirection;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MarsRoverTests extends BasicTest {

	@Test
	public void multipleCommandAndExecuteTests() {
		ArrayList<Command> commands = roverExpected.buildCommandList(commandsExpected.trim().toCharArray());
		assertEquals(commandsExpected.length(), commands.size());
	}

	@Test
	public void multipleCommandAndExecuteTests2() {
		ArrayList<Command> commands = roverExpected2.buildCommandList(commandsExpected2.trim().toCharArray());
		assertEquals(commandsExpected2.length(), commands.size());
	}

	@Test
	public void executeCommandTest1() {
		roverExpected.setDirection(new NorthDirection());
		roverExpected.setPlateau(plateauExpected);
		roverExpected.setCoordinateX(coordinateX);
		roverExpected.setCoordinateY(coordinateY);
		assertEquals(outPutExpected, roverExpected.executeCommandList(commandsExpected));
	}

	@Test
	public void executeCommandTest2() {
		roverExpected2.setDirection(new EastDirection());
		roverExpected2.setPlateau(plateauExpected2);
		roverExpected2.setCoordinateX(coordinateX2);
		roverExpected2.setCoordinateY(coordinateY2);
		assertEquals(outPutExpected2, roverExpected2.executeCommandList(commandsExpected2));
	}

	@Test
	public void setDirectionNorth() {
		direction = new NorthDirection();
	}

	@Test
	public void setDirectionSouth() {
		direction = new SouthDirection();
	}

	@Test
	public void setDirectionEast() {
		direction = new EastDirection();
	}

	@Test
	public void setDirectionWest() {
		direction = new WestDirection();
	}
}
