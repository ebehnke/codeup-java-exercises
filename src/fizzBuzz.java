public class fizzBuzz {
    public static void main(String[] args) {
//        int i = 0;
        for(int i = 0; i < 100; i+=1) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            System.out.println(i);
        }
    }
}
