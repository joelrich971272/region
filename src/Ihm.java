import clavier.In;

public class Ihm {
    public static void main(String[] args) {
        String zoneGeographique = null;
        String numeroDeTelephone = new String("0139757575");
        String zoneDep =null;
        int digitZoneGeo = 0 ;
        int digitDep = 0;

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
                        zoneDep = new String("(22)Cotes-d'Armor/(29)Finistère/(35)Ille-et-Villaine/(56)Morbihan");
                        break;
                    case 28 :
                    case 40 :
                        zoneDep = new String("(44)Loire-Atlantique");
                        break;
                    case 32 :
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
                        zoneDep = new String("(44)Loire-Atlantique/(49)Maine-et-Loire/(53)Mayenne/(72)Sarthe(85)Vendée");
                }

                break;
            case 3 :
                zoneGeographique = new String("Region Nord Est ");
                break;
            case 4 :
                zoneGeographique = new String("Region Sud Est");
                break;
            case 5 :
                zoneGeographique = new String("Region Sud Ouest");
                break;
            case 6 :
                zoneGeographique = new String("Operateur mobile");
        }
        System.out.println(zoneGeographique + zoneDep);
    }
}