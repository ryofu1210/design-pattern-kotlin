package prototype.framework

public class Manager {
//     private val showcase_hashmap = HashMap<String, Product>()
    // HashMapだとエラーになる
    private val showcase = mutableMapOf<String, Product>()
    public fun register(name: String, proto: Product) {
        showcase[name] = proto
    }

    public fun create(proto_name: String): Product {
        val p: Product = showcase.getValue(proto_name)
        return p.createClone()
    }

}