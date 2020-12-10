import java.util.Scanner;

public class ConvertNumberToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int number = scanner.nextInt();
        String numberString = "Please enter a positive integer";
        String textNumber [] = {" ", "one", "two", "three", "four", "five", "six","seven","eight","nine", "ten"};
        String textDozen [] = {" ", " ", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        if (number == 0){
            numberString = "Zero";
        } else if (number <= 10){
            numberString = textNumber[number];
        } else if (number == 11){
            numberString = "eleven";
        } else if (number == 12){
            numberString = "twelve";
        } else if (number == 13){
            numberString = "thirteen";
        } else if (number < 20){
            numberString = textNumber[number%10] + "teen";
        } else if (number < 100){
            numberString = textDozen[number/10]+textNumber[number%10];
        } else if (number ==100){
            numberString = "one hundred";
        }
        else if (number <1000){
            numberString = textNumber[number/100]+ " hundred and " + textDozen[(number%100)/10] + textNumber[number%10];
        } else {
            numberString = "out of ability";
        }

        System.out.println("This number is write: " + numberString);
    }
}
