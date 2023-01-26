public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        byte stuffNumber=5;
        short studentNumber=250;
        int sitizenNumber=35000;
        long peopleNumber=5000000L;
        float piNumber=3.141592f;
        double randomNumber=5.63987562354935;

        System.out.println("«Значение переменной "+"stuffNumber"+" с типом "+"byte"+" равно "+stuffNumber);
        System.out.println("«Значение переменной "+"studentNumber"+" с типом "+"short"+" равно "+studentNumber);
        System.out.println("«Значение переменной "+"sitizenNumber"+" с типом "+"int"+" равно "+sitizenNumber);
        System.out.println("«Значение переменной "+"peopleNumber"+" с типом "+"long"+" равно "+peopleNumber);
        System.out.println("«Значение переменной "+"piNumber"+" с типом "+"float"+" равно "+piNumber);
        System.out.println("«Значение переменной "+"randomNumber"+" с типом "+"double"+" равно "+randomNumber);
    }
    public static void task2() {
        float one=27.12f;
        long two=987678965549L;
        float three=2.786f;
        short four=569;
        short five=-159;
        short six=27897;
        byte seven=67;
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);
        System.out.println(six);
        System.out.println(seven);
    }
    public static void task3() {
        byte LP=23;
        byte AS=27;
        byte EA=30;
        short paperList=480;
        int paperPerson=paperList/(LP+AS+EA);
        System.out.println("На каждого ученика рассчитано "+paperPerson+" листов бумаги");
    }
    public static void task4() {
        byte bottleNumber=16;
        byte prodTime=2;
        int prodMinute=bottleNumber/prodTime;

        byte time1=20;
        int prod1=time1*prodMinute;
        System.out.println("За "+time1+" минут машина произвела "+prod1+" штук бутылок");

        short time2=24*60;
        int prod2=time2*prodMinute;
        System.out.println("За "+time2+" минут машина произвела "+prod2+" штук бутылок");

        short time3=3*24*60;
        int prod3=time3*prodMinute;
        System.out.println("За "+time3+" минут машина произвела "+prod3+" штук бутылок");

        int time4=30*24*60;
        int prod4=time4*prodMinute;
        System.out.println("За "+time4+" минут машина произвела "+prod4+" штук бутылок");
    }
    public static void task5() {
        short totalNumber=120;
        short whiteClass=2;
        short brownClass=4;
        int classNumber=totalNumber/(whiteClass+brownClass);
        int whiteNumber=classNumber*whiteClass;
        int brownNumber=classNumber*brownClass;
        System.out.println("В школе, где "+classNumber+" классов, нужно "+whiteNumber+" банок белой краски и "+brownNumber+" банок коричневой краски");
    }
    public static void task6() {
        byte bananas=5;
        byte weightBanan=80;
        short milk=200;
        short weigh100Milk=105;
        short icecream=2;
        short weightIcecream=100;
        short eggs=4;
        short weightEgg=70;
        int weightSportbreakfast=bananas*weightBanan+milk/100*weigh100Milk+icecream*weightIcecream+eggs*weightEgg;
        System.out.println("Вес спортзавтрака "+weightSportbreakfast+" грамм");
        System.out.println("Вес спортзавтрака "+weightSportbreakfast/1000+" кг");
    }
    public static void task7() {
    short totaldecreasWeight=7000;
    short decreasOneDay1=250;
    short decreasOneDay2=500;
    int numberDays1=totaldecreasWeight/decreasOneDay1;
    System.out.println("Если спортсмен будет терять в день по "+decreasOneDay1+" грамм, то он достигнет результата за "+numberDays1+" дней");
    int numberDays2=totaldecreasWeight/decreasOneDay2;
    System.out.println("Если спортсмен будет терять в день по "+decreasOneDay2+" грамм, то он достигнет результата за "+numberDays2+" дней");
    }
    public static void task8() {
    int salaryMasha=67760;
    int salaryDenis=83690;
    int salaryKristina=76230;
    double increaseSalaryMasha=salaryMasha+salaryMasha*0.1;
    double increaseSalaryDenis=salaryDenis+salaryDenis*0.1;
    double increaseSalaryKristina=salaryKristina+salaryKristina*0.1;
    double yearProfitMasha=increaseSalaryMasha*12-salaryMasha*12;
    double yearProfitDenis=increaseSalaryDenis*12-salaryDenis*12;
    double yearProfitKristina=increaseSalaryKristina*12-salaryKristina*12;
    System.out.println("Маша теперь получает "+increaseSalaryMasha+" рублей. Годовой доход вырос на "+yearProfitMasha+" рублей");
    System.out.println("Денис теперь получает "+increaseSalaryDenis+" рублей. Годовой доход вырос на "+yearProfitDenis+" рублей");
    System.out.println("Кристина теперь получает "+increaseSalaryKristina+" рублей. Годовой доход вырос на "+yearProfitKristina+" рублей");
    }
}