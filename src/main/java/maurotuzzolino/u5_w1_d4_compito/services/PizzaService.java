package maurotuzzolino.u5_w1_d4_compito.services;

import maurotuzzolino.u5_w1_d4_compito.entities.Pizza;
import maurotuzzolino.u5_w1_d4_compito.repositories.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzaService {
    @Autowired
    private PizzaRepository pizzaRepository;

    public List<Pizza> getAll() {
        return pizzaRepository.findAll();
    }

    public Pizza getById(Long id) {
        return pizzaRepository.findById(id).orElseThrow(() -> new RuntimeException("Pizza non trovata"));
    }

    public Pizza save(Pizza pizza) {
        return pizzaRepository.save(pizza);
    }

    public void delete(Long id) {
        pizzaRepository.deleteById(id);
    }

    public List<Pizza> searchByKeyword(String keyword) {
        return pizzaRepository.findByNomeContainingIgnoreCase(keyword);
    }

    public List<Pizza> findWithPrezzoBaseMaggioreDi(double prezzoMinimo) {
        return pizzaRepository.findPizzeConPrezzoBaseMaggioreDi(prezzoMinimo);
    }
}
