package com.company.things_they_do;

import com.company.DTO.Music;
import com.company.DTO.Score;
import com.company.DTO.Video;

public interface IUpload {
    void upload(Video video);
    void upload(Music music);
    void upload(Score score);
}
