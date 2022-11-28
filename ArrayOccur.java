package com.practice.assignment1;

public class ArrayOccur {

	public static void main(String[] args) {
		int a[] = { 2, 43, 5, 2, 8, 5, 2, 9, 45, 8 };

		int f[] = new int[a.length];
		int visited = -1;
		for (int i = 0; i < a.length; i++) {
			int count = 1;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j])
				{
					count++;
					f[j] = visited;
				}

			}
			if (f[i] != visited) {
				f[i] = count;
				System.out.println(a[i] + " has occurred " + f[i] + " times");

			}

		}

	}

}
