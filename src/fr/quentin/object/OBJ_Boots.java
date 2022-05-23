package fr.quentin.object;

import fr.quentin.entity.Entity;
import fr.quentin.main.GamePanel;

public class OBJ_Boots extends Entity {

    public OBJ_Boots(GamePanel gp) {

        super(gp);

        name = "Boots";
        down1 = setup("/objects/boots");
    }
}
