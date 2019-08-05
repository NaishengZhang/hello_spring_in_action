package edu.nyu.hello_spring_in_action.cd.impl;

import edu.nyu.hello_spring_in_action.annotation.American;
import edu.nyu.hello_spring_in_action.cd.CompactDisc;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*
 *
 * Try to use @Value  @Primary
 *
 * */
@Component
@Primary
@American
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class SgtPeppers implements CompactDisc {

    //    private String title = "sgt. pepper";
//    private String artist = "The Beatles";
    @Value("sgt")
    private String title;

    @Value("Beatles")
    private String artist;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        System.out.println("执行setTitle");
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        System.out.println("执行setArtist");
        this.artist = artist;
    }

    @Override
    public void play() {
        System.out.println("play" + title + "by" + artist);
    }
}
