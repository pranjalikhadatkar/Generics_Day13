
public class GenericsClass<T> {
	 public static <T extends Comparable> T getMax(T first, T second, T third) {
	        if (first.compareTo(second) > 0 && first.compareTo(third) > 0) {
	            return first;
	        } else if (second.compareTo(first) > 0 && second.compareTo(third) > 0) {
	            return second;
	        } else {
	            return third;
	        }
	    }

	    public static void main(String[] args) {
	        Integer firstInt = 1, secondInt = 5, thirdInt = 9;
	        Float firstFloat = 15.7f, secondFloat = 8.2f, thirdFloat = 6.2f;
	        String firstString = "Nick", secondString = "john", thirdString = "Sachin";
	        
	        System.out.println(getMax(firstInt, secondInt, thirdInt));
	        System.out.println(getMax(firstFloat, secondFloat, thirdFloat));
	        System.out.println(getMax(firstString, secondString, thirdString));       
	    }	
 }
