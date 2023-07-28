package com.girlkun.models.boss.ultils;

import java.util.Random;

import com.girlkun.models.boss.Boss;
import com.girlkun.models.boss.BossData;
import com.girlkun.models.map.ItemMap;
import com.girlkun.models.player.Player;
import com.girlkun.services.Service;
import com.girlkun.utils.Util;

public class BossDropItem extends Boss {

    public BossDropItem(int id, BossData ...data) throws Exception {
        super(id, data);
        //TODO Auto-generated constructor stub  
    }
    public void DropITem(Player plKill){
        int[] itemDos = new int[]{233, 237, 241,245, 249, 253,257, 261, 265,269, 273, 277,281};
        int[] itemtime = new int[]{381,382,383,384,385};
        int randomDo = new Random().nextInt(itemDos.length);
        int randomitem = new Random().nextInt(itemtime.length);
        if (Util.isTrue(20, 100)) {
            if (Util.isTrue(1, 5)) {
                Service.gI().dropItemMap(this.zone, Util.RaitiDoc12(zone, 281, 1, this.location.x, this.location.y, plKill.id));
                return;
            }
            Service.gI().dropItemMap(this.zone, Util.RaitiDoc12(zone, itemDos[randomDo], 1, this.location.x, this.location.y, plKill.id));
        } else {
            Service.gI().dropItemMap(this.zone, new ItemMap(zone, itemtime[randomitem], 1, this.location.x, zone.map.yPhysicInTop(this.location.x, this.location.y - 24), plKill.id));
        }
    }
    
}
