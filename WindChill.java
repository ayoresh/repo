import java.util.Scanner;

public class WindChill{

    public static void main(String[] args){

        System.out.println("**************************************************************");
        System.out.println("Wind Chill Calculator");
        System.out.println("**************************************************************");

        double temp = 0, windspeed = 0, windchill = 0;
        final double NUM_1 = 35.74, NUM_2 = 0.6215, NUM_3 = 35.75, NUM_4 = 0.4275, NUM_5 = 0.16;
        Scanner input = new Scanner(System.in);

        System.out.println("This program calculates wind chill from temperature and wind speed.");
        System.out.println("What is the temperature in Fahrenheit? Please note: must be between -45 and 40.");
        temp = input.nextDouble();

        if (temp <= 40 && temp >= -45){

            System.out.println("What is the wind speed in MPH?");
            windspeed = input.nextDouble();

            if (windspeed >= 5 && windspeed <= 60){
                windchill = (NUM_1 + (NUM_2 * temp) - (NUM_3 * Math.pow(windspeed, NUM_5)) + (NUM_4 * temp * Math.pow(windspeed, NUM_5)));
                System.out.println("The wind chill is " + windchill + " degrees Fahrenheit.");
            }
            else{
                System.out.println("Invalid input. Program terminating.");
                System.exit(0);
            }
        }
        else {
            System.out.println("Invalid input. Program terminating.");
            System.exit(0);
        }
    }
}
