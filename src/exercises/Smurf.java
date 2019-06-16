package exercises;

/* 
 * 1. Watch this smurf cartoon: https://www.youtube.com/watch?v=RqbpzEHuO2g
 * 2. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name.
 * 
 * 5. Make a Papa Smurf and print his name, hat color and girl or boy.
 * 6. Make a Smurfette and print her name, hat color and girl or boy. */

public class Smurf {

	private String name;

	Smurf(String name) {
		this.name = name;
	}

	public String getName() {
		return "My name is " + name + " Smurf.";
	}

	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}

	/* Papa Smurf wears a red hat, all the others are white. */
	public String getHatColor() {
		// 3. Fill in this method
		if (name == "Papa") {
			return name + " This smurf wears a red hat.";
		} else {
			return name + " This smurf wears a white hat.";
		}

	}


	/* Smurfette is the only female Smurf  magically created from clay by Gargamel. */
	public String isGirlOrBoy() {
		// 4. Fill in this method
		 if (this.name.equalsIgnoreCase("Smurfette")) {
      	   System.out.println("This smurf is a girl");
         } else {
      	   System.out.println("This smurf is Gargamel's pawn");
         }
         return "";
	}

}


