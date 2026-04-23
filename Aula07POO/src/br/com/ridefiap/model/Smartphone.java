package br.com.ridefiap.model;

public class Smartphone extends Celular {
    private String sistemaOperacional;

    public Smartphone(String marca, String cor, int capacidadeemGb, Bateria bateria, String sistemaOperacional) {
        super(marca, cor, capacidadeemGb, bateria);
        this.sistemaOperacional = sistemaOperacional;
    }

    @Override
    public void emitirSom() {
        System.out.println("O Smartphone " + getMarca() + " está tocando uma música MP3 personalizada!");
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public void instalarApp(String nomeApp) {
        System.out.println("Instalando o aplicativo " + nomeApp + " no sistema " + sistemaOperacional);
    }
}