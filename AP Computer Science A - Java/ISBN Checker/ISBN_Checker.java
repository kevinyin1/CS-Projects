import java.util.Scanner;
	class a3{
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			int d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,tmp;
			String num;
			p("Enter ISBN Number");
			num=sc.nextLine();
			d1=Integer.parseInt(num.substring(0,1));
			d2=Integer.parseInt(num.substring(1,2));
			d3=Integer.parseInt(num.substring(2,3));
			d4=Integer.parseInt(num.substring(3,4));
			d5=Integer.parseInt(num.substring(4,5));
			d6=Integer.parseInt(num.substring(5,6));
			d7=Integer.parseInt(num.substring(6,7));
			d8=Integer.parseInt(num.substring(7,8));
			d9=Integer.parseInt(num.substring(8,9));
			tmp=(d1*1+d2*2+d3*3+d4*4+d5*5+d6*6+d7*7+d8*8+d9*9)%11;
			if (num.substring(9,10).equals("x"))d10=10;
			else d10=Integer.parseInt(num.substring(9,10));
			if (d10==tmp)p("It is an ISBN code");
			else p("It isn't an ISBN code");
		}
		public static void p(String msg){
			System.out.println(msg);
		}
	}
	