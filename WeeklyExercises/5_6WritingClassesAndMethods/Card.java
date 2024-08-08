package Assignment;

class Card {
    private String suit;
    private String faceValue;

    // Constructor to initialize suit and face value of the card
    public Card(String suit, String faceValue) {
        this.suit = suit;
        this.faceValue = faceValue;
    }

    // Getter methods
    public String getSuit() {
        return suit;
    }

    public String getFaceValue() {
        return faceValue;
    }

    // Method to represent card as a string
    public String toString() {
        return faceValue + " of " + suit;
    }
}