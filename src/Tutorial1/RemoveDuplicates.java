package Tutorial1;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[]a= {10,20,10,30,40,20,50,90,45};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
				}
			}
		}

	}

}
