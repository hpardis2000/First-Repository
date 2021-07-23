
public class Card implements Comparable<Card>{
	
	public static enum Suit {
		SPADES("Spades"),CLUBS("Clubs"),HEARTS("Hearts"),DIAMONDS("Diamonds");
		
		private String displayString;
		
		private Suit(String displayString) {
			this.displayString=displayString;
		}
		public String getDisplayString() {
			return this.displayString;
		}
		@Override
		public String toString() {
			return this.displayString;
		}
	};
	public static enum Value {
		ONE(1,false),TWO(2,false),THREE(3,false),FOUR(4,false),FIVE(5,false),SIX(6,false),SEVEN(7,false),EIGHT(8,false),NINE(9,false),
		JACK(10,true),QUEEN(10,true),KING(10,true),
		ACE(1,false);
		
		private int value;
		private boolean faceCard;
		
		private Value(int value,boolean faceCard) {
			this.value=value;
			this.faceCard=faceCard;
		}
		public int getValue() {
			return this.value;
		}
		public boolean getFaceCard() {
			return this.faceCard;
		}
//		@Override
//		public String toString() {
//			
//			return "Value is: " + value + " Is this a face card? ";
//		}
	};

	private Suit suit;
	private Value value;
	
	public Card(Suit suit, Value value) {
		this.suit=suit;
		this.value=value;
	}
	
	public Suit getSuit() {
		return this.suit;
	}
	public int getValue() {
		return this.value.getValue();
	}
	public boolean isFaceCard() {
		return this.value.getFaceCard();
	}
	
	@Override
	public String toString() {
		return value + " Of " + suit;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Card) {
			Card otherCard=(Card)obj;
			return this.suit.equals(otherCard.suit) && 
					this.value.equals(otherCard.value);
		}else {
			return false;
		}
	}

	@Override
	public int compareTo(Card otherCard) {
		if(suit.equals(otherCard.suit)) {
			return this.value.compareTo(otherCard.value);
		}else {
			return this.suit.compareTo(otherCard.suit);
		}
	}
		
}
