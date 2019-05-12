package helper;

import bean.DemandeAvance;
import java.util.List;

import javafx.scene.control.TableView;

public class DemandeAvanceFxHelper extends AbstractFxHelper<DemandeAvance> {

    private static AbstractFxHelperItem[] titres;

    static {
        titres = new AbstractFxHelperItem[]{
            new AbstractFxHelperItem("N#", "id"),
            new AbstractFxHelperItem("DATE", "date"),
            new AbstractFxHelperItem("DATE DEBUT", "dateDebut"),
            new AbstractFxHelperItem("DATE FIN", "dateFin"),
            new AbstractFxHelperItem("Commentaire", "commentaire"),
            new AbstractFxHelperItem("ETAT", "etat")
        };
    }

    public DemandeAvanceFxHelper(TableView<DemandeAvance> table, List<DemandeAvance> list) {
        super(titres, table, list);
    }

    public DemandeAvanceFxHelper(TableView<DemandeAvance> table) {
        super(titres, table);
    }

}
