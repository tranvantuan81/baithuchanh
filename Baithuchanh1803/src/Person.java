import java.util.Scanner;
public class Person {
    String PersonID, PersonName, Address;
    Boolean Gender;
    void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap PersonID: ");
        PersonID = sc.nextLine();
        System.out.print("Nhap PersonName: ");
        PersonName = sc.nextLine();
        System.out.print("Nhap Address: ");
        Address = sc.nextLine();
    }
    void in() {
        System.out.println("PersonID: " + PersonID);
        System.out.println("PersonName: " + PersonName);                 
        System.out.println("Address: " + Address);  
    }
} 

