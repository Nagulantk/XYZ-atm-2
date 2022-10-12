import java.util.*;
public class Server {
  private static ArrayList<Card> cards=new java.util.ArrayList<>();
  private static  HashMap<Card,Integer> list=new HashMap<>();
   private static  HashMap<Integer,Integer> list1=new HashMap<>();
   Scanner input=new Scanner(System.in);

    public static ArrayList<Card> getCards() {
        return cards;
    }

    public static HashMap<Card, Integer> getList() {
        return list;
    }

    public static HashMap<Integer, Integer> getList1() {
        return list1;
    }

    public static void setCards(Card card) {
        Server.cards.add(card);
    }

    public static void setList(Card card, Integer accountNumber) {
        Server.list.put(card,accountNumber);
    }

    public static void setList1(int accountNumber,int balance) {
        Server.list1.put(accountNumber,balance);
    }

    public int verification()
    {System.out.println("Enter the card Number");
        int cardNumber=input.nextInt();
        System.out.println("Enter pin");
        int pin=input.nextInt();
        for(Card card :cards)
        {
            if(card.cardNumber==cardNumber&&card.pin==pin)
            {
                return list.get(card);
            }
        }
        return 0;
    }
}
