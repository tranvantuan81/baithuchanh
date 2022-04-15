package shapes;
import java.util.Scanner;
public class hinhtru extends hinhtron {
    public float chieucao;
    public hinhtru(){
        ten = "hinh tru";
    }
    public void nhapchieucao(){
        nhapbankinh();
        System.out.println("Chieu cao =");
        Scanner scanner = new Scanner(System.in);
        chieucao = scanner.nextFloat();
    }
    public void tinhthetich(){
        tinhdientich();
        thetich = dientich * chieucao;
    }
}
