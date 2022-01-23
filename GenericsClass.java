public class GenericsClass<T extends Comparable<T>> {

    T x, y, z;

    public GenericsClass(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void testMaximum() {
        GenericsClass.findMaximum(this.x, this.y, this.z);
    }

    public static <T extends Comparable<T>> void findMaximum(T firstNumber, T secondNumber, T thirdNumber) {
        T maximumNumber;

        if(firstNumber.compareTo(secondNumber)>0 && firstNumber.compareTo(thirdNumber)>0) {
            maximumNumber = firstNumber;
        }
        else if(secondNumber.compareTo(firstNumber)>0 && secondNumber.compareTo(thirdNumber)>0) {
            maximumNumber = secondNumber;
        }
        else {
            maximumNumber = thirdNumber;
        }
        
        System.out.println("The maximum number is: " + maximumNumber);
    }

    public static void main(String[] args) {

        Integer firstNumber = 55, secondNumber = 24, thirdNumber = 17;
        Double number1 = 1.3, number2 = 9.3, number3 = 5.1;
        String firstString = "pranay", secondString = "nikhil", thirdString = "bhimraoji";

        new GenericsClass<Integer>(firstNumber, secondNumber, thirdNumber).testMaximum();
        new GenericsClass<Double>(number1, number2, number3).testMaximum();
        new GenericsClass<String>(firstString, secondString, thirdString).testMaximum();

    }
}
