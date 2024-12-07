package day24_methods;

public class OurArrayClass {
    public static void main(String[] args) {
        int[] num1 = {213,45,23,65,87,98,43};
        int[] num2 = {54,75,5678,234,23,54,2,55};

        arrayFirstElem(num1);
        arrayLastElem(num1);
        System.out.println("-----");

        arrayMiddleElem(num1);
        arrayMiddleElem(num2);
    }
    public static void arrayFirstElem(int [] arr){
        System.out.println("First value in array : " + arr[0]);

    }
    public static void arrayLastElem (int [] arr){
        System.out.println("Last value in array :" + arr[arr.length-1]);
    }
    public static void arrayMiddleElem(int [] num){
        if(num.length % 2 ==0){
            System.out.println("Middle first:" + num[num.length/2-1]);
            System.out.println("Middle second : " + num[num.length/2]);
        }else{
            System.out.println("Middle " + num[num.length/2]);
        }
    }
}
