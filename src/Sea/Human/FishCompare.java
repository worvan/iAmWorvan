package Sea.Human;

import Sea.Fish.SimpleFish;

public class FishCompare {

    public static void main(String[] args) {
        SimpleFish[] fishPool = new SimpleFish[5];
        String fishName[] = {"Carp", "Carp", "Pollock", "Shark", "Swordfish"};

        for (int i = 0; i < fishPool.length; i++) {
            fishPool[i] = new SimpleFish(fishName[i]);
        }

        System.out.println( fishName[0] == fishName[1] ); //peeks into stringpool and is equal
        System.out.println( fishName[0] == new String("Carp") ); //compares value with address, which is false

        System.out.println( fishPool[0] == fishPool[1] ); //looks at hashCode/address, which is different
        System.out.println( fishPool[0].equals(fishPool[1]) ); //compares fishName

    }
}
