package Main;
import Person.Customer;
import Person.VIPCustomer;
public class khachhang {
   public static void main(String[] args){
       Customer ctm = new Customer();
       VIPCustomer vip = new VIPCustomer();
       ctm.nhap();
       ctm.xuat();
       vip.nhap();
       vip.xuat();
       
   } 
}
