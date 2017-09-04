package me.james.simplemessageserver.mail.controller;

import me.james.simplemessageserver.mail.domain.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/mail")
public class MailController {

    @Autowired
    private JavaMailSender javaMailSender;

    @PostMapping("/v1/send")
    public ResponseEntity<Email> sendMail(
            @RequestBody Email email
    ) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(email.getTo());
        message.setSubject(email.getTitle());
        message.setText(email.getMessage());
        javaMailSender.send(message);
        return new ResponseEntity<>(email, HttpStatus.OK);
    }
}
