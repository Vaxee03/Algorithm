import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        return bfs(maps, n, m);
    }

    private int bfs(int[][] maps, int n, int m) {
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        boolean[][] visited = new boolean[n][m];
        Queue<int[]> queue = new LinkedList<>();
        
        queue.add(new int[]{0, 0, 1}); // 시작점 (x, y, 이동 거리)
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int distance = current[2];

            // 목표 지점 도착 시 최단 거리 반환
            if (x == n - 1 && y == m - 1) {
                return distance;
            }

            // 네 방향 이동
            for (int[] dir : directions) {
                int nx = x + dir[0];
                int ny = y + dir[1];

                if (nx >= 0 && ny >= 0 && nx < n && ny < m && maps[nx][ny] == 1 && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    queue.add(new int[]{nx, ny, distance + 1});
                }
            }
        }

        return -1; // 상대 팀 진영에 도달할 수 없는 경우
    }
}
