package helper;

import bean.Demande;
import java.util.List;

import javafx.scene.control.TableView;

public class DemandeFxHelper extends AbstractFxHelper<Demande> {

    private static AbstractFxHelperItem[] titres;

    static {
        titres = new AbstractFxHelperItem[]{
            new AbstractFxHelperItem("Numero", "id"),
            new AbstractFxHelperItem("Type", "typeDemande"),
            new AbstractFxHelperItem("First Name", "prenom"),
            new AbstractFxHelperItem("Address", "adresse"),
            new AbstractFxHelperItem("Phone number", "telephone"),
            new AbstractFxHelperItem("Category", "classe")
        };
    }

    public DemandeFxHelper(TableView<Demande> table, List<Demande> list) {
        super(titres, table, list);
    }

    public DemandeFxHelper(TableView<Demande> table) {
        super(titres, table);
    }

}
