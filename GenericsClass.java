
public class GenericsClass {
	public static void findMaxString(String x, String y, String z) {
		String max=x;
		if(y.compareTo(max)>0) {
			max=y;
		}
		if(z.compareTo(max)>0) {
			max=z;
		}
		System.out.printf("Maximum of %s, %s, and %s is %s\n" , x, y, z, max);
	}
public static void main(String[] args) {
	String x="apple", y="peach", z="banana";
	findMaxString(x, y, z);
}
	
}
