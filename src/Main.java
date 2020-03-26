import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap vao ban kinh hinh tron: ");
        double radius = input.nextDouble();
        input.nextLine();

        System.out.print("Nhap vao mau sac hinh tron: ");
        String color = input.nextLine();

        Circle circle = new Circle(radius, color);

        System.out.printf("Hinh tron co ban kinh '%-3.1f', mau '%s'\n", circle.getRadius(), color);
        System.out.printf("Dien tich hinh tron la %-5.2f", circle.getArea());

    }
}
