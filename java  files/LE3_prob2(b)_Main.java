public class Main{
  public static void main(String[] args){
    AbsTest a = new AbsTest(){
        public void display(){
            System.out.println("Implementation in anonymous class of AbsTest");
        }
    };
    a.display();
  }
}