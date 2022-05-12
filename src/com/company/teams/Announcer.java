package com.company.teams;

import com.company.model.Voice;
import com.company.things_they_do.IRecord;

public class Announcer implements IRecord {
    private Voice voice;
    @Override
    public Voice record() {
        return voice;
    }
}
