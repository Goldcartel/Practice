package Algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int Qn = Integer.parseInt(st.nextToken());
        st=new StringTokenizer(br.readLine());
        int [] array=new int[N+1];
        int [] result=new int[Qn];
        for(int i=1;i<=N;i++) {
            array[i]=array[i-1]+Integer.parseInt(st.nextToken());
        }
        for(int i=0;i<Qn;i++) {
            st=new StringTokenizer(br.readLine());
            int start=Integer.parseInt(st.nextToken());
            int end=Integer.parseInt(st.nextToken());

            result[i] = (array[end]-array[start-1]);
        }
        for(int i : result) System.out.println(i);
    }
}
