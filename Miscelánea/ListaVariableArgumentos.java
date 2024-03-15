package Miscelánea;

public class ListaVariableArgumentos {
    public static void main(String[] args) {

        minimo(new int [0]);
    }

    public static int minimo(int num1,int num2){
        System.out.println("Minimo de tres valores: ");
        return Math.min(num1, num2);
    }

    public static int minimo(int...nums){
        System.out.println("Minimo de : ");
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (min>= nums[i]) {
                min = nums[i];
            }
        }
        return min;
    }
}
