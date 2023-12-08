package payment.payment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import payment.payment.domen.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction,Long> {

}
