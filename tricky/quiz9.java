
    class Outer{
        private int data = 10; 
        class Inner {
            private int data = 20;
            void display(){
                int data = 30;
                System.out.println(data);
                System.out.println(this.data);
                System.out.println(Outer.this.data);
            }
        }
    }
    public class quiz9 {
        public static void main(String[] args){
            Outer outer = new Outer();
            Outer.Inner inner = outer.new Inner();
            inner.display();

        }
    }

