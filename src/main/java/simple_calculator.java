import java.util.Scanner;

public class simple_calculator {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int a,b;
        System.out.println("��������: ������� ��� ����� (������, 12 8): ");
         a=scanner.nextInt();
         b=scanner.nextInt();

        System.out.println("C���� "+a+" + "+b+" = " + sum(a,b));

        System.out.println("���������: ������� ��� ����� (������, 4 5): ");
        a=scanner.nextInt();
        b=scanner.nextInt();
        System.out.println("������������ "+a+" * "+b +" = "+ multyply(a,b));
    }

       static   int sum ( int a, int b){
            return a + b;
        }
      static   int  multyply ( int a, int b){
            return a * b;
        }

    }
