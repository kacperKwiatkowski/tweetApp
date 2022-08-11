package com.kacperKwiatkowski.tweetApp.repository;

import com.kacperKwiatkowski.tweetApp.model.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends MongoRepository<UserEntity, UUID> {
}
