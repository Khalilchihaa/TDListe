import java.util.ArrayList;
import java.util.Collections;

public class GestionEtudiant implements University<Etudiant>{
    private ArrayList<Etudiant> listetudiant = new ArrayList<Etudiant>();

    public ArrayList<Etudiant> getListetudiant() {
        return listetudiant;
    }

    public void setListetudiant(ArrayList<Etudiant> listetudiant) {
        this.listetudiant = listetudiant;
    }

    @Override
    public void ajouterEtudiant(Etudiant e) {
        this.listetudiant.add(e);

    }

    @Override
    public boolean rechercherEtudiant(Etudiant e) {
        return this.listetudiant.contains(e);

    }

    @Override
    public boolean rechercherEtudiant(String nom) {
        for (Etudiant e:listetudiant){
            if (e.getNom().equals(nom))
                return true;
        }
        return false;
    }

    @Override
    public void supprimerEtudiant(Etudiant e) {
        listetudiant.remove(e);
    }

    @Override
    public void displayEtudiants() {
        for (Etudiant e: listetudiant){
            System.out.println(e);
        }

    }

    @Override
    public void trierEtudiantsParId() {
        Collections.sort(listetudiant,new Etudiant());

    }

    @Override
    public void trierEtudiantsParNom() {
        Collections.sort(listetudiant, new Triname());

    }

}
