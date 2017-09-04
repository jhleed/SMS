# simple message server

Mail, SMS 등을 전송할 수 있는 서버



### application.properties

```
spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.username=your email
spring.mail.password=your password
spring.mail.default-encoding=utf-8
spring.mail.protocol=smtp
spring.mail.properties.mail.smtp.starttls.enable=true
spring.mail.properties.mail.smtp.starttls.required=true
```