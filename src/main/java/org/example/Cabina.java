package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Cabina {
    private int numeroCabina;
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

    public Cabina() {
    }

    public Cabina(int numeroCabina, int duracionl, int duracionld, int duracionc, int tduracionl, int tduracionld, int tduracionc, int numeroLlamadasl, int numeroLlamadasld, int numeroLlamadasc, int costoLlamadal, int costoLlamadald, int costoLlamadac) {
        this.numeroCabina = numeroCabina;
        this.duracionl = duracionl;
        this.duracionld = duracionld;
        this.duracionc = duracionc;
        this.tduracionl = tduracionl;
        this.tduracionld = tduracionld;
        this.tduracionc = tduracionc;
        this.numeroLlamadasl = numeroLlamadasl;
        this.numeroLlamadasld = numeroLlamadasld;
        this.numeroLlamadasc = numeroLlamadasc;
        this.costoLlamadal = costoLlamadal;
        this.costoLlamadald = costoLlamadald;
        this.costoLlamadac = costoLlamadac;
    }

    public Cabina(int nCabina) {
        this.numeroCabina=nCabina;
    }

    public int getNumeroCabina() {
        return numeroCabina;
    }

    public void setNumeroCabina(int numeroCabina) {
        this.numeroCabina = numeroCabina;
    }

    public int getDuracionl() {
        return duracionl;
    }

    public void setDuracionl(int duracionl) {
        this.duracionl = duracionl;
    }

    public int getDuracionld() {
        return duracionld;
    }

    public void setDuracionld(int duracionld) {
        this.duracionld = duracionld;
    }

    public int getDuracionc() {
        return duracionc;
    }

    public void setDuracionc(int duracionc) {
        this.duracionc = duracionc;
    }

    public int getTduracionl() {
        return tduracionl;
    }

    public void setTduracionl(int tduracionl) {
        this.tduracionl = tduracionl;
    }

    public int getTduracionld() {
        return tduracionld;
    }

    public void setTduracionld(int tduracionld) {
        this.tduracionld = tduracionld;
    }

    public int getTduracionc() {
        return tduracionc;
    }

    public void setTduracionc(int tduracionc) {
        this.tduracionc = tduracionc;
    }

    public int getNumeroLlamadasl() {
        return numeroLlamadasl;
    }

    public void setNumeroLlamadasl(int numeroLlamadasl) {
        this.numeroLlamadasl = numeroLlamadasl;
    }

    public int getNumeroLlamadasld() {
        return numeroLlamadasld;
    }

    public void setNumeroLlamadasld(int numeroLlamadasld) {
        this.numeroLlamadasld = numeroLlamadasld;
    }

    public int getNumeroLlamadasc() {
        return numeroLlamadasc;
    }

    public void setNumeroLlamadasc(int numeroLlamadasc) {
        this.numeroLlamadasc = numeroLlamadasc;
    }

    public int getCostoLlamadal() {
        return costoLlamadal;
    }

    public void setCostoLlamadal(int costoLlamadal) {
        this.costoLlamadal = costoLlamadal;
    }

    public int getCostoLlamadald() {
        return costoLlamadald;
    }

    public void setCostoLlamadald(int costoLlamadald) {
        this.costoLlamadald = costoLlamadald;
    }

    public int getCostoLlamadac() {
        return costoLlamadac;
    }

    public void setCostoLlamadac(int costoLlamadac) {
        this.costoLlamadac = costoLlamadac;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public String RegistrarLlamadas(int tipo){
        String mensaje;
        mensaje="";
        switch (tipo){
            case 1:
                this.random = new Random();
                this.duracionl = random.nextInt(60)+1;
                this.costoLlamadal = this.costoLlamadal+(50*this.duracionl);
                this.numeroLlamadasl=this.numeroLlamadasl+1;
                this.tduracionl=tduracionl+this.duracionl;
                mensaje="Haz realizado una llamada de tipo local\n" +
                        "La duración de la llamada fue de: " +this.duracionl+"minutos\n"+
                        "El costo total de la llamada fue de: $"+this.costoLlamadal+" \n";
                break;
            case 2:
                this.random = new Random();
                this.duracionld = random.nextInt(60)+1;
                this.costoLlamadald = this.costoLlamadald+(350*this.duracionld);
                this.numeroLlamadasld=this.numeroLlamadasld+1;
                this.tduracionld=tduracionld+this.duracionld;
                mensaje="Haz realizado una llamada de tipo larga distancia\n" +
                        "La duración de la llamada fue de: " +this.duracionld+"minutos\n"+
                        "El costo total de la llamada fue de: $"+this.costoLlamadald+" \n";
                break;
            case 3:
                this.random = new Random();
                this.duracionc = random.nextInt(60)+1;
                this.costoLlamadac = this.costoLlamadac+(150*this.duracionc);
                this.numeroLlamadasc=this.numeroLlamadasc+1;
                this.tduracionc=tduracionc+this.duracionc;
                mensaje="Haz realizado una llamada a celular\n" +
                        "La duración de la llamda fue de: " +this.duracionc+"minutos\n"+
                        "El costo total de la llamda fue de: $"+this.costoLlamadac+" \n";
                break;
        }
        return mensaje;
    }

    public void InformacionCabina(){
        System.out.println("Número de llamadas local: "+this.numeroLlamadasl+"\n" +
                "Duración de llamadas locales: "+this.tduracionl+"minutos\n"+
                "Costo total de las llamadas locales: $" +this.costoLlamadal+"\n"+
                "Número de llamadas larga distancia: "+this.numeroLlamadasld+"\n" +
                "Duración de llamadas a larga distancia: "+this.tduracionld+"minutos\n"+
                "Costo total de las llamadas a larga distancia: $" +this.costoLlamadald+"\n"+
                "Número de llamadas celular: "+this.numeroLlamadasc+"\n"+
                "Duración de llamadas a celular: " +this.tduracionc+"minutos\n"+
                "Costo total de las llamadas a celular: $"+this.costoLlamadac+"\n");
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
