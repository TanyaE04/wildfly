  #  wildfly
  This application allows to get reduced form for arbitrary set of page numbers.



  # Requirements
   WildFly 18.0.1 Final
   Maven 3.6.3


  # Getting started
  Deploy application on WildFly server (can use wildfly-plugin). After the application will be able at http://localhost:8080/{artifactId}/reducedPageNumbers?rawPageNumbers={list of page numbers seperated by comma}
  
  
  Maven plugins:
  ```
          <plugin>
             <groupId>org.apache.maven.plugins</groupId>
             <artifactId>maven-war-plugin</artifactId>
             <version>3.2.2</version>
             <configuration>
                 <failOnMissingWebXml>false</failOnMissingWebXml> //not need web.xml
             </configuration>
          </plugin>
          <plugin>
             <groupId>org.wildfly.plugins</groupId>
             <artifactId>wildfly-maven-plugin</artifactId>  //deploy application by command ###mvn wildfly:deploy
             <version>2.0.2.Final</version>
          </plugin>
  ```

  Maven dependencies:
  ```
        <dependency>
            <groupId>javax.ws.rs</groupId>
            <artifactId>javax.ws.rs-api</artifactId>
            <version>2.1.1</version>
            <scope>provided</scope>
        </dependency>
        <dependency>
            <groupId>org.jboss.spec.javax.ws.rs</groupId>
            <artifactId>jboss-jaxrs-api_2.1_spec</artifactId>
            <version>2.0.1.Final</version>
            <scope>provided</scope>
        </dependency>
        <dependency>
            <groupId>org.jboss.spec.javax.annotation</groupId>
            <artifactId>jboss-annotations-api_1.3_spec</artifactId>
            <version>2.0.1.Final</version>
            <scope>provided</scope>
        </dependency>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.11</version>
            <scope>test</scope>
        </dependency>
  ```

