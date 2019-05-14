package helper;

import bean.DemandeAugmentation;
import bean.DemandeConge;
import java.util.List;

import javafx.scene.control.TableView;

public class DemandeAugmentationFxHelper1 extends AbstractFxHelper<DemandeAugmentation> {

    private static AbstractFxHelperItem[] titres;

    static {
        titres = new AbstractFxHelperItem[]{
            new AbstractFxHelperItem("N#", "id"),
            new AbstractFxHelperItem("DATE", "date"),
            new AbstractFxHelperItem("Pourcentage_Augmentation", "Pourcentage"),
            new AbstractFxHelperItem("Commentaire", "commentaire"),
            new AbstractFxHelperItem("ETAT", "etat")
        };
    }

    public DemandeAugmentationFxHelper1(TableView<DemandeAugmentation> table, List<DemandeAugmentation> list) {
        super(titres, table, list);
    }

    public DemandeAugmentationFxHelper1(TableView<DemandeAugmentation> table) {
        super(titres, table);
    }

}
