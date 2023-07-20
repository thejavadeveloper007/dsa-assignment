package com.rakesh;

import java.util.Vector;

public class Program7 {
	static int removeConsecutiveSame(Vector<String> v) {
		int n = v.size();
		for (int i = 0; i < n - 1;) {
			if (v.get(i).equals(v.get(i + 1))) {
				v.remove(i);
				v.remove(i);
				if (i > 0)
					i--;
				n = n - 2;
			} else
				i++;
		}
		return v.size();
	}

	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.addElement("ab");
		v.addElement("aa");
		v.addElement("aa");
		v.addElement("bcd");
		v.addElement("ab");
		System.out.println(removeConsecutiveSame(v));
	}
}