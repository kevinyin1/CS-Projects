import java.util.Scanner;
	public class deviation{
		public static void main(String[] args){
			 //double[] grade={54.33,81.11,0,73.5,59.1,77,68.1,62,95.1,39.5,86.5,40.5,59.5,80.5,75.9,73,86.5,62.5,68.5,50.5,54.6,73,41.6,50.5,54,37,63.6,63.6,68.5,77.5};
			double[] grade= {58,84,79,80,92,79,92,73,92,85,85,82,68,69,60,49,78,87,65,95,30,88,64,83,71,37,59,75,89,65,83,76,65,92};
			
			
		System.out.println("The standard deviation is "+Math.sqrt(dev(grade)));
		System.out.println("The mode is "+mode(grade)+". The median is "+median(grade)+"The average is "+avg(grade));
		}
		
		public static double avg(double[] x){
			double avg,sum=0;
			double[] grade=x;
			for(int index=0;index<grade.length;index++)sum+=grade[index];

			return sum/grade.length;
		}
		public static double dev(double[] x){
			double[] grade=x;
			double sum=0;
			for (int index=0;index<grade.length;index++){
				sum += Math.pow((grade[index]-avg(x)),2);
			}
			return sum/grade.length;
		}
		public static double mode(double[] x){
			double[] grades=x;
			int[] tally=new int[grades.length];
			int high=0,hg=0;
			for (int index=0;index<grades.length;index++){
				for (int pos=0;pos<grades.length;pos++)
					if (grades[index]==grades[pos])tally[pos]++;
			}
			for (int i=0;i<tally.length;i++){
				if (tally[i]>high){
					high=tally[i];
					hg=i;
				}	
			}		
			return grades[hg];
		}
		public static double median(double [] x){
			double[] grades=x;
			double temp =0;
			double med = 0;
			// sort the gades[]
			for (int index = 0; index < grades.length; index++)
				for (int i = 0; i < grades.length; i++)
					if (grades[index] > grades[i]){
						temp = grades[index];
						grades[index] = grades[i];
						grades[i] = temp;
			}
			
			// check the length of the grades[] is odd or even
			if(1== (grades.length) % 2) 
				med = grades[grades.length / 2];
		
			else 
				med = (grades[(grades.length -1)/ 2]+grades[grades.length / 2])/2;

			return med;
		}
	}	
		
			
		
	