package com.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;

@Service
public class KafkaDatabaseConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaDatabaseConsumer.class);

    @KafkaListener(
                    topics = "kafka-topic-wikimedia-recent-change",
                    groupId = "myGroup"
    )
    public void consume(String eventMessage) {
        System.out.println("hello");
        LOGGER.info(String.format("Event message received -> %s", eventMessage));
    }
}
