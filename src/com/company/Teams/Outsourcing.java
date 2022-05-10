package com.company.Teams;

import com.company.DTO.*;
import com.company.things_they_do.IVideo;

import java.util.List;

public class Outsourcing implements IVideo {
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
    public List<Datas> research(Nas nas) {
        return null;
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
        return null;
    }
}
