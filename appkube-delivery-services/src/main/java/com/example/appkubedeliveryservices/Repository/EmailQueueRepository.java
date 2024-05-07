package com.example.appkubedeliveryservices.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.appkubedeliveryservices.entity.EmailQueueEntity;

public interface EmailQueueRepository extends JpaRepository<EmailQueueEntity, Long> {

}
