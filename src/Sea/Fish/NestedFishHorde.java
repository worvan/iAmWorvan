package Sea.Fish;

public class NestedFishHorde {

    private void doBlackMagic() {
        class BlackMagicFish {
            private BlackMagicFish() {}
            static class NestedBlackMagic {} //Guy teaching this says it is not possibruuu... wtf? 2.19
        }
    }

    public static void main(String[] args) {
        int i = 0;
        class LocalFish {
            {
                if(i > 1) { System.out.println("Running before constructor, runs every time, but I hide that after 1st run"); }
                //i += 1; cannot do that! (would i should be final)
            }
            public LocalFish() {
                System.out.println("Fish born");
                if(Math.random() > 0.1) { System.out.println("this one is really nice"); }
                //i += 1; also cannot do that
            }
        }

        int hordeSize = (int) (Math.random()*50);
        LocalFish[] horde = new LocalFish[hordeSize];
        for (int j = 0; j < hordeSize; j++) {
            horde[j] = new LocalFish();
        }

        if(hordeSize < 10) { System.out.println("not really much of them");
        } else if(hordeSize >= 10 ) { System.out.println("could be a bigger horde");
        } else if(hordeSize >= 30 ) { System.out.println("nice haul this year");
        } else if(hordeSize >= 45 ) { System.out.println("who is going to eat all of those!"); }

        NestedFishHorde nf = new NestedFishHorde();
        nf.doBlackMagic();
    }
}
