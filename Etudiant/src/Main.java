// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Etudiant e1 = new Etudiant(1,"chiha","khalil");
        Etudiant e2 = new Etudiant(2, "chargui","wassef");
        Etudiant e3 = new Etudiant(3, "attaya","imed");
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e1.equals(e2));
        GestionEtudiant g1 = new GestionEtudiant();

        g1.ajouterEtudiant(e1);
        g1.ajouterEtudiant(e2);
        g1.ajouterEtudiant(e3);

        System.out.println(g1.rechercherEtudiant(e1.getNom()));
        System.out.println(g1.getListetudiant());

        g1.trierEtudiantsParId();
        System.out.println(g1.getListetudiant());

        g1.trierEtudiantsParNom();
        System.out.println(g1.getListetudiant());


        g1.supprimerEtudiant(e3);
        System.out.println(g1.getListetudiant());

        }

}