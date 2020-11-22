import java.util.Scanner;
public class Main_window {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to my Caeser Cipher App\n");
        for ( ;; )
        {
            System.out.println("Please make a choice...\n 1.Encryption \t 2.Decryption \t 3.Exit program\n" );

            Integer myChoice = s.nextInt();
            Cipher ceaser_cipher = new Cipher();
            if (myChoice == 1)
            {
                System.out.println("Enter your string to encrypt\n");
                String message = new String();
                message = s.next();
                System.out.println("Enter Key (Key must be between 0 to 25)\n");
                int key = s.nextInt();
                System.out.println(ceaser_cipher.encryption(message, key));
            }
            else if (myChoice == 2)
            {
                System.out.println("Enter your string to decrypt\n");
                String message = new String();
                message = s.next();
                System.out.println("Enter Key used for the encryption (Key must be between 0 to 25)\n");
                int key = s.nextInt();
                System.out.println(ceaser_cipher.decryption(message, key));
            }
            else if (myChoice == 3)
            {
                System.exit(0);
            }
            else {
                System.out.println("Sorry..., you made an invalid Choice");
            }
        }

    }
}
