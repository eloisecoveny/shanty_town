package attractions;

import inhabitants.Visitor;

import java.util.ArrayList;

public class Museum extends Attraction implements ITicket, IEnter {

    private String name;
    private ArrayList<Review> reviews;

    public Museum(String name){
        super(name);
        this.reviews = new ArrayList<Review>();
    }

    public void charge(Visitor visitor){
        visitor.isCharged(10.00);
    }

    public String enter(Visitor visitor){
        this.charge(visitor);
        return "As your close the door behind you the wooden floorboards beneath foot creak and cradle your weight. Dust particles float around you as you breathe in the cloggy scent of old industry and horse-wear. That will cost $10 please, askss the woman behind the counter. Small round spectacles and some unknown scar around the circumference of her neck. Please remember to leave a comment on your way out.";
    }

    public void isIssuedReview(Review review){
        this.reviews.add(review);
    }

    public int countReviews(){
        return this.reviews.size();
    }
}
