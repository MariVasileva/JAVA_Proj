package Arithmetic;

public class Arith_IF {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 4;
        int result = num1 + num2;
        System.out.println("Результат: " + result);


        int num3 = 7;
        int num4 = ++num3; //инкремент. если num3++, то результат 7, т.к. сначала результат, а потом +1
        int num5 = num4;
        System.out.println("Результат: " + num5);

        if (num1 == num2) {
            System.out.println("Результат равен ");
        } else {
            System.out.println("Результат не равен ");
        }

        int num6 = 10;
        int num7 = 6;
        int num8 = 15;
        int num9 = 4;
        if (num6 == num7 || num8 >= num9) { // || или, && и
            System.out.println("Результат равен ");
        } else {
            System.out.println("Результат не равен ");
        }
    }
}