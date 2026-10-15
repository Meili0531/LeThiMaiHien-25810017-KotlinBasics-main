// Lê Thị Mai Hiền - MSSV: 25810017

fun main() {
    val soDuBanDau: Long = 5_000_000
    var soDuHienTai: Long = soDuBanDau

    println("Số dư ban đầu: $soDuBanDau Vnđ")

    soDuHienTai += 2_000_000
    println("Gửi 2.000.000 đồng, số dư: $soDuHienTai Vnđ")

    soDuHienTai -= 1_500_000
    println("Rút 1.500.000 đồng, số dư: $soDuHienTai Vnđ")
    
}