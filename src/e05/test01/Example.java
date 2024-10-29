package e05.test01;

public class Example {
    public static void main(String[] args) {
        Chinese chinaPeople = new Chinese();
        American americanPeople = new American();
        Beijingman beijingPeople = new Beijingman();

        chinaPeople.speakHello();
        americanPeople.speakHello();
        beijingPeople.speakHello();

        chinaPeople.averageHeight();
        americanPeople.averageHeight();
        beijingPeople.averageHeight();

        chinaPeople.averageWeight();
        americanPeople.averageWeight();
        beijingPeople.averageWeight();

        chinaPeople.chinaGongfu();
        americanPeople.americanBoxing();
        beijingPeople.beijingOpera();
        beijingPeople.chinaGongfu();

    }
}
