import java.util.Comparator;

public class Etudiant implements Comparator<Etudiant> {
    int id;
    String nom;
    String prenom;

    public Etudiant(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public Etudiant() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public int compare(Etudiant o1, Etudiant o2) {
        return o1.getId()-o2.getId();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj ==this) return true;
        if (obj==null) return false;
        if (obj.getClass()!=this.getClass())
            return false;
        Etudiant etudiant = (Etudiant)  obj;
        if (  etudiant.id==id && etudiant.prenom==prenom)
            return true;
        return false;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }

}
