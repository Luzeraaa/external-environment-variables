package br.com.ConfigurationExternalProperties.producer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//A variável de ambiente é carregada através do servidor
@FeignClient(value = "pong-service", url = "${service.pong.url}")
public interface PongProducer {

    @GetMapping
    String getProperties();

}
