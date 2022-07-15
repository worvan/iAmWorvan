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
        short a = 10, b = 5;
        int i = 63, j = 5;
        float f = 10.0f, g = 3.0f;

        System.out.println( i +" Mod "+ j + " = "+ i%j);
        System.out.println( f +" Mod "+ g + " = "+ f%g);
        //System.out.println( i +" Mod "+ 0 + " = "+ f%0);//throws exception
        System.out.println( f +" Mod "+ 0.0f + " = "+ f%0.0f);
        var e = a % b; //TODO % promotes automatically to integer, idk why even when doing short%short
        System.out.println("short "+a+" Mod short"+b+" = "+a%b+" (int)");
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

    public void ternaryDemo() {
        boolean a = true;
        boolean b = false;

        String msg = a ? "I am True carp" : "I am False carp";
        System.out.println("A: "+msg);

        String msg2 = b ? "I am True carp" : "I am False carp"; //only statements allowed
        System.out.println("B: "+msg2);

        //a ? System.out.println() : System.out.println(); //not expressions
    }

    public void operatorPriorityDemo() {
        short a = 10;
        short b = 5;
        char c = 3;

        var d = a *= b -= c--;
        System.out.println("eval: "+d);


        int i = 0;//stolen from quiz
        int j = 5;
        int k = 10;

        int loopIterations = 0;
        while ((i++ < j) || (j < --k)) {
            loopIterations++;
        }
        System.out.println("loops: "+loopIterations);
    }

    public void condicionalDemo() {
        boolean a = false, b = false, c = false;
        //a && b gets resolved and is true, so what is after OR gets skipped
        if(( a=true ) && (b = true) || (c = true)) {
            System.out.println("a:" + a + "\nb:" + b + "\nc:" + c);
        }
    }


    public static void main(String[] args) {
        OperatorCarp oc = new OperatorCarp();

        //oc.incrementDemo();
        //oc.modulusDemo();
        //oc.shiftDemo();
        //oc.ternaryDemo();
        //oc.operatorPriorityDemo();
        oc.condicionalDemo();
    }
}
