
import entity.Categorie;
import entity.Produit;
import service.CategorieService;
import service.ProduitService;
import view.GestionnaireView;

public class App {
    public static void main(String[] args) throws Exception {
        int choix;
        do {
               System.out.println("1-Ajouter Categorie"); 
               System.out.println("2-Lister les Categorie");
               System.out.println("3-Ajouter Produit"); 
               System.out.println("4-Lister les Produits");  
               System.out.println("5-Lister les Produits d'une categorie");  
               System.out.println("6-Quitter"); 
               choix=GestionnaireView.saisieNbrePositif("Faites votre choix: ");

               switch (choix) {
                case 1:
                       Categorie categorie=GestionnaireView.saisieCategorie();
                      var result= CategorieService.addCategorie(categorie);
                      if (result) {
                          System.out.println("Categorie ajoutee avec success");
                      }else{
                        System.out.println("Tableau est rempli");
                      }
                break;
                case 2:
                       Categorie[] categories=CategorieService.getAllCategories();
                       int nbreCategorie=CategorieService.getNbreCategorie();
                       GestionnaireView.afficheCategorie(categories,nbreCategorie);
                break;

                 case 3:
                        
                       categories=CategorieService.getAllCategories();
                       nbreCategorie=CategorieService.getNbreCategorie();
                       Produit produit=GestionnaireView.saisieProduit(categories,nbreCategorie);
                       result= ProduitService.addProduit(produit);
                      if (result) {
                          System.out.println("Produit ajoutee avec success");
                      }else{
                        System.out.println("Produit est rempli");
                       }
                break;

                 case 4:
                       Produit[] produits=ProduitService.getAllProduits();
                       int nbreProduit=ProduitService.getNbreProduit();
                       GestionnaireView.afficheProduit(produits, nbreProduit);
                break;

                 case 5:
                       String nom =GestionnaireView.saisieChaine("Entrer le Nom de la Categorie: ");
                       Categorie categorieByNom=CategorieService.getCategorieByNom(nom);
                       if (categorieByNom==null) {
                           System.out.println("Cette categorie n'existe pas");
                        } else {
                           produits=categorieByNom.getProduitsByCategorie();
                           nbreProduit=categorieByNom.getNbreProduitByCategorie();
                          GestionnaireView.afficheProduit(produits, nbreProduit);
                       }
                      
                break;
                default:
               break;
               }
        } while (choix!=6);
    }
}
