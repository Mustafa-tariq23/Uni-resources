public class Main {
    static class SwapNumbers {
        public  static void main(String[] args) {
            // declared two variables and printed them out before and after swap and instructed that we can use direct values instead of input/cin
            int a = 10;
            int b = 20;
            System.out.println("Before Swapping: a = " + a + ", b: " + b);

            a = a + b;
            b = a - b;
            a = a - b;

            System.out.println("After Swapping: a = " + a + ", b: " + b);
        }
    }

    static class GreatestOfThree {
        public static void main (String[] args) {
            // I have used three variables here and just checked if a is greater than b then compared a and c else compared b and c.
            int a = 10;
            int b = 50;
            int c = 3;

            System.out.println("Three numbers are: " + a + ", " + b + ", " + c);

            int maxNum = (a > b) ? (Math.max(a, c)) : (Math.max(b, c));

            System.out.println("Greatest number: " + maxNum);

        }
    }

    static class EvenOddChecker {
        public static void main(String[] args) {
            int num = 121;
            System.out.println("The number is: " + num);

            if(num % 2 == 0) System.out.println("The number is even");
            else System.out.println("The number is odd");
        }
    }

    static class FactorialCalculation {
        public static int factorial(int n) {
            if (n <= 1)
                return 1;
            return n * factorial(n - 1);
        }

        public static void main(String[] args) {
            int number = 5;
            System.out.println("The number is: " + number);
            int fac = factorial(number);
            System.out.println("Factorial of " + number + " is: " + fac);
        }
    }

    static class Student {
        String name;
        int age;

        void display() {
            System.out.println("Name: " + name + ", Age: " + age);
        }

        public static void main(String[] args) {
            Student s1 = new Student();
            s1.name = "John";
            s1.age = 20;
            s1.display();
        }
    }
}
