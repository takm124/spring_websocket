package com.practice.audio.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.TargetDataLine;

@Controller
@Slf4j
public class AudioController {
    //http://cris.joongbu.ac.kr/course/java/api/javax/sound/sampled/AudioSystem.html

    private AudioInputStream ais; // audio stream
    private AudioFormat af;
    private TargetDataLine line; // Data type which can read audio data.


}
