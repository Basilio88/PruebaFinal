package com.example.chatbot.repository;

import com.example.chatbot.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<UserModel, Long>{
    UserModel findByChatId(Long chatId);
}
