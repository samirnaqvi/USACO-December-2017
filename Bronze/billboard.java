import java.io.*;
import java.util.*;
public class prob2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (new File("billboard.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("billboard.out")));
		int x1 = sc.nextInt(); 
		int x2 = sc.nextInt(); 
		int x3 = sc.nextInt(); 
		int x4 = sc.nextInt(); 
		int y1 = sc.nextInt(); 
		int y2 = sc.nextInt(); 
		int y3 = sc.nextInt(); 
		int y4 = sc.nextInt(); 
		int z1 = sc.nextInt(); 
		int z2 = sc.nextInt(); 
		int z3 = sc.nextInt(); 
		int z4 = sc.nextInt(); 
		int area= (x3-x1)*(x4-x2)+(y3-y1)*(y4-y2);
		//System.out.println(area);
		int carea=0;
		int darea=0;
		if(z1>x3 || x1>z3 || z2>x4|| x2>z4)
		{
			carea=0;
		}
		else 
		{
			int clen= Math.min(z3,x3)-Math.max(x1,z1);
			int cwid=Math.min(z4,x4)-Math.max(x2,z2);
			carea=clen*cwid;
		}
		if(z1>y3 || y1>z3 || z2>y4 || y2>z4)
		{
			darea=0;
		}
		else 
		{
			int dlen= Math.min(z3,y3)-Math.max(y1,z1);
			int dwid=Math.min(z4,y4)-Math.max(y2,z2);
			darea=dlen*dwid;
		}
		
		int f = area-carea-darea;
		//System.out.println(carea);
		//System.out.println(darea);
		//System.out.println(f);
		pw.println(f);
		pw.close();
	}

}
