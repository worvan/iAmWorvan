package Sea.Fish;

public class OperatorCarp {

    public void incrementDemo() {
        int i = 0, j = 0, k = 0;
        System.out.println("i = "+i);
        System.out.println("i++ "+ i++); //++ evaluated after printing
        System.out.println(i++ +" i++" ); //++ also evaluated after printing
        System.out.println("++i: "+ ++i); //evaluated before printing
    }

    public void modulusDemo() {
        int i = 63, j = 5;
        float f = 10.0f, g = 3.0f;

        System.out.println( i +" Mod "+ j + " = "+ i%j);
        System.out.println( f +" Mod "+ g + " = "+ f%g);
        //System.out.println( i +" Mod "+ 0 + " = "+ f%0);//throws exception
        System.out.println( f +" Mod "+ 0.0f + " = "+ f%0.0f);
    }

    public void shiftDemo() {
        int i = Integer.MIN_VALUE;
        ///unsigned bit shift
        System.out.println(
                String.format("%32s", Integer.toBinaryString(i >>> 1)).replace(' ','0')
        );
        ///signed bit shift
        System.out.println(
                String.format("%32s", Integer.toBinaryString(i >> 1)).replace(' ','0')
        );
    }


    public static void main(String[] args) {
        OperatorCarp oc = new OperatorCarp();

        //oc.incrementDemo();
        //oc.modulusDemo();
        oc.shiftDemo();
    }
}
