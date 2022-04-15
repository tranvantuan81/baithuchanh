package shapes;
import java.util.Scanner;

public class hinhtron extends hinhhoc {
    public float bankinh;
    public hinhtron(){
        ten = "hinh tron ";
    }
    public void nhapbankinh(){
        System.out.println("Ban kinh = ");
        Scanner scanner = new Scanner(System.in);
        bankinh=scanner.next.Float();
    }
    public void tinhchuvi(){
        chuvi =2 * PI * bankinh;
    }
    public void tinhdientich(){
        dientich = PI * bankinh * bankinh;
    }
}
