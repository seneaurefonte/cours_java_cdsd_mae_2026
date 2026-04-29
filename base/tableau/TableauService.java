import java.util.Arrays;

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
       private static int[] tabPairs=new int[TAILLE];
    
       private static int nbreValPairs=0;
     

      public  static int[] getTableauIntPairs() {
        for (int index = 0; index < TableauService.nbreElements ; index++) {
             if (TableauService.tableauInt[index]%2==0) {
                TableauService.tabPairs[TableauService.nbreValPairs]=TableauService.tableauInt[index];
                TableauService.nbreValPairs++;
             }
        }
         return    TableauService.tabPairs; 
    }

       public static int[] getTabPairs() {
        return tabPairs;
      }

      public static int getNbreValPairs() {
        return nbreValPairs;
      }

      public static int[] getTabSorted(){
        //Copie de valeurs
         int[] tabClone=Arrays.copyOf(TableauService.tableauInt, TableauService.nbreElements);
         Arrays.sort(tabClone);
         return tabClone; 
      }

public  static int[] getTableauInt() {
      return TableauService.tableauInt; 
}
   
}
