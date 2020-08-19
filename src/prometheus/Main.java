package prometheus;


import prometheus.patterns.SingletonExample;

public class Main {

    public static void main(String[] args) {
	singleton();
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
