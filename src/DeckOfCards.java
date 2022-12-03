public class DeckOfCards {
    int[] deck = new int[52];
    String[] suits = {"Clubs","Diamonds","Hearts", "Spades"};
    String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King","Ace"};

    int[][] player_cards=new int[13][4];
    public void initialize_cards(){
        // Initialize cards
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
    }
    public void shuffle_cards(){
        for (int i = 0; i < deck.length; i++) {
            int index = (int)(Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }

    }


    public void distribute_cards(){
        for (int i = 0; i < 52; i++) {
            int choice=i%4;
            int suit = deck[i] / 13;
            int rank = deck[i] % 13;
            player_cards[rank][suit]=choice+1;
    }
    }
    public void display_cards(){
        System.out.println("Player 1 Cards:");
            for(int i=0;i<player_cards.length;i++){
                for(int j=0;j<4;j++){
                    if(player_cards[i][j]==1){
                        System.out.println(ranks[i]+" of "+suits[j]);
                    }
                }
            }
        System.out.println("\n\nPlayer 2 Cards:");
        for(int i=0;i<player_cards.length;i++){
            for(int j=0;j<4;j++){
                if(player_cards[i][j]==2){
                    System.out.println(ranks[i]+" of "+suits[j]);
                }
            }
        }
        System.out.println("\n\nPlayer 3 Cards:");
        for(int i=0;i<player_cards.length;i++){
            for(int j=0;j<4;j++){
                if(player_cards[i][j]==3){
                    System.out.println(ranks[i]+" of "+suits[j]);
                }
            }
        }
        System.out.println("\n\nPlayer 4 Cards:");
        for(int i=0;i<player_cards.length;i++){
            for(int j=0;j<4;j++){
                if(player_cards[i][j]==4){
                    System.out.println(ranks[i]+" of "+suits[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
            DeckOfCards dec_obj=new DeckOfCards();
            dec_obj.initialize_cards();
            dec_obj.shuffle_cards();
            dec_obj.distribute_cards();
            dec_obj.display_cards();
        }
}

