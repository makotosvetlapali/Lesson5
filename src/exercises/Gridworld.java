package exercises;

import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

/* 
 * Use the Gridworld Reference document in the "doc" directory to complete the following tasks;
 * 
 * 1. Figure out how to get the World to show.
 * 2. Figure out how to add a Bug to the world (clue: you will need the Bug and Location objects)
 * 3. Add another bug at a random location in the world.
 * 4. Change the color of that bug to blue.
 * 5. Make the bug face to the right.
 * 6. Add flowers to the left and right of the bug.
 * 7. Fill the whole world with flowers!
*/

public class Gridworld {

	public static void main(String[] args) {
		World<Actor> gridWorld = new World<Actor>();
		gridWorld.show();

		Bug bug1 = new Bug();
		Location pos1 = new Location(1, 1);
		gridWorld.add(pos1, bug1);

		Random rand = new Random();
		int a = rand.nextInt(9) + 1;
		int b = rand.nextInt(9) + 1;

		Location pos2 = new Location(a, b);

		Bug bug2 = new Bug(Color.CYAN);
		bug2.turn();
		bug2.turn();
		gridWorld.add(pos2, bug2);

		Flower rose = new Flower(Color.RED);
		Location pos3 = new Location(1, 3);
		Location pos4 = new Location(5, 2);
		gridWorld.add(pos3, rose);
		gridWorld.add(pos4, rose);

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				Location pos5 = new Location(i, j);
				gridWorld.add(pos5, rose);
			}
		}

	}
}
