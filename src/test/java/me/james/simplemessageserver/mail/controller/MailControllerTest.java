package me.james.simplemessageserver.mail.controller;

import me.james.simplemessageserver.mail.domain.Email;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MailControllerTest {

    @Autowired
    private MailController mailController;

    @Test
    public void sendMail() throws Exception {
        //TODO 실제로 메일을 쏘지 않고 테스트 하는 방법은 없을까?
        //Given
        Email email = new Email();
        email.setTitle("mail title");
        email.setMessage("hello it's test message");
        email.setTo("jhleed@naver.com");

        //When
        ResponseEntity<Email> result = mailController.sendMail(email);

        //Then
        assertNotNull(result);
        assertEquals(HttpStatus.OK, result.getStatusCode());
        assertEquals(email, result.getBody());
    }
}