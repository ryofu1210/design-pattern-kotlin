package prototype
import prototype.framework.*

class MessageBox: Product, Cloneable {
    private val deco_char: Char

    constructor(deco_char: Char) {
        this.deco_char = deco_char
    }

    public override fun use(s: String) {
        val length = s.length
        for(i in 0..(length + 4)){
            print(deco_char)
        }

        println()
        println("$deco_char $s $deco_char")

        for(i in 0..(length + 4)){
            print(deco_char)
        }
        println()
    }

    public override fun createClone(): Product {
//        val p: Product
        // https://medium.com/kaleidot725/kotlin%E3%81%A7%E3%83%87%E3%82%B6%E3%82%A4%E3%83%B3%E3%83%91%E3%82%BF%E3%83%BC%E3%83%B3-prototype%E7%B7%A8-b1cddb602568
        try{
            // Type mismatch. Required: Product. Found: Anyというエラーがでる。これはcloneの戻り値の型がProductじゃなくてAnyになってるよという意味。型アサーションしてやればよい
            // val p: Product = clone()
            return clone() as Product
        }catch(e: CloneNotSupportedException) {
            throw e
        }
    }
}