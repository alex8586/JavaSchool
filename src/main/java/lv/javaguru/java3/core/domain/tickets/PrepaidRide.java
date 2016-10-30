package lv.javaguru.java3.core.domain.tickets;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="prepaid_rides")
@PrimaryKeyJoinColumn(name="ticket_id" , referencedColumnName = "id")
public class PrepaidRide extends Ticket {

    @Column(name="balance")
    private int balance;

    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "PrepaidRide{" +
                "balance=" + balance +
                " " + super.toString() +
                '}';
    }
}
