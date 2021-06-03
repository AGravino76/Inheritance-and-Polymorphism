public class SuperheroDemo{
    public static void main(String[] args) {
        Person nicky = new Person("Nicholas", 18, "a Chicken Sandwich");
        Person niko = new Person("Nicholas", 18, "a Chicken Sandwich");
        SuperHero jack = new SuperHero("Jack Bean", 24, "Justice served on a cold platter", "Killer Bean", "guns", "I'm trying to get some sleep!", "*pap pap*");
        SuperHero robert = new SuperHero("Robert Parr", 51, "Chocolate Cake", "Mr. Incredible", "superstrength", "Yeah, I've got time.", "*fwTANG*");

        //showing off that sweet toString method
        System.out.println(nicky);
        System.out.println(niko);
        System.out.println(jack);
        System.out.println(robert);

        SuperHero.catchVillain();
        SuperHero.villainsCaught();

        if(nicky.equals(niko)){
            System.out.println("Nicky is the same as Niko.");
        }
        else{
            System.out.println("Nicky is not the same as Niko.");
        }

        if(jack.equals(robert)){
            System.out.println("Jack is the same as Robert.");
        }
        else{
            System.out.println("Jack is not the same as Robert.");
        }

        jack.speak();
        robert.speak();
    }   
}