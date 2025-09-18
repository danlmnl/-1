import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt(); // ввод длин отрезков
        if (a+b>c && a+c>b && b+c>a){ // условия существования треугольника
            if (a==b && b==c){ //условие равностороннего треугольника
                System.out.println("Можно составить равносторонний треугольник");
            } else {
                if (a == b && a!=c || a == c && a!=b || c == b && a!=c) { //условие для равнобедренного треугольника
                    System.out.println("Можно составить равнобедренный треугольник");
                } else {
                    if (a*a + b*b == c*c || a*a + c*c == b*b || c*c + b*b == a*a){//проверка на прямоугольность
                        System.out.println("Можно составить прямоугольный треугольник");
                    } else {
                        System.out.println("Можно составить разносторонний треугольник");
                    }
                }
            }
        } else {
            System.out.println("Треугольник невозможно составить"); //если не выполнилось условие существования
        }
    }
}
