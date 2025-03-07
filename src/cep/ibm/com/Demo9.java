package cep.ibm.com;

public class Demo9 {

	public static void main(String[] args) {
		//0 1 1 2 3 5 
		//n1 n2 n3
		
		int a[]= {7,1,3,5,4,6};
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			//System.out.println(a[i]);
		}
		
		int n1=0;
		int n2=1;
		int n3;
		int n=5;
		int sum=1;
		System.out.println(n1+" "+n2);
		for(int i=2;i<n;i++) {
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
			
			 sum=sum+n3;
		}
		System.out.println("===============");
			System.out.println(sum);
	
		// TODO Auto-generated method stub

	}

}
