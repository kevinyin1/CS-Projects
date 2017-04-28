import java.util.Scanner;
  class PI{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int term,num=3;
      double pie=1;
      p("Enter how many terms");
      term=sc.nextInt();
      for(int x=1;x<term;x++){
        if (x%2==1){
          pie=pie-(1.0/num);
          num+=2;
        }
        else{
          pie=pie+(1.0/num);
          num+=2;
        }
      }
      p("The Pie value is "+pie*4);

    }
    public static void p(String msg){
      System.out.println(msg);
    }
  }
