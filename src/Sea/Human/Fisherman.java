package Sea.Human;

public class Fisherman {
    private String greeting;
    private int hookedFishCount;

    Fisherman(String greeting) {
        this.greeting = greeting;
    }

    public void changeGreeting(String newGreeting) {
        this.greeting = newGreeting;
        hookedFishCount = (int) (Math.random()*30);
    }

    public void greet() {
        System.out.println(greeting);
        System.out.println("I already hooked " + hookedFishCount + "\n I know it ain't much, but it's honest work");
    }

    public static void main(String[] args) {

    }
}
