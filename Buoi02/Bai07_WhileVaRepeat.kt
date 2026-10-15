// Lê Thị Mai Hiền - MSSV: 25810017

// So sánh: while dùng khi chưa biết trước số lần lặp, repeat dùng khi đã biết trước số lần lặp.
fun main() {
    println("Đếm ngược bằng while:")
    var so = 10
    while (so >= 1) {
        println(so)
        so--
    }

    println("In cố định :")
    repeat(5) {
        println("Hello")
    }
}