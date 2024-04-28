package br.com.ConfigurationExternalProperties.service;

import br.com.ConfigurationExternalProperties.producer.PongProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PingService {
    @Autowired
    private PongProducer pongProducer;

    public String getProperties() {
        return pongProducer.getProperties();
    }
}
