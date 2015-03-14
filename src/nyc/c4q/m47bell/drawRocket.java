package nyc.c4q.m47bell;

/**
 * Created by c4q-marbella on 3/12/15.
 * Access Code 2-1
 * Marbella Vidals
 */
public class drawRocket {
    public static void main(String[] args){
        drawLine(1);
        rocketcapTail(1);



    }
    public static void rocketcapTail(int size){
    String cap = "/";
    String star= "**";
        for(int i= 0;i <size; i++){
            cap = cap + star;

        }cap = "/ ";
        System.out.println(cap);




    }
    public static void drawLine(int size) {
    String line = "+";
        for(int i= 0;i <size; i++){
            line += "*=*=";

        }line += "+";
        System.out.println(line);
    }



    public static void rocketBody(){
    //String


}




}
