package com.example.springsoapslient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class SpellerConfiguration {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        // this package must match the package in the <generatePackage> specified in
        // pom.xml
        marshaller.setContextPath("com.example.springsoapslient.wsdl");
        return marshaller;
    }

    @Bean
    public SpellerClient countryClient(Jaxb2Marshaller marshaller) {
        SpellerClient client = new SpellerClient();
        client.setDefaultUri("http://speller.yandex.net/services/spellservice");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}
