package com.andrew.ITicket.repo;

import com.andrew.ITicket.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepo extends JpaRepository<Message, Long> {
}
