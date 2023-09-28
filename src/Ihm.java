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
                        zoneDep = new String("(75)Paris");
                        break;
                    case 47 :
                        zoneDep = new String("(92)Hauts-de-Seine");
                        break;
                    case 48 :
                        zoneDep = new String("(93)Seine-Saint-denis/(94)Val-Sur-Marne/(95)Val-d'Oise");
                        break;
                    case 49 :
                        zoneDep = new String("");s



                }
                break;
            case  2 :
                zoneGeographique = new String("Region Nord Ouest");

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