package ua.lviv.shop.entity;

import javax.persistence.*;

/**
 * Created by User on 31.05.2017.
 */
@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Bidder bidder;



    public Order() {
    }
}
