package org.example;
import org.example.zrk.bindings.OrderOutputChannelProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(value={OrderOutputChannelProcessor.class})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}