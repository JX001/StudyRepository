package com.jjx.study;

/**
 * 实现FizzBuzz 编写一个算法，打印输出1到N之间的所有数字，将3的倍数替换为String Fizz，
 * 将5的倍数替换为Buzz，将15的倍数替换为FizzBuzz。
 */
public class FizzBuzz {
	public static void main(String[] args) {
		fizzBuzz();
	}

	public static void fizzBuzz() {
		String str = "";
		for (int i = 1; i < 50; i++) {
			str = appendStr(3, i, "Fizz") + appendStr(5, i, "Buzz");
			if ("".equals(str))
				str = i + "";
			System.out.println(str);
		}

	}

	public static String appendStr(int v, int i, String str) {
		String s = i % v == 0 ? str : "";
		return s;
	}
}
