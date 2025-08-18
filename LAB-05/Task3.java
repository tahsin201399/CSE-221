import java.io.*;
import java.util.*;

public class Task3 {
    static ArrayList<Integer>[] adjoints;
    static int[] parent;
    static boolean[] visited;
    static PrintWriter pw;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        adjoints = new ArrayList[N + 1];
        for (int i = 0; i <= N; i++) adjoints[i] = new ArrayList<>();

        int[] u = new int[M + 1];
        int[] v = new int[M + 1];

        if (M > 0) {
            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= M; i++) {
                u[i] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= M; i++) {
                v[i] = Integer.parseInt(st.nextToken());
            }

            for (int i = 1; i <= M; i++) {
                adjoints[u[i]].add(v[i]);
                adjoints[v[i]].add(u[i]);
            }
        }

        // sort neighbors for lexicographic order
        for (int i = 1; i <= N; i++) {
            Collections.sort(adjoints[i]);
        }

        visited = new boolean[N + 1];
        parent = new int[N + 1];
        Arrays.fill(parent, -1);

        int dist = bfs(S, D);

        if (dist == -1) {
            pw.println(-1);
        } else {
            pw.println(dist);
            ArrayList<Integer> path = new ArrayList<>();
            int cur = D;
            while (cur != -1) {
                path.add(cur);
                cur = parent[cur];
            }
            Collections.reverse(path);
            for (int x : path) {
                pw.print(x + " ");
            }
            pw.println();
        }

        pw.flush();
    }

    private static int bfs(int S, int D) {
        Queue<Integer> q = new LinkedList<>();
        int[] dist = new int[adjoints.length];
        Arrays.fill(dist, -1);

        q.add(S);
        visited[S] = true;
        dist[S] = 0;

        while (!q.isEmpty()) {
            int u = q.poll();
            if (u == D) return dist[u];

            for (int v : adjoints[u]) {
                if (!visited[v]) {
                    visited[v] = true;
                    parent[v] = u;
                    dist[v] = dist[u] + 1;
                    q.add(v);
                }
            }
        }

        return -1; // unreachable
    }
}