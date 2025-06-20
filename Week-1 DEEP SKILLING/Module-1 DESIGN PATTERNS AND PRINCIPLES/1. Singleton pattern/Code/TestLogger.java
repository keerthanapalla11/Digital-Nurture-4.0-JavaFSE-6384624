package singletonexample;

public class TestLogger{
    public static void main(String[] args){
        Logger log1=Logger.getInstance();
        Logger log2=Logger.getInstance();

        log1.log("First Logger");
        log2.log("Second Logger");

        if(log1==log2){
            System.out.println("Logger1 and Logger2 are same.");
        }
        else{
            System.out.println("Logger 1 and Logger 2 are different instances");
        }
    }
}