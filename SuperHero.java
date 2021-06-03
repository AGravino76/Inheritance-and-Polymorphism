public class SuperHero extends Person{

    public static int totalNumberVillainsCaught = 0;

    private String superHeroName;
    private String superPower;
    private String catchphrase;
    private String sound;

    public SuperHero(String name, int age, String food, String superHeroName, String superPower, String catchphrase, String sound){
        super(name, age, food);
        this.superHeroName = superHeroName;
        this.superPower = superPower;
        this.catchphrase = catchphrase;
        this.sound = sound;
    }

    public void setSuperHeroName(String superHeroName){
        this.superHeroName = superHeroName;
    }

    public void setSuperPower(String superPower){
        this.superPower = superPower;
    }

    public void setCatchphrase(String catchphrase){
        this.catchphrase = catchphrase;
    }

    public void setSound(String sound){
        this.sound = sound;
    }

    public String getSuperHeroName(){
        return superHeroName;
    }

    public String getSuperPower(){
        return superPower;
    }

    public String getCatchphrase(){
        return catchphrase;
    }

    public String getSound(){
        return sound;
    }

    public void speak(){
        System.out.println(catchphrase + " I'll have to pull out " + superPower + " on you! " + sound);
    }

    public static void catchVillain(){
        totalNumberVillainsCaught++;
    }

    public static void villainsCaught(){
        System.out.println("Number of villains caught is: " + totalNumberVillainsCaught);
    }

    @Override
    public String toString(){
        return "My superhero name is " + superHeroName + ", my super power is " + superPower + ", and my catchphrase is ''" + catchphrase + "'' "
        + super.toString();
    }
}