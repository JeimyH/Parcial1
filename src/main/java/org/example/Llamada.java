package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Llamada {
    private int duracionl;
    private int duracionld;
    private int duracionc;
    private int tduracionl;
    private int tduracionld;
    private int tduracionc;
    private int numeroLlamadasl;
    private int numeroLlamadasld;
    private int numeroLlamadasc;
    private int costoLlamadal;
    private int costoLlamadald;
    private int costoLlamadac;
    private Random random;

    public Llamada() {
    }

    public Llamada(int duracionl, int duracionld, int duracionc, int numeroLlamadasl, int numeroLlamadasld, int numeroLlamadasc, int costoLlamadal, int costoLlamadald, int costoLlamadac, Random random) {
        this.duracionl = duracionl;
        this.duracionld = duracionld;
        this.duracionc = duracionc;
        this.numeroLlamadasl = numeroLlamadasl;
        this.numeroLlamadasld = numeroLlamadasld;
        this.numeroLlamadasc = numeroLlamadasc;
        this.costoLlamadal = costoLlamadal;
        this.costoLlamadald = costoLlamadald;
        this.costoLlamadac = costoLlamadac;
        this.random = random;
    }

    public void RegistrarLlamadas(int tipo){
        switch (tipo){
            case 1:
                this.random = new Random();
                this.duracionl = random.nextInt(60)+1;
                this.costoLlamadal = this.costoLlamadal+(50*this.duracionl);
                this.numeroLlamadasl=this.numeroLlamadasl+1;
                this.tduracionl=tduracionl+this.duracionl;
                break;
            case 2:
                this.random = new Random();
                this.duracionld = random.nextInt(60)+1;
                this.costoLlamadald = this.costoLlamadald+(350*this.duracionld);
                this.numeroLlamadasld=this.numeroLlamadasld+1;
                this.tduracionld=tduracionld+this.duracionld;
                break;
            case 3:
                this.random = new Random();
                this.duracionc = random.nextInt(60)+1;
                this.costoLlamadac = this.costoLlamadac+(150*this.duracionc);
                this.numeroLlamadasc=this.numeroLlamadasc+1;
                this.tduracionc=tduracionc+this.duracionc;
                break;
        }
    }

    public void InformacionCabina(){
        System.out.println("Número de llamadas local: "+this.numeroLlamadasl+"\n" +
                "Duración de llamadas locales: "+this.tduracionl+"\n"+
                "Costo total de las llamadas locales: " +this.costoLlamadal+"\n"+
                "Número de llamadas larga distancia: "+this.numeroLlamadasld+"\n" +
                "Duración de llamadas a larga distancia: "+this.tduracionld+"\n"+
                "Costo total de las llamadas a larga distancia" +this.costoLlamadald+"\n"+
                "Número de llamadas celular: "+this.numeroLlamadasc+"\n"+
                "Duración de llamadas a celular: " +this.tduracionc+"\n"+
                "Costo total de las llamadas a celular: "+this.tduracionc+"\n");
    }

    public void ReiniciarCabina(){
        duracionl=0;
        duracionld=0;
        duracionc=0;
        tduracionl=0;
        tduracionld=0;
        tduracionc=0;
        numeroLlamadasl=0;
        numeroLlamadasld=0;
        numeroLlamadasc=0;
        costoLlamadal=0;
        costoLlamadald=0;
        costoLlamadac=0;
    }

}

