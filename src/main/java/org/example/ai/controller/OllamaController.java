package org.example.ai.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ollama")
@CrossOrigin("*")
public class OllamaController {
    private ChatClient chatClient;

    public OllamaController(OllamaChatModel chatModel) {
        this.chatClient = ChatClient.builder(chatModel).build();
    }


    @GetMapping("/{msg}")
    private ResponseEntity<String> getAnswer(@PathVariable String msg){
        ChatResponse respose=chatClient.prompt(msg).call().chatResponse();
        String message=respose.getResult().getOutput().getText();
        return ResponseEntity.ok(message);
    }
}
