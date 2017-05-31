package ua.lviv.shop.serviceImpl;

import ua.lviv.shop.entity.Bid;
import ua.lviv.shop.entity.Bidder;
import ua.lviv.shop.entity.Item;

import java.util.List;

/**
 * Created by User on 31.05.2017.
 */
public interface BidService {

    /**
     * Adds a bid
     * @param bid - bid
     */
    void add(Bid bid);

    /**
     * Cancels the bid
     * @param bid - bid
     */
    void cancelBid(Bid bid);

    /**
     * Returns a list of the bids
     * @param item - item
     * @return list of bids
     */
    List<Bid> getBids(Item item);

    /**
     * Returns a bid provided the
     * @param id
     * @return Bid
     */
    String getBid(long id);

    /**
     * Places a snag-it order
     * @param item - item being ordered
     * @param bidder - bidder
     * @param card - credit card
     */
    public void placeSnagItOrder(Item item, Bidder bidder, CreditCard card) throws CreditProcessingException, CreditCardSystemException;


}
