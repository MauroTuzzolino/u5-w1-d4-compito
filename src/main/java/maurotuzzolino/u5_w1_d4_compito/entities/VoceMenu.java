package maurotuzzolino.u5_w1_d4_compito.entities;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class VoceMenu {
    protected String nome;
    protected double prezzo;
    protected int calorie;

    public VoceMenu() {
    }

    public VoceMenu(String nome, double prezzo, int calorie) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.calorie = calorie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }
}
