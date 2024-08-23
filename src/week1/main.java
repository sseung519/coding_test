package week1;


import java.io.*;
import java.util.StringTokenizer;

public class main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] input = new int[n + 1]; //배열은 index 0 부터 시작이기 때문에 편허게 계산하기 위해 1로 만들어주기. 결과에서 다시 -1해주면됨

        st = new StringTokenizer(br.readLine());
        input[1] = Integer.parseInt(st.nextToken());
        for(int i = 2; i <= n; i++) {
            input[i] = input[i -1] + Integer.parseInt(st.nextToken()); //여기서 -해주기
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write((input[b]) - input[a-1] + "\n");
        }
        bw.flush();

    }
}
