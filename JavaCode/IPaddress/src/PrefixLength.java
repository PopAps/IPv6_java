
public class PrefixLength {
       public String[] getPrefix() {
    	   String network_message = "networks /64";
   		  String[] choices = { "", "1 (9,223,372,036,854,775,808 " + network_message + ")",
   				"2 (4,611,686,018,427,387,904 " + network_message + ")",
   				"3 (2,305,843,009,213,693,952 " + network_message + ")",
   				"4 (1,152,921,504,606,846,976 " + network_message + ")",
   				"5 (576,460,752,303,423,488 " + network_message + ")",
   				"6 (288,230,376,151,711,744 " + network_message + ")",
   				"7 (144,115,188,075,855,872 " + network_message + ")",
   				"8 (72,057,594,037,927,936 " + network_message + ")",
   				"9 (36,028,797,018,963,968 " + network_message + ")",
   				"10 (18,014,398,509,481,984 " + network_message + ")",
   				"11 (9,007,199,254,740,992 " + network_message + ")",
   				"12 (4,503,599,627,370,496 " + network_message + ")",
   				"13 (2,251,799,813,685,248 " + network_message + ")",
   				"14 (1,125,899,906,842,624 " + network_message + ")",
   				"15 (562,949,953,421,312 " + network_message + ")", "16 (281,474,976,710,656 " + network_message + ")",
   				"17 (140,737,488,355,328 " + network_message + ")", "18 (70,368,744,177,664 " + network_message + ")",
   				"19 (35,184,372,088,832 " + network_message + ")", "20 (17,592,186,044,416 " + network_message + ")",
   				"21 (8,796,093,022,208 " + network_message + ")", "22 (4,398,046,511,104 " + network_message + ")",
   				"23 (2,199,023,255,552 " + network_message + ")", "24 (1,099,511,627,776 " + network_message + ")",
   				"25 (549,755,813,888 " + network_message + ")", "26 (274,877,906,944 " + network_message + ")",
   				"27 (137,438,953,472 " + network_message + ")", "28 (68,719,476,736 " + network_message + ")",
   				"29 (34,359,738,368 " + network_message + ")", "30 (17,179,869,184 " + network_message + ")",
   				"31 (8,589,934,592 " + network_message + ")", "32 (4,294,967,296 " + network_message + ")",
   				"33 (2,147,483,648 " + network_message + ")", "34 (1,073,741,824 " + network_message + ")",
   				"35 (536,870,912 " + network_message + ")", "36 (268,435,456 " + network_message + ")",
   				"37 (134,217,728 " + network_message + ")", "38 (67,108,864 " + network_message + ")",
   				"39 (33,554,432 " + network_message + ")", "40 (16,777,216 " + network_message + ")",
   				"41 (8,388,608 " + network_message + ")", "42 (4,194,304 " + network_message + ")",
   				"43 (2,097,152 " + network_message + ")", "44 (1,048,576 " + network_message + ")",
   				"45 (524,288 " + network_message + ")", "46 (262,144 " + network_message + ")",
   				"47 (131,072 " + network_message + ")", "48 (65,536 " + network_message + ")",
   				"49 (32,768 " + network_message + ")", "50 (16,384 " + network_message + ")",
   				"51 (8,192 " + network_message + ")", "52 (4,096 " + network_message + ")",
   				"53 (2,048 " + network_message + ")", "54 (1,024 " + network_message + ")",
   				"55 (512 " + network_message + ")", "56 (256 " + network_message + ")",
   				"57 (128 " + network_message + ")", "58 (64 " + network_message + ")",
   				"59 (32 " + network_message + ")", "60 (16 " + network_message + ")", "61 (8 " + network_message + ")",
   				"62 (4 " + network_message + ")", "63 (2 " + network_message + ")",
   				"64 (18,446,744,073,709,551,616 addresses)", "65 (9,223,372,036,854,775,808 addresses)",
   				"66 (4,611,686,018,427,387,904 addresses)", "67 (2,305,843,009,213,693,952 addresses)",
   				"68 (1,152,921,504,606,846,976 addresses)", "69 (576,460,752,303,423,488 addresses)",
   				"70 (288,230,376,151,711,744 addresses)", "71 (144,115,188,075,855,872 addresses)",
   				"72 (72,057,594,037,927,936 addresses)", "73 (36,028,797,018,963,968 addresses)",
   				"74 (18,014,398,509,481,984 addresses)", "75 (9,007,199,254,740,992 addresses)",
   				"76 (4,503,599,627,370,496 addresses)", "77 (2,251,799,813,685,248 addresses)",
   				"78 (1,125,899,906,842,624 addresses)", "79 (562,949,953,421,312 addresses)",
   				"80 (281,474,976,710,656 addresses)", "81 (140,737,488,355,328 addresses)",
   				"82 (70,368,744,177,664 addresses)", "83 (35,184,372,088,832 addresses)",
   				"84 (17,592,186,044,416 addresses)", "85 (8,796,093,022,208 addresses)",
   				"86 (4,398,046,511,104 addresses)", "87 (2,199,023,255,552 addresses)",
   				"88 (1,099,511,627,776 addresses)", "89 (549,755,813,888 addresses)", "90 (274,877,906,944 addresses)",
   				"91 (137,438,953,472 addresses)", "92 (68,719,476,736 addresses)", "93 (34,359,738,368 addresses)",
   				"94 (17,179,869,184 addresses)", "95 (8,589,934,592 addresses)", "96 (4,294,967,296 addresses)",
   				"97 (2,147,483,648 addresses)", "98 (1,073,741,824 addresses)", "99 (536,870,912 addresses)",
   				"100 (268,435,456 addresses)", "101 (134,217,728 addresses)", "102 (67,108,864 addresses)",
   				"103 (33,554,432 addresses)", "104 (16,777,216 addresses)", "105 (8,388,608 addresses)",
   				"106 (4,194,304 addresses)", "107 (2,097,152 addresses)", "108 (1,048,576 addresses)",
   				"109 (524,288 addresses)", "110 (262,144 addresses)", "111 (131,072 addresses)",
   				"112 (65,536 addresses)", "113 (32,768 addresses)", "114 (16,384 addresses)", "115 (8,192 addresses)",
   				"116 (4,096 addresses)", "117 (2,048 addresses)", "118 (1,024 addresses)", "119 (512 addresses)",
   				"120 (256 addresses)", "121 (128 addresses)", "122 (64 addresses)", "123 (32 addresses)",
   				"124 (16 addresses)", "125 (8 addresses)", "126 (4 addresses)", "127 (2 addresses)",
   				"128 (1 address)" };
    	   return choices;
    	   
       }
}