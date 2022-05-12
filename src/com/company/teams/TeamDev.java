package com.company.teams;

import com.company.model.App;
import com.company.model.Server;
import com.company.model.Web;
import com.company.things_they_do.IClean;
import com.company.things_they_do.IExercise;
import com.company.things_they_do.IPray;

public class TeamDev implements IClean, IPray, IExercise {
    @Override
    public void clean() {
        System.out.println("맡은 구역 청소하기");
    }

    @Override
    public void playPingPong() {
        System.out.println("탁구 치기");
    }

    @Override
    public void playFootVolleyball() {
        System.out.println("족구하기");
    }

    @Override
    public void playBadminton() {
        System.out.println("배드민턴 치기");
    }

    @Override
    public void pray() {
        System.out.println("1시 기도");
    }

    public App app(){
        System.out.println("앱 개발");
        return null;
    }
    public Web web(){
        System.out.println("웹 개발");
        return null;
    }
    public Server server(){
        System.out.println("서버 관리");
        return null;
    }
}
