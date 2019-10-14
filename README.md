# Pocket Project - DB Manager

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

## Prerequisites

1. Install Java and set JAVA_HOME and PATH variables.
2. Install Maven.
3. Install Elasticsearch 5.6.0
4. Configure ElasticSearch Cluster by opening ${ELASTICSEARCH_HOME}\config\elasticsearch.yml and adding the following configuration `cluster.name: pocket-cluster`
5. Go to `application.properties` file and modify the `elasticsearch.host`, `elasticsearch.port`, `elasticsearch.home` to match your local configuration.

### Running

1. Start Elasticsearch Instance

*(Go to project root)*

2. `mvn clean install`
3. `mvn spring-boot:run`

## Deployement

In construction