package com.company.teams;

import com.company.model.Diorama;
import com.company.things_they_do.IClean;
import com.company.things_they_do.IPray;

public class Team3D implements IClean, IPray {
    private Diorama diorama;
    @Override
    public void clean() {
        System.out.println("맡은 구역 청소하기");
    }

    @Override
    public void pray() {
        System.out.println("1시 기도");
    }

    public Diorama make(){
        return diorama;
    }
}
