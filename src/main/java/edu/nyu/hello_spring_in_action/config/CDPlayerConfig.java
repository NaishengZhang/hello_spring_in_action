package edu.nyu.hello_spring_in_action.config;

import edu.nyu.hello_spring_in_action.CDPlayer;
import edu.nyu.hello_spring_in_action.cd.CompactDisc;
import edu.nyu.hello_spring_in_action.cd.impl.Rap;
import edu.nyu.hello_spring_in_action.cd.impl.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//@ComponentScan(basePackages = "edu.nyu.hello_spring_in_action")

@Configuration
public class CDPlayerConfig {
//
//    @Bean
//    public CDPlayer cdPlayer(CompactDisc compactDisc){
//        return new CDPlayer(compactDisc);
//    }
//
//
//    @Bean
//    public CompactDisc sgtPeppers() {
//        SgtPeppers sgtPeppers = new SgtPeppers();
//        sgtPeppers.setArtist("The Beastles");
//        sgtPeppers.setTitle("Peppers");
//        return sgtPeppers;
//    }

//    @Bean
//    public CompactDisc randomCD(){
//        int choice = (int)Math.floor(Math.random() * 2);
//        if (choice == 0) {
//            return new SgtPeppers();
//        }else {
//            return new Rap();
//        }
//    }
}
