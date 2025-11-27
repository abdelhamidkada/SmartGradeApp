package ma.smartgrade.model;

public class Note {
    private Etudiant etudiant;
    private Module module;
    private double note;

    //Constructeur

    public Note(){
        // constructeur sans paramètres
    }

    public Note(Etudiant etudiant, Module module, double note){
        this.etudiant = etudiant;
        this.module = module;
        this.note = note;
    }

    //Getters


    public Etudiant getEtudiant() {
        return etudiant;
    }

    public Module getModule() {
        return module;
    }

    public double getNote() {
        return note;
    }

    //Setters


    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public void setModule(Module module) {
        this.module = module;
    }

    public void setNote(double note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return etudiant.getNom() + " " + etudiant.getPrenom() +
                " | " + module.getIntitule() +
                " : " + note;
    }

}
