package pl.syncode.recruitment.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.syncode.recruitment.model.TabelaTestowa;

import java.util.List;

public interface TabelaTestowaRepository extends JpaRepository<TabelaTestowa, Long> {

    @Query( "SELECT t " +
            "FROM TabelaTestowa t WHERE t.kolumna1 IN (SELECT tt.kolumna1 FROM TabelaTestowa tt " +
            "GROUP BY tt.kolumna1 " +
            "HAVING count(tt.kolumna1) = 1)"
    )
    List<TabelaTestowa> findDifferentColumn1();


    @Query( "SELECT t " +
            "FROM TabelaTestowa t WHERE t.kolumna2 IN (SELECT tt.kolumna2 FROM TabelaTestowa tt " +
            "GROUP BY tt.kolumna2 " +
            "HAVING count(tt.kolumna2) = 1)"
    )
    List<TabelaTestowa> findDifferentColumn2();


    @Query( "SELECT t " +
            "FROM TabelaTestowa t WHERE t.kolumna3 IN (SELECT tt.kolumna3 FROM TabelaTestowa tt " +
            "GROUP BY tt.kolumna3 " +
            "HAVING count(tt.kolumna3) = 1)"
    )
    List<TabelaTestowa> findDifferentColumn3();


    @Query( "SELECT t " +
            "FROM TabelaTestowa t WHERE t.kolumna4 IN (SELECT tt.kolumna4 FROM TabelaTestowa tt " +
            "GROUP BY tt.kolumna4 " +
            "HAVING count(tt.kolumna4) = 1)"
    )
    List<TabelaTestowa> findDifferentColumn4();

}
