import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("กรุณาใส่จำนวน: ");
        int number = scanner.nextInt();
        String result = "";
        if(number % 3 == 0 && number % 5 == 0 && number % 7 == 0){
            result += "FizzBuzzBazz" ;
        }else if(number % 3 == 0 && number % 5 == 0 ){
            result += "FizzBuzz";
        }else if(number % 3 == 0){
            result += "Fizz";
        }else if(number % 5 == 0 ){
            result += "Buzz";
        }else if(number % 7 == 0){
            result += "Bazz";
        }else{
            result += Integer.toString(number);
        }
        System.out.print("result : "+result);
        scanner.close();
    }

}