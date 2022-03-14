package pl.syncode.recruitment.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tabela_testowa")
@NoArgsConstructor @Getter @Setter
public class TabelaTestowa {

    @Id
    @Column
    private int id;

    @Column
    private String kolumna1;

    @Column
    private String kolumna2;

    @Column
    private String kolumna3;

    @Column
    private int kolumna4;

}
