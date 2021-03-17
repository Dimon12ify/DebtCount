package ru.flamesyt.debtcount.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RequestMapping("/bills")
@RestController
public class BillsController {

    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @GetMapping("/")
    public static String getAllBills(@RequestParam(value = "filter", required = false) String filter) {
        if (filter != null) {
            return filter;
        }
        return "All bills";
    }

    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @GetMapping("/{id}")
    public static String getBillById(@PathVariable("id") String id) {
        return "ID " + id;
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping
    public static String postBill(@RequestBody String billMock) {
        return "Bill " + billMock + " Successfully added";
    }
}
