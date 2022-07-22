package com.example.demo.repo;

import com.example.demo.entity.UserId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserIdRepository  extends JpaRepository<UserId,Long> {
}
