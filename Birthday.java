import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.util.Random;

public class Birthday extends Toy{
    public static void main(String[] args){

        //Introduce program and set variables
        JOptionPane.showMessageDialog(null, "Welcome to the Toy Company to choose gifts for young children.");
        String continueProgram = "";
        Random r = new Random();
        double totalItemCost = 0.00;
        DecimalFormat moneyFormatter = new DecimalFormat("#,##0.00");

        do{
            /**
             * create variables to send info to Toy.java
             */
            String childName, childAgeTemp, toyChoice, cardChoice, balloonChoice;
            int childAge;
            Toy toy = new Toy();

            /**
             * Ask for child's name and age
             * Send age to toy object to set age.
             */
            childName = JOptionPane.showInputDialog("What is the child's name?");
            childAgeTemp = JOptionPane.showInputDialog("What is the child's age?");
            childAge = Integer.parseInt(childAgeTemp);
            toy.setAge(childAge);

            /**
             * Ask for toy choice
             */
            toyChoice = JOptionPane.showInputDialog("Which toy would you like to purchase? (plushie, blocks, book)");

            /**
             * if (toyChoice.equalsIgnoreCase("plushie") ||  toyChoice.equalsIgnoreCase("blocks") ||
             *                         toyChoice.equalsIgnoreCase("book")){
             *                 continue;
             *             }
             *             else{
             *                 toyChoice = JOptionPane.showInputDialog("Please enter a valid toy choice. (plushie/blocks/book)");
             *
             *             }
             */
            toy.setToy(toyChoice);




            /**
             * If toy is not age appropriate, ask user if they'd like to change it. If yes, reprompt for toy choice.
             * If no, continue
             */
            if (!toy.ageOK()){
                String continueOrNot = JOptionPane.showInputDialog("This toy is not age appropriate. Would you like to change the toy choice? (yes/no)");
                if (continueOrNot.equalsIgnoreCase("yes")) {
                    toyChoice = JOptionPane.showInputDialog("Which toy would you like to purchase? (plushie, blocks, book)");
                    toy.setToy(toyChoice);
                }
            }

            /**
             * Set cost of toy
             */
            toy.setCost(toyChoice);

            /**
             * Ask if card is wanted. Send answer to addCard
             */
            cardChoice = JOptionPane.showInputDialog("Would you like to add a card? (yes/no)");
            toy.addCard(cardChoice);

            /**
             * Ask if balloon is wanted. Send answer to addBalloon
             */
            balloonChoice = JOptionPane.showInputDialog("Would you like to add a balloon? (yes/no)");
            toy.addBalloon(balloonChoice);

            /**
             * Add cost or toy and/or cards/balloons to running total
             */

            totalItemCost += toy.getCost();

            /**
             * Display toy information to user
             */

            JOptionPane.showMessageDialog(null, "The gift for " + childName + toy.toString());

            /**
             * Ask user if another toy will be purchased
             * If no, continue. If yes, repeat while loop
             */
            continueProgram = JOptionPane.showInputDialog("Would you like to purchase another toy? (yes/no)");

        }
        while(continueProgram.equalsIgnoreCase("yes"));


        /**
         * Display order total and number to user
         */

        JOptionPane.showMessageDialog(null, "The total cost of your order is $" +
                moneyFormatter.format(totalItemCost) + ". \nOrder number: " + (r.nextInt(10000) + 1)
                + "\n***Programmer: Amanda Yoresh***");




    }
}
