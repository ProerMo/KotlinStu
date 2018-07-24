package com.mpf.kotlin

import com.mpf.java.JavaClass

val value1 = "mo1"
val value2: String = "mo2"
val value3: String? = null
var var4 = "mo4"
var var5: String = "mo5"
var var6: String? = null
val value7: String? = "mo7"
var var8 = 1
val value9 = 2

fun main(args: Array<String>) {
//    value1 = value2
//    var4 = value3!!
//    println(var4)
    var4 = value7!!
    println(var4)
    println("this is var4:$var4 this is var6:$var6")
    fun_default()
    fun_default(value1, value2)
//    fun_return_string(var8, value9)
    println("${fun_return_string(var8, value9)}")
    fun_default(value2, fun_return_string(10, 4))
    var javaClass: JavaClass = JavaClass()
    println("the small is ${javaClass.getSmaller(1, 4)}")
    var6 = "\n\n"
    val value10 = "\n\n"
    println("var6 is NullOrBlank?${var6.isNullOrBlank()}")
    println("var6 is Blank?${value10.isBlank()}")
    println("KotlinClass static func getLongerStringStatic ${KotlinClass.getLongerStringStatic("", "aaaaa")}")
    println("KotlinClass func getLongerString ${KotlinClass().getLongerString("sdfs","gggggggggg")}")
}

fun fun_default(string: String = var4, string1: String? = value1) {
    println("this is string:$string this is String1:$string1")
}

fun fun_return_string(int1: Int, int2: Int): String? {
//    if ()
//    return (int1 > int2).toString()
    if (int1 > int2)
        return "int1>int2"
//    else return var6
//    else return value3!!
    else return value3
}