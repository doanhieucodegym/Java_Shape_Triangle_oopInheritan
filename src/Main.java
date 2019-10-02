import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập màu  cho  hình tam giác");
        String color = sc.nextLine();
        System.out.println("Nhập cạnh thứ  nhất");
        double side1 =sc.nextDouble();
        System.out.println("nhập cạnh thứ  2");
        double side2 = sc.nextDouble();
        System.out.println("nhập cạnh thứ 3");
        double side3 = sc.nextDouble();
        if(check(side1,side2,side3)){
            Triangle_Inheritance_Shape triangle =new Triangle_Inheritance_Shape(color,side1,side2,side3);
            String triangle1= triangle.toString();
            System.out.println(triangle1);

        }else{
            System.out.println("Triangle is side not edges");
        };

    }
    public static boolean check(double a, double b, double c){
        if(a >= b + c || b >= a + c || c >= a + b){
            return false;
        }else {
            return  true;
        }
    }
}
