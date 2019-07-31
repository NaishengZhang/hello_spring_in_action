package edu.nyu.hello_spring_in_action.cd.impl;

import edu.nyu.hello_spring_in_action.cd.CompactDisc;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "jazz")
@PropertySource(value = "config.properties")
public class Jazz implements CompactDisc {
    private String title;
    private String artist;

    public Jazz(@Value(value = "${jazz.title}") String title, @Value(value = "${jazz.artist}") String artist) {
        this.title = title;
        this.artist = artist;
    }

    @Override
    public void play() {
        System.out.println("Play jazz " + title + " " + artist);
    }
}
