import java.io.Console;
import java.util.Scanner;
public class Main_window {
    public static void main(String[] args){
        System.out.println("Welcome to my Ceaser Cipher App");
        for ( ;; ){
            System.out.println("Please make your choice...\n 1.Encryption \t 2.Decryption \t 3.Exit program" );
            Console c = System.console();
            String choice = c.readLine();
            int myChoice = Integer.parseInt(choice);
            Cipher ceaser_cipher = new Cipher();
            if (myChoice == 1){
                Console m = System.console();
                System.out.println("Enter your string to encrypt");
                String message = m.readLine();
                System.out.println("Enter Key");
                Console k = System.console();
                String shiftKey = k.readLine();
                Integer key = Integer.parseInt(shiftKey);
                System.out.println(ceaser_cipher.encryption(message, key));
            }
        }


    }
}
