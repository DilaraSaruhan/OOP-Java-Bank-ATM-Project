public class Main {
     public static void main(String[] args) {
  
        ATM atm = new ATM();
        
        Hesap hesap = new Hesap("Dilara Saruhan","1997", 5000);
        
        atm.calis(hesap);
        System.out.println("Programdan Çıkılıyor...");
        
  }
  
}
