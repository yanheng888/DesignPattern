/**
 * @author hengyan
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("---make red bean milk");
        AbstractSoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
        redBeanSoyaMilk.make();

        System.out.println("---make peanut milk");
        AbstractSoyaMilk peautSoyaMilk = new PeautSoyaMilk();
        peautSoyaMilk.make();

        System.out.println("---make pure milk");
        AbstractSoyaMilk pureSoyaMilk = new PureSoyaMilk();
        pureSoyaMilk.make();
    }
}

