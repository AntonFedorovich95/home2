package ru.skypro;

public class Main {

    public static void main(String[] args) {
	    byte a = 127;
        short b = 32767;
        int c = 214749;
        long d = 99L;
        float e = 20.75f;
        double f = 77.98;
        char j = 'A';
        char m = 65;
        boolean h = a < b;

        float oneboxer = 78.2f;
        float twoboxer = 82.7f;
        float totalweight = oneboxer + twoboxer;
        float differenceofboxers = twoboxer - oneboxer;
        System.out.println("Общий вес двух бойцов " + totalweight);
        System.out.println("Разница между весами бойцов " + differenceofboxers);

        short bananas = 5 * 80;
        short milk = 105 * 2;
        short icecream = 100 * 2;
        short eggs = 4 * 70;
        int mix = bananas + milk + icecream + eggs;
        int weight = mix / 1000;
        System.out.println("Вес спорт-завтрака " + weight + " кг");

        short excessweight = 7;
        short weightloss = 250;
        short weightloss2 = 500;
        int day = (excessweight * 1000) / weightloss;
        int day2 = (excessweight * 1000) / weightloss2;
        int day3 = (day + day2) / 2;
        System.out.println("При похудение на 250 грамм в сутки у спортсмена уйдет " + day + " суток");
        System.out.println("При похудение на 500 грамм в сутки у спортсмена уйдет " + day2 + " суток");
        System.out.println("В среднем для достижения результата похудения у спортсмена уйдет " + day3 + " суток");

        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKris = 76230;
        int newsalaryMasha = ((salaryMasha / 100) * 10) + salaryMasha;
        int newsalaryDenis = ((salaryDenis / 100) * 10) + salaryDenis;
        int newsalaryKris = ((salaryKris / 100) * 10) + salaryKris;
        int incomedifferenceMasha = (newsalaryMasha - salaryMasha) * 12;
        int incomedifferenceDenis = (newsalaryDenis - salaryDenis) * 12;
        int incomedifferenceKris = (newsalaryKris - salaryKris) * 12;
        System.out.println("Маша теперь получает " + newsalaryMasha + " рублей." + " Годовой доход вырос на " + incomedifferenceMasha + " рублей.");
        System.out.println("Денис теперь получает " + newsalaryDenis + " рублей." + " Годовой доход вырос на " + incomedifferenceDenis + " рублей.");
        System.out.println("Кристина теперь получает " + newsalaryKris + " рублей." + " Годовой доход вырос на " + incomedifferenceKris + " рублей.");

        int a1 = 12;
        int b1 = 27;
        int c1 = 44;
        int d1 = 15;
        int e1 = 9;
        int result = a1 * (b1 + (c1 - d1 * e1));
        System.out.println(result * -1);

        int a2 = 5;
        int b2 = 7;
        a2 = a2 + b2;
        b2 = a2 - b2;
        a2 = a2 - b2;
        System.out.println(a2);
        System.out.println(b2);

        int num = 449;
        System.out.println((num / 10) % 10);
    }
}
