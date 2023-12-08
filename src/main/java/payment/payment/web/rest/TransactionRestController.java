package payment.payment.web.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import payment.payment.domen.Transaction;
import payment.payment.service.ServiceTransaction;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TransactionRestController {

    public final ServiceTransaction serviceTransaction;

    public TransactionRestController(ServiceTransaction serviceTransaction) {
        this.serviceTransaction = serviceTransaction;
    }


    @PostMapping("/transaction")
    public ResponseEntity<Transaction> create(@RequestBody Transaction transaction){
        Transaction result = serviceTransaction.save(transaction);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/transactions")
    public ResponseEntity<List<Transaction>> getAll(){
        return ResponseEntity.ok(serviceTransaction.findAll());
    }

    @GetMapping("/transactions/test")
    public ResponseEntity getMsg(){
        return ResponseEntity.ok(serviceTransaction.findAll());
    }
}
