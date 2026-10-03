 //Rooftop Solar Energy Monitor

import java.util.Scanner;
public class q1 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter Panel ID: ");
int panelId = sc.nextInt();
System.out.print("Enter Energy Generated: ");
double energyKwh = sc.nextDouble();
System.out.print("Enter Number of Solar Panels: ");
int numberOfPanels = sc.nextInt();
System.out.print("Enter System Status: ");
char systemStatus = sc.next().charAt(0);
System.out.println("Panel ID: " + panelId);
System.out.println("Energy Generated (kWh): " + energyKwh);
System.out.println("Number of Solar Panels: " + numberOfPanels);
System.out.println("System Status: " + systemStatus);
sc.close();
}
}
