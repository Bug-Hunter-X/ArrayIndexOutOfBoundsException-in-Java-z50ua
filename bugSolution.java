public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2;
        }
        System.out.println(arr[4]); // Accessing a valid element
        //To avoid the exception, you can also check if the index is within bounds before accessing the element.
        int index = 5;
        if(index >= 0 && index < arr.length){
            System.out.println(arr[index]);
        } else {
            System.out.println("Index out of bounds");
        }
    }
}