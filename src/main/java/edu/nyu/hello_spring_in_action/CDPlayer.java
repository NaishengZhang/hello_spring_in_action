package edu.nyu.hello_spring_in_action;

import edu.nyu.hello_spring_in_action.annotation.Chinese;
import edu.nyu.hello_spring_in_action.cd.CompactDisc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer {
    @Autowired
//    @American
    @Qualifier("jazz")
    private CompactDisc cd;


    public CompactDisc getCd() {
        return cd;
    }

    public void setCd(CompactDisc cd) {
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }

}
