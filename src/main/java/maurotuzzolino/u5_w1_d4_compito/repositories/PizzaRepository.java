package maurotuzzolino.u5_w1_d4_compito.repositories;

import maurotuzzolino.u5_w1_d4_compito.entities.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PizzaRepository extends JpaRepository<Pizza, Long> {
    // Derived query: trova pizze con un nome che contiene una certa parola (case insensitive)
    List<Pizza> findByNomeContainingIgnoreCase(String keyword);

    // Custom query: trova pizze con prezzo base maggiore di un certo valore
    @Query("SELECT p FROM Pizza p WHERE p.prezzo > :prezzoMinimo")
    List<Pizza> findPizzeConPrezzoBaseMaggioreDi(@Param("prezzoMinimo") double prezzoMinimo);
}
