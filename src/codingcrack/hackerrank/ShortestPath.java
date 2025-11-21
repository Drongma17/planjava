package codingcrack.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ShortestPath {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }

    static class Pair implements Comparable<Pair> {
        long distance;
        int node;

        public Pair(long distance, int node) {
            this.distance = distance;
            this.node = node;
        }

        @Override
        public int compareTo(Pair other) {
            return Long.compare(this.distance, other.distance);
        }
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();

        int n = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        int t = sc.nextInt();

        // Create adjacency list for the graph
        List<List<Pair>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        // Read edges
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            long w = sc.nextLong();
            graph.get(u).add(new Pair(w, v));
        }

        // Find shortest path
        long result = dijkstra(n, graph, s, t);

        if (result == Long.MAX_VALUE) {
            System.out.println("NO_PATH");
        } else {
            System.out.println(result);
        }
    }

    static long dijkstra(int n, List<List<Pair>> graph, int source, int target) {
        long[] dist = new long[n + 1];
        Arrays.fill(dist, Long.MAX_VALUE);
        dist[source] = 0;

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.offer(new Pair(0, source));

        while (!pq.isEmpty()) {
            Pair current = pq.poll();
            long currentDist = current.distance;
            int u = current.node;

            // Skip if we found a better path already
            if (currentDist > dist[u]) {
                continue;
            }

            // If we reached the target, we can return early
            if (u == target) {
                return currentDist;
            }

            // Explore neighbors
            for (Pair edge : graph.get(u)) {
                int v = edge.node;
                long weight = edge.distance;

                long newDist = currentDist + weight;
                if (newDist < dist[v]) {
                    dist[v] = newDist;
                    pq.offer(new Pair(newDist, v));
                }
            }
        }

        return dist[target];
    }
}
