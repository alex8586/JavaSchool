package lv.javaguru.java3.domain.tickets;

import lv.javaguru.java3.domain.BaseEntity;
import lv.javaguru.java3.domain.terminals.Terminal;

import javax.persistence.*;


@Entity
@Table(name = "tickets")
@Inheritance(strategy= InheritanceType.JOINED)
@SequenceGenerator(name = "base_generator", sequenceName = "tickets_seq", allocationSize = 1)
public class Ticket extends BaseEntity{

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "issue_terminal_id")
    private Terminal issueTerminal;

    @Column(name = "token_id")
    private long tokenId;

    public Terminal getIssueTerminal() {
        return issueTerminal;
    }
    public void setIssueTerminal(Terminal issueTerminal) {
        this.issueTerminal = issueTerminal;
    }

    public long getTokenId() {
        return tokenId;
    }

    public void setTokenId(long tokenId) {
        this.tokenId = tokenId;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", issueTerminal=" + issueTerminal +
                ", tokenId=" + tokenId +
                '}';
    }
}
