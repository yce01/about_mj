package com.company.teams;

import com.company.model.Inst;
import com.company.model.Lyric;
import com.company.model.Music;
import com.company.model.Voice;
import com.company.things_they_do.IExercise;
import com.company.things_they_do.IMusic;
import com.company.things_they_do.IPray;

public class Director implements IExercise, IMusic, IPray {
    @Override
    public void playPingPong() {
        System.out.println("탁구 치기");
    }

    @Override
    public void playFootVolleyball() {
        System.out.println("족구하기");
    }

    @Override
    public void playBadminton() {}

    @Override
    public Music compose() {
        System.out.println("작곡하기");
        return null;
    }

    @Override
    public Lyric write() {
        System.out.println("작사하기");
        return null;
    }

    @Override
    public Music arrange() {
        System.out.println("편곡하기");
        return null;
    }

    @Override
    public Music mixing() {
        return null;
    }

    @Override
    public Voice record(Voice voice) {
        System.out.println("녹음하기");
        return null;
    }

    @Override
    public Inst record(Inst inst) {
        return null;
    }

    @Override
    public void pray() {
        System.out.println("1시 기도");
    }

    public void morningAssembly(){
        System.out.println("아침 조회 올리기");
    }
    public void manage(){
        System.out.println("명작 관리");
    }
}
