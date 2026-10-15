// Lê Thị Mai Hiền - MSSV: 25810017

fun main() {
    var soLienTruoc = 0
    var soSau = 1

    println("Các số Fibonacci nhỏ hơn 100:")
    for (viTri in 0..99) {
        if (soLienTruoc >= 100) break

        println("Vị trí $viTri: $soLienTruoc")

        val tong = soLienTruoc + soSau
        soLienTruoc = soSau
        soSau = tong
    }
}