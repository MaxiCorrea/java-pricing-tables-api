FROM openjdk:11
VOLUME /tmp
ADD ./target/java-pricing-tables-api.jar java-pricing-tables-api.jar
ENTRYPOINT ["java","-jar","/java-pricing-tables-api.jar"]
