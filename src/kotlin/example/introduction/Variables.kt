package example.introduction

fun main() {
    var a: String = "initial"
    println(a)

    val b: Int = 1
    val c = 3

//    var e: Int
//    println(e) // Compile Error Occurred

    val d: Int

    if (someCondition()) {
        d = 1
    } else {
        d = 2
    }

    println(d)
}

fun someCondition(): Boolean {
    return true
}

