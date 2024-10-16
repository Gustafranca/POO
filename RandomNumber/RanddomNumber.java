package RandomNumber;

import java.security.SecureRandom;

public class RanddomNumber {
    public static void main(String[] args) {
        SecureRandom randomNumber = new SecureRandom();

        int randomValue = randomNumber.nextInt();

        int d20 = randomNumber.nextInt(0,21);

        System.out.println("Random Value: " + randomValue);
        System.out.println("Rolagem d20: " + d20);
        
    }
}
