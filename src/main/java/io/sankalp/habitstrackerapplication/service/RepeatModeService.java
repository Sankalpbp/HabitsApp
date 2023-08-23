package io.sankalp.habitstrackerapplication.service;

import io.sankalp.habitstrackerapplication.entity.RepeatMode;
import io.sankalp.habitstrackerapplication.payload.RepeatModeDTO;

public interface RepeatModeService {

    public RepeatMode createRepeatMode (RepeatModeDTO repeatModeDTO );
}
