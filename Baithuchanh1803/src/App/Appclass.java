package App;

public class Appclass {
    import Shapes.HinhTron;
    import Shapes.HinhChuNhat;
    public class MainClass {
        public static void main(String[] args) {
            HinhTron ht = new HinhTron();
            ht.nhapbankinh();
            ht.tinhchuvi();
            ht.tinhdientich();
            ht.inchuvi();
            ht.indientich();
    
            HinhChuNhat hcn = new HinhChuNhat();
            hcn.nhap();
            hcn.chuvi();
            hcn.dientich();
            hcn.inchuvivadientich();
        }
    } 
}
