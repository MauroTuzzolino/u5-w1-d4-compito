package maurotuzzolino.u5_w1_d4_compito.runners;

import maurotuzzolino.u5_w1_d4_compito.entities.Bevanda;
import maurotuzzolino.u5_w1_d4_compito.entities.Pizza;
import maurotuzzolino.u5_w1_d4_compito.entities.Topping;
import maurotuzzolino.u5_w1_d4_compito.services.BevandaService;
import maurotuzzolino.u5_w1_d4_compito.services.PizzaService;
import maurotuzzolino.u5_w1_d4_compito.services.ToppingService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final PizzaService pizzaService;
    private final BevandaService bevandaService;
    private final ToppingService toppingService;

    public DataLoader(PizzaService pizzaService, BevandaService bevandaService, ToppingService toppingService) {
        this.pizzaService = pizzaService;
        this.bevandaService = bevandaService;
        this.toppingService = toppingService;
    }

    @Override
    public void run(String... args) {
        // Creazione topping
        Topping mozzarella = new Topping("Mozzarella", 1.00, 120);
        Topping prosciutto = new Topping("Prosciutto", 1.50, 150);

        toppingService.save(mozzarella);
        toppingService.save(prosciutto);

        // Creazione pizza e aggiunta topping
        Pizza margherita = new Pizza("Margherita");
        margherita.aggiungiTopping(mozzarella);

        Pizza hawaiian = new Pizza("Hawaiian");
        hawaiian.aggiungiTopping(mozzarella);
        hawaiian.aggiungiTopping(prosciutto);

        pizzaService.save(margherita);
        pizzaService.save(hawaiian);

        // Creazione bevande
        Bevanda acqua = new Bevanda("Acqua", 1.00, 0);
        Bevanda cola = new Bevanda("Cola", 2.00, 150);
        
        bevandaService.save(acqua);
        bevandaService.save(cola);

        // Stampa dei dati persistiti
        System.out.println("=== PIZZE ===");
        pizzaService.getAll().forEach(System.out::println);

        System.out.println("=== BEVANDE ===");
        bevandaService.findAll().forEach(System.out::println);

        System.out.println("=== TOPPINGS ===");
        toppingService.findAll().forEach(System.out::println);
    }
}
