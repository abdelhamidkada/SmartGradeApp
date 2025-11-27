package ma.smartgrade.ui;
import ma.smartgrade.model.Etudiant;
import ma.smartgrade.service.EtudiantService;

public class SmartGradeApp {
    public static void main(String[] args) {
        // ici on va tester EtudiantService

        EtudiantService e = new EtudiantService();

        Etudiant e1 = new Etudiant(1, "Oubihi", "ismail", "ismail.oubihi@gmail.com", "BCG");
        Etudiant e2 = new Etudiant(2, "Ezzamouri", "Redouane", "Redouane.Ezzamouri@gmail.com", "GEGM");
        Etudiant e3 = new Etudiant(3, "Kada", "Abdelhamid", "Abdelhamid.Kada@gmail.com", "MIP");
        Etudiant e4 = new Etudiant(4, "Mojahid", "Youness", "Youness.Mojahid@gmail.com", "GEGM");


        // on les ajoute dans la liste
        e.ajouterEtudiant(e1);
        e.ajouterEtudiant(e2);
        e.ajouterEtudiant(e3);
        e.ajouterEtudiant(e4);

        // on affiche la liste des étudiants
        e.afficherTousLesEtudiants();

        // petits tests bonus
        e.chercherParId(2);      // devrait trouver Redouane
        e.supprimerParId(1);     // supprime Ismail
        e.afficherTousLesEtudiants(); // voir la liste après suppression
    }
}
