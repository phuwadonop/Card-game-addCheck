import java.util.ArrayList;

public class ComparableCard extends Card implements CheckCardValue{

    public ComparableCard(String suit, String name, int value, String cardImage) {
        super(name, suit, value, cardImage);
    }
    
    public int checkValue1(ComparableCard card){
        if(getValue()==card.getValue())
        {
            if(getValueSuit()>card.getValueSuit())
            {
                return 1;
            }
            else{
                return -1;
            }
        }
        else if(getValue()>card.getValue())
        {
            return 1;
        }
        else{
            return -1;
        }
        
    }

    public static int checkValue2(ComparableCard card1,ComparableCard card2,ComparableCard card3,ComparableCard card4){
        if(card1.getValue()==card3.getValue())
        {
            int max1,max2;
            if(card1.getValueSuit()>card2.getValueSuit())
            {
                max1=card1.getValueSuit();
            }
            else{
                max1=card2.getValueSuit();
            }

            if(card3.getValueSuit()>card4.getValueSuit())
            {
                max2=card3.getValueSuit();
            }
            else{
                max2=card4.getValueSuit();
            }

            if(max1>max2)
            {
                return 1;
            }
            else{
                return -1;
            }
        }
        else if(card1.getValue()>card3.getValue())
        {
            return 1;
        }
        else{
            return -1;
        }
    }
    public static int checkValue3(ComparableCard card1,ComparableCard card2){
        if(card1.getValue()>card2.getValue()){
            return 1;
        }
        else{
            return -1;
        }
    }
    public static int checkValue4(ComparableCard card1,ComparableCard card2){
       if(card1.getValue()>card2.getValue()){
           return 1;
       }
       else{
           return -1;
       }
    }  

    public static Boolean twoCardsOnHand(ArrayList<ComparableCard> cardsOnHand){
        int value = 0;
        for(int loop=0;loop<13;loop++){
            if(cardsOnHand.get(loop).getStatus()){
                if(cardsOnHand.get(loop).getValue()==value)
                {
                    return true;
                }
                else{
                    value = cardsOnHand.get(loop).getValue() ;
                }
            }
        }
        return false;
    }

    public static Boolean threeCardsOnHand(ArrayList<ComparableCard> cardsOnHand){
        int value = 0;
        int stacx = 1;
        for(int loop=0;loop<13;loop++){
            if(cardsOnHand.get(loop).getStatus()){
                if(cardsOnHand.get(loop).getValue()==value)
                {
                    stacx++;
                }
                else{
                    value = cardsOnHand.get(loop).getValue() ;
                    stacx = 1;
                }
            }

            if(stacx==3)
            {
                return true;
            }

        }
        return false;
    }

    public static Boolean fourCardsOnHand(ArrayList<ComparableCard> cardsOnHand){
        int value = 0;
        int stacx = 1;
        for(int loop=0;loop<13;loop++){
            if(cardsOnHand.get(loop).getStatus()){
                if(cardsOnHand.get(loop).getValue()==value)
                {
                    stacx++;
                }
                else{
                    value = cardsOnHand.get(loop).getValue() ;
                    stacx = 1;
                }
            }

            if(stacx==4)
            {
                return true;
            }

        }
        return false;
    }

    public static Boolean isFourCard(ArrayList<ComparableCard> cardsOnHand,int value){
        int stacx = 0;
        for(int loop=0;loop<13;loop++){
            if(cardsOnHand.get(loop).getValue()==value){
                
                stacx++;
               
            }

        }
        if(stacx==4)
        {
            return true;
        }
        return false;
    }

    public static Boolean isThreeCard(ArrayList<ComparableCard> cardsOnHand,int value){
        int stacx = 0;
        for(int loop=0;loop<13;loop++){
            if(cardsOnHand.get(loop).getValue()==value){
                
                stacx++;
               
            }
        }
        if(stacx>=3)
        {
            return true;
        }
        return false;
    }

    public static Boolean isTwoCard(ArrayList<ComparableCard> cardsOnHand,int value){
        int stacx = 0;
        for(int loop=0;loop<13;loop++){

            if(cardsOnHand.get(loop).getValue()==value){
                stacx++;
            }
        }
        if(stacx>=2)
        {
            return true;
        }
       
        return false;
    }

    


}
