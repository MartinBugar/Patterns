package prometheus;


import prometheus.patterns.factory.Factory;
import prometheus.patterns.factory.Kladivo;
import prometheus.patterns.observer.Blog;
import prometheus.patterns.observer.MojaOsoba;
import prometheus.patterns.observer.Noviny;
import prometheus.patterns.singleton.SingletonExample;

public class Main {

    public static void main(String[] args) {
	singleton();
    factory();
    observer();

    }

    private static void builder(){
        Kladivo kladivo = Kladivo.noveKladivo()
                .farba("Biele")
                .vyrobca("OBI")
                .dlzka(40.50f)
                .build();
    }

    private static void observer(){
        Blog blog = new Blog(); // vytvorime instacie observerov aby sme ch mohli priradit
        Noviny noviny = new Noviny();// vytvorime instacie observerov aby sme ch mohli priradit

        MojaOsoba mojaOsoba = new MojaOsoba();
        mojaOsoba.addObserver(blog); // musim priradit pozorovatela - observera
        mojaOsoba.addObserver(noviny);// musim priradit pozorovatela - observera
        mojaOsoba.setSprava("pisem spravu vsetkym"); // v seteri spravy sa odosle sprava observerom
    }

    private static void factory() { // facotry pattern, pouzivam instaciu ktra bola niekde vztvorena a spracovana, nevytvaram si ju ja
        Kladivo kladivo = Factory.createKladivo();
    }


    private static void singleton() {
        SingletonExample singletonExample = SingletonExample.getInstance(); // zavolam si uz vytvorenu instanciu
        SingletonExample singletonExample2 = SingletonExample.getInstance(); // zavolam si uz vytvorenu instanciu

        if (singletonExample.equals(singletonExample2)){
            System.out.println("rovnaju sa");
        }else {
            System.out.println("nerovnaju sa");
        }
    }
}
