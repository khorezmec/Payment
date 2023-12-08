package payment.payment.service;

import org.springframework.stereotype.Service;
import payment.payment.domen.Transaction;
import payment.payment.repository.TransactionRepository;

import java.util.List;

@Service
public class ServiceTransaction {
    private final TransactionRepository transactionRepository;

    public ServiceTransaction(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public Transaction save(Transaction transaction){
        return transactionRepository.save(transaction);
    }

    public List<Transaction> findAll(){
        return transactionRepository.findAll();
    }
}
