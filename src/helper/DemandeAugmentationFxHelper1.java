package helper;

import bean.Demande;
import bean.DemandeConge;
import java.util.List;

import javafx.scene.control.TableView;

public class DemandeAugmentationFxHelper1 extends AbstractFxHelper<DemandeConge> {

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

    public DemandeAugmentationFxHelper1(TableView<DemandeConge> table, List<DemandeConge> list) {
        super(titres, table, list);
    }

    public DemandeAugmentationFxHelper1(TableView<DemandeConge> table) {
        super(titres, table);
    }

}
