package com.kazue.collection.gft.collection.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class TemperaturaMedia {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Scanner scan = new Scanner(System.in);

        List<Double>temperaturaSemestral = new ArrayList<Double>();

        double soma = 0.0;
        for (int i=1; i<=6; i++){
            System.out.print("Digite a temperatura "+ i+ ":");
            double temperatura = scan.nextDouble();
            temperaturaSemestral.add(temperatura);
            soma+= temperatura;
        }

        double mediaTemperaturaSemestral = soma/temperaturaSemestral.size();

        System.out.println("Temperatura Semestral: " + temperaturaSemestral + "oC");
        System.out.println("Temperatura Média do Semestre :" + String.format("%.2f",mediaTemperaturaSemestral) + "oC");
        System.out.println("---------------");

        for (double temp:temperaturaSemestral){
            if (temp > mediaTemperaturaSemestral) {
                int index = temperaturaSemestral.indexOf(temp);
                switch (index) {
                    case 0:
                        System.out.println((index + 1) + " -Janeiro: " + temp + "oC");
                        break;
                    case 1:
                        System.out.println((index + 1) + " -Fevereiro: " + temp + "oC");
                        break;
                    case 2:
                        System.out.println((index + 1) + " -Março: " + temp + "oC");
                        break;
                    case 3:
                        System.out.println((index + 1) + " -Abril: " + temp + "oC");
                        break;
                    case 4:
                        System.out.println((index + 1) + " -Maio: " + temp + "oC");
                        break;
                    case 5:
                        System.out.println((index + 1) + " -Junho: " + temp + "oC");
                        break;
                    default:
                        break;
                }
            }
        }
    }
}
