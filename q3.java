import java.util.Scanner;
public class q3 {
public static double total(double morning, double evening) {
return morning + evening;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter morning energy: ");
double morning = sc.nextDouble();
System.out.print("Enter evening energy: ");
double evening = sc.nextDouble();
double totalEnergy = total(morning, evening);
System.out.println("Total Energy: " + totalEnergy + " kWh");
sc.close();
}
}