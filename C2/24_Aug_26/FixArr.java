public class FixArr {
    
    public static void main(String[] args) {
        
        int[] arr = new int[5];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;


        //Method 1st:

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        // Method 2nd: 
        
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }


    }
}
