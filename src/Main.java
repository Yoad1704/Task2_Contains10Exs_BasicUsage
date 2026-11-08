import java.util.Scanner;

public class Main
{
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("The number of exercise to test: ");
        int exercise = reader.nextInt();

        if (exercise == 1)
        {
            f1_DigitalId();
        }
        else if (exercise == 2)
        {
            f2_TimeConverter();
        }
        else if (exercise == 3)
        {
            f3_RestaurantBill();
        }
        else if (exercise == 4)
        {
            f4_ComputerStore();
        }
        else if (exercise == 5)
        {
            f5_SpeedCalculator();
        }
        else if (exercise == 6)
        {
            f6_FinalGrade();
        }
        else if (exercise == 7)
        {
            f7_NumbersCheck();
        }
        else if (exercise == 8)
        {
            f8_TicketPrice();
        }
        else if (exercise == 9)
        {
            f9_AnalyzeWord();
        }
        else if (exercise == 10)
        {
            f10();
        }
        else
        {
            System.out.println("isnt 1-10");
        }
    }

    public static void f1_DigitalId()
    {
        System.out.print("Enter the name of the person: ");
        String name = reader.next();

        System.out.print("Enter the age of the person: ");
        int age = reader.nextInt();

        System.out.print("Enter the height of the person in cm: ");
        double height = reader.nextDouble();
        
        System.out.print("Enter the first letter of the last name of the person: ");
        String lastNameFirstChar = reader.next();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height:" + height);
        System.out.println("Last Name initial: " + lastNameFirstChar);
        System.out.println("Age in 1o years: " + (age + 10));

    }

    public static void f2_TimeConverter()
    {
        System.out.print("Enter the number of seconds you want to convert: ");
        int secondsToConvert = reader.nextInt();

        int timeLeft = secondsToConvert;
       
        int hours = secondsToConvert / 3600;
        timeLeft -= hours * 3600;
        int minutes = timeLeft / 60;
        timeLeft -= minutes * 60;
        int seconds = timeLeft % 60;
  

        System.out.print(hours + " hours, " + minutes + " minutes and " + seconds + " seconds" );
    }

    public static void f3_RestaurantBill()
    {
        System.out.print("Enter the bill: ");
        double bill = reader.nextDouble();

        System.out.print("Enter the desired tip percentage: ");
        int percentage = reader.nextInt();
        double percentageInDecimal = percentage / 100.0; ///for it not to be 0 you need to add .0 - also mentioned in 6 apprantely

        System.out.print("Enter the amount of people: ");
        int people = reader.nextInt();

        double totalAmount = bill + bill * percentageInDecimal;
        double amountPerPerson = totalAmount / people;

        System.out.println();
        System.out.println("Bill was " + bill + " for " + people + " people that agreed to tip " + percentage + " percent.");
        System.out.println("The total amount came out to: " + totalAmount + ", the tip was calculated to be a total of " + (totalAmount - bill) + ", and each person needs to pay: " + amountPerPerson);

    }

    public static void f4_ComputerStore()
    {
        System.out.print("Enter the price of product 1: ");
        double price1 = reader.nextDouble();
        System.out.print("Enter the amount of units sold of product 1: ");
        int units1 = reader.nextInt();
        
        System.out.print("Enter the price of product 2: ");
        double price2 = reader.nextDouble();
        System.out.print("Enter the amount of units sold of product 2: ");
        int units2 = reader.nextInt();
        
        System.out.print("Enter the price of product 3: ");
        double price3 = reader.nextDouble();
        System.out.print("Enter the amount of units sold of product 3: ");
        int units3 = reader.nextInt();

        double total = price1 * units1 + price2 * units2 + price3 * units3;

        System.out.print("Enter the discount percentage to apply on the entire purchase: ");
        double percentage = reader.nextDouble();
        double percentageInDecimal = percentage / 100.0;
        System.out.println();

        System.out.println("The total amount to pay for the purchase before the discount is: " + total);
        System.out.println("The total discount to pay for the purchase: " + (total * percentageInDecimal));
        System.out.println("The total amount to pay for the purchase after the discount is: " + (total - total * percentageInDecimal));

    }

    public static void f5_SpeedCalculator()
    {
        System.out.print("Enter the distance driven (km): ");
        double distance = reader.nextDouble();

        System.out.print("Enter the duration of the drive (mins): ");
        int minutes = reader.nextInt();

        System.out.println("The drive took " + (minutes / 60.0) + " hours, " + "the average velocity in km/h was: " + (distance / (minutes / 60.0)) + ". The distance driven if the vehicle drove in that same speed for an hour would be: " + (distance / (minutes / 60.0))) ;

    }

    public static void f6_FinalGrade()
    {
        System.out.print("Enter the grade given for the assignments: ");
        double assignmentsGrade = reader.nextDouble();

        System.out.print("Enter the grade given for the quiz: ");
        double quizGrade = reader.nextDouble();

        System.out.print("Enter the grade given for the final exam: ");
        double finalExamGrade = reader.nextDouble();

        double finalGrade = assignmentsGrade * 0.20 + quizGrade * 0.30 + finalExamGrade * 0.50;

        System.out.println();
        System.out.println("The final grade came out to: " + finalGrade);

        if (finalGrade >= 60)  System.out.println("Pass");
        else System.out.println("ail");

    }

    public static void f7_NumbersCheck()
    {
        System.out.print("Enter the first number: ");
        int firstNum = reader.nextInt();
        System.out.print("Enter the second number: ");
        int secondNum = reader.nextInt();

        System.out.println();
        if (firstNum > secondNum)
        {
            System.out.println("First num is bigger than the second");
        }
        else if (secondNum > firstNum)
        {
            System.out.println("Second num is bigger than the first num");
        }
        else
        {
            System.out.println("Both nums are the same and equal to " + firstNum);
        }

        if (firstNum % 2 == 0)
        {
            System.out.println("The first number is even");
        }
        else
        {
            System.out.println("The first number is odd");
        }

        if (secondNum % 5 == 0)
        {
            System.out.println("The second num divides by 5 without a remainder");
        }
        else
        {
            System.out.println("The second num doesnt divide by 5 without leaving a remainder");
        }

        long sum = (long) firstNum + secondNum;

        if (sum > 0)
        {
            System.out.println("The sum of the nums is positive");
        }
        else if (sum < 0)
        {
            System.out.println("The sum of the nums is negfative");
        }
        else
        {
            System.out.println("The sum of the nums is 0.");
        }
    }

    public static void f8_TicketPrice()
    {
        System.out.print("Enter the age of the customer: ");
        int age = reader.nextInt();
        int ticketPrice;
        if (age < 0)
        {
            System.out.println(("Age cant be negative! try again"));
        }

        if (age < 6)
        {
            ticketPrice = 0;
        }
        else if (age <= 17)
        {
            ticketPrice = 30;
        }
        else if (age <= 64)
        {
            ticketPrice = 45;
        }
        else
        {
            ticketPrice = 25;
        }

        System.out.println("The ticket price for a customer with the age of " + age + " is: " + ticketPrice);
    }

    public static void f9_AnalyzeWord()
    {
        System.out.print("Enter the word you want to analyze: ");
        String word = reader.next();

        int wordLength = word.length();

        System.out.println();
        System.out.println("The word has " + wordLength + " chars");
        System.out.println("The word in uppercase:" + word.toUpperCase());
        System.out.println("The word in lowercase:" + word.toLowerCase());
        System.out.println("The first char of the word is: " + word.charAt(0));
        System.out.println("The last char of the word is: " + word.charAt(wordLength - 1));
    }
    
    
    
    public static void f10()
    {
        int a1 = 7;  
        int b1 = 2;

        System.out.println("Part A: ");
        System.out.println(a1 / b1); ///get 3 as 2 fits three times in 7, it doesnt round as it is in
        System.out.println(b1 / 2.0); ///will return 1.0 because of what I learned at 4 and mentioned at 6
        System.out.println();

        System.out.println("Part B: ");
        int num = 2147483647;
        System.out.println(num); /// integer limit so it will print it
        System.out.println(num + 1); ///goes beyond so will not print
        System.out.println();

        System.out.println("Part C:");
        double a3 = 0.1;
        double b3 = 0.2;
        System.out.println(a3 + b3); ///will print 0.3
        System.out.println(a3+ b3 == 0.3); //will print 1 as it is a condition that is true
        System.out.println();


        System.out.println("Part D:");
        float smallPrecision = 100000000.0f;
        double highPrecision = 100000000.0;
        System.out.println(smallPrecision + 1); ///will print the large number +1 in full without the zero in th e end as I think it formats it
        System.out.println(highPrecision + 1); //will print t with the zero at the end




        ////RESULTS///:
        /// A: oth correct
        /// B: First correct second incorrect - it went to negative and decreased by 1 so
        /// c: did not expect it with so many zeros and 4 at the end, for second it did not print 1 and it even printed false as the word - both suprising
        /// D: grouped it to E which is 10^-something BUT  DID FORMAT IT AS I SAID, for the second it did not
        /// 
        /// conclusions after research:
        /// in B adding 1 after int limit goes to the smallest in and it doesnt stop printing.
        /// in C 0.1 and 0.2 cannot be stored exactly in binary so their saved approximations add up to 0.30000000000000004 instead of exactly 0.3. == checks exact equality and returns true or false and not numbers like c
        /// in D float doesnt have enough precision at 100000000 to keep the added 1 so it rounds it back to the original and displays with E. double has enough precision to keep it
        
    }
}