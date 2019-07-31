package edu.nyu.hello_spring_in_action.cd.impl;

import edu.nyu.hello_spring_in_action.cd.CompactDisc;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "rap")
@PropertySource(value = "config.properties")
public class Rap implements CompactDisc {
    @Value("${rap.artist}")
    private String artist;

    @Value("${rap.title}")
    private String title;

    @Override
    public void play() {
        System.out.println("  play  " + title + "  by  " + artist);
    }

    @Override
    public String toString() {
        return "Rap{" +
                "artist='" + artist + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }


}
