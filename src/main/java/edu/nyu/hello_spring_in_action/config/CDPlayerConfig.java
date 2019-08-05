package edu.nyu.hello_spring_in_action.config;

import edu.nyu.hello_spring_in_action.cd.CompactDisc;
import edu.nyu.hello_spring_in_action.cd.impl.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//@ComponentScan(basePackages = "edu.nyu.hello_spring_in_action")

@Configuration
public class CDPlayerConfig {

    //构造器注入
//    @Bean
//    public CDPlayer cdPlayer(CompactDisc compactDisc){
//        return new CDPlayer(compactDisc);
//    }


    @Bean
    public CompactDisc sgtPeppers() {
        SgtPeppers sgtPeppers = new SgtPeppers();
        sgtPeppers.setArtist("The Beastles");
        sgtPeppers.setTitle("Peppers");
        return sgtPeppers;
    }
}
