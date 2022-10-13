package com.practice.chat.controller;

import com.practice.chat.domain.ChatMessage;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
@Slf4j
public class ChatController {

    private final SimpMessageSendingOperations so;

    @GetMapping("/chat")
    public String startPage(){
        return "ChatRoom";
    }


    @MessageMapping("/chat/message")
    public void message(ChatMessage message) {

        so.convertAndSend("/sub/chat/room/1", message);
    }

}
