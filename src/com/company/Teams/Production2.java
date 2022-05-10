package com.company.Teams;

import com.company.DTO.*;
import com.company.things_they_do.*;

import java.util.List;

public class Production2 implements IVideo, IClean, IUpload, IExercise, IPray {
    private Video video;
    private List<Music> musics;
    private List<VTemplates> templates;
    private List<Datas> datas;

    public void setVideo(Video video){
        this.video = video;
    }
    public Video getVideo() {
        return video;
    }
    public List<Music> getMusics(){
        return musics;
    }
    public List<VTemplates> getTemplates(){
        return templates;
    }
    public List<Datas> getDatas(){
        return datas;
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
    public void pray() {
        System.out.println("1시 기도");
    }

    @Override
    public void upload(Video video) {
        System.out.println("영상 업로드");
    }

    @Override
    public void upload(Music music) {
    }

    @Override
    public void upload(Score score) {

    }

    @Override
    public List<Datas> research(Nas nas) {
        System.out.println("나스에서 자료 찾기");
        return datas;
    }

    @Override
    public List<VTemplates> searchTemplate(Envato envato) {
        System.out.println("영상 템플릿 찾기");
        return templates;
    }

    @Override
    public List<Music> findMusic(Envato envato) {
        System.out.println("영상에 넣을 음악 찾기");
        return musics;
    }

    @Override
    public Video editVideo(List<Datas> datas, List<VTemplates> templates, List<Music> musics) {
        System.out.println("영상 편집");
        return video;
    }

    @Override
    public Video completeVideo(Video video) {
        System.out.println("영상 종편하기");
        return video;
    }

    @Override
    public Video filming(Camera camera) {
        System.out.println("촬영하기");
        return null;
    }
}
