package Trololo;

public class AnglerFish {

    public void badFormatting() {
        var isFish = true;
        var isReallyAFish = true;
        //badly formatted/designed to confuse
        if(isFish)
            if(isReallyAFish) System.out.println("Yea, it's really a fish");
        else System.out.println("Semms like fish, but it is not");
        //here especially
        isReallyAFish = false;
        if(isFish)
            if(isReallyAFish) System.out.println("Yea, it's really a fish");
        else System.out.println("Semms like fish, but it is not");
        else System.out.println("It's not a fish");
    }


    public static void main(String[] args) {
        AnglerFish af = new AnglerFish();
        af.badFormatting();
    }
}
