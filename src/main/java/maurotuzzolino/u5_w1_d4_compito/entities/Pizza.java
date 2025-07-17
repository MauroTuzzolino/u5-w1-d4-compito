package maurotuzzolino.u5_w1_d4_compito.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Pizza extends VoceMenu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    private List<Topping> toppings = new ArrayList<>();

    public Pizza() {
    }

    public Pizza(String nome) {
        super(nome, 5.00, 500); // base Margherita
    }

    public Long getId() {
        return id;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void aggiungiTopping(Topping t) {
        toppings.add(t);
        this.calorie += t.getCalorie();
        this.prezzo += t.getPrezzo();
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", prezzo=" + prezzo +
                ", calorie=" + calorie +
                '}';
    }


}
