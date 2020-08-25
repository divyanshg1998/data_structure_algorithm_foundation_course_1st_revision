package Jan12_2019;

public class FloodFill {

	public static void main(String[] args) {
		int[][] maze = { 
				{ 1, 0, 0, 1, 1 },
				{ 1, 1, 1, 1, 1 },
				{ 1, 0, 1, 0, 1 },
				{ 1, 1, 1, 0, 1 },
				{ 1, 0, 0, 1, 1 } };
		Rec(maze, new boolean[maze.length][maze[0].length], 0, 0, "");
	}

	// boolean matrix is used so that we dont
	// go back to the same place
	public static void Rec(int[][] mat, boolean[][] visited, int sr, int sc, String path) {

		if (sr == mat.length - 1 && sc == mat[0].length - 1) {
			System.out.println(path);
			return;
		}
		//JUST REMOVE ALL THE IF STATEMENTS
//		if(sr <= mat.length - 1|| sc<=mat[0].length-1 || sr>=0|| visited[sr][sc]==true
//		|| visited[sr][sc]==true ) return;
//same program 
		visited[sr][sc] = true;

		if (sr + 1 <= mat.length - 1 && mat[sr + 1][sc] == 1 && visited[sr + 1][sc] != true)
			Rec(mat, visited, sr + 1, sc, path + "D");

		 if (sc + 1 <= mat[0].length - 1 && mat[sr][sc + 1] == 1 && visited[sr][sc + 1] != true)
			Rec(mat, visited, sr, sc + 1, path + "R");

		 if (sr - 1 >= 0 && mat[sr - 1][sc] == 1 && visited[sr - 1][sc] != true)
			Rec(mat, visited, sr - 1, sc, path + "U");

		 if (sc - 1 >= 0 && mat[sr][sc - 1] == 1 && visited[sr][sc - 1] != true)
			Rec(mat, visited, sr, sc - 1, path + "L");
		
		visited[sr][sc] = false;
	}

}
