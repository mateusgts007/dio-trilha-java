package Singleton;

/*
 *  Singleton "Preguiçoso" faz a verificacao
 *  @Author Mateus
 */

public class SingletonLazy {
   
    private static SingletonLazy instancia;

    private SingletonLazy(){
        super();
    }

    public static SingletonLazy getInstancia(){

        if(instancia == null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }

}
