package Main;
import Student.Student;
import Student.OfflineStudent;
import Student.OnlineStudent;
public class sinhvien {
    public static void main(String[] agrs){
        Student std = new Student();
        OfflineStudent offs = new OfflineStudent();
        OnlineStudent onls = new OnlineStudent();
        std.nhap();
        offs.nhap();
        offs.xuat();
        onls.nhap();
        onls.xuat();
    }
}
