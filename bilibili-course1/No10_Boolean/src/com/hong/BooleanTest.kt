package com.hong

fun main(args: Array<String>) {
	var n1 = 4
	var n2 = 3
	println(n1 > n2)

	var n3 = Math.sqrt(5.0) - Math.sqrt(4.0);
	var n4 = Math.sqrt(4.0) - Math.sqrt(3.0);
	println("n3 > n4 ? " + (n3 > n4));

	var n5 = Math.pow(2.0, 100.0);
	var n6 = Math.pow(3.0, 75.0)
	println("2^100 > 3^75 ? " + (n5 > n6))
}
