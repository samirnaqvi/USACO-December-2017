import java.io.*;
import java.util.*;
public class prob1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (new File("shuffle.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("shuffle.out")));
		int times = sc.nextInt(); 
		int[] array = new int[times];
		int[] array2 = new int[times];
		for (int x=0; x<times;x++)
		{
			array[x]=sc.nextInt();
		}
		for (int z=0; z<times;z++)
		{
			array2[z]=sc.nextInt();
		}
		//System.out.println(Arrays.toString(array));
		//System.out.println(Arrays.toString(array2));
		int [] new1 =new int[times];
		int [] new2 =new int[times];
		int [] new3 =new int[times];
		
		for (int b=0; b<times;b++)
		{
		int a=array[b];
		new1[b]=array2[a-1];
		}
		
		System.out.println(Arrays.toString(new1));
		for (int m=0; m<times;m++)
		{
		int a=array[m];
		new2[m]=new1[a-1];
		}
		System.out.println(Arrays.toString(new2));
		for (int k=0; k<times;k++)
		{
		int a=array[k];
		new3[k]=new2[a-1];
		}
		
		System.out.println(Arrays.toString(new3));
		/*for (int b=0; b<times;b++)
		{
		temp = find(array, (b+1));
		new1[b]=array2[temp];	
		}*/
		for (int m=0; m<times;m++)
		{
		pw.println(new3[m]);
		}
		pw.close();
		}
	
	public static int find(int[] array, int value) {
	    for(int i=0; i<array.length; i++) 
	         if(array[i] == value)
	             return i;
	    return -1;
	}

}
