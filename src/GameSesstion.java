public class GameSesstion {
    
    private Boolean []statusButton={true,true,true,true};
    private int selectStage ;
    private int limitSelectCards ;
    private int selectCards;
    
    public GameSesstion() {
        this.selectStage = 0;
        this.limitSelectCards = 1;
        this.selectCards=0;
    }

    public Boolean getStatusButton(int index) {
        return statusButton[index];
    }

    public void setStatusButtonfalse(int index) {
        this.statusButton[0] = false;
    }

    public void setStatusButtontrue(int index) {
        this.statusButton[0] = true;
    }

    public int getSelectStage() {
        return selectStage;
    }

    public void setSelectStage(int selectStage) {
        this.selectStage = selectStage;
    }

    public int getLimitSelectCards() {
        return limitSelectCards;
    }

    public void setLimitSelectCards(int limitSelectCards) {
        this.limitSelectCards = limitSelectCards;
    }

    public int getSelectCards() {
        return selectCards;
    }

    public void setSelectCards(int selectCards) {
        this.selectCards = selectCards;
    }

    
    public void plusSelectCards() {
        this.selectCards++;
    }
    

    public void decreaseSelectCards() {
        this.selectCards--;
    }
    

    
    
}
