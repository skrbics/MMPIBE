package si.unm.fis.skrbic.mmpibe.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Feature {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    int idFeature;
    String featureMark;

    public Feature(int idFeature, String featureMark) {
        this.idFeature = idFeature;
        this.featureMark = featureMark;
    }



    public Feature() {

    }

    public int getIdFeature() {
        return idFeature;
    }

    public void setIdFeature(int idFeature) {
        this.idFeature = idFeature;
    }

    public String getFeatureMark() {
        return featureMark;
    }

    public void setFeatureMark(String featureMark) {
        this.featureMark = featureMark;
    }


}
