package com.example;

import java.util.Random;

public class Jokes {

    public String getJokes(){

        String Jokes[] = {

                "Yo momma is so fat, I took a picture of her last Christmas and it's still printing.",
                "Yo momma is so fat when she sat on WalMart, she lowered the prices.",
                "Yo momma is so ugly when she tried to join an ugly contest they said, \"Sorry, no professionals.\"",
                "Yo momma is so fat when she got on the scale it said, \"I need your weight not your phone number.\"",
                "Yo momma is so fat that when she went to the beach a whale swam up and sang, \"We are family, even though you're fatter than me.\"",
                "Yo momma is so ugly she made One Direction go another direction.",
                "Yo momma's so fat, that when she fell, no one was laughing but the ground was cracking up.",
                "Yo momma is so fat that Dora can't even explore her!",
                "Yo momma is so stupid when an intruder broke into her house, she ran downstairs, dialed 9-1-1 on the microwave, and couldn't find the \"CALL\" button.",
                "Yo momma is so fat her bellybutton gets home 15 minutes before she does.",
                "Yo momma's so stupid, she put two quarters in her ears and thought she was listening to 50 Cent.",
                "Yo momma's so fat and old when God said, \"Let there be light,\" he asked your mother to move out of the way.",
                "My friend thinks he is smart. He told me an onion is the only food that makes you cry, so I threw a coconut at his face.",
                "Yo momma so stupid she stuck a battery up her ass and said, \"I GOT THE POWER!\"",
                "Yo momma's so dumb, when y'all were driving to Disneyland, she saw a sign that said \"Disneyland left,\" so she went home.",
                "Yo momma is so fat she doesn't need the internet, because she's already world wide.",
                "Teacher: \"Kids, what does the chicken give you?\" \n Student: \"Meat!\" \n Teacher: \"Very good! Now what does the pig give you?\" \n Student: \"Bacon!\" \n Teacher: \"Great! And what does the fat cow give you?\" \n Student: \"Homework!\"",
                "Yo momma is so stupid she climbed over a glass wall to see what was on the other side."

        };

        int i = new Random().nextInt(Jokes.length);
        return Jokes[i];
    }

}
