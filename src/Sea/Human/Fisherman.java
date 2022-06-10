package Sea.Human;

public class Fisherman {
    private String greeting;

    Fisherman(String greeting) {
        this.greeting = greeting;
    }

    public void changeGreeting(String newGreeting) {
        this.greeting = greeting;
    }

    public void greet() {
        System.out.println(greeting);
    }

    public static void main(String[] args) {

        System.out.println("Oi Matey");
    }
}
