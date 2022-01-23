
public class GenericsClass<T extends Comparable<T>> {

	    public static void getMaxInt(Integer first , Integer second , Integer third ) {
	    	Integer max = first;
	        if (second.compareTo(max) > 0 ) {
	            max = second;
	        }
	        if (third.compareTo(max) > 0){
	            max = third;
	        }
	        printMax(first , second , third , max);
	    }
	    
	    public static void getMaxDouble(Double first , Double second , Double third ) {
	    	Double max = first;
	        if (second.compareTo(max) > 0 ) {
	            max = second;
	        }
	        if (third.compareTo(max) > 0){
	            max = third;
	        }
	        printMax(first , second , third , max);
	    }
	    public static String getMaxStr(String a , String b , String c ) {
	        String max = a ;
	        if (b.compareTo(max) > 0 ) {
	            max = b;
	        }
	        if (c.compareTo(max) > 0) {
	            max = c;
	        }
	        printMax(a , b , c , max);
	        return max;
	    }
	    public static <T> void printMax(T a, T b, T c, T max) {
	        System.out.printf("Max of %s, %s and %s is %s\n",a,b,c,max);
	    }
	    public static void main(String[] args) {
	        Integer firstInt = 15, secondInt = 32, thirdInt = 13;
	        Double firstDouble = 1.2, secondDouble = 8.2, thirdDouble = 60.2;
	        String firstString = "Virat", secondString = "Dhoni", thirdString = "Sachin";

	        GenericsClass<Integer> Generic1 = new GenericsClass<Integer>();
	        GenericsClass<Float>  Generic2 = new GenericsClass<Float>();        
	        GenericsClass<String> Generic3= new GenericsClass<String>();
	     
	        Generic1.getMaxInt(firstInt, secondInt, thirdInt);
	       Generic2.getMaxDouble(firstDouble, secondDouble, thirdDouble);
	       Generic3.getMaxStr(firstString, secondString, thirdString);     
	    }
}
