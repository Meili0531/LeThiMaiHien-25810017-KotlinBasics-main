// Lê Thị Mai Hiền - MSSV: 25810017

fun main() {
    val diem = 8.5

    println("Diem trung binh: $diem")

    when (diem) {
        in 8.5..10.0 -> println("Xep loai: Xuat sac")
        in 7.0..<8.5 -> println("Xep loai: Gioi")
        in 5.5..<7.0 -> println("Xep loai: Kha")
        in 4.0..<5.5 -> println("Xep loai: Trung binh")
        else -> println("Xep loai: Yeu")
    }
}
