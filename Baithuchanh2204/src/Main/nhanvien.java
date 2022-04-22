package Main;
import Person.Employee;
import Employee.ParttimeEmployee;
import Employee.FulltimeEmployee;
public class nhanvien {
    public static void main(String[] args){
       Employee el = new Employee();
       ParttimeEmployee pte = new ParttimeEmployee();
       FulltimeEmployee fte = new FulltimeEmployee();
       el.nhap();
       el.xuat();
       pte.nhap();
       pte.xuat();
       fte.nhap();
       fte.xuat();
    }
}
