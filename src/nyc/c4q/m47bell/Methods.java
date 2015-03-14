package nyc.c4q.m47bell;

/**
 * Created by c4q-marbella on 3/12/15.
 * Access Code 2-1
 * Marbella Vidals
 */
public class Methods {
//here we are declaring a method speak
    public static void speak(){

        System.out.println("Hi, there!");

    }
    // declaring a method called shoutOut
    public static void shoutOut(String name) {
    System.out.println("hey, " + name);

      //  speak(); can pass parameter in other methods- it calls speak method

    }

        public static void main(String[] args) {


        //here we are calling a method speak

        //speak ();
            // function executes twice, the first Von Neuman and then Grace H.
            //sort of like a tmeplate..may not need string n
            String n = " Von Neuman";
            shoutOut(n);// can use shoutOut("Von Neuman")
            shoutOut("Grace Hopper");



    }
}




