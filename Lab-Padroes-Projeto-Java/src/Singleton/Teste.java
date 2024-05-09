package Singleton;

import Facade.Facade;
import Strategy.Comportamento;
import Strategy.ComportamentoAgressivo;
import Strategy.ComportamentoDefensivo;
import Strategy.ComportamentoNormal;
import Strategy.Robo;

public class Teste {

    public static void main (String [] args){

        /// testes design pattern Singleton
        
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy); 

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);

        eager = SingletonEager.getInstancia();
        System.out.println(eager); 

        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);

        holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder); 


        //// Strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();
        
        Robo robo = new Robo();
        robo.setComportamento(agressivo);

        robo.mover();
        robo.mover();

        /// facade

        Facade facade = new Facade();
        facade.migrarCliente("Mateus", "40029099");


    }

}
