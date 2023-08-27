package com.company.observer;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        //first create the subject
        Subject subject = new Subject();

        //create observer objects
        ScoreCardObserver battingCard = new BattingCardObserver();
        ScoreCardObserver bowlingCard = new BowlingCardObserver();
        ScoreCardObserver matchSummery = new MatchSummeryObserver();

        //subscribe
        subject.subscribe(battingCard);
        subject.subscribe(bowlingCard);
        subject.subscribe(matchSummery);

        System.out.println("=====a new delivery=====");
        subject.notifyObservers("Bat1-> 20, Bat2->28");

        Thread.sleep(5000); //wait for 5 seconds

        System.out.println("=====a new delivery=====");
        subject.notifyObservers("Bat1-> 21, Bat2->28");

        Thread.sleep(10000); //wait for 10 seconds
        System.out.println("=====a new delivery=====");
        subject.notifyObservers("Bat1-> 21, Bat2->30");

    }
}

//Do these improvements by yourself
// 1. Use a MatchState Object instead of using a string as the match state
// 2. Implement a GUI to capture the match state data -> when the submit button
// is clicked -> trigger subject.notifyObservers()