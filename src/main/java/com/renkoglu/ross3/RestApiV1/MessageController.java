package com.renkoglu.ross3.RestApiV1;

import com.renkoglu.ross3.Business.IService;
import com.renkoglu.ross3.Entities.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class MessageController {

    @Autowired
    @Qualifier("messageManager")
    private IService messageManager;

    public MessageController(IService messageManager) {
        this.messageManager = messageManager;
    }

    @GetMapping("/messages")
    public List<Message> messages() {
        return messageManager.getAll();
    }

    @GetMapping("/messages/{id}")
    public Message getById(@PathVariable int id) {
        return (Message) messageManager.getById(id);
    }

    @PostMapping("/messages")
    public void add(@RequestBody Message message) {
        messageManager.add(message);
    }

    @PutMapping("/messages")
    public void update(@RequestBody Message message) {
        messageManager.update(message);
    }

    @DeleteMapping("/messages")
    public void delete(@RequestBody Message message) {
        messageManager.delete(message);
    }
}
