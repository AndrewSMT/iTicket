package com.andrew.ITicket.repo;


import com.andrew.ITicket.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepo extends JpaRepository<User, String> {
}
