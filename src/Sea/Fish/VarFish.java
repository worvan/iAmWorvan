package Sea.Fish;

import java.util.ArrayList;

public class VarFish {
    //var huhu = "hehe"; No no no, class cannot variable cannot be var
    public static void main(String[] args) {
        var varGreeting = "Do you want to protect yourself, or deal some damage"; //can do this since Java 10
        var var = new Object(); //haha, var is not reserved keyword

        // var nullObject = null; cannot be instantiated with null
        Object nullObject = null;
        var lVar = nullObject; //but can be instantiated as Object with value null

        //var lVarray = {nullObject, nullObject}; cannot create arrays like this
        var lVList = new ArrayList<>(); //can Init this, because it is not typed

        var hello = "helo";
        for (var i = 0; i < 10; i++) { //noice, but pointless
            hello = hello.concat("o");
            lVList.add(hello);
        }
        System.out.println(hello);

        var j = 0;
        for (var listGreeting: lVList) { //more readable for long class names
            j += 1; // haha, could do lVList.size(), but wanted to try out vars
        }
        System.out.println(j+" greetings in the list");
    }
}
