
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    
    public Money plus(Money added){
        
        int resultEuros = this.euros + added.euros;
        int resultCents = this.cents + added.cents;
        
        Money result = new Money(resultEuros, resultCents);
        return result;
        
    }
 
    public boolean less(Money compared){
        
        int thisTotal = (this.euros*100) + this.cents;
        int comparedTotal = (compared.euros*100) + compared.cents;
        
        if (thisTotal < comparedTotal){
            return true;
        }
        else {
            return false;
        }
        
    }

    public Money minus(Money decremented){
        
        int thisTotal = (this.euros*100) + this.cents;
        int decrementedTotal = (decremented.euros*100) + decremented.cents;
        int resultTotal = thisTotal - decrementedTotal;
        
        if (resultTotal > 0){
            Money result = new Money(0, resultTotal);
            return result;
        } else{
            Money result = new Money(0, 0);
            return result;
        }
             
    }    
    
}
