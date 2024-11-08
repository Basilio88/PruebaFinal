package com.example.chatbot.repository;

import com.example.chatbot.model.ChatMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IChatMassageRepository extends JpaRepository<ChatMessage, Long>{
    
}
