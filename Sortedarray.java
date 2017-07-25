package guvi;
import java.util.Scanner;
public class Sortedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sor=0;
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
	a[i]=sc.nextInt();
}
for(int j=0;j<n;j++){
	if(a[j]>sor){
		sor=a[j];
	}
}
System.out.println(sor);
	}

}
