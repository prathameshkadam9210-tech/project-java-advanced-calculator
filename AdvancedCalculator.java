
import java.util.*;

public class AdvancedCalculator {

    Scanner sc = new Scanner(System.in);

    int size, choice, start, end;
    float num ,p, r, t , temp;

    // To get the size of numbers for Arithematic Opertions
    void getsize() {
        System.out.println("Enter the total number size : ");
        size = sc.nextInt();
    }

    // To get the number for Square, Cube, Even Odd and Prime Check
    void getnum() {
        System.out.println("Enter the number : ");
        num = sc.nextFloat();
    }
    
    // To get the starting and ending number for Square, Cube, Even Odd and Prime Check
    void getstartend() {
        System.out.println("Enter the starting number: ");
        start = sc.nextInt();
        System.out.println("Enter the ending number: ");
        end = sc.nextInt();
    }

    // To get the choice for Arithematic Opertions, Square Cube, Even Odd, Interest and Prime Check
    void getchoice() {
        System.out.println("Enter your choice: ");
        choice = sc.nextInt();
    }

    // To display the default case for invalid choice
    void defaultcase() {
        System.out.println("Invalid choice!\nPlease select from above menu");
    }

    // To perform Addition, Substraction, Multiplication and Division
    void arithematic() {
		System.out.println("===========************===========");
        System.out.println("1. For Addition");
        System.out.println("2. For Substraction");
        System.out.println("3. For Multiplication");
        System.out.println("4. For Division");
        getchoice();
        switch (choice) {
            case 1 ->
                add();
            case 2 ->
                sub();
            case 3 ->
                mul();
            case 4 ->
                div();
            default ->
                defaultcase();
        }
    }

    void add() {
        getsize();
        int total = 0;
        int a[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the " + (i + 1) + " number : ");
            a[i] = sc.nextInt();
            total = total + a[i];
        }
        System.out.println("Result = " + total);
    }

    void sub() {
        getsize();
        int a[] = new int[size];
        int total;
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the " + (i + 1) + " number : ");
            a[i] = sc.nextInt();

        }
        total = a[0];
        for (int i = 0; i < size; i++) {
            total = total - a[i];
        }
        System.out.println("Result = " + total);
    }

    void mul() {
        getsize();
        int a[] = new int[size];
        int total = 1;
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the " + (i + 1) + " number : ");
            a[i] = sc.nextInt();
            total = total * a[i];
        }
        System.out.println("Result = " + total);
    }

    void div() {
        getsize();
        int a[] = new int[size];
        double total;
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the " + (i + 1) + " number : ");
            a[i] = sc.nextInt();

        }
        total = a[0];
        for (int i = 0; i < size; i++) {
            if (a[i] != 0) {
                total = total / a[i];
            } else {
                System.out.println("Error : Divide by zero is not allowed.");
            }
        }
        System.out.println("Result = " + total);
    }

    // To Calculate Square and Cube
    void squarecube() {
		System.out.println("===========************===========");
        System.out.println("1. For Square");
        System.out.println("2. For Cube");
        getchoice();
        switch (choice) {
            case 1 -> {
                System.out.println("1. For Single Number Sqaure");
                System.out.println("2. For Multiple Number Square");
                System.out.println("Enter the choice: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1 -> {
                        getnum();
                        System.out.println(num + " = " + num * num);
                    }
                    case 2 -> {
                        getstartend();
                        for (int i = start; i <= end; i++) {
                            System.out.println(i + " = " + i * i);
                        }
                    }
                    default ->
                        defaultcase();
                }
            }
            case 2 -> {
                System.out.println("1. For Single Number Cube");
                System.out.println("2. For Multiple Number Cube");
                System.out.println("Enter the choice: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1 -> {
                        getnum();
                        System.out.println(num + " = " + num * num * num);
                    }
                    case 2 -> {
                        getstartend();
                        for (int i = start; i <= end; i++) {
                            System.out.println(i + " = " + i * i * i);
                        }
                    }
                    default ->
                        defaultcase();
                }
            }
            default ->
                defaultcase();
        }
    }

    // To find or Calculate Even and Odd Numbers
    void evenodd() {
		System.out.println("===========************===========");
        System.out.println("1. For checking Number is Even or Odd");
        System.out.println("2. For giving Even number in user entered range");
        System.out.println("3. For giving Odd number in user entered range");
        getchoice();
        switch (choice) {
            case 1 -> {
                getnum();
                if (num % 2 == 0) {
                    System.out.println(num + " is an Even number");
                } else {
                    System.out.println(num + " is an Odd number");
                }
            }
            case 2 -> {
                getstartend();
                boolean evenfound = false;
                for (int i = start; i <= end; i++) {
                    if (i % 2 == 0) {
                        if (!evenfound) {
                            System.out.println("Even number from " + start + " to " + end + ": ");
                            evenfound = true;
                        }
                        System.out.print(i + " ");
                    }
                }
                if (!evenfound) {
                    System.out.println("Their is no any even number between in this range");
                }
            }
            case 3 -> {
                getstartend();
                boolean oddfound = false;
                for (int i = start; i <= end; i++) {
                    if (i % 2 != 0) {
                        if (!oddfound) {
                            System.out.println("Odd number from " + start + " to " + end + ": ");
                            oddfound = true;
                        }
                        System.out.print(i + " ");
                    }
                }
                if (!oddfound) {
                    System.out.println("Their is no any even number between in this range");
                }
            }
            default ->
                defaultcase();
        }
    }

    // To Calculate Simple and Compound Interest
    void getinterest() {
            System.out.println("Enter the Principal Amount: ");
            p = sc.nextFloat();
            System.out.println("Enter the Rate of Interest: ");
            r = sc.nextFloat();
            System.out.println("Enter the Time Period: ");
            t = sc.nextFloat();
        }

    void interest() {
		System.out.println("===========************===========");
        System.out.println("1. For Simple Interest");
        System.out.println("2. For Compound Interest");
        getchoice();

        
        switch (choice) {
            case 1 -> {
                getinterest();
                float si = (p * r * t) / 100;
                System.out.println("Simple Interest is: " + si);
            }
            case 2 -> {
                getinterest();
                double ci = p * Math.pow((1 + r / 100), t);
                System.out.println("Compound Interest is: " + ci);
            }
            default ->
                defaultcase();
        }
    }

    // To find or Calculate Prime Numbers
    void prime() {
		System.out.println("===========************===========");
        System.out.println("1. For Single Number Prime Check");
        System.out.println("2. For Multiple Number Prime Check in Range");
        getchoice();

        switch (choice) {
            case 1 -> {
                getnum();
                boolean isPrime = true;
                if (num <= 1) {
                    isPrime = false;
                } else {
                    for (int i = 2; i <= Math.sqrt(num); i++) {
                        if (num % i == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                }
                if (isPrime) {
                    System.out.println(num + " is a Prime number.");
                } else {
                    System.out.println(num + " is not a Prime number.");
                }
            }
            case 2 -> {
                getstartend();

                boolean primefound = false;
                for (int i = start; i <= end; i++) {
                    boolean isPrime = true;
                    if (i <= 1) {
                        isPrime = false;
                    } else {
                        for (int j = 2; j <= Math.sqrt(i); j++) {
                            if (i % j == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                    }
                    if (isPrime) {
                        if (!primefound) {
                            System.out.println("Prime numbers from " + start + " to " + end + ": ");
                            primefound = true;
                        }
                        System.out.print(i + " ");
                    }
                }
                if (!primefound) {
                    System.out.println("There are no prime numbers in this range.");
                }
            }
            default ->
                defaultcase();
        }
    }

    // To Convert Temperature from one unit to another unit
    void getTemperature() {
        System.out.println("Enter the Temperature: ");
        temp = sc.nextFloat();
    }

    void Temperature() {
		System.out.println("===========************===========");
        System.out.println("1. For Degree Celsius to Kelvin");
        System.out.println("2. For Degree Celsius to Fahrenheit");
        System.out.println("3. For Kelvin to Degree Celsius");
        System.out.println("4. For Kelvin to Fahrenheit");
        System.out.println("5. For Fahrenheit to Degree Celsius");
        System.out.println("6. For Fahrenheit to Kelvin");

       getchoice();

        switch (choice) {
            case 1 -> {
                getTemperature();

                System.out.println("Temperature in Degree Celsius : " + temp + " C ");
                System.out.println("Temperature in Kelvin : " + (temp + 273.15) + " K ");
            }
            case 2 -> {
                getTemperature();

                System.out.println("Temperature in Degree Celsius : " + temp + " C ");
                System.out.println("Temperature in Degree Fahrenheit : " + (((1.8) * temp) + 32) + " F ");
            }
            case 3 -> {
                getTemperature();

                System.out.println("Temperature in Kelvin : " + temp + " K ");
                System.out.println("Temperature in Degree Celsius : " + (temp - 273.15) + " C ");
            }
            case 4 -> {
                getTemperature();

                System.out.println("Temperature in Kelvin : " + temp + " K ");
                System.out.println("Temperature in Degree Fahrenheit : " + ((1.8 * (temp - 273.15)) + 32) + " F ");
            }
            case 5 -> {
                getTemperature();

                System.out.println("Temperature in Degree Fahrenheit : " + temp + " F ");
                System.out.println("Temperature in Degree Celsius : " + ((0.556) * (temp - 32)) + " C ");
            }
			   case 6 -> {
                getTemperature();

                System.out.println("Temperature in Degree Fahrenheit : " + temp + " F ");
                System.out.println("Temperature in Kelvin : " + (((0.556) * (temp - 32)) + 273.15) + " K ");
            }
            default ->
                defaultcase();
        }

    }

    // To Display the Table of User Entered Number
    void table() {
        getnum();
        System.out.println("Table of " + num + " is : ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }

    // To Calculate the Factorial of User Entered Number
    void factorial(){
        getnum();
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + num + " is: " + fact);
    }
    
    // To Display the Menu for User
    void displaymenu(){
        System.out.println("\n\n===========***********===========\n");
        System.out.println("Welcome in Advanced Calculator");
        System.out.println("1. For Arithematic Operations");
        System.out.println("2. For Sqaure and Cube");
        System.out.println("3. For Even and Odd");
        System.out.println("4. For Interest Calculation");
        System.out.println("5. For Prime Number");
		System.out.println("6. For Temperature Conversion");
        System.out.println("7. For Table");
        System.out.println("8. For Factorial");
        System.out.println("9. For Exit");
    }

    // To Exit from the Program
    void exit() {
        System.out.println("Thank you visiting\nExitting...\n..Visit Again..");
    }

    public static void main(String args[]) {
        AdvancedCalculator cal = new AdvancedCalculator();
        try (Scanner sc = new Scanner(System.in)) {
            int choice;
            do {
                
                cal.displaymenu();
                System.out.println("Enter your choice from above menu : ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1 ->
                        cal.arithematic();
                    case 2 ->
                        cal.squarecube();
                    case 3 ->
                        cal.evenodd();
                    case 4 ->
                        cal.interest();
                    case 5 ->
                        cal.prime();
					case 6 ->
                        cal.Temperature();	
                    case 7 ->
                        cal.table();
                    case 8 ->
                        cal.factorial();
                    case 9 ->
                        cal.exit();
                    default ->
                        cal.defaultcase();
                }
            } while (choice != 9);
        }
    }
}
