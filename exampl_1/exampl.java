/*Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)*/

package Sem1;
import java.util.Scanner;

public class exampl{

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int i = iScanner.nextInt();
        System.out.printf("Треугольное число: %d\n", triangularNumber(i));
        iScanner.close();
    }

    public static int triangularNumber(int a) {
        return (a * (a + 1)) / 2;
    }
}
