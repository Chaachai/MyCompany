package helper;

import bean.Demande;
import bean.DemandeConge;
import java.util.List;

import javafx.scene.control.TableView;

public class DemandeCongeFxHelper extends AbstractFxHelper<DemandeConge> {

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

    public DemandeCongeFxHelper(TableView<DemandeConge> table, List<DemandeConge> list) {
        super(titres, table, list);
    }

    public DemandeCongeFxHelper(TableView<DemandeConge> table) {
        super(titres, table);
    }

}
