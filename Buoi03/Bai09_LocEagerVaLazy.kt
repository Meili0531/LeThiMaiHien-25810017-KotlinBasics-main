// Lê Thị Mai Hiền - MSSV: 25810017

fun main() {
    val dsNhacCu = listOf("Piano", "Guitar", "Violin", "Guzheng", "Drum", "Flute", "Ukulele")

    // 1. Lọc thông thường (Eager Evaluation)
    val ketQuaEager = dsNhacCu.filter { it.startsWith("G") }
    println("Lọc thông thường (Eager): $ketQuaEager")

    // 2. Lọc qua Sequence (Lazy Evaluation)
    val ketQuaLazy = dsNhacCu.asSequence()
        .filter { it.startsWith("G") }
        .toList()
    println("Lọc qua Sequence (Lazy): $ketQuaLazy")
}