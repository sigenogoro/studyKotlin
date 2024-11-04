package com.example.study.competition

class User(
    val nickname: String,
    val old: String,
    val birth: String,
    val state: String
) {
    fun get(): User {
        return this
    }
}


fun main() {
    val n = readln().toInt()
    for (i in 0 until n) {
        val user = readln().split(" ")
        val instance = User(nickname = user[0], old = user[1], birth = user[2], state = user[3])
        println(
            "User{\n" +
                "nickname : ${instance.nickname} \n" +
                "old : ${instance.old} \n" +
                "birth : ${instance.birth} \n" +
                "state : ${instance.state} \n" +
                "}"

        )
    }
}