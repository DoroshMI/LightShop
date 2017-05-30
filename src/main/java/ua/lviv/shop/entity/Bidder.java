package ua.lviv.shop.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by User on 29.05.2017.
 */
@Entity
@DiscriminatorValue(value = "B")
public class Bidder extends User implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "bidder")
    private List<Bid> bids;

    public Bidder() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Bid> getBids() {
        return bids;
    }

    public void setBids(List<Bid> bids) {
        this.bids = bids;
    }
}
