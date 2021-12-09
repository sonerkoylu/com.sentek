package com.sentek.com.sentek.com.sentek;

import com.sentek.com.sentek.entity.Account;
import com.sentek.com.sentek.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/account")
public class AccountController {
    @Autowired
    private AccountRepository accountRepository;

    @PostMapping
    public ResponseEntity<Account> save(@RequestBody Account account) {
        return ResponseEntity.ok(accountRepository.save(account));
    }

    @GetMapping
    public ResponseEntity<List<Account>> getAll() {
        return ResponseEntity.ok(accountRepository.findAll());
    }
}
