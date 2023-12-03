package cz.czechitas.java2webapps.lekce10.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OrderBy;

import java.util.List;

/**
 *
 */
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String jmeno;
    private String prijmeni;

    @ManyToOne
    private Trida trida;

    public Integer getId() {
        return id;
    }

    @ManyToMany(mappedBy = "deti")
    @OrderBy("prijmeni, jmeno")
    private List<Rodic> rodice;

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public Trida getTrida() {
        return trida;
    }

    public void setTrida(Trida trida) {
        this.trida = trida;
    }

    public List<Rodic> getRodice() {
        return rodice;
    }

    public void setRodice(List<Rodic> rodice) {
        this.rodice = rodice;
    }

    @Override
    public String toString() {
        return String.format("%s %s [%d]", jmeno, prijmeni, id);
    }
}
