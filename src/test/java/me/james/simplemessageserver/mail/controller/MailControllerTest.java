package me.james.simplemessageserver.mail.controller;

import me.james.simplemessageserver.mail.domain.Email;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MailControllerTest {

    @Autowired
    private MailController mailController;

    @Test
    public void sendMail() throws Exception {
        //Given
        Email email = new Email();
        email.setFrom("hello@james.me");
        email.setTitle("mail title");
        email.setMessage("hello it's test message");

        //When
        boolean result = mailController.sendMail(email);

        //Then
        assertTrue(result);
    }
}