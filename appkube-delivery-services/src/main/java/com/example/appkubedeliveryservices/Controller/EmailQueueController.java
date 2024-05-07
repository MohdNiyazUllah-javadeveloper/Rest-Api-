package com.example.appkubedeliveryservices.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.appkubedeliveryservices.Service.EmailQueueService;
import com.example.appkubedeliveryservices.entity.EmailQueueEntity;
@RestController
@RequestMapping("/emails")

public class EmailQueueController {
	
		
		
	@Autowired
    private EmailQueueService emailQueueService;
    @GetMapping
    public List<EmailQueueEntity> getAllEmails() {
        return emailQueueService.getAllEmails();
    }
    @GetMapping("/{id}")
    public Optional<EmailQueueEntity> getEmailById(@PathVariable Long id) {
        return emailQueueService.getEmailById(id);
             
    
    }
    @PostMapping("post")
    public EmailQueueEntity createEmail(@RequestBody EmailQueueEntity email) {
        return emailQueueService.saveEmail(email);
    }
    @PutMapping("update")
    public EmailQueueEntity updateEmail( @RequestBody EmailQueueEntity updatedEmail) {
         // Ensure ID is set
        return emailQueueService.saveEmail(updatedEmail);
    }
    @DeleteMapping("/{id}")
    public void deleteEmail(@PathVariable Long id) {
        emailQueueService.deleteEmail(id);
    }
}
