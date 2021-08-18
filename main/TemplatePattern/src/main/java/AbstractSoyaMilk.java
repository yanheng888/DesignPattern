/**
 * @author hengyan
 */
public abstract class AbstractSoyaMilk {

    /**
     *  template method. final template method cannot be overwritten
     */
    final void make(){
        select();
        addCondiments();
        soak();
        whip();
    }

    /**
     * select ingredients
     */
    void select(){
        System.out.println("First stemp: select good soya");
    }

    /**
     * add different condiments, abstract method can be implemented by subclass
     */
    abstract void addCondiments();

    /**
     * soak
     */
    void soak(){
        System.out.println("Third stemp, soak soya for three hours");
    }

    void whip(){
        System.out.println("Fourth step: whip soya");
    }
}
