package com.zup.marsrover.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zup.marsrover.Plateau;
import com.zup.marsrover.Rover;

/**
 * @author leonardo
 *
 */
@RestController
@RequestMapping("/rover")
public class RoverController {

	private Rover rover = new Rover();

	public static final String COORDINATE = "/coordinates/x/{x}/y/{y}/direction/{direction}";
	public static final String PLATEAU = "/plateau/x/{x}/y/{y}";
	public static final String COMMAND = "/commands/{commands}";

	@GetMapping(value = COORDINATE)
	public void setCoordinates(@PathVariable int x, @PathVariable int y, @PathVariable String direction) {
		rover.setCoordinateX(x);
		rover.setCoordinateY(y);

		if (direction.equalsIgnoreCase("N") || direction.equalsIgnoreCase("S") || direction.equalsIgnoreCase("E")
				|| direction.equalsIgnoreCase("W")) {

			rover.setDirection(rover.getDirectionSymbol(direction));

		} else {
			rover.validateDirection();
		}
	}

	@GetMapping(value = PLATEAU)
	public void setPlateau(@PathVariable int x, @PathVariable int y) {
		Plateau p = new Plateau(x, y);

		rover.setPlateau(p);
	}

	@GetMapping(value = COMMAND)
	public String setCommands(@PathVariable String commands) {
		return rover.executeCommandList(commands);
	}
}
