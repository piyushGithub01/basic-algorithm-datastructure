package com.matrix.d2.geeks;

public class WordSearch {

	public static void main(String[] args) {
		char[][] board = {
				{'A','B','C','E'},
				{'S','F','C','S'},
				{'A','D','E','E'}
		};
		WordSearch ws = new WordSearch();
		boolean ABCCED = ws.search(board, "ABCCED");
		System.out.println(ABCCED);
		boolean SEE = ws.search(board, "SEE");
		System.out.println(SEE);
		boolean ABCB = ws.search(board, "ABCB");
		System.out.println(ABCB);
	}
	
	public boolean search(char[][] board, String word) {
		int m = board.length;
		int n = board[0].length;
		boolean result = false;
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(dfs(board, word, i, j, 0)) {
					result = true;
					break;
				}
				if(result) {
					break;
				}
			}
		}
		return result;
	}
	
	public boolean dfs(char[][] board, String word, int i, int j, int k) {
		int m = board.length;
		int n = board[0].length;
		if(i<0||j<0||i>=m||j>=n) {
			return false;
		}
		if(board[i][j] == word.charAt(k)) {
			if(k == word.length()-1) {
				return true;
			}
			char temp = board[i][j];
			board[i][j] = '#';
			if(dfs(board, word, i-1, j, k+1) ||
				dfs(board, word, i+1, j, k+1) ||
				dfs(board, word, i, j-1, k+1) ||
				dfs(board, word, i, j+1, k+1)) {
				board[i][j] = temp;
				return true;
			}
		}
		return false;
	}

}
