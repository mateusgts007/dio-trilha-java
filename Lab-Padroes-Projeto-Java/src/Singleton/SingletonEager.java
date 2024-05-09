package Singleton;

/*
 *  Singleton "Apressado" faz a instanciação direto
 * 
 */

public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    public SingletonEager(){
        super();
    }


    public static SingletonEager getInstancia(){
        return instancia;
    }

}
