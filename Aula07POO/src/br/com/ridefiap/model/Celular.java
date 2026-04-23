package br.com.ridefiap.model;

public class Celular {
    private String marca;
    private String cor;
    private int capacidadeemGb;
    private Bateria bateria; // Associação

    public Celular(String marca, String cor, int capacidadeemGb, Bateria bateria) {
        this.marca = marca;
        this.cor = cor;
        this.capacidadeemGb = capacidadeemGb;
        this.bateria = bateria; // Inicialização da associação
    }

    // Método polimórfico genérico
    public void emitirSom() {
        System.out.println("O dispositivo está emitindo um som genérico...");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getCapacidadeemGb() {
        return capacidadeemGb;
    }

    public void setCapacidadeemGb(int capacidadeemGb) {
        if (capacidadeemGb >= 0 && capacidadeemGb <= 1024) {
            this.capacidadeemGb = capacidadeemGb;
        } else {
            System.out.println("Erro: A capacidade deve estar entre 0 e 1024GB.");
        }
    }

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public boolean alterarCor(String novaCor) {
        if (novaCor != null && !novaCor.trim().isEmpty()) {
            this.cor = novaCor;
            System.out.println("Cor do celular alterada para: " + novaCor);
            return true;
        } else {
            System.out.println("Erro: A nova cor não pode ser vazia.");
            return false;
        }
    }

    public boolean aumentarCapacidade(int capacidadeAdicional) {
        if (capacidadeAdicional > 0) {
            int novaCapacidade = this.capacidadeemGb + capacidadeAdicional;
            if (novaCapacidade <= 1024) {
                this.capacidadeemGb = novaCapacidade;
                System.out.println("Capacidade do celular aumentada em " + capacidadeAdicional + "GB. Nova capacidade: " + this.capacidadeemGb + "GB.");
                return true;
            } else {
                System.out.println("Erro: A capacidade excede o limite máximo de 1024GB.");
                return false;
            }
        } else {
            System.out.println("Erro: A capacidade adicional deve ser um valor positivo.");
            return false;
        }
    }
}