import java.lang.String;

/**
 * Models a director.
 */
public class Director {

    private String name;

    /**
     * Constructs a new director.
     * @param n the name of the director
     */
    public Director(String n) {
        name = n;
        System.out.println(name + " is ready");
    }

    /**
     * Directs a play.
     */
    public void directPlayA() {

	// define the participants
        Participant andersLundMadsen;
        Participant madsMikkelsen;
        Participant brittBendixen;
        
        // casting
        System.out.println("Casting...");
        System.out.println("----------------------------");
        andersLundMadsen = new ApprenticeActor("Anders Lund Madsen");
        madsMikkelsen = new ApprenticeActor("Mads Mikkelsen");
        brittBendixen = new Choreographer("Britt Bendixen", madsMikkelsen,
					andersLundMadsen);
        
        // direct the play
        System.out.println();
        System.out.println("The play begins...");
        System.out.println("--------------------");
        andersLundMadsen.clap(2);
        System.out.println();
        madsMikkelsen.turn(3);
        System.out.println();
        brittBendixen.clap(1);
        System.out.println();

        andersLundMadsen.printNumberOfTricks();
        madsMikkelsen.printNumberOfTricks();
        brittBendixen.printNumberOfTricks();
        System.out.println("-------------------------");
    }

    /**
     * Directs a play.
     */    
    public void directPlayB() {
        // define the participants
        Participant soerenPilmark,
	    andersLundMadsen,
	    madsMikkelsen,
	    ghitaNoerby,
	    oleThestrup,
	    brittBendixen;
        
        // casting
        System.out.println("Casting...");
        System.out.println("----------------------------");
        soerenPilmark = new Actor("Soeren Pilmark");
        ghitaNoerby = new CharacterActor("Ghita Noerby");
        oleThestrup = new GrumpyActor("Ole Thestrup");
        andersLundMadsen = new ApprenticeActor("Anders Lund Madsen");
        madsMikkelsen = new ApprenticeActor("Mads Mikkelsen");
        brittBendixen = new Choreographer("Britt Bendixen", oleThestrup,
					ghitaNoerby);
        
        // direct the play
        System.out.println();
        System.out.println("The play begins...");
        System.out.println("--------------------");

        andersLundMadsen.clap(1);
        madsMikkelsen.clap(1);
        brittBendixen.clap(1);
        soerenPilmark.clap(1);
        ghitaNoerby.clap(1);
        oleThestrup.clap(1);

        andersLundMadsen.turn(1);
        madsMikkelsen.turn(1);
        brittBendixen.turn(1);
        soerenPilmark.turn(1);
        ghitaNoerby.turn(1);
        oleThestrup.turn(1);

        andersLundMadsen.printNumberOfTricks();
        madsMikkelsen.printNumberOfTricks();
        brittBendixen.printNumberOfTricks();
        soerenPilmark.printNumberOfTricks();
        ghitaNoerby.printNumberOfTricks();
        oleThestrup.printNumberOfTricks();
        
        System.out.println("-------------------------");
    }


    /**
     * Directs a play.
     */    
    public void directPlayC() {
        // define the participants
        Participant soerenPilmark,
                    ghitaNoerby;
        
        // casting
        System.out.println("Casting...");
        System.out.println("----------------------------");
        soerenPilmark = new Actor("Soeren Pilmark");
        ghitaNoerby = new CharacterActor("Ghita Noerby");
        
        // direct the play
        System.out.println();
        System.out.println("The play begins...");
        System.out.println("--------------------");

        soerenPilmark.clap(2);
        ghitaNoerby.turn(3);

        soerenPilmark.printNumberOfTricks();
        ghitaNoerby.printNumberOfTricks();
        
        System.out.println("-------------------------");
    }
}
