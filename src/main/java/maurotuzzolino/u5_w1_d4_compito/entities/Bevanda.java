package maurotuzzolino.u5_w1_d4_compito.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bevanda extends VoceMenu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Bevanda() {
    }

    public Bevanda(String nome, double prezzo, int calorie) {
        super(nome, prezzo, calorie);
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Bevanda{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", prezzo=" + prezzo +
                ", calorie=" + calorie +
                '}';
    }
}
