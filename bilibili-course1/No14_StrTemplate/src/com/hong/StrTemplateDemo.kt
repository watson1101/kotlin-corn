package com.hong

fun main(args: Array<String>) {
	var s = strGenerater("��԰");
	println(s)
}
// �ַ���ģ�壬${}��ʾ��Ҫ�滻�����ݣ�����˫���ű�ʾ?
fun strGenerater(palceName: String): String {
	var templateStr = """�ҽ���ȥ${palceName}�棬${palceName}��${palceName.length}���֡�"""
	return templateStr
}
