import java.io.*;
import java.util.StringTokenizer;

public class main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int[] road = new int[H + 2];

        for (int i = 1; i <= N; i++) {
            int a = Integer.parseInt(br.readLine());
            if (i % 2 == 0) {
                road[1]++;
                road[a + 1]--;
            }
            else {
                road[H - a + 1]++;
                road[H + 1]--;
            }
        }

        for (int i = 2; i <= H; i++) {
            road[i] += road[i - 1];
        }

        int ans1 = Integer.MAX_VALUE;
        int ans2 = 0;

        for (int i = 1; i <= H; i++) {
            if (ans1 > road[i])
                ans1 = road[i];
        }

        for (int i = 1; i <= H; i++) {
            if (ans1 == road[i])
                ans2++;
        }

        bw.write(ans1 + " " + ans2 + "\n");
        bw.flush();

    }

}