package com.hong

fun main(args: Array<String>) {
	var s = strGenerater("公园");
	println(s)
}
// 字符串模板，${}表示需要替换的内容，三个双引号表示?
fun strGenerater(palceName: String): String {
	var templateStr = """我今天去${palceName}玩，${palceName}有${palceName.length}个字。"""
	return templateStr
}
