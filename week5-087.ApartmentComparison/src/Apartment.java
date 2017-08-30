
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    
    public boolean larger(Apartment otherApartment){
        if (this.squareMeters > otherApartment.squareMeters){
            return true;
        }
        else {
            return false;
        }
    }

    public int priceDifference(Apartment otherApartment){
        
        int aptPrice = this.pricePerSquareMeter * this.squareMeters;
        int otherAptPrice = otherApartment.pricePerSquareMeter * otherApartment.squareMeters;
        
        return Math.abs(aptPrice - otherAptPrice);
    }
    
    public boolean moreExpensiveThan(Apartment otherApartment){
        
        int aptPrice = this.pricePerSquareMeter * this.squareMeters;
        int otherAptPrice = otherApartment.pricePerSquareMeter * otherApartment.squareMeters;
        
        if (aptPrice > otherAptPrice){
            return true;
        } else {
            return false;
        }
    }
    
}
