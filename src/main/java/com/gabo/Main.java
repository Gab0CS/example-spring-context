package com.gabo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gabo.beans.HelloWorld;
import com.gabo.models.MindStone;
import com.gabo.models.PowerStone;
import com.gabo.models.RealityStone;
import com.gabo.models.SoulStone;
import com.gabo.models.SpaceStone;
import com.gabo.models.TimeStone;
import com.gabo.services.GaunletService;
import com.gabo.services.GaunletServiceImpl;
public class Main {
    public static void main(String[] args) {

        final ClassPathXmlApplicationContext applicationContext = 
            new ClassPathXmlApplicationContext("stones.xml");
        
        final MindStone mind = applicationContext.getBean("mind", MindStone.class);
        final PowerStone power = applicationContext.getBean("power", PowerStone.class);
        final RealityStone reality = applicationContext.getBean("reality", RealityStone.class);
        final SoulStone soul = applicationContext.getBean("soul", SoulStone.class);     
        final SpaceStone space = applicationContext.getBean("space", SpaceStone.class);
        final TimeStone time = applicationContext.getBean("time", TimeStone.class);

        final GaunletService gaunletService = new GaunletServiceImpl(
            mind, power, reality, soul, space, time
        );

        gaunletService.useFullPower();
        gaunletService.useGaunlet("mind");

        applicationContext.close();
    }
}