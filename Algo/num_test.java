package Algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num_test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] sum = new int[N+1];
        int[] temp = new int[N+1];
        for(int i=1; i<=N; i++) {
            sum[i] = Integer.parseInt(st.nextToken());
            temp[i] = sum[i];
        }
        int[][] arr = new int[N][N+1];
        for(int i=1;i <=N; i++) {
            for(int j=0; j<N; j++) {
                sum[i] = sum[i] +sum[i-1];
                arr[i-1][j+1] = sum[i];
            }

            sum[i] = temp[i];


        }
    }
}
