package com.zup.marsrover.direction;

/**
 * @author leonardo
 *
 */
public enum FollowDirection {
	
	E(0, "E"),
	N(1, "N"),
	W(2, "W"),
	S(3, "S");
	
	private static final FollowDirection[] followDirection = FollowDirection.values();
	private final int id;
	private final String description;

	private FollowDirection(int id, String description) {
		this.id = id;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}
	
	public static FollowDirection getByDescription(String description){
		for(FollowDirection d : followDirection){
			if(d.getDescription().equals(description)){
				return d;
			}
		}
		return null;
	}
	
}
