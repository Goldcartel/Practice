package Algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class num_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double[] arr = new double[Integer.parseInt(br.readLine())];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        double sum = 0;
        double result = 0;
        for(int i = 0; i<arr.length; i++) {
            arr[i] = Double.parseDouble(st.nextToken());
            sum += arr[i];
            if(i == arr.length-1) {
                Arrays.sort(arr);
                result = sum*100/ arr[arr.length-1]/ arr.length;
            }
        }
        System.out.println(result);
    }
}
