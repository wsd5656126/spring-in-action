package com.wusd.xmlconfig.impl;

import com.wusd.xmlconfig.CompactDisc;

/**
 * 口水专辑
 */
public class SgtPeppers implements CompactDisc {
    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";
    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
