package ma.smartgrade.service;

import ma.smartgrade.model.Etudiant;
import java.util.List;
import java.util.ArrayList;


public class EtudiantService {

    private List<Etudiant> etudiants;

    public EtudiantService() {
        etudiants = new ArrayList<>();
    }

    //Les Méthodes

    public void ajouterEtudiant(Etudiant etudiant) {
        //1. verification des doublons
        for(Etudiant e : etudiants){
            if(e.getId() == etudiant.getId()){
                System.out.println("un étudiant avec l'Id " + etudiant.getId() +"existe déjà");
                return;
            }
        }
        //2. si pas de doublon, on ajoute
        etudiants.add(etudiant);
        System.out.println("Étudiant ajouté avec succès : " + etudiant);
    }

    public void afficherTousLesEtudiants() {
        if(etudiants.isEmpty()){
            System.out.println("Aucun étudiant enregistré pour le moment.");
            return;
        }
        System.out.println("Liste des étudiants :");
        for(Etudiant e : etudiants){
            System.out.println(e); // utilise toString()
        }
    }

    public Etudiant chercherParId(int id) {
        for (Etudiant e : etudiants) {
            if (e.getId() == id) {
                return e; // On a trouvé → on retourne l'étudiant
            }
        }

        // Si on arrive ici, la boucle est terminée sans avoir trouvé
        System.out.println("Pas d'étudiant avec l'Id: " + id);
        return null;
    }


    public boolean supprimerParId(int id) {
        Etudiant aSupprimer = null;

        // 1. On cherche l'étudiant
        for (Etudiant e : etudiants) {
            if (e.getId() == id) {
                aSupprimer = e;
                break; // on sort de la boucle, on a trouvé
            }
        }

        // 2. On supprime si trouvé
        if (aSupprimer != null) {
            etudiants.remove(aSupprimer);
            System.out.println("Étudiant supprimé avec succès : " + aSupprimer);
            return true;
        } else {
            System.out.println("Pas d'étudiant avec l'Id: " + id);
            return false;
        }
    }



}
