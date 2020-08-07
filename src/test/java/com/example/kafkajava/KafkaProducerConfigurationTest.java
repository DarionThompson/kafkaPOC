package com.example.kafkajava;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class KafkaProducerConfigurationTest {

    @Test
    public void shouldReturnKafkaConfiguration(){
        //Arrange
        ProducerConfiguration consumerConfiguration = new ProducerConfiguration();

        //Act
        var createConsumerConfiguration = consumerConfiguration.createProducerConfigurations();

        //Assert
        assertThat(createConsumerConfiguration).isNotNull();
    }

    @Test
    public void shouldContainConfigurationForServerConfig(){
        //Arrange
        ProducerConfiguration consumerConfiguration = new ProducerConfiguration();

        //Act
        var createConsumerConfiguration = consumerConfiguration.createProducerConfigurations();

        //Assert
        assertThat(createConsumerConfiguration.get(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG)).isNotNull();
    }

    @Test
    public void shouldContainConfigurationForGroupIdConfig(){
        //Arrange
        ProducerConfiguration consumerConfiguration = new ProducerConfiguration();

        //Act
        var createConsumerConfiguration = consumerConfiguration.createProducerConfigurations();

        //Assert
        assertThat(createConsumerConfiguration.get("group.id")).isNotNull();
    }

    @Test
    public void shouldContainConfigurationForKeyDeserializedClassConfig(){
        //Arrange
        ProducerConfiguration consumerConfiguration = new ProducerConfiguration();

        //Act
        var createConsumerConfiguration = consumerConfiguration.createProducerConfigurations();

        //Assert
        assertThat(createConsumerConfiguration.get("key.deserializer")).isNotNull();
    }

    @Test
    public void shouldContainConfigurationForValueDeserializedClassConfig(){
        //Arrange
        ConsumerConfiguration consumerConfiguration = new ConsumerConfiguration();

        //Act
        var createConsumerConfiguration = consumerConfiguration.createConsumerConfigurations();

        //Assert
        assertThat(createConsumerConfiguration.get("value.deserializer")).isNotNull();
    }

}
