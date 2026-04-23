package br.com.ridefiap.model;

public class Bateria {
    private int capacidadeMah;
    private int percentualCarga;

    public Bateria(int capacidadeMah, int percentualCarga) {
        this.capacidadeMah = capacidadeMah;
        this.percentualCarga = percentualCarga;
    }

    public int getCapacidadeMah() {
        return capacidadeMah;
    }

    public void setCapacidadeMah(int capacidadeMah) {
        this.capacidadeMah = capacidadeMah;
    }

    public int getPercentualCarga() {
        return percentualCarga;
    }

    public void setPercentualCarga(int percentualCarga) {
        this.percentualCarga = percentualCarga;
    }

    @Override
    public String toString() {
        return "Bateria [Capacidade: " + capacidadeMah + "mAh, Carga: " + percentualCarga + "%]";
    }
}