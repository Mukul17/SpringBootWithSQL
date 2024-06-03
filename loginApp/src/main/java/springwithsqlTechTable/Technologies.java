package springwithsqlTechTable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Technologies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String technologyname;
    Integer usedfrom;
    Boolean currentlyused;

    public String getTechnologyname() {
        return technologyname;
    }

    public void setTechnologyname(String technologyname) {
        this.technologyname = technologyname;
    }

    public Integer getUsedfrom() {
        return usedfrom;
    }

    public void setUsedfrom(Integer usedfrom) {
        this.usedfrom = usedfrom;
    }

    public Boolean getCurrentlyused() {
        return currentlyused;
    }

    public void setCurrentlyused(Boolean currentlyused) {
        this.currentlyused = currentlyused;
    }
}
