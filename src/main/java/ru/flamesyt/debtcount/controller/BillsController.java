package ru.flamesyt.debtcount.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.flamesyt.debtcount.entity.BillEntity;

import javax.websocket.server.PathParam;

@RequestMapping("/bills")
@RestController
public class BillsController {

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public String getAllBills(@RequestParam(value = "filter", required = false) String filter) {
        if (filter != null) {
            return filter;
        }
        return "All bills";
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/bill/{id}")
    public String getBillById(@PathVariable("id") String id) {
        return "ID " + id;
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping
    public String postBill(@RequestBody BillEntity bill) {
        return "Bill " + bill.getId() + " Successfully added";
    }
}
