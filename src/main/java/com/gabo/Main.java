package com.gabo;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gabo.beans.HelloWorld;
import com.gabo.configs.StoneConfigs;
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

        final AnnotationConfigApplicationContext applicationContext 
        = new AnnotationConfigApplicationContext(StoneConfigs.class);

        final GaunletServiceImpl gaunletService =
        applicationContext.getBean(GaunletServiceImpl.class);

        gaunletService.useGaunlet("space");
        gaunletService.useFullPower();
        

        /*
         * Load all beans by eager
         * implementation of IoC supports events, internationalization
         * configurable and advanced management of beans
         * Anotation @ComponentScan and @Configuration
         * 
         */
        // final ClassPathXmlApplicationContext applicationContext = 
        //     new ClassPathXmlApplicationContext("stones.xml");
        /*
         * Basic implementation of IoC
         */
        // final BeanFactory beanFactory = 
        //     new ClassPathXmlApplicationContext("stones.xml");
        // final MindStone mind = applicationContext.getBean("mind", MindStone.class);
        // final PowerStone power = applicationContext.getBean("power", PowerStone.class);
        // final RealityStone reality = applicationContext.getBean("reality", RealityStone.class);
        // final SoulStone soul = applicationContext.getBean("soul", SoulStone.class);     
        // final SpaceStone space = applicationContext.getBean("space", SpaceStone.class);
        // final TimeStone time = applicationContext.getBean("time", TimeStone.class);
        // final GaunletService gaunletService = new GaunletServiceImpl(
        //     mind, power, reality, soul, space, time
        // );
        // gaunletService.useFullPower();
        // gaunletService.useGaunlet("mind");
    }
}