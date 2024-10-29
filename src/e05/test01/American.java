package e05.test01;

public class American extends People {
    @Override
    public void averageHeight() {
        height = 176;
        System.out.println("American's average height is " + height + "cm");
    }

    @Override
    public void averageWeight() {
        weight = 75;
        System.out.println("American's average weight is " + height + "kg");
    }

    @Override
    public void speakHello() {
        System.out.println("How do you do");
    }

    public void americanBoxing() {
        System.out.println("直拳，勾拳，组合拳");
    }


}
