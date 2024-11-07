package com.Project.UnRealProperties.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Project.UnRealProperties.model.ContactUs;
import com.Project.UnRealProperties.repository.ContactUsRepository;

@Service
public class ContactUsService {

    private final ContactUsRepository contactUsRepository;

    @Autowired
    public ContactUsService(ContactUsRepository contactUsRepository) {
        this.contactUsRepository = contactUsRepository;
    }

    public ContactUs saveContactUs(ContactUs contactUs) {
        return contactUsRepository.save(contactUs);
    }

    // Other service methods if needed
}
