package com.gabo.services;

import java.lang.reflect.Field;
import java.util.Map;

import com.gabo.models.MindStone;
import com.gabo.models.PowerStone;
import com.gabo.models.RealityStone;
import com.gabo.models.SoulStone;
import com.gabo.models.SpaceStone;
import com.gabo.models.Stone;
import com.gabo.models.TimeStone;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.java.Log;

@Log
@AllArgsConstructor  
@Getter
public class GaunletServiceImpl implements GaunletService {

    private final MindStone mind;
    private final PowerStone power;
    private final RealityStone reality;
    private final SoulStone soul;
    private final SpaceStone space;
    private final TimeStone time;

    @Override
    public void useGaunlet(String stoneName){
        switch (stoneName) {
            case "mind":
                log.info("Use stone " + this.mind);   
                break;
            case "power":
                log.info("Use stone " + this.power);   
                break;
            case "reality":
                log.info("Use stone " + this.reality);   
                break;
            case "soul":
                log.info("Use stone " + this.soul);   
                break;
            case "space":
                log.info("Use stone " + this.space);   
                break;
            case "time":
                log.info("Use stone " + this.time);   
                break;
            default:
                throw new IllegalArgumentException("Invalid name");
        }
    }
    public void useFullPower(){
        if(
            this.mind != null 
            && this.power != null 
            && this.reality != null 
            && this.soul !=null 
            && this.space != null 
            && this.time != null){
            log.info("Using all power");
        } else {
            throw new IllegalStateException("Can't be using full power if some fields are null");
        }
    }
}
