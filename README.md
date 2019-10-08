## codeCraft社区

## 部署
### 依赖
- Git
- JDK
- Maven
- MySQL
## 步骤
- yum update
- yum install git
- mkdir App
- cd App
- git clone https://github.com/codedrinker/community.git
- yum install maven
- mvn -v
- mvn compile package

## 资料
[spring 文档](https://spring.io/guides)  
[spring Web](https://spring.io/guides/gs/serving-web-content/)  
[es](https://elasticsearch.cn/exploer)  
[Bootstrap](https://v3.bootcss.com/getting-started/)  
[Github OAuth](https://developer.github.com/apps/building-oauth-apps/creating-an-oauth-app/)  
[Spring](https://docs.spring.io/spring-boot/docs/2.1.7.RELEASE/reference/html/boot-features-sql.html#boot-features-embedded-database-support)
[菜鸟教程](https://www.runoob.com/mysql/mysql-insert-query.html)  
[Thymeleaf](https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html#setting-attribute-values)  
[Spring MVC](https://docs.spring.io/spring/docs/5.0.3.RELEASE/spring-framework-reference/web.html#mvc-config)  
[Markdown 插件](https://editor.md.ipandao.com/)
## 工具
[Git](https://git-scm.com/download)  
[Visual Paradigm](https://www.visual-parading.com)  
[flyway](https://flywaydb.org/getstarted/firststeps/maven)  
[Lombok](https://www.projectlombok.org)

## 脚本
```sql
    create table USER
    (
    	ID int AUTO_INCREMENT primary key not null,
    	ACCOUNT_ID VARCHAR(100),
    	NAME VARCHAR(50),
    	TOKEN CHAR(36),
    	GMT_CREATE BIGINT,
    	GMT_MODIFIED BIGINT
    );
```
```bash
mvn flyway:migrate
mvn -Dmybatis.generator.overwrite=true mybatis-generator:generate
```