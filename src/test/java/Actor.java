public class Actor {

    String FirstName;
    String LastName;
    public Actor(String firstName, String lastName) {
        this.FirstName = firstName;
        this.LastName = lastName;
        System.out.println("CONSTRUCTOR CALLED");
    }

    public void act() {
        System.out.println("Acting..");
    }
    public void play() {
        System.out.println ("Playing...");

    }
}
