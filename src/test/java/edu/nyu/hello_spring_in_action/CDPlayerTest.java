package edu.nyu.hello_spring_in_action;

import edu.nyu.hello_spring_in_action.config.CDPlayerConfig_Auto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig_Auto.class)
public class CDPlayerTest {

    @Autowired
    private CDPlayer player;

    @Test
    public void play() {
        player.play();
        System.out.println(player.getCd());
    }

}
