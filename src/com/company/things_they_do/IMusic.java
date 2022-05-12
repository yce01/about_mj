package com.company.things_they_do;

import com.company.model.Inst;
import com.company.model.Lyric;
import com.company.model.Music;
import com.company.model.Voice;

public interface IMusic {
    Music compose();
    Lyric write();
    Music arrange();
    Music mixing();
    Voice record(Voice voice);
    Inst record(Inst inst);
}
