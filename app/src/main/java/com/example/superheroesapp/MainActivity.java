package com.example.superheroesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<SuperheroAttributes> itemList;
    SuperheroAttributes s1;
    MyAdapter adapter;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        itemList=new ArrayList<>();
        s1=new SuperheroAttributes("Batman","Batman is a superhero who appears in American comic books published by DC Comics. Batman was created by artist Bob Kane and writer Bill Finger, and debuted in the 27th issue of the comic book Detective Comics on March 30, 1939. In the DC Universe continuity, Batman is the alias of Bruce Wayne, a wealthy American playboy, philanthropist, and owner of Wayne Enterprises based in Gotham City. Kane, Finger, and future DC writers accompanied Batman with supporting characters, including his sidekick Robin, allies Alfred Pennyworth and James Gordon, and foes such as Catwoman, the Scarecrow, the Penguin, and his archenemy, the Joker. Batman's origin story features him swearing vengeance against criminals after witnessing the murder of his parents Thomas and Martha; he trains himself physically and intellectually, crafts a bat-inspired persona, and monitors the Gotham streets at night.",R.drawable.batman);
        itemList.add(s1);

        s1=new SuperheroAttributes("Iron Man","Iron Man is a 2008 American superhero film based on the Marvel Comics character of the same name. Produced by Marvel Studios and distributed by Paramount Pictures,[N 1] it is the first film in the Marvel Cinematic Universe (MCU). Directed by Jon Favreau from a screenplay by the writing teams of Mark Fergus and Hawk Ostby, and Art Marcum and Matt Holloway, the film stars Robert Downey Jr. as Tony Stark / Iron Man alongside Terrence Howard, Jeff Bridges, Shaun Toub, and Gwyneth Paltrow. In the film, following his escape from captivity by a terrorist group, world famous industrialist and master engineer Tony Stark builds a mechanized suit of armor and becomes the superhero Iron Man.",R.drawable.ironman);
        itemList.add(s1);

        s1=new SuperheroAttributes("Thor","Thor is a 2011 American superhero film based on the Marvel Comics character of the same name. Produced by Marvel Studios and distributed by Paramount Pictures,[N 1] it is the fourth film in the Marvel Cinematic Universe (MCU). It was directed by Kenneth Branagh, written by the writing team of Ashley Edward Miller and Zack Stentz along with Don Payne, and stars Chris Hemsworth as the title character alongside Natalie Portman, Tom Hiddleston, Stellan Skarsgård, Colm Feore, Ray Stevenson, Idris Elba, Kat Dennings, Rene Russo, and Anthony Hopkins. After reigniting a dormant war, Thor is banished from Asgard to Earth, stripped of his powers and his hammer Mjölnir. As his brother Loki plots to take the Asgardian throne, Thor must prove himself worthy.",R.drawable.thor);
        itemList.add(s1);

        s1=new SuperheroAttributes("Hulk","Dr. Bruce Banner is a character in the Marvel Cinematic Universe (MCU) film franchise initially portrayed by Edward Norton and subsequently by Mark Ruffalo—based on the Marvel Comics character of the same name—known commonly by his alter ego, the Hulk. In the films, Banner is a renowned physicist who subjected himself to a gamma radiation experiment designed to replicate a World War II-era \"super soldier\" program. The experiment failed, and now causes Banner to transform into a green, hulking and gigantic creature, with super-human strength and durability, whenever his heart rate goes above 200 bpm or if he is placed in mortal danger. The character is one of the central protagonists of the MCU, having appeared in eight films of the series and is depicted as one of the most powerful members of the Avengers.",R.drawable.hulk);
        itemList.add(s1);

        s1=new SuperheroAttributes("Flash","The Flash (Bartholomew Henry \"Barry\" Allen) is a fictional superhero appearing in a series of American comic books published by DC Comics. The character first appeared in Showcase #4 (October 1956), created by writer Robert Kanigher and penciler Carmine Infantino.[1] Barry Allen is a reinvention of a previous character called the Flash, and is widely considered to be the most popular version.\n" +
                "Because he is a speedster, his power consists mainly of superhuman speed. Various other effects are also attributed to his ability to control the speed of molecular vibrations, including his ability to vibrate at speed to pass through objects. The Flash wears a distinct red and gold costume treated to resist friction and wind resistance, traditionally storing the costume compressed inside a ring.\n",R.drawable.flash);
        itemList.add(s1);

        s1=new SuperheroAttributes("Black Widow","Black Widow is an upcoming American superhero film based on the Marvel Comics character of the same name. Produced by Marvel Studios and distributed by Walt Disney Studios Motion Pictures, it is intended to be the 24th film in the Marvel Cinematic Universe (MCU). The film was directed by Cate Shortland and written by Eric Pearson from a story by Jac Schaeffer and Ned Benson, and stars Scarlett Johansson as Natasha Romanoff / Black Widow alongside Florence Pugh, David Harbour, O-T Fagbenle, William Hurt, Ray Winstone, and Rachel Weisz. Set after Captain America: Civil War (2016), the film sees Romanoff on the run and forced to confront her past.",R.drawable.blackwidow);
        itemList.add(s1);

        s1=new SuperheroAttributes("Son Goku","Son Goku[nb 1] is a fictional character and main protagonist of the Dragon Ball manga series created by Akira Toriyama. He is based on Sun Wukong (Monkey King), a main character in the classic Chinese novel Journey to the West. His origin story also shares some similarities with that of Superman.[2] Goku first made his debut in the first Dragon Ball chapter, Bulma and Son Goku,[nb 2][nb 3] originally published in Japan's Weekly Shōnen Jump magazine on December 3, 1984.[3] Born Kakarot,[nb 4][nb 5] Goku is introduced as an eccentric, monkey-tailed boy who practices martial arts and possesses superhuman strength. He meets Bulma and joins her on a journey to find the magical seven Dragon Balls that can grant the user one wish. Along the way, he finds new friends who follow him on his journey to become a stronger fighter. As Goku grows up, he becomes the Earth's mightiest warrior and battles a wide variety of villains with the help of his friends and family, while also gaining new allies in the process.",R.drawable.goku);
        itemList.add(s1);

        s1=new SuperheroAttributes("Saitama","Saitama is an indifferent person. Even the mightiest foes pose no challenge to him, so he does not take his hero work seriously, goes through everything with little to no effort, and yearns for an opponent that can provide him with a challenge.[10] The lack of worthy opponents has led him to suffer from a self-imposed existential crisis,[3] and he claims that his ability to feel any and all emotions has dulled considerably.[11] The combination of his attitude, unstoppable power, and \"unimpressive\" appearance often causes his battles to become anticlimactic. Saitama will usually allow his opponents to rant about their motives and power up into their strongest forms, before obliterating them with a single punch.",R.drawable.saitama);
        itemList.add(s1);

        s1=new SuperheroAttributes("Yujiro Hanma","Yuujiro Hanma (範馬 勇次郎, Hanma Yūjiro) is Baki and Jack Hanma's father. He is the primary antagonist of the Baki franchise. Yujiro is the son of Yuichiro Hanma, and also the strongest character in the series.\n" +
                "\n" +
                "Yujiro works as a highly-paid freelance mercenary and assassin for various governments and organizations. It is unknown how much people or organizations pay him to do his mercenary job but judging from his expensive taste, it is extremely high. He is often called \"the Strongest Creature on Earth\" (地上最強の生物, Chijō Saikyō No Seibutsu) or \"the Ogre",R.drawable.yujirohanma);
        itemList.add(s1);

        adapter=new MyAdapter(itemList,this);
        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);



    }
}