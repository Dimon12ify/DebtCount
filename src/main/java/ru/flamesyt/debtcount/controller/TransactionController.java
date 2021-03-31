package ru.flamesyt.debtcount.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.flamesyt.debtcount.entity.TransactionEntity;

@RestController
@RequestMapping("transactions")
public class TransactionController {

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public String getAllTransactions() {
        return "all transactions";
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/transaction/{id}")
    public String getTransactionById(@PathVariable long id) {
        return "Transactions with id " + id;
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping
    public String addTransaction(@RequestBody TransactionEntity transaction) {
        return "Transactions with id " + transaction.getId() + " was successfully added";
    }

}
