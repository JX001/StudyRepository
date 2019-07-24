package com.jjx.study;

/**
 * 翻转字符串
 * 
 * @author jiangjinxin
 *
 */
public class ReverseStr {
	public static void main(String[] args) {
		reverseStr();
	}

	public static void reverseStr() {
		String str = "abcdefg";
		StringBuilder strbuilder = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			strbuilder.append(str.charAt(i));
		}
		System.out.println(strbuilder);
	}
}
