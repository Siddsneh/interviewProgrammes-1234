package Tutorial1;

public class reverseStringmethod2 {

	public static void main(String[] args) {
		String a="siddhesh";
		
		//conver to char array
		char b[]=a.toCharArray();
		
		for(int i=b.length-1;i>0;i--) {
			System.out.println(b[i]);
		}

	}

}
