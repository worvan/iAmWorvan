package Sea.Fish;

public class StringFish {
    //TODO Equals, intern(), concat, charsets

    static class SmallStringFish {
        public String toString() {
            return "Small string fish";
        }
    }

    public static void main(String[] args) {
        final String fishInput = "Whale, Pollock, Carp, Swordfish";
        final String nullFish = null;

        final int num = 10;

        String whale = fishInput.substring(0, 5);
        System.out.println(whale);

        String nullAndWhale = nullFish + whale;
        System.out.println(nullAndWhale); // prints out "nullWhale"

        //nullAndWhale = nullFish.concat(whale); // cannot do that

        var smallFish = new SmallStringFish();
        String toStringExample;
        //toStringExample = smallFish; //doesn't call toString
        toStringExample = String.valueOf(smallFish); //this does
        toStringExample = "" + smallFish; //and this also does

        System.out.println("Summoning fish! And?... "+toStringExample);

        String fishcountConcat = num + num + " vs " + num + num; //eval left to right, int + string -> string
        System.out.println(fishcountConcat);

        fishcountConcat = String.valueOf(num + num);
        fishcountConcat += num + num;
        System.out.println("same wrong approach as before "+fishcountConcat);

        fishcountConcat = num + num + " you can use brackets and sum will be correct " + (num + num);
        System.out.println(fishcountConcat);

    }
}
