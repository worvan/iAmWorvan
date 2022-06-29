package Sea.Fish;

public class StringFish {

    static class SmallStringFish {
        public String toString() {
            return "Small string fish";
        }
    }

    static void staticDemo() {
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

    void stringSimpleConcatDemo() {
        String whiteSpaceFish = " ";

        boolean fishPresence = !whiteSpaceFish.isEmpty();
        boolean isJustWhitespace = whiteSpaceFish.isBlank();

        System.out.println("is the fish there? " + fishPresence + "\nIs the fish blank? "+ isJustWhitespace );

    }

    void searchDemo(String pattern) {
        final String fishInput = "Whale, Pollock, Carp, Swordfish";
        String resultMsg = "No fish like that found";

//        var toFind = "Pollock";
        var toFind = pattern;

        int foundIndex = fishInput.lastIndexOf(toFind);
        if (foundIndex > -1) {
            resultMsg = "found "+toFind+" on index: "+foundIndex;
        }
        System.out.println(resultMsg);
    }

    void joinDemo() {
        final String fishInput = "Whale, Pollock, Carp, Swordfish";
        String resultMsg = "Types of fish I do have now: ";

        resultMsg = resultMsg.join(" ", resultMsg, fishInput);
        System.out.println(resultMsg);
    }

    void trimStripDemo() {
        final String fishInput = " \n \tWhale, Pollock, Carp, Swordfish          ";
        String resultMsg;
        resultMsg = fishInput.trim();
        System.out.println("trim: "+ resultMsg); //cuts of everything lower than U+0020

        resultMsg = fishInput.strip();
        System.out.println("strip (preffered): "+ resultMsg); //character.isWhitespace: tried stuff like \u00A0 but it does not trim... it's a scam :D
    }

    void stringBuilderDemo() {
        final String fishInput = "Whale, Pollock, Carp, Swordfish";
        StringBuilder sb = new StringBuilder(fishInput);
        StringBuilder sb2 = new StringBuilder(fishInput);

        System.out.println("sb==sb2 "+ (sb==sb2));
        System.out.println("sb.equals(sb2) "+ sb.equals(sb2));
        System.out.println("sb.compareTo(sb2) "+ sb.compareTo(sb2));
        System.out.println("sb.toString() == sb2.toString() "+ (sb.toString() == sb2.toString()));
        System.out.println("sb.toString().equals(sb2.toString()) "+ sb.toString().equals(sb2.toString()));

        //sb2.getChars(0,5,new char[5], 0);


    }

    public static void main(String[] args) {
        //StringFish.staticDemo();
        var sf = new StringFish();

        //sf.stringSimpleConcatDemo();
        //sf.searchDemo("Carp");
        //sf.joinDemo();
        //sf.trimStripDemo();
        sf.stringBuilderDemo();
    }
}
