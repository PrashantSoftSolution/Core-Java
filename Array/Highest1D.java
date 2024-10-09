public class Highest1D {
    public static void main(String[] args) {
        int arr[]={10, 29, 40, 60, 69};
        int max=arr[0];
        for ( int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max= arr[i];

            }
        }
        System.out.print("Maximum value in array " + max);

        
    }
}
