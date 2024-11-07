package com.Project.UnRealProperties.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.Project.UnRealProperties.model.ContactUs;
import com.Project.UnRealProperties.service.ContactUsService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ContactUsController {

	@Autowired
    private final ContactUsService contactUsService;

    
    public ContactUsController(ContactUsService contactUsService) {
        this.contactUsService = contactUsService;
    }

    @PostMapping("/contact")
    public ContactUs handleContactForm(@RequestBody ContactUs contactUs) {
        return contactUsService.saveContactUs(contactUs);
    }

    // Other controller methods if needed
}

