package me.james.simplemessageserver.mail.controller;

import me.james.simplemessageserver.mail.domain.Email;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/mail")
public class MailController {
    @PostMapping("")
    public boolean sendMail(
            @RequestBody Email email
    ) {
        return true;
    }
}
