package src.jp.ac.uryukyu.ie.e205752;
import java.io.FileWriter;
import java.io.IOException;

public class Report5 {
    public static void main(String[] args){
        try{
            // FileWriter fw = new FileWriter("output.txt");
            String str = null;
            System.out.println(str.length());
            // fw.close();
        }
        catch (NullPointerException e){
            System.out.println("NullPointerExceptionが発生");
            // }catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}