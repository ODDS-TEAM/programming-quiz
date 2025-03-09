public class TestOdde {
    public static String fizzBuzzBazz(int number) {
        StringBuilder result = new StringBuilder();

        if (number % 3 == 0) {
            result.append("Fizz");
        }
        if (number % 5 == 0) {
            result.append("Buzz");
        }
        if (number % 7 == 0) {
            result.append("Bazz");
        }
        if (result.length() == 0) {
            return String.valueOf(number);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        // test
        System.out.println(fizzBuzzBazz(3));   // Fizz
        System.out.println(fizzBuzzBazz(5));   // Buzz
        System.out.println(fizzBuzzBazz(7));   // Bazz
        System.out.println(fizzBuzzBazz(15));  // FizzBuzz
        System.out.println(fizzBuzzBazz(21));  // FizzBazz
        System.out.println(fizzBuzzBazz(35));  // BuzzBazz
        System.out.println(fizzBuzzBazz(105)); // FizzBuzzBazz
        System.out.println(fizzBuzzBazz(8));   // 8
    }
}
