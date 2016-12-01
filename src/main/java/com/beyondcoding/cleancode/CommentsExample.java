package com.beyondcoding.cleancode;

import com.beyondcoding.cleancode.comments.Barista;
import com.beyondcoding.cleancode.comments.Cellphone;
import com.beyondcoding.cleancode.comments.Place;
import com.beyondcoding.cleancode.comments.Pocket;
import com.beyondcoding.cleancode.comments.Thing;
import com.beyondcoding.cleancode.comments.Wallet;
import com.beyondcoding.cleancode.structure.Pet;

public class CommentsExample {

    private void commentsAreTheThievesAndRoguesOfThisStory() {
        double m = 10.0;
        Place place = Place.POCKET;
        Thing thing = null;
        double sr = 0.0;
        Wallet wallet = new Wallet();
        Barista barista = new Barista();
        Pocket pocket = new Pocket();
        Cellphone cellphone = new Cellphone();
        Barista sneakyRogue = new Barista();

        // if we have our wallet in the pocket with money
        // then buy a coffee
        if (m > 0.0 && place == Place.POCKET) {
            place = Place.HAND;
            m -= 3.0;
            thing = Thing.COFFEE;
        }

        // Get the cellphone quick and check the time
        place = Place.OTHER_HAND;
        thing = Thing.CELLPHONE;
        System.out.println("Time is 9:03");
        place = Place.POCKET;

        // if we still have some money
        // then give the barista a tip
        if (m > 0.0) {
            sr += m;
            m = 0.0;
        }

        if (pocket.contains(wallet) && wallet.hasMoney()) {
            Object money = wallet.get(3.0);
            barista.buyCoffee(money);
        }
        cellphone = pocket.getCellphone();
        cellphone.checkTime();
        if (wallet.hasMoney()) {
            double allMyMoney = wallet.getAllMoneyLeft();
            sneakyRogue.give(allMyMoney);
        }

        Pet mittens = Pet.builder()
                         .setName("Mittens")
                         .setType("cat")
                         .setAge(1)
                         .setHairColor("grey")
                         .build();

    }

}
