package com.example.cloudant.app.config;

import com.fasterxml.jackson.databind.MapperFeature;
import org.ektorp.CouchDbConnector;
import org.ektorp.CouchDbInstance;
import org.ektorp.impl.StdCouchDbConnector;
import org.springframework.cloud.config.java.AbstractCloudConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
public class CloudantAppConfig extends AbstractCloudConfig{
	
	@Bean
	  public CouchDbConnector couchDbConnector(CouchDbInstance couchDbInstance) {
	    CouchDbConnector connector = new StdCouchDbConnector("accountdb", couchDbInstance);
	    connector.createDatabaseIfNotExists();
	    return connector;
	  }
	
	@Bean
    public CouchDbInstance couchDbInstance() {
      CouchDbInstance instance = connectionFactory().service(CouchDbInstance.class);
      return instance;
    }

    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, true);

        return mapper;
    }

}
