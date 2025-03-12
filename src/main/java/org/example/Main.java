package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int op, tipo, cab, ca, tl, dt, ct,tld, dtld, ctld, tlc, dtc, ctc, con;
        Cabina c=null;
        Scanner teclado = new Scanner(System.in);
        List<Cabina> cabinas=new ArrayList<>();
        System.out.println("Bienvenido a tu cabina");
        do{
            System.out.println("Menu\n" +
                    "1. Crear una cabina\n" +
                    "2. Escoger una cabina\n" +
                    "3. Mostrar información por cabina\n" +
                    "4. Mostrar información de todas las cabinas\n" +
                    "5. Mostrar resumen de la información de las cabinas\n" +
                    "6. Reiniciar una cabina\n" +
                    "7. Salir\n" +
                    "Selecciona una de las opciones");
            op=teclado.nextInt();
            switch (op){
                case 1:
                    System.out.println("Vas a crear una nueva Cabina\n" +
                            "Digita el número de cabina que vas a crear");
                    cab=teclado.nextInt();
                    cabinas.add(new Cabina(cab,0,0,0,0,0,0,0,0,0,0,0,0));
                    break;
                case 2:
                    System.out.println("Selecciona una de las siguientes cabinas telefonicas\n");
                    for(int i=0; i<cabinas.size(); i++){
                        System.out.println("Cabina: "+cabinas.get(i).getNumeroCabina());
                    }
                    cab=teclado.nextInt();
                    for(int i=0; i<cabinas.size(); i++){
                        ca=cabinas.get(i).getNumeroCabina();
                        if(ca==cab){
                            System.out.println("¿Que tipo de llamada vas a realizar? Selecciona una opción\n" +
                                    "1. LLamada Local\n" +
                                    "2. LLamada larga distancia\n" +
                                    "3. Llamada a Celular\n");
                            tipo=teclado.nextInt();
                            System.out.println(cabinas.get(i).RegistrarLlamadas(tipo));
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Selecciona una de las siguientes cabinas telefonicas para ver su información\n");
                    for(int i=0; i<cabinas.size(); i++){
                        System.out.println("Cabina: "+cabinas.get(i).getNumeroCabina());
                    }
                    cab=teclado.nextInt();
                    for(int i=0; i<cabinas.size(); i++){
                        ca=cabinas.get(i).getNumeroCabina();
                        if(ca==cab){
                            cabinas.get(i).InformacionCabina();
                            break;
                        }
                    }
                    break;
                case 4:
                    con=0;
                    System.out.println("Información de cada cabina");
                    for(int i=0; i<cabinas.size(); i++){
                        con=con+1;
                        System.out.println("Cabina "+con);
                        cabinas.get(i).InformacionCabina();
                    }
                    break;
                case 5:
                    tl=0;
                    dt=0;
                    ct=0;
                    tld=0;
                    dtld=0;
                    ctld=0;
                    tlc=0;
                    dtc=0;
                    ctc=0;
                    for(int i=0; i<cabinas.size(); i++){
                        tl=tl+cabinas.get(i).getNumeroLlamadasl();
                        dt=dt+cabinas.get(i).getDuracionl();
                        ct=ct+cabinas.get(i).getCostoLlamadal();
                        tld=tld+cabinas.get(i).getNumeroLlamadasld();
                        dtld=dtld+cabinas.get(i).getDuracionld();
                        ctld=ctld+cabinas.get(i).getCostoLlamadald();
                        tlc=tlc+cabinas.get(i).getNumeroLlamadasc();
                        dtc=dtc+cabinas.get(i).getDuracionc();
                        ctc=ctc+cabinas.get(i).getCostoLlamadac();
                        //cabinas.get(i).InformacionCabina();
                    }
                    System.out.println("Uso total de las cabinas");
                    System.out.println("Número de llamadas local: "+tl+"\n" +
                            "Duración de llamadas locales: "+dt+"minutos\n"+
                            "Costo total de las llamadas locales: $" +ct+"\n"+
                            "Número de llamadas larga distancia: "+tld+"\n" +
                            "Duración de llamadas a larga distancia: "+dtld+"minutos\n"+
                            "Costo total de las llamadas a larga distancia: $" +ctld+"\n"+
                            "Número de llamadas celular: "+tlc+"\n"+
                            "Duración de llamadas a celular: " +dtc+"minutos\n"+
                            "Costo total de las llamadas a celular: $"+ctc+"\n");
                    break;
                case 6:
                    System.out.println("Selecciona una de las siguientes cabinas telefonicas para reiniciar\n");
                    for(int i=0; i<cabinas.size(); i++){
                        System.out.println("Cabina: "+cabinas.get(i).getNumeroCabina());
                    }
                    cab=teclado.nextInt();
                    for(int i=0; i<cabinas.size(); i++){
                        ca=cabinas.get(i).getNumeroCabina();
                        if(ca==cab){
                            System.out.println("Valores de la cabina antes de reiniciar\n");
                            cabinas.get(i).InformacionCabina();
                            cabinas.get(i).ReiniciarCabina();
                            System.out.println("Valores de la cabina despues de reiniciar\n");
                            cabinas.get(i).InformacionCabina();
                            break;
                        }
                    }
                    break;
                default: System.out.println("Haz salido del Menu");
            }
        }while(op!=7);
    }
}