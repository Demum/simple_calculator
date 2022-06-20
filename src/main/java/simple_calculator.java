import java.util.Scanner;

public class simple_calculator {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int a,b;
        System.out.println("Сложение: Введите два числа (пример, 12 8): ");
         a=scanner.nextInt();
         b=scanner.nextInt();

        System.out.println("Cумма "+a+" + "+b+" = " + sum(a,b));

        System.out.println("Умножение: Введите два числа (пример, 4 5): ");
        a=scanner.nextInt();
        b=scanner.nextInt();
        System.out.println("Произведение "+a+" * "+b +" = "+ multyply(a,b));
    }

       static   int sum ( int a, int b){
            return a + b;
        }
      static   int  multyply ( int a, int b){
            return a * b;
        }

    }
