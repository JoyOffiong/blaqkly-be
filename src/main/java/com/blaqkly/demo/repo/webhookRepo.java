package com.blaqkly.demo.repo;

import com.blaqkly.demo.model.webhook_model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface webhookRepo extends JpaRepository<webhook_model, String> {

}

