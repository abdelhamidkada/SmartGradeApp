package ma.smartgrade.model;

public class Module {
    private String codeModule;
    private String intitule;
    private double coefficient;

    //constructeur

    public Module (){
        // constructeur sans paramètres
    }

    public Module(String codeModule, String intitule, double coefficient){
        this.codeModule = codeModule;
        this.intitule = intitule;
        this.coefficient = coefficient;
    }

    //Getters

    public String getCodeModule() {
        return codeModule;
    }

    public String getIntitule() {
        return intitule;
    }

    public double getCoefficient() {
        return coefficient;
    }

    //Setters

    public void setCodeModule(String codeModule) {
        this.codeModule = codeModule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

    @Override
    public String toString() {
        return codeModule + " - " + intitule + " (Coeff: " + coefficient + ")";
    }


}
