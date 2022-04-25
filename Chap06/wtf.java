package Chap06;
class AA{
	void averageScore(int...values){
	    double sum=0;
	    for (int i=0; i<values.length;i++){
	        sum = sum + values[i];
	    }
	    System.out.println(sum/values.length);;
	}
}
public class wtf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA a = new AA();
		a.averageScore(1);
		a.averageScore(1,2);
		a.averageScore(1,2,3,4,5,6,7,8,9,10);
	}

}
