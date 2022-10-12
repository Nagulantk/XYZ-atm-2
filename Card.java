public class Card {
    int cardNumber;
    private int ccv;
    int pin;
    public int getPin() {
        return pin;
    }
    Card( int cardNumber, int pin, int ccv)
    {
        this.ccv=ccv;
        this.cardNumber=cardNumber;
        this.pin=pin;
    }
}
