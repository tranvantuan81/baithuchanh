package main;
import shapes.hinhchunhat;
import shapes.hinhtron;
import shapes.hinhtru;
import shapes.hinhvuong;

public class App54 {
   public static void main(String[] args) {
       hinhtron hinhtron = new hinhtron();
       hinhtron.xuatten();
       hinhtron.nhapbankinh();
       hinhtron.nhapbankinh();
       hinhtron.tinhchuvi();
       hinhtron.tinhdientich();
       hinhtron.inchuvi();
       hinhtron.indientich();

       hinhtru hinhtru = new hinhtru();
       hinhtru.xuatten();
       hinhtru.nhapchieucao();
       hinhtru.tinhdientich();
       hinhtru.inthetich();

       hinhchunhat hinhchunhat = new hinhchunhat();
       hinhchunhat.xuatten();
       hinhchunhat.nhapchieudai();
       hinhchunhat.nhapchieurong();
       hinhchunhat.tinhchuvi();
       hinhchunhat.tinhdientich();
       hinhchunhat.inchuvi();
       hinhchunhat.indientich();

       hinhvuong hinhvuong = new hinhvuong();
       hinhvuong.xuatten();
       hinhvuong.nhapcanh();
       hinhvuong.tinhchuvi();
       hinhvuong.tinhdientich();
       hinhvuong.inchuvi();
       hinhvuong.indientich();

   }
}
