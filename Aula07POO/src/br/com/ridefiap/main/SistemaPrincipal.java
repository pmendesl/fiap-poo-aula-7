package br.com.ridefiap.main;

import br.com.ridefiap.model.Bateria;
import br.com.ridefiap.model.Celular;
import br.com.ridefiap.model.Smartphone;
import br.com.ridefiap.model.TelefoneFixo;
import java.util.ArrayList;
import java.util.List;

public class SistemaPrincipal {
    public static void main(String[] args) {
        // Criando baterias
        Bateria bat1 = new Bateria(5000, 100);
        Bateria bat2 = new Bateria(1000, 100);
        Bateria bat3 = new Bateria(4000, 80);

        // Criando a lista tipada com a Superclasse
        List<Celular> listaDispositivos = new ArrayList<>();

        // Adicionando objetos específicos na lista
        listaDispositivos.add(new Smartphone("iPhone 15", "Titânio", 256, bat1, "iOS 17"));
        listaDispositivos.add(new TelefoneFixo("Intelbras", "Preto", 0, bat2, true));
        listaDispositivos.add(new Celular("Nokia Antigo", "Azul", 1, bat3));

        System.out.println("--- Teste de Fogo: Polimorfismo com List ---");
        
        // Laço for chamando o método polimórfico
        for (Celular dispositivo : listaDispositivos) {
            System.out.print("Dispositivo: " + dispositivo.getMarca() + " -> ");
            dispositivo.emitirSom();
        }
    }
}