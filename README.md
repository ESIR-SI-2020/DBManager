# Pocket Project - Domain and Databases (Elastic Search + Kafka)

This project contains three things that you may need:

1. The domain models of the pocket application (see module `domain`)
2. The kafka configuration (see module `kafka`)
3. The elastic search configuration (see module `elastic-search`)

Feel free to contribute to these projects via Pull Requests.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

## Prerequisites

1. Install Java and set JAVA_HOME and PATH variables.
2. Install Maven.
3. Install Elasticsearch 5.6.0
4. Configure ElasticSearch Cluster by opening ${ELASTICSEARCH_HOME}\config\elasticsearch.yml and adding the following configuration `cluster.name: pocket-cluster`
5. Go to `application.properties` file and modify the `elasticsearch.host`, `elasticsearch.port`, `elasticsearch.home` to match your local configuration.
6. Install Kafka (requires Zookeeper)
7. Create a new topic in Kafka, named `pocket-application`
8. In your `application.properties` configure `kafka.topic`, `kafka.bootstrapAddress` and `kafka.groupdId`

## To do each time a new version is released

As this project contains classes that all the systems rely on, any update must be integrated by every project.
Therefore, when a new version of this project is released, you have to update your dependencies to it. 
To do so:
1. Come back to this folder's root
2. Type `mvn install` -> this will build every module and place a jar of them in your local maven repository. Then you will be able to use them in other projects.
3. You're all set

## Using

### Domain

To use the domain module, please add the following dependency:

```xml
<dependency>
    <groupId>fr.esir.jxc</groupId>
    <artifactId>domain</artifactId>
    <version>1.1.0</version>
</dependency>
```

Nothing more to do if you followed the section `To do each time a new version is released`.

### Elastic Search

To use the domain module, please add the following dependency:

```xml
<dependency>
    <groupId>fr.esir.jxc</groupId>
    <artifactId>elastic-search</artifactId>
    <version>1.1.0</version>
</dependency>
```

Be careful, this project only provide you with configurations!
Then, if you need Elastic Search, you will have to start it by yourself on your machine.

To get up and running with elastic search, you must add this to your SpringBoot main class:

```java
@ComponentScan({"fr.esir.jxc.elasticsearch.config"}) // add your root package too
public class MyApplication { ... }
```

Then in all the services that need a connector to Elastic Search, add this property:

```java
@Service
class MyService {
  @Autowired private ElasticsearchOperations elasticsearchTemplate;
}
```

### Kafka

With kafka, same than elastic search, you'll have to start an instance of kafka on your machine.
 
Then you have to write your own Kafka producer or consumer, depending on your needs.

Example are available here: [consumer](https://github.com/ESIR-SI-2020/examples/blob/master/src/main/java/fr/esir/jxc/examples/user_events_handler/services/UserEventsListener.java) and [producer](https://github.com/ESIR-SI-2020/examples/blob/master/src/main/java/fr/esir/jxc/examples/command/services/KafkaProducer.java).
