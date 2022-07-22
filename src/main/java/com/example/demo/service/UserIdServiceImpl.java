package com.example.demo.service;

import com.example.demo.entity.UserId;
import com.example.demo.repo.UserIdRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service

@AllArgsConstructor
public class UserIdServiceImpl implements UserIdService{

    private final UserIdRepository repository;


    @Override
    public Long getNextUserId() {
        UserId userId= new UserId();
        repository.save(userId);
        return userId.getId();
    }
}
