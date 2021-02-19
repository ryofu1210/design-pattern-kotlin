package prototype.framework

// public interface Product: CloneableだとCloneableがうまく継承されない。おそらくInterfaceは継承ができない。
// abstract class Product: Cloneableで抽象クラスを作成すればいける
public interface Product{
    public abstract fun use(s: String)
    public abstract fun createClone(): Product
}