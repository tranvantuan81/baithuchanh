package Student;
import java.util.Scanner;
import Person.Person;
public class Student extends Person {
   public String cachhoc;
   public void nhap(){
       System.out.println("Nhap ten :");
       Scanner sc = new Scanner(System.in);
       ten = sc.nextLine();
       System.out.println("Nhap tuoi :");
       tuoi = sc.nextInt();
   } 
}
