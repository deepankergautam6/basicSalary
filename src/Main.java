import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter you basic salary: ");
        double num = input.nextDouble();
        double da = 0.5 * num;
        double total = num + da;
        if(20000<total){
            double tax = total - (0.05 * total);
            System.out.println("\tSalary Slip");
            System.out.println("\t_____________");
            System.out.println("Basic Salary: " + num);
            System.out.println("Dearness Allowance: " + da);
            System.out.println("Salary before tax: " + total);
            System.out.println("total salary: " + tax);
        }else{
            System.out.println("\tSalary Slip");
            System.out.println("\t_____________");
            System.out.println("Basic Salary: " + num);
            System.out.println("Dearness Allowance: " + da);
            System.out.println("Salary before tax: " + total);
            System.out.println("total salary:" + total);
        }
    }
}