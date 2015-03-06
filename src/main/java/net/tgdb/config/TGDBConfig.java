package net.tgdb.config;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import net.tgdb.client.TGDBClient;
import net.tgdb.client.TGDBClientImpl;

import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

/**
 * @author Ldabul
 * @version 0.1 - 06.03.2015
 */
@Configuration
@ComponentScan("net.tgdb")
@PropertySource(value = "classpath:tgdb.properties", ignoreResourceNotFound = true)
public class TGDBConfig {
  private static final int DEFAULT_TIMEOUT = 30 * 1000;

  @Resource
  private Environment env;

  @Bean
  public TGDBClient tgdbClient() {
    TGDBClientImpl tgdbClient = new TGDBClientImpl();
    tgdbClient.setRestTemplate(getRestTemplate());
    return tgdbClient;
  }

  /**
   * Creates rest template for TGDB client
   * 
   * @return
   */
  private RestTemplate getRestTemplate() {
    RestTemplate restTemplate = new RestTemplate();
    restTemplate.setRequestFactory(getRequestFactory());
    restTemplate.setMessageConverters(getMessageConverters());
    return restTemplate;
  }

  /**
   * Creates request factory for rest template
   * 
   * @return
   */
  private ClientHttpRequestFactory getRequestFactory() {
    RequestConfig.Builder builder = RequestConfig.custom();
    builder.setConnectTimeout(env.getProperty("tgdb.connectTimeout", Integer.class, DEFAULT_TIMEOUT));
    builder.setSocketTimeout(env.getProperty("tgdb.connectTimeout", Integer.class, DEFAULT_TIMEOUT));
    builder.setConnectionRequestTimeout(env.getProperty("tgdb.readTimeout", Integer.class, DEFAULT_TIMEOUT));

    HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
    httpClientBuilder.setDefaultRequestConfig(builder.build());

    return new HttpComponentsClientHttpRequestFactory(httpClientBuilder.build());
  }

  /**
   * Creates message converters for rest template
   * 
   * @return
   */
  private List<HttpMessageConverter<?>> getMessageConverters() {
    List<HttpMessageConverter<?>> messageConverter = new ArrayList<>();
    messageConverter.add(new Jaxb2RootElementHttpMessageConverter());
    return messageConverter;
  }
}
