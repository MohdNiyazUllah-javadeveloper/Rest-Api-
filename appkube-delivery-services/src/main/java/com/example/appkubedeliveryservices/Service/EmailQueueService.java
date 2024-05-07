package com.example.appkubedeliveryservices.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.appkubedeliveryservices.Repository.EmailQueueRepository;
import com.example.appkubedeliveryservices.entity.EmailQueueEntity;

@Service
public class EmailQueueService {

	
	 
		  @Autowired
		    private EmailQueueRepository emailQueueRepository;

		    public List<EmailQueueEntity> getAllEmails() {
		        return emailQueueRepository.findAll();
		    }

		    public Optional<EmailQueueEntity> getEmailById(Long id) {
		        return emailQueueRepository.findById(id);
		    }

		    public EmailQueueEntity saveEmail(EmailQueueEntity email) {
		        return emailQueueRepository.save(email);
		    }

		    public void deleteEmail(Long id) {
		        emailQueueRepository.deleteById(id);
		    }
	}


