package prototype
import prototype.framework.*

fun main() {
    val manager: Manager = Manager()
    val mbox: MessageBox = MessageBox('*')

    manager.register("warning box", mbox)

    val p1: Product = manager.create("warning box")
    p1.use("Hello World")
}