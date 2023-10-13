package oct10.oops;

public class Apple extends Mobile {

        private int memory;

        public Apple(String color, int size,int memory){
            super(color,size);
            this.memory = memory;
        }
        public void mobileDetails(){
          SetMobile();
          System.out.println(memory);

        }

    }

