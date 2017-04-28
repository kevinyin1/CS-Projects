import java.util.Scanner; //Kevin Yin 9/28/15 A2
	class triangle{
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			boolean tri=false,equ=false,isos=false,right=false;
			int s1,s2,s3;//s# is the side lengths 
			p("Enter the 3 sides of the triangle");
			s1=sc.nextInt();s2=sc.nextInt();s3=sc.nextInt();
			if(Math.sqrt(Math.pow(s1,2)+Math.pow(s2,2))==Math.sqrt(Math.pow(s3,2))||Math.sqrt(Math.pow(s2,2)+Math.pow(s3,2))==Math.sqrt(Math.pow(s1,2))
			||Math.sqrt(Math.pow(s1,2)+Math.pow(s3,2))==Math.sqrt(Math.pow(s2,2)))right=true;
			if(s1==s2&&s2==s3)equ=true;
			if(s1==s2||s2==s3||s1==s3)isos=true;
			if (s1+s2>s3&&s1+s3>s2&&s3+s2>s1)tri=true;
			
			if (tri==true&&equ==true)p("It is an equilateral triangle!");
			else if (tri==true&&isos==true)p("It is an isosceles triangle!");
			else if (tri==true&&right==true)p("It is a right triangle!");
			else if (tri==true&&!(isos==true&&equ==true&&right==true))p("It is a scalene triangle!");
			else p("It is not a triangle!");
			
		}
		
		public static String rl(String msg){//rl = readline
			Scanner sc=new Scanner(System.in);
			p(msg);
			return sc.nextLine();
		}
		public static void p(String msg){
			Scanner sc=new Scanner(System.in);
			System.out.println(msg);
		}
	}