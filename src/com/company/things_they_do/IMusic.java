package com.company.things_they_do;

import com.company.DTO.Inst;
import com.company.DTO.Lyric;
import com.company.DTO.Music;
import com.company.DTO.Voice;

public interface IMusic {
    Music compose();
    Lyric write();
    Music arrange();
    Music mixing();
    Voice record(Voice voice);
    Inst record(Inst inst);
}
