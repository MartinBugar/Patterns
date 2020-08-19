package prometheus;


import prometheus.patterns.factory.Factory;
import prometheus.patterns.factory.Kladivo;
import prometheus.patterns.singleton.SingletonExample;

public class Main {

    public static void main(String[] args) {
	singleton();
    factory();

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
