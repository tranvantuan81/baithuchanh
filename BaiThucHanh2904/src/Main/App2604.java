package Main;

import Shape.Point;
import Shape.Triangle;

public class App2604 {
    public static void main(String[] args) {
        Point p = new Point("A", 2, 3);
        p.Nhap();
        p.In();
        Triangle tg = new Triangle("A", 2, 3);
        tg.kiemTra();
   
    }
}
