/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pokemones;

/**
 *
 * @author ap550
 */
public class Pokemon {
    
 private String[] Nombre ={
   
       "xd", "Bulbasaur", "Ivysaur", "Venusaur", "Charmander", "Charmeleon", "Charizard", "Squirtle", "Wartotle", "Blastoise","Caterpie",
           "Metapod", "Weedle", "Kakuna", "Beedrill", "Pidgey", "Pidgeotto", "Pidgeot", "Rataata", "Raticate", //Posicion 1 - 20
           
           "Spearow", "Fearow", "Ekans", "Arbok", "Pikachu", "Raichu", "Sandshrew", "Sandslash", "Nidoran", "Nidorina", "Nidoqueen","Nidoran", 
           "Dinorino", "Dinoking", "Clefairy", "Clefable", "Vulpix", "Nidetales", "Jigglypuff", "Widdlytuff", //Posicion 21 - 40
           
           "Zubat", "Golbat", "Oddish", "Gloom", "Vileplume", "Paras", "Parasect", "Venonat", "Venomoth", "Diglett",
           "Dugtrio", "Meowth", "Persian", "Psyduck", "Golduck", "Mankey", "Primeape", "Growlithe", "Arcanine", "Poliwag", //Posicion 41 - 60
           
           "Poliwhirl", "Abra", "Kadabra", "Alakazam", "Machop", "Machokw", "Machamp", "Bellsprout", "Weepinbell",
           "Victreebel", "Tentacool", "Tentacruel", "Geoude", "Gravel", "Golem", "Ponyta", "Rapidash", "Slowpoke", "Slowbro", //Posicion 61 - 80
           
           "Magnemite", "Magneton", "Farfetch´d", "Doduo", "Dotrio", "Seel", "Dewgong", "Grimer", "Muk", "Shellder",
           "Cloyster", "Gastly", "Haunter", "Gengar", "Onix", "Drowzee", "Hypno", "Krabby", "Kingler", "Volbort", //Posicion 81 - 100
           
           "Electrode", "Exeggcute", "Exeggutor", "Cubone", "Marowak", "Hitmonlee", "Hitmochan", "Lickitung", "Koffing", "Weezing",
           "Rhyhorn", "Rhydon", "Chansey", "Tangela", "Kangaskhan", "Horsea", "Seadra", "Goldeen", "Seaking", "Staryu", //Posicion 101 - 120
           
           "Starmie", "Mr. Mime", "Scyther", "jynx", "Electrabuzz", "Magmar", "Pinsir", "Tauros", "Magikarp", "Gyarados",
           "Lapras", "Ditto", "Eevee", "Vaporeon", "Jolteon", "Flareon", "Porygon", "Omayte", "Omastar", "Kabuto", //Posicion 121 - 140
           
           "Kabutops", "Aerodactyl", "Snorlax", "Articuno", "Zapdos", "Moltres", "Dratini", "Dragonair", "Dragonite", "Mewtwo", "Mew", //Posicion 141 - 151
           //FIN 1ra Gen Pokemon Rojo Fuego

   
         "Chikorita", "Bayleef", "Meganium", "Cyndaquil", "Quilava", "Typhlosion", "Totodile", "Croconaw", "Feraligatr", "Sentret",
           "Furret", "Hoothoot", "Noctowl", "Ledyba", "Ledian", "Spinarak", "Ariados", "Crobat", "Chinchou", "Lanturn", //Posicion 152 - 171
           
           "Pichu", "Cleffa", "Igglybuff", "Togepi", "Togetic", "Natu", "Xatu", "Mareep", "Flaaffy", "Ampharos",
           "Bellossom", "Marill", "Azumarill", "Sudowoodo", "Politoed", "Hoppip", "Skiploom", "Jumpluff", "Aipom", "Sunkern", //Posicion 172 - 191
           
           "Sunflora", "Yanma", "Wooper", "Quagsire", "Espereon", "Umbreon", "Murkrow", "Slowking", "Misdreavus", "Unown",
           "Wobbuffet", "Girafarig", "Pineco", "Forretress", "Dunsparce", "Gligar", "Steelix", "Snubbull", "Granbull", "Qwilfish", //Posicion 192 - 211
           
           "Scizor", "Shuckle", "Heracross", "Sneasel", "Teddiursa", "Ursaring", "Slugma", "Magcargo", "Swinub", "Piloswine",
           "Corsola", "Remoraid", "Octillery", "Delibird", "Mantine", "Skarmoy", "Houndour", "Hounddoom", "Kingdra", "Phanpy", //Posicion 212 - 231
           
           "Donphan", "Porygon2", "Stantler", "Smeargle", "Tyrogue", "Hitmontop", "Smoochum", "Elekid", "Magby", "Miltank",
           "Blissey", "Raikou", "Entei", "Suicune", "Larvitar", "Pupitar",  "Tyranitar", "Lugia", "Ho-oh", "Celebi", //Posicion 232 - 251
           //FIN 2da Gen Pokemon Rojo Fuego     
           
           
           "Treecko", "Grovyle", "Sceptile", "Torich", "Combusken", "Blaziken", "Mudkip", "Marshtomp", "Swampert", "Poochyena",
           "Mightyena", "Zigzagoon", "Linoone", "Wurmple", "Silicoon", "Beautifly", "Cascoon", "Dustox", "lotad", "Lombre", //Posicion 252 - 271
           
           "Ludicolo", "Seedot", "Nuzleaf", "Shiftry", "Taillow", "Swellow", "Wigull", "Pelipper", "Ralts", "Krilia",
           "Gardevoir", "Surskit", "Masquerain", "Shroomish", "Breloom", "Slakoth", "Vigoroth", "Slaking", "Nincada", "Ninjask", //Posicion 272 - 291
           
           "Shedinja", "Whismur", "Loudred", "Exploud", "Makuhita", "Hariyama", "Azurill", "Nosepass", "Skitty", "Delcatty",
           "Sableye", "Mawile", "Aron", "Lairon", "Aggron", "Meditite", "Medicham", "Electrike", "Manectric", "Plusle", //Posicion 292 - 311
           
           "Minum", "Volbeat", "IIIumise", "Roselia", "Gulpin", "Swalot", "Carvanha", "Shaperdo", "Wailmer", "Wailord",
           "Numel", "Camerupt", "Torkoal", "Spoink", "Grumpig", "Spinda", "Trapinch", "Vibrava", "Flygon", "Cacnea", //Posicion 312 - 331
           
           "Cacturne", "Swablu", "Altaria", "Zangoose", "Serviper", "Lunatone", "Solrock", "Barboach", "Whiscash", "Corphish",
           "Crawdaunt", "Baltoy", "Claydol", "Lileep", "Cradily", "Anorith", "Armaldo", "Feebas", "Milotic", "Castform", //Posicion 332 - 351
           
           "Kecleon", "Shuppet", "Banette", "Duskull", "Dusclops", "Tropius", "Chimecho", "Absol", "Wynaut", "Snorunt", 
           "Glalie", "Spheal", "Sealeo", "Walrein", "Clamperl", "Huntail", "Gorebyss", "Relicanth", "Luvdisc", "Bagon", //Posicion 352 - 371
           
           "Shelgon", "Salamence", "Beldum", "Metang", "Metagross", "Regirock", "Regice", "Registeel", "Latias", "Latios",
           "Kyogre", "Groudon", "Rayquaza", "Jirachi", "Deoxys" //Posicion 372 - 386
         };
  
    
    
    
}
