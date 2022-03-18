import java.util.*;
public class physics {

    public boolean sum(int n, int [][]A){
        int sum=0;

        if ( n<1 || n>100) { //checks n's range
            return false;
        }

        for (int i=0; i<n; i++) {
            for (int j = 0; j < 3; j++) {
                if (A[i][j] <= -101 || A[i][j] >= 101){   //checks each x,y,z range
                    return false;
                }
            }
        }

        for (int j=0; j<3; j++) {
            for (int k = 0; k < n; k++){
                sum = sum + A[k][j];  // inner loop that sums all values of x then y then z
            }
            if (sum != 0) {          // if the sum of Xs is not zero immediately exit loop, if its  zero complete loop to check sum of Ys and then finally sum of Zs
                return false;
            }
        }
        return true;
    }


}
