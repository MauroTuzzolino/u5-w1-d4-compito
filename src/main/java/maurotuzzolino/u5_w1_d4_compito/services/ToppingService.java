package maurotuzzolino.u5_w1_d4_compito.services;

import maurotuzzolino.u5_w1_d4_compito.entities.Topping;
import maurotuzzolino.u5_w1_d4_compito.repositories.ToppingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ToppingService {
    @Autowired
    private ToppingRepository toppingRepository;

    public List<Topping> findAll() {
        return toppingRepository.findAll();
    }

    public Optional<Topping> findById(Long id) {
        return toppingRepository.findById(id);
    }

    public Topping save(Topping topping) {
        return toppingRepository.save(topping);
    }

    public void deleteById(Long id) {
        toppingRepository.deleteById(id);
    }

    public boolean existsById(Long id) {
        return toppingRepository.existsById(id);
    }
}
