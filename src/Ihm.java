import clavier.In;

import java.util.zip.ZipEntry;

public class Ihm {
    public static void main(String[] args) {
        String zoneGeographique = null;
        String zoneDep =null;
        int digitZoneGeo = 0 ;
        int digitDep = 0;


        System.out.println("Veuillez saisir le numero de téléphone désiré ");
        String numeroDeTelephone =In.readString();
        digitZoneGeo = Integer.parseInt(numeroDeTelephone.substring(1, 2));
        digitDep = Integer.parseInt(numeroDeTelephone.substring(2,4));
        switch (digitZoneGeo){
            case 1 :
                zoneGeographique = new String("Region Parisienne");
                switch (digitDep) {
                    case 34 :
                    case 39 :
                        zoneDep = new String("\n(78)Yvelines");
                        break;
                    case 40 :
                    case 42 :
                    case 43 :
                    case 44 :
                    case 45 :
                    case 46 :
                    case 53 :
                    case 70 :
                    case 72 :
                    case 73 :
                    case 74 :
                    case 75 :
                    case 79 :
                    case 80 :
                    case 81 :

                        zoneDep = new String("(75)Paris");
                        break;
                    case 47 :
                        zoneDep = new String("(92)Hauts-de-Seine");
                        break;
                    case 48 :
                        zoneDep = new String("(93)Seine-Saint-denis/(94)Val-Sur-Marne/(95)Val-d'Oise");
                        break;
                    case 49 :
                        zoneDep = new String("(95)Paris/(92)Hauts-sur-Seine/(94)Val-sur-Marne");
                        break;
                    case 55 :
                    case 76 :
                    case 78 :
                        zoneDep = new String("(75)Paris/(92Hauts-sur-Seine");
                        break;
                    case 56 :
                        zoneDep = new String("(75)Paris/(94)Val-sur-Marne");
                        break;
                    case 60 :
                    case 64 :
                        zoneDep = new String("(77)Seine-et-Marne");
                        break;
                    case 69 :
                        zoneDep = new String("(91)Essone");
                        break;

                }
                break;
            case  2 :
                zoneGeographique = new String("Region Nord Ouest");
                switch (digitDep) {
                    case 14 :
                        zoneDep = new String("(14)Calvados/(50)Manche/(61)Orne");
                        break;
                    case 18 :
                    case 34 :
                    case 36 :
                    case 45 :

                        zoneDep = new String("(18)Cher/(28)Eure-et-Loir/(36)Indre/(37)Indre-et-Loire/(41)Loire-et-Cher");
                        break;
                    case 22 :
                    case 30 :
                    case 56 :
                    case 90 :
                        zoneDep = new String("(22)Cotes-d'Armor/(29)Finistère/(35)Ille-et-Villaine/(56)Morbihan");
                        break;
                    case 28 :
                    case 40 :
                        zoneDep = new String("(44)Loire-Atlantique");
                        break;
                    case 32 :
                    case 76 :
                    case 77 :
                    case 78 :
                        zoneDep = new String("(27)Eure/(76)Seine-Maritime");
                        break;
                    case 33 :
                        zoneDep = new String("(50)Manche/(61)Orne");
                        break;
                    case 35 :
                        zoneDep = new String("(76)Seine-Maritime");
                        break;
                    case 37 :
                        zoneDep = new String("(28)Eure-et-Loire");
                        break;
                    case 38 :
                        zoneDep = new String("(45)Loiret");
                        break;
                    case 41 :
                        zoneDep =new String("(49)Maine-et-Loire");
                        break;
                    case 43 :
                        zoneDep = new String("(53)Mayenne/(72)Sarthe");
                        break;
                    case 44 :
                    case 49 :
                    case 53 :
                    case 72 :

                        zoneDep = new String("(44)Loire-Atlantique/(49)Maine-et-Loire/(53)Mayenne/(72)Sarthe(85)Vendée");
                        break;
                    case 47 :
                        zoneDep = new String("(37)Indre-et-Loire");
                        break;
                    case 48 :
                        zoneDep = new String("(18)Cher");
                        break;
                    case 50 :
                    case 61 :
                        zoneDep = new String("(14)Calvados/(50)Manche/(61)Orne");
                        break;
                    case 54 :
                        zoneDep = new String("(36)Indre/(41)Loir-et-Cher");
                        break;
                    case 96 :
                        zoneDep = new String("(22)Cotes-d'Armor");
                        break;
                    case 97 :
                        zoneDep = new String("(56)Morbihan");
                        break;
                    case 98 :
                        zoneDep = new String("(29)Finistère");
                        break;
                    case 99 :
                        zoneDep = new String("(35)Ille-et-Vilaine");
                        break;


                }

                break;
            case 3 :
                zoneGeographique = new String("Region Nord Est ");
                switch (digitDep){
                    case 10 :
                        zoneDep = new String("(08)Ardennes/(10)Aube/(51)Marne/(52)Haut-Marne");
                        break;
                    case 20 :
                        zoneDep = new String("(59)Nord");
                        break;
                    case 21 :
                        zoneDep = new String("(62)Pas-de-Calais");
                        break;
                    case 22 :
                        zoneDep = new String("(80)Somme");
                        break;
                    case 23 :
                        zoneDep = new String("(02)Aisne");
                        break;
                    case 24 :
                        zoneDep = new String("(08)Ardennes");
                        break;
                    case 25 :
                        zoneDep = new String("(10)Aube/(52)Haute-Marne");
                    case 26 :
                        zoneDep = new String("(51)Marne");
                        break;
                    case 27 :
                    case 28 :
                        zoneDep = new String("(59)Nord");
                        break;
                    case 29 :
                        zoneDep = new String("(54)Meurthe-et-Moselle/(88)Vosges");
                        break;
                    case 44 :
                        zoneDep = new String("(60)Oise");
                        break;
                    case 45 :
                    case 71:
                        zoneDep = new String("(21)Cote-d'Or/(58)Nièvre/(71)Saone-et-Loire/(89)Yonne");
                        break;
                    case 51 :
                    case 52 :
                        zoneDep = new String("(08)Ardennes/(10)Aube/(51)Marne/(52)Guate-Marne");
                        break;
                    case 54 :
                    case 55 :
                    case 57 :
                        zoneDep = new String("(54)Meurthe-et-Moselle/(55)Meuse/(57)Moselle/(88)Vosges");
                        break;
                    case 58 :
                        zoneDep = new String("(21)Cote-d'Or/(58)Nièvre/(71)Saone-etLoire");
                        break;
                    case 60 :
                    case 64:
                    case 65:
                        zoneDep = new String("(02)Aisne/(60)Oise/(80)Somme");
                        break;
                    case 61 :
                    case 62 :
                    case 66:
                        zoneDep = new String("(59)Nord/(62)Pas-de-Calais");
                        break;
                    case 63 :
                    case 70 :
                        zoneDep = new String("(25)Doubs/(39)Jura/(70)Haute-Saone/(90)Territoire-de-Belfort");
                        break;
                    case 68:
                    case 69:
                        zoneDep = new String("(67)Bas-Rhin/(68)Haut-Rhin");
                        break;
                    case 80:
                        zoneDep = new String("(21) Cote-d'Or");
                        break;
                    case 81:
                        zoneDep = new String("(25)Doubs");
                        break;
                    case 82:
                        zoneDep = new String("(54)Meurthe-et-Moselle/(57)Moselle");
                        break;
                    case 83:
                        zoneDep = new String("(54)Meurthe-et-Moselle");
                        break;
                    case 84:
                        zoneDep = new String("(39)Jura/(70)Haute-Saone/(90)Territoire-de-Belfort");
                        break;
                    case 85:
                        zoneDep = new String("(71)Saone-et-Loire");
                        break;
                    case 86:
                        zoneDep = new String("(58)Nièvre/(89)Yonne");
                        break;
                    case 87:
                        zoneDep = new String("(57)Moselle");
                        break;
                    case 88:
                    case 90:
                        zoneDep = new String("(67)Bas-Rhin");
                        break;
                    case 89:
                        zoneDep = new String("(68)Haut-Rhin");
                        break;


                }
                break;
            case 4 :
                zoneGeographique = new String("Region Sud Est");
                switch (digitDep){
                    case 11 :
                    case 30 :
                    case 34 :
                        zoneDep = new String("(11)Aude/(30)Gard/(34)Hérault/(48)Lozère/(66)Pyrénées-Orientales");
                        break;
                    case 13 :
                        zoneDep = new String("(04)Alpes-de-Haute-Provence/(05)Hautes-Alpes(13)Bouches-du-Rhone");
                        break;
                    case 15 :
                    case 43 :
                    case 63 :
                        zoneDep = new String("(03)Allier/(15)Cantal/(43)Haute-Loire/(63)Puy-en-Dome");
                        break;
                    case 20 :
                        zoneDep = new String("(2A)Corse-du-Sud");
                        break;
                    case 26 :
                    case 27 :
                    case 81 :
                        zoneDep = new String("(01)Ain/(07)Ardèche/(26)Drome/(42)Loire/(69)Rhone");
                        break;

                    case 42 :
                        zoneDep = new String("(13)Bouche-du-Rhone");
                        break;
                    case 50 :
                        zoneDep = new String("(01)Ain/(74)Haute-Savoie");
                        break;
                    case 56 :
                    case 57 :
                    case 80 :
                        zoneDep = new String("(38)Isère(73)Savoie(74)Haute-Savoie");
                        break;
                    case 66 :
                        zoneDep = new String("(30)Gard/(48)Lozère");
                        break;
                    case 67 :
                        zoneDep = new String("(34)Hérault");
                        break;
                    case (70) :
                        zoneDep = new String("(03)Allier");
                        break;
                    case 71 :
                        zoneDep = new String("(15)Cantal/(43)Haute-Loire");
                        break;
                    case 72 :
                    case 78 :
                        zoneDep = new String("(69)Rhone");
                        break;
                    case 73 :
                        zoneDep = new String("(63)Puy-en-Dome");
                        break;
                    case 74 :
                        zoneDep = new String("(01)Ain");
                        break;
                    case 75 :
                        zoneDep = new String("(07)Ardèche/(26)Drome");
                        break;
                    case 76 :
                        zoneDep = new String("(38)Isère");
                        break;
                    case 79 :
                        zoneDep = new String("(73)Savoie");
                        break;
                    case 83 :
                    case 89 :
                        zoneDep = new String("(06)Alpes-Maritimes/(83)Var");
                        break;
                    case 86 :
                    case 88 :
                        zoneDep = new String("(04)Alpes-de-Hautes-Provence/(05)Hauts-Alpes/(13)Bouches-du-Rhone");
                        break;
                    case 90 :
                        zoneDep = new String("(13)Bouches-du-Rhone/(84)Vaucluse");
                        break;
                    case 91 :
                        zoneDep = new String("(13)Bouches-du-Rhone");
                        break;
                    case 92 :
                        zoneDep = new String("(04)Alpes-de-Hautes-Provence(05)Hauts-Alpes(83)Var");
                        break;
                    case 93 :
                    case 97 :
                        zoneDep = new String("(06)Alpes-Maritimes");
                        break;
                }
                break;
            case 5 :
                zoneGeographique = new String("Region Sud Ouest");
                switch (digitDep){
                    case 34 :
                        zoneDep = new String("(31)Haute-Garonne");
                        break;
                    case 45 :
                        zoneDep = new String("(16)Charente");
                        break;
                }
                break;
            case 6 :
                zoneGeographique = new String("Operateur mobile");
                switch (digitDep){

                }
                break;
        }
        System.out.println(zoneGeographique + zoneDep);
    }
}