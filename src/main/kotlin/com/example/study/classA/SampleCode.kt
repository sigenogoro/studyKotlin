package com.example.study.classA

//fun main() {
//    // 変数名に型を定義しなくても入れることはできる
//
////  IntelliJ からは、警告文として「冗長である」ことが記載されている
//    val message: String = "Hello World"
//    val age = 11
//    println(message)
//    println(age)
//
////  このような書き方もできる
//    println(message);println(age)
//}

// 型の定義 is演算子を使って、型チェック
fun main() {
    val byteCode: Byte = 125
    println(byteCode is Byte)
    val shortCode: Short = 3333
    println(shortCode is Short)
    // 数値だけを入れた場合のデフォルトはInt型
    val intCode = 123
    println(intCode is Int)

    // Int型と同じ型に含まれる場合は、to〇〇と宣言しないとエラーになる
//  val smartCode = 122
//  println(smartCode is Long) -> エラーとなる

    val smartCode = 122L
    println(smartCode is Long)

    // 一番大きな数値の型にできる
    val longCode = 99999999999999
    println(longCode is Long)
    // Long型にできるショートカットな記入方法
    val shortLongCode = 144L
    println(shortLongCode is Long)
}