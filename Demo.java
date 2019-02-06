class Demo1{
  void addition(int a, int b){
    int c=a+b;
    System.out.println(c);
    }
   void deletion(int a, int b){
    int c=a-b;
    System.out.println(c);
    }
    void multiplication(int a, int b){
    int c=a*b;
    System.out.println(c);
    }
  void division(int a, int b){
    int c=a/b;
    System.out.println(c);
    }
  void show(){
    System.out.println("God is great");
  }
 }
 class Demo{
   public static void main(String args[]){
    Demo1 ob = new Demo1();
    ob.addition(2,1);
    ob.deletion(2,1);
    ob.multiplication(2,1);
    ob.division(2,1);
    }
  }
