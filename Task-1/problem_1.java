import java.util.Scanner;
class calc {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
	   System.out.println("Enter the length of Rectangle:");
	   double length = input.nextDouble();
	   System.out.println("Enter the width of Rectangle:");
	   double width = input.nextDouble();
	   //Area = length*width;
	   double area = length*width;
	   System.out.println("Area of Rectangle is:"+area);
	   double perimeter = (length+width)*2;
	   	   System.out.println("Area of Rectangle is:"+perimeter);

    }
}
