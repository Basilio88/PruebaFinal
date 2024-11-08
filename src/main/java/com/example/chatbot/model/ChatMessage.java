package com.example.chatbot.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ChatMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String messageContent;

    @ManyToOne
    @JoinColumn(name = "bot_command_id")
    private BotCommand botCommand;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserModel user;
    
}