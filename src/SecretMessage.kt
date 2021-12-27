fun main() {
    val msg = "Hello003"
    val msgToByteArrayList = msg.encodeToByteArray()

    println(msgToByteArrayList)
    println(msgToByteArrayList
        .map { it.toString(2).padStart(8, '0') }
        .map { it.toCharArray().toList() }
        .flatten()
        .map { if (it == '1') 1 else 0 }
        //.joinToString()
    )

//    println(
//        Triple(0, 0, 3)
//            .toList()
//            .map { Char(it) }
//    )
}