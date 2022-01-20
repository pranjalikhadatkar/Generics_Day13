
public class GenericsClass {
	public static void findMaxDouble(Double x, Double y, Double z) {
		Double max=x;
		if(y.compareTo(max)>0) {
			max=y;
		}
		if(z.compareTo(max)>0) {
			max=z;
		}
		System.out.printf("Maximum of %s, %s, and %s is %s\n" , x, y, z, max);
	}
public static void main(String[] args) {
	Double x=3.2, y=12.5, z=9.4;
	findMaxDouble(x, y, z);
 }
}
