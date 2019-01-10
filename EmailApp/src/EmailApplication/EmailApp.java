package EmailApplication;

public class EmailApp {
  public static void main(String[] args) {
   Email e=new Email("Sravani","Karnati");
  // e.setPassword("sra");
   e.setAltEmail("sk@gmail.com");
   System.out.println("Your alt email is:" +e.getAltEmail());
}
}
