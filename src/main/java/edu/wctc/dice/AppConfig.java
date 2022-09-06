package edu.wctc.dice;

import edu.wctc.dice.iface.Dice;
import edu.wctc.dice.iface.GameInput;
import edu.wctc.dice.iface.GameOutput;
import edu.wctc.dice.impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("edu.wctc.dice")
public class AppConfig {
    @Bean
    public GameOutput gameOutput() {
        return new ConsoleOutput();
        //return new PopupOutput();
    }

    @Bean
    public GameInput gameInput() {
        return new ConsoleInput();
        //return new PopupInput();
    }

    @Bean
    public Dice dice() {
        return new Dice20Sided();
    }
}
