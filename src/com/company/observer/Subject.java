package com.company.observer;

import java.util.ArrayList;
import java.util.List;

//this is just like the newspaper agency
// this is the class responsible for updating the
// scorecards when the match state changes
public class Subject {

  //Subject should maintain a list of observers
  private List<ScoreCardObserver> scoreCards = new ArrayList<ScoreCardObserver>();

  //- allowing the observers to subscribe
  public void subscribe(ScoreCardObserver scoreCard) {
    scoreCards.add(scoreCard);
  }

  //   - allowing the observers to unsubscribe
  public void unsubscribe(ScoreCardObserver scoreCard) {
    scoreCards.remove(scoreCard);
  }

  //   - when the match state changes, notify all the observers
  public void notifyObservers(String matchState) {
    for (ScoreCardObserver scoreCard : scoreCards) {
      scoreCard.notifyNewDelivery(matchState);
    }

  }

}
