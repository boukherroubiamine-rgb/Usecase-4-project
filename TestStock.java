public class TestStock {
    public static void main(String[] args) {
        Stock stock = new Stock(5);

        Ordinateur o1 = new Ordinateur("HP", "Pavilion", "Intel i5", 8, 512);
        Ordinateur o2 = new Ordinateur("Dell", "Inspiron", "Intel i7", 16, 1024);
        Ordinateur o3 = new Ordinateur("Lenovo", "ThinkPad", "AMD Ryzen 5", 8, 256);

        stock.ajouterOrdinateur(o1);
        stock.ajouterOrdinateur(o2);
        stock.ajouterOrdinateur(o3);

        System.out.println("---- Stock initial ----");
        stock.afficherStock();

        System.out.println("\n---- Recherche ----");
        Ordinateur resultat = stock.rechercherOrdinateur("Dell", "Inspiron");
        if (resultat != null) resultat.afficherInfos();
        else System.out.println("Ordinateur non trouvé.");

        System.out.println("\n---- Suppression ----");
        stock.supprimerOrdinateur("HP", "Pavilion");

        System.out.println("\n---- Stock après suppression ----");
        stock.afficherStock();
    }
}
