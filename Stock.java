public class Stock {
    private Ordinateur[] ordinateurs;
    private int nbOrdinateurs;

    public Stock(int taille) {
        ordinateurs = new Ordinateur[taille];
        nbOrdinateurs = 0;
    }

    public boolean ajouterOrdinateur(Ordinateur o) {
        if (nbOrdinateurs < ordinateurs.length) {
            ordinateurs[nbOrdinateurs] = o;
            nbOrdinateurs++;
            return true;
        } else {
            System.out.println("Stock plein, impossible d'ajouter un nouvel ordinateur.");
            return false;
        }
    }

    public void afficherStock() {
        if (nbOrdinateurs == 0) {
            System.out.println("Aucun ordinateur en stock.");
        } else {
            for (int i = 0; i < nbOrdinateurs; i++) {
                ordinateurs[i].afficherInfos();
            }
        }
    }

    public Ordinateur rechercherOrdinateur(String marque, String modele) {
        for (int i = 0; i < nbOrdinateurs; i++) {
            if (ordinateurs[i].getMarque().equalsIgnoreCase(marque) &&
                ordinateurs[i].getModele().equalsIgnoreCase(modele)) {
                return ordinateurs[i];
            }
        }
        return null;
    }

    public boolean supprimerOrdinateur(String marque, String modele) {
        for (int i = 0; i < nbOrdinateurs; i++) {
            if (ordinateurs[i].getMarque().equalsIgnoreCase(marque) &&
                ordinateurs[i].getModele().equalsIgnoreCase(modele)) {
                for (int j = i; j < nbOrdinateurs - 1; j++) {
                    ordinateurs[j] = ordinateurs[j + 1];
                }
                ordinateurs[nbOrdinateurs - 1] = null;
                nbOrdinateurs--;
                System.out.println("Ordinateur supprimé avec succès.");
                return true;
            }
        }
        System.out.println("Ordinateur introuvable.");
        return false;
    }
}
