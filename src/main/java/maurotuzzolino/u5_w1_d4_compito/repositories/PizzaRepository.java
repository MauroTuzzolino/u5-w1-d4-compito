package maurotuzzolino.u5_w1_d4_compito.repositories;

import maurotuzzolino.u5_w1_d4_compito.entities.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepository extends JpaRepository<Pizza, Long> {
}
