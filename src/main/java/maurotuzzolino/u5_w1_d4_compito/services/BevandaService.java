package maurotuzzolino.u5_w1_d4_compito.services;

import maurotuzzolino.u5_w1_d4_compito.entities.Bevanda;
import maurotuzzolino.u5_w1_d4_compito.repositories.BevandaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BevandaService {
    @Autowired
    private BevandaRepository bevandaRepository;

    public List<Bevanda> findAll() {
        return bevandaRepository.findAll();
    }

    public Optional<Bevanda> findById(Long id) {
        return bevandaRepository.findById(id);
    }

    public Bevanda save(Bevanda bevanda) {
        return bevandaRepository.save(bevanda);
    }

    public void deleteById(Long id) {
        bevandaRepository.deleteById(id);
    }

    public boolean existsById(Long id) {
        return bevandaRepository.existsById(id);
    }
}
