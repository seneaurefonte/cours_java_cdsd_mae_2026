

public final class TableauService {
    private static  final int TAILLE = 10;
    private static int[] tableauInt=new int[TAILLE];
    private static int nbreElements = 0;

    public static int getNbreElements() {
        return TableauService.nbreElements;
    }

    private TableauService() {
        // Constructeur privé pour empêcher l'instanciation
    }

  public static boolean addElement(int value) {
        if (TableauService.nbreElements < TAILLE) {
            tableauInt[TableauService.nbreElements] = value;
            TableauService.nbreElements++;
            return true;
        }
        return false;
    }

public  static int[] getTableauInt() {
      return TableauService.tableauInt; 
}
   
}
