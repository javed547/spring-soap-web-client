package com.javed.spring.soap.web.client.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class WSConfigClient {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.concretepage.article_ws");
        return marshaller;
    }

    @Bean
    public ArticleClient articleClient(Jaxb2Marshaller marshaller) {
        ArticleClient articleClient = new ArticleClient();

        articleClient.setDefaultUri("http://localhost:8080/soapws/articles.wsdl");
        articleClient.setMarshaller(marshaller);
        articleClient.setUnmarshaller(marshaller);

        return articleClient;
    }

}
