## irakoze_maurice_assignment1

Web technologies wednesday group assignment 1
Admission module with hibernate

#### Technologies tools used

```bash
Hibernate
IDE - Eclipse IDE
Maven 3.5.3
Java 17
Apache Tomcat version 9
MySQL
```

### configurations

Configure the following before running this project

1. src\main\resources\hibernate.cfg.xml

```bash
<property name="connection.url">jdbc:mysql://localhost:3306/YOUR_DATABASE_NAME?useSSL=false</property>
<property name="connection.username">YOUR_DATABASE_USERNAME</property>
<property name="connection.password">YOUR_DATABASE_PASSWORD</property>
```

1. tomcat server.xml

```bash
Change context path to "/"
```
