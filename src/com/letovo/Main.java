package com.letovo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		n = scan.nextInt();
		int[][] d = new int [n][n];
		int last = 0;
		for (int i = 1; i < n + 1; ++i){
			if (i % 2 == 0) {
				for (int j = n - 1; j > -1; --j) {
					last += 1;
					d[i - 1][j] = last;
				}
			} else{
				for (int j = 0; j < n; ++j){
					last += 1;
					d[i-1][j] = last;
				}
			}
		}
		for(int i = 0; i < n; ++i){
			for(int j = 0; j < n; ++j){
				System.out.printf("%4d", d[i][j]);
			}
			System.out.println();
		}
	}

}
