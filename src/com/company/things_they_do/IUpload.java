package com.company.things_they_do;

import com.company.model.Music;
import com.company.model.Score;
import com.company.model.Video;

public interface IUpload {
    void upload(Video video);
    void upload(Music music);
    void upload(Score score);
}
