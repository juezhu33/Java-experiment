package e05.test01;

public class Beijingman extends Chinese {
    public void averageHeight() {
        height = 172.5;
        System.out.println("北京人的平均身高 " + height + "厘米");
    }

    @Override
    public void averageWeight() {
        weight = 70;
        System.out.println("北京人的平均体重" + weight + "千克");
    }


    public void beijingOpera() {
        System.out.println("花脸，青衣，花旦和老生");
    }
}