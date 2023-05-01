package com.example.study.inheritance


// 共通の Any スーパークラスをもちます。これはスーパータイプの宣言がないクラスのデフォルトのスーパークラス
class Example


// 継承を基本、禁止。継承を行う場合は、open キーワードを利用する
open class Base(){
    open fun overrideSample(){
        println("オーバライド")
    }
}

class Derived(val num: Int) : Base() {
    override fun overrideSample(){
        println("$num")
    }
}

fun main(){
    Derived(10).overrideSample()
}