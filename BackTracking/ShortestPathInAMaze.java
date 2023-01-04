package BackTracking;

import java.util.*;

class ShortestPathInAMaze {

    static boolean[][] visited;

    static boolean isSafe(int[][] mat, boolean[][] visited,
                          int x, int y)
    {
        return (x >= 0 && x < mat.length && y >= 0
                && y < mat[0].length && mat[x][y] == 1
                && !visited[x][y]);
    }

    static int findShortestPath(int[][] mat, int i, int j,
                                int x, int y, int min_dist,
                                int dist)
    {

        if (i == x && j == y) {
            min_dist = Math.min(dist, min_dist);
            return min_dist;
        }

        visited[i][j] = true;
        if (isSafe(mat, visited, i + 1, j)) {
            min_dist = findShortestPath(mat, i + 1, j, x, y,
                    min_dist, dist + 1);
        }
        if (isSafe(mat, visited, i, j + 1)) {
            min_dist = findShortestPath(mat, i, j + 1, x, y,
                    min_dist, dist + 1);
        }
        if (isSafe(mat, visited, i - 1, j)) {
            min_dist = findShortestPath(mat, i - 1, j, x, y,
                    min_dist, dist + 1);
        }
        if (isSafe(mat, visited, i, j - 1)) {
            min_dist = findShortestPath(mat, i, j - 1, x, y,
                    min_dist, dist + 1);
        }
        visited[i][j] = false;
        return min_dist;
    }

    static int findShortestPathLength(int[][] mat,
                                      int[] src, int[] dest)
    {
        if (mat.length == 0 || mat[src[0]][src[1]] == 0
                || mat[dest[0]][dest[1]] == 0)
            return -1;

        int row = mat.length;
        int col = mat[0].length;

        visited = new boolean[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++)
                visited[i][j] = false;
        }

        int dist = Integer.MAX_VALUE;
        dist = findShortestPath(mat, src[0], src[1],
                dest[0], dest[1], dist, 0);

        if (dist != Integer.MAX_VALUE)
            return dist;
        return -1;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[][] mat = new int[][] {
                { 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 },
                { 1, 0, 1, 0, 1, 1, 1, 0, 1, 1 },
                { 1, 1, 1, 0, 1, 1, 0, 1, 0, 1 },
                { 0, 0, 0, 0, 1, 0, 0, 0, 0, 1 },
                { 1, 1, 1, 0, 1, 1, 1, 0, 1, 0 },
                { 1, 0, 1, 1, 1, 1, 0, 1, 0, 0 },
                { 1, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
                { 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 },
                { 1, 1, 0, 0, 0, 0, 1, 0, 0, 1 }
        };

        int[] src = new int[2];
        int[] dest = new int[2];
        int i,j,m,n;
        System.out.println("Enter the coordinates of the source->");
        src[0]=sc.nextInt();
        src[1]=sc.nextInt();
        System.out.println("Enter the coordinates of the destination->");
        dest[0]=sc.nextInt();
        dest[1]=sc.nextInt();
        int dist = findShortestPathLength(mat, src, dest);
        if (dist != -1)
            System.out.print("Shortest Path is " + dist);

        else
            System.out.print("Shortest Path doesn't exist");
    }
}