package example

fun main() {
    var neverNull: String = "This can't be null"

//    neverNull = null // Compile error occurred.

    var nullable: String? = "You can keep a null here"

    nullable = null

    var inferredNonNull = "This compiler assumes non-null"

//    inferredNonNull = null // Compile error occurred.

    fun strLength(notNull: String): Int {
        return notNull.length
    }

    strLength(neverNull)
//    strLength(nullable) // Compile error occurred.
}