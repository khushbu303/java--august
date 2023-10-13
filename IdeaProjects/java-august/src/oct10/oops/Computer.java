package oct10.oops;

public class Computer {
   private int hdd;
   private int size;
   private  String model;

   public Computer(int hdd, int size, String model){
       this.hdd = hdd;
       this.size = size;
       this.model = model;
   }
   public void setDisplay(){
       System.out.println(hdd);
       System.out.println(size);
       System.out.println(model);

   }
}
