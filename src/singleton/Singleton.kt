package singleton

public class Singleton {
    // companion objectのブロック内に書くことにより、変数・メソッドをstatic化する
    // @see https://tech.ga-tech.co.jp/entry/2020/07/android-kotin-companion-object
    companion object {
        private val singleton: Singleton = Singleton()

        fun getInstance(): Singleton {
            return singleton
        }
    }

    // コンストラクタはprivateにして、外部から直接インスタンス化できないようにする
    private constructor() {
        println("インスタンスを生成しました")
    }
}