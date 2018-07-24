package com.mpf.kotlin

//open 非final类
open class KotlinClass {

    open fun getLongerString(string: String, string1: String): String {
        return if (string.length > string1.length) string else string1
    }

    companion object {
        @JvmStatic
        fun getLongerStringStatic(string: String, string1: String): String {
            return if (string.length > string1.length) string else string1
        }
    }
//    @JvmStatic
//    fun getLongerStringJvmStatic(string: String, string1: String): String {
//        return if (string.length > string1.length) string else string1
//    }

}