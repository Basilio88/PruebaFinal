
package com.example.chatbot.service;

import com.example.chatbot.model.ChatMessage;
import com.example.chatbot.model.UserModel;
import com.example.chatbot.repository.IChatMassageRepository;
import com.example.chatbot.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TelegramBotService {
    @Autowired
    private IUserRepository userRepository;

    @Autowired
    private IChatMassageRepository chatMessageRepository;

    public void handleIncomingMessage(Long chatId, String username, String name, String messageContent) {
        UserModel user = userRepository.findByChatId(chatId);
        
        if (user == null) {
            user = new UserModel();
            user.setChatId(chatId);
            user.setUsername(username);
            user.setName(name);
            userRepository.save(user);
        }

        ChatMessage chatMessage = new ChatMessage();
        chatMessage.setMessageContent(messageContent);
        chatMessage.setUser(user);
        chatMessageRepository.save(chatMessage);
    }
}
