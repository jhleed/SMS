package me.james.simplemessageserver.mail.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class Email {
    @JsonProperty("to")
    private String to; //받는 사람
    @JsonProperty("title")
    private String title; // 메일 제목
    @JsonProperty("message")
    private String message; //메일 본문

}
