public class ArrayRotation {
    public void rotate(int[] arr, int d, int n){
            if (n==0){
                return;
            }
            d = d % n;

            if(d == 0){
                return;
            }

            int[] temp = new int[d];

            for (int i = 0; i < d; i++) {
                    temp[i] = arr[i];
            }

             for (int i = d; i < n; i++) {
                    arr[i - d] = arr[i];
             }

             for (int i = 0; i < d; i++) {
                  arr[n - d + i] = temp[i];
             }

    }
}
