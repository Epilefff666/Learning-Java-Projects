import java.security.SecureRandom;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        Bicycle myNewBicycle = new Bicycle("TREK","RED");

        myNewBicycle.streamBicyle();

        //the code below that is for moving the bicycle randomly

        for(int i = 0; i<20; i++){
            Random random = new Random();
            int option = random.nextInt(2);
            switch (option){
                case 0: {
                    myNewBicycle.stop();
                    myNewBicycle.streamBicyle();
                }
                case 1: {
                    myNewBicycle.speedUp();
                    myNewBicycle.streamBicyle();
                }
            }
        }
    }
}