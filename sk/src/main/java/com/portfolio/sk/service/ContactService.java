package com.portfolio.sk.service;

import com.portfolio.sk.entity.ContactMessage;
import com.portfolio.sk.repository.ContactMessageRepository;
import org.springframework.stereotype.Service;

@Service
public class ContactService {
    private final ContactMessageRepository contactMessageRepository;

    public ContactService(ContactMessageRepository contactMessageRepository) {
        this.contactMessageRepository = contactMessageRepository;
    }

    public ContactMessage save(ContactMessage message) {
        return contactMessageRepository.save(message);
    }
}