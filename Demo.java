class Demo1{
  void addition(int a, int b){
    int c=a+b;
    System.out.println(c);
    }
   void deletion(int a, int b){
    int c=a-b;
    System.out.println(c);
    }
 }
 class Demo{
   public static void main(String args[]){
    Demo1 ob = new Demo1();
    ob.addition(2,1);
    ob.deletion(2,1);
    }
  }
