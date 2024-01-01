package systemdesign.questions.designatm.atmstate;


import systemdesign.questions.designatm.ATM;
import systemdesign.questions.designatm.Card;

public class IdleState extends ATMState {

    @Override
    public void insertCard(ATM atm, Card card) {
        System.out.println("Card is inserted");
        atm.setCurrentATMState(new HasCardState());
    }
}
