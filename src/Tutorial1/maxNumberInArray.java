




package Tutorial1;


public class maxNumberInArray{

public static void main(String[] args){

int a[]={20,30,40,50,60};
int maxNum=a[0];

for(int i=1;i<a.length;i++){

if(a[i]<maxNum){
maxNum=a[i];
}

}


System.out.println(maxNum);


}





}