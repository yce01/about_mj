package com.company.Teams;

import com.company.DTO.*;
import com.company.things_they_do.*;

public class TeamMusic implements IMusic, IClean, IPray, IUpload, IExercise {
    private Music music;
    private Lyric lyric;
    private Voice voice;
    private Inst inst;
    public void setMusic(Music music){
        this.music = music;
    }
    public Music getMusic(){
        return music;
    }
    public void setLyric(Lyric lyric) {
        this.lyric = lyric;
    }
    public Lyric getLyric() {
        return lyric;
    }
    public void setVoice(Voice voice) {
        this.voice = voice;
    }
    public Voice getVoice() {
        return voice;
    }
    public void setInst(Inst inst) {
        this.inst = inst;
    }
    public Inst getInst() {
        return inst;
    }

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
    public Music compose() {
        System.out.println("작곡하기");
        return music;
    }

    @Override
    public Lyric write() {
        System.out.println("작사하기");
        return lyric;
    }

    @Override
    public Music arrange() {
        System.out.println("편곡하기");
        return music;
    }

    @Override
    public Music mixing() {
        System.out.println("믹싱하기");
        return music;
    }

    @Override
    public Voice record(Voice voice) {
        System.out.println("녹음하기");
        return voice;
    }

    @Override
    public Inst record(Inst inst) {
        System.out.println("세션 녹음하기");
        return inst;
    }

    @Override
    public void pray() {
        System.out.println("1시 기도");
    }

    @Override
    public void upload(Video video) {
    }

    @Override
    public void upload(Music music) {
        System.out.println("음원 업로드");
    }

    @Override
    public void upload(Score score) {
        System.out.println("악보 업로드");
    }
}
