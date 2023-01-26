package mypack1;

import java.util.Arrays;

public class GeeksStack {

	static int minDifferenceAmongMaxMin(int arr[],
            int N, int K)
{

// sort the array so that close
// elements come together.
Arrays.sort(arr);

// initialize result by
// a big integer number
int res = 2147483647;

// loop over first (N - K) elements
// of the array only
for (int i = 0; i <= (N - K); i++)
{

// get difference between max and
// min of current K-sized segment
int curSeqDiff = arr[i + K - 1] - arr[i];
res = Math.min(res, curSeqDiff);
}

return res;
}

// Driver code
public static void main(String[] args)
{
int arr[] = {10, 20, 30, 100, 101, 102};
int N = arr.length;

int K = 3;
System.out.print(
minDifferenceAmongMaxMin(arr, N, K));
}

}
