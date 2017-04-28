import java.util.Scanner; //Kevin Yin 9/28/15 
/*Computing devices consist of electrical circuits.
Electrical circuits are networks consisting of a closed loop, giving return path for the current.
Basic circuits can be arranged in series or in parallel as shown in the images below.
Engineers often have to determine the total resistance in a circuit.*/
	class Resistance{
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			String type;
			int ohm1,ohm2,ohm3;
			double total;
			type=rl("Enter Type of Circut");
			print("Enter the 3 ohm resistor values");
			ohm1=sc.nextInt();ohm2=sc.nextInt();ohm3=sc.nextInt();
			
			if (type.equals("parallel")){
				total=(1.0/ohm1+1.0/ohm2+1.0/ohm3);
				print("The Total Resistance is: "+1.0/total);
			}
			else{
				total=ohm1+ohm2+ohm3;
				print("The Total Resistance is: "+total);
			}
		}
		public static String rl(String msg){//rl = readline
			Scanner sc=new Scanner(System.in);
			print(msg);
			return sc.nextLine();
		}
		public static void print(String msg){
			Scanner sc=new Scanner(System.in);
			System.out.println(msg);
		}
	}