package fr.quentin.object;

import fr.quentin.entity.Entity;
import fr.quentin.main.GamePanel;

public class OBJ_Key extends Entity {

    public OBJ_Key(GamePanel gp) {
        super(gp);

        name = "Key";
        down1 = setup("/objects/key");
    }
}
