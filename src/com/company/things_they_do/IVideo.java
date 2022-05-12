package com.company.things_they_do;

import com.company.model.*;

import java.util.List;

public interface IVideo {
    List<Datas> research(Nas nas);
    List<VTemplates> searchTemplate(Envato envato);
    List<Music> findMusic(Envato envato);
    Video editVideo(List<Datas> datas, List<VTemplates> templates, List<Music> musics);
    Video completeVideo(Video video);
    Video filming(Camera camera);
}