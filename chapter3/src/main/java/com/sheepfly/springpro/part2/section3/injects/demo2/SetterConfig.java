package com.sheepfly.springpro.part2.section3.injects.demo2;

import com.sheepfly.springpro.part1.MessageProvider;
import com.sheepfly.springpro.part1.MessageProviderImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:com/sheepfly/springpro/part2/section3/SetterInject.xml")
public class SetterConfig {
    @Bean
    public MessageProvider defaultProvider() {
        return new MessageProviderImpl();
    }

    @Bean
    public MessageProvider homeProvider() {
        MessageProviderImpl messageProvider = new MessageProviderImpl();
        messageProvider.setMessage("home");
        return messageProvider;
    }

    @Bean
    public MessageProvider autowiredProvider() {
        MessageProviderImpl messageProvider = new MessageProviderImpl();
        messageProvider.setMessage("autowire");
        return messageProvider;
    }
}
