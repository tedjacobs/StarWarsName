package com.example.starwarsname;

import java.util.Random;

class NameBook {
    // Fields or Member Variables - Properties about the object
    private String[] names = {
            "Bot Jien",
            "Ranik Cooc",
            "Faroer Danodel",
            "Plet Pescer",
            "Cado Valentine",
            "Rayfe Corse",
            "Gosse Endivain",
            "Zan Doneeta",
            "Xakic Rohana",
            "Fama Yarrow",
            "Biran Khel",
            "Genn Jade",
            "Revia Syrus",
            "Brion Fah",
            "Zizzy Stryder",
            "Otta Curran",
            "Aesho Korpil",
            "Denth Phlox",
            "Ivan Serasai",
            "Pidoshom Metro",
            "Mako Katherion",
            "Davenrue Brock",
            "Strata Muschifurche",
            "Keth Tharandon",
            "Dak Tong"};
    // Methods - Actions the object can take
    String getName() {
        // Display random name when button is clicked
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(names.length);
        return names[randomNumber];
    }
}
