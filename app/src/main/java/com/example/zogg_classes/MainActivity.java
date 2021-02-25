package com.example.zogg_classes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView display = findViewById(R.id.txtdisplay);

        Hero clockwerk = new Hero();

        clockwerk.heroName = "Rattletrap";
        clockwerk.heroLvl = 1;
        clockwerk.baseHealth = 200;
        clockwerk.baseMana = 75;
        clockwerk.armor = 0.0;
        clockwerk.strength = 26.0;
        clockwerk.agility = 13.0;
        clockwerk.intelligence = 18.0;

        Hero Taps = new Hero();

        Taps.heroName = "Taps";
        Taps.heroLvl = 1;
        Taps.baseHealth = 200;
        Taps.baseMana = 75;
        Taps.armor = 0.0;
        Taps.strength = 26.0;
        Taps.agility = 13.0;
        Taps.intelligence = 18.0;



        Monster Roshan = new Monster(5000,2000,250);

        Roshan.monsterName = "Rosh";
        Roshan.armor = 12.0;
        Roshan.magicResistance = 40.0;
        Roshan.physicalResistance = 20.0;
        Roshan.vision = 1000;
        Roshan.truesight = 0;

        Roshan.regen(); // if outCamp = true then regen*2
        Roshan.regen(2); //regen +2

        Monster MudGolem = new Monster(1000,200,50);
        MudGolem.monsterName = "MG";
        MudGolem.armor = 3.0;
        MudGolem.magicResistance = 5.0;
        MudGolem.physicalResistance = 2.0;
        MudGolem.vision = 500;
        MudGolem.truesight = 0;

        Monster BMhawk = new Monster();
        BMhawk.monsterName = "Hawk";
        BMhawk.armor = 3.0;
        BMhawk.magicResistance = 5.0;
        BMhawk.physicalResistance = 2.0;
        BMhawk.vision = 500;
        BMhawk.truesight = 0;

        Monster Fspirit = new Monster(0);
        Fspirit.monsterName = "Forge Spirit";
        Fspirit.armor = 2.0;
        Fspirit.magicResistance = 0.0;
        Fspirit.physicalResistance = 0.0;
        Fspirit.vision = 250;
        Fspirit.truesight = 0;









        display.setText(String.valueOf(clockwerk.totalHealth()));

    }
}