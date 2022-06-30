package Sea.Fish;

public class OperatorCarp {

    public void incrementDemo() {
        int i = 0, j = 0, k = 0;
        System.out.println("i = "+i);
        System.out.println("i++ "+ i++); //++ evaluated after printing
        System.out.println(i++ +" i++" ); //++ also evaluated after printing
        System.out.println("++i: "+ ++i); //evaluated before printing

    }


    public static void main(String[] args) {
        OperatorCarp oc = new OperatorCarp();

        oc.incrementDemo();
    }
}
