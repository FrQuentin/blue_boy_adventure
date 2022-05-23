package fr.quentin.object;

import fr.quentin.entity.Entity;
import fr.quentin.main.GamePanel;

public class OBJ_Chest extends Entity {

    public OBJ_Chest(GamePanel gp) {

        super(gp);

        name = "Chest";
        down1 = setup("/objects/chest");
    }
}
