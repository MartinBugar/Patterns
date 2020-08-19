package prometheus.patterns;

public class SingletonExample {

    private static SingletonExample instance = null;
    private SingletonExample (){} // nikto mimo triedy singleton, nemoze zavolat tento contructor

    public static SingletonExample getInstance(){
        if (instance == null){
            instance = new SingletonExample();
        }
        return  instance;
    }


}
