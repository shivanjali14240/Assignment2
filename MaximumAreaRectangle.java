package com.bnt;

public class MaximumAreaRectangle {
	static class Rectangle {
		int length;
		int breadth;

		public Rectangle(int length, int breadth) {
			this.length = length;
			this.breadth = breadth;
		}

		public int area() {
			return length * breadth;
		}
	}

	public static int calculateArea(Rectangle[] rect, int N) {
		int maxArea = Integer.MIN_VALUE;

		for (int i = 0; i < N; i++) {
			int currentArea = rect[i].area();
			maxArea = Math.max(maxArea, currentArea);
		}

		return maxArea;
	}

	public static void main(String[] args) {
		Rectangle[] rect1 = { new Rectangle(1, 2), new Rectangle(3, 4), new Rectangle(5, 6) };
		int N1 = rect1.length;
		System.out.println(calculateArea(rect1, N1)); 

		Rectangle[] rect2 = { new Rectangle(12, 3), new Rectangle(40, 5) };
		int N2 = rect2.length;
		System.out.println(calculateArea(rect2, N2)); 
	}

}
