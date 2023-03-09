# 工程简介

# 延伸阅读

# 资料
[Spring Boot 文档](https://spring.io/guides/gs)

[Spring Web 文档](https://spring.io/guides/gs/testing-web/)

[ES社区](https://elasticsearch.cn/)

[GitHub deploy key](https://docs.github.com/en/authentication/connecting-to-github-with-ssh/managing-deploy-keys#deploy-keys)

[Bootspart](https://v3.bootcss.com/getting-started/)

[GitHub QAuth](https://docs.github.com/zh/apps/oauth-apps/building-oauth-apps/creating-an-oauth-app)
# 工具
[Git](https://git-scm.com/download)

[Visual Paradigm](https://www.visual-paradigm.com/cn/)

[Spring](https://docs.spring.io/spring-boot/docs/2.0.0.RC1/reference/htmlsingle/#boot-features-embedded-database-support)

# 脚本
```sql
CREATE TABLE USER(
    "ID" INTEGER AUTO_INCREMENT PRIMARY KEY NOT NULL,
    "ACCOUNT_ID" CHARACTER VARYING(100),
    "NAME" CHARACTER VARYING(50),
    "TOKEN" CHARACTER(36),
    "GMT_CREATE" BIGINT,
    "GMT_MODIFIED" BIGINT
)

```