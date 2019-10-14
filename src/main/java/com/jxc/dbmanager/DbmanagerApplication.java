package com.jxc.dbmanager;

import lombok.extern.slf4j.Slf4j;
import org.elasticsearch.client.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;

import java.util.Map;

@SpringBootApplication
@Slf4j
public class DbmanagerApplication implements CommandLineRunner {

    @Autowired
    private ElasticsearchOperations esOperation;

    public static void main(String[] args) {
        SpringApplication.run(DbmanagerApplication.class, args);
    }

    @Override
    public void run(String... args) {
        printElasticSearchInfos();
    }

    /**
     * A method that display information about the ElasticSearch database
     */
    private void printElasticSearchInfos() {

        log.info("--- ElasticSearchInfos : Start ---");
        Client client = esOperation.getClient();
        Map<String, String> asMap = client.settings().getAsMap();

        asMap.forEach((k, v) -> {
            log.info(k + " = " + v);
        });
        log.info("--- ElasticSearchInfos : End ---");
    }

}
