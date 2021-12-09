package com.sentek.com.sentek.repository;

import com.sentek.com.sentek.entity.Account;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountRepository extends MongoRepository<Account,Long> {

}
