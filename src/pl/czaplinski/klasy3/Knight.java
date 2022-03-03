package pl.czaplinski.klasy3;

public class Knight {
    private Quest quest;
    public Knight(Quest quest) {
        this.quest = quest;
    }

    public void whereIsKnight(){
        quest.process();
    }
}
