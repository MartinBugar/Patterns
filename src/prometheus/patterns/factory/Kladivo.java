package prometheus.patterns.factory;

public class Kladivo {
    private String farba;
    private String vyrobca;
    private float dlzka;

    public Kladivo(Builder builder) {
        setFarba(builder.farba);
        setVyrobca(builder.vyrobca);
        setDlzka(builder.dlzka);
    }
    //......

    public static Builder noveKladivo(){
        return new Builder();
    }

    public String getFarba() {
        return farba;
    }

    public void setFarba(String farba) {
        this.farba = farba;
    }

    public String getVyrobca() {
        return vyrobca;
    }

    public void setVyrobca(String vyrobca) {
        this.vyrobca = vyrobca;
    }

    public float getDlzka() {
        return dlzka;
    }

    public void setDlzka(float dlzka) {
        this.dlzka = dlzka;
    }

    public static class Builder {
        private String farba;
        private String vyrobca;
        private float dlzka;

        private Builder(){}

        public Builder farba (String farba){
            this.farba = farba;
            return this;
        }

        public Builder vyrobca (String vyrobca){
            this.vyrobca = vyrobca;
            return this;
        }

        public  Builder dlzka (Float dlzka){
            this.dlzka = dlzka;
            return this;
        }

        public Kladivo build(){
            return  new Kladivo(this);
        }
    }
}
