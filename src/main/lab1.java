package main;

public class lab1 {
    static void main() {

        int[] numbers={2,3,4,5,6};
        System.out.println(minMaxDifference(numbers));
        minAndSecondMin(numbers);
        System.out.println( mathExpression(2,5));

    }
    public static int minMaxDifference(int[] numbers){
        int max = numbers[0];
        int min =numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        int result = max-min;
        return result;
    }

    public static void minAndSecondMin(int[] numbers){

        int min =numbers[0];

        int minIndex=0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                minIndex=i;
            }
        }

        int temp= numbers[numbers.length-1];
        numbers[numbers.length-1] = min;
        numbers[minIndex]= temp;

        int secondMin = numbers[0];
        for (int i = 0; i < numbers.length-1; i++) {
            if (numbers[i] < secondMin) {
                secondMin = numbers[i];
            }
        }
        System.out.println("min:"+min);
        System.out.println("second min:"+ secondMin);

    }
    public static double mathExpression(double x, double y){
        double a = (4*y)/5 -x;
        double sum= x*x + a*a;
        return sum;
    }
}
