package com.company.Teams;

import com.company.DTO.Voice;
import com.company.things_they_do.IRecord;

public class Announcer implements IRecord {
    private Voice voice;
    @Override
    public Voice record() {
        return voice;
    }
}
