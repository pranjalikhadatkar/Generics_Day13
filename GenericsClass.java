
public class GenericsClass {
	public static void findMaxInteger(Integer x, Integer y, Integer z) {
		Integer max=x;
		if(y.compareTo(max)>0) {
			max=y;
		}
		if(z.compareTo(max)>0) {
			max=z;
		}
		System.out.printf("Maximum of %s, %s, and %s is %s\n" , x, y, z, max);
	}
public static void main(String[] args) {
	int x=50, y=30, z=35;
	findMaxInteger(x, y, z);
}
}
