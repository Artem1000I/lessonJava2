package org.example;

public class SwitchTest {
    public static void main(String[] args){
        final int SEASON_NUMBER =2; //константа
        convertSeason(SEASON_NUMBER);//номер сезона
        convertSeasonSwitch(SEASON_NUMBER);
        convertSeasonSwitchToMonth(4);


    }
    public static void convertSeason(int seasonNumber){
        String season;

        if (seasonNumber == 1){
            season ="Winter";
        }else if (seasonNumber == 2){
            season = "Spring";
        } else if (seasonNumber == 3) {
            season = "Summer";
        }else if (seasonNumber == 4){
            season = "Fall";
        }else {
            season = "Unkown season";
        }
        System.out.println(season);
    }

    public static void convertSeasonSwitch(int seasonNumber){
        String season = switch (seasonNumber) {
            case 1 -> "Winter";
            case 2 -> "Spring";
            case 3 -> "Summer";
            case 4 -> "Fall";
            default -> "Unkown season";
        };

        /*switch (seasonNumber){
            case 1:
                season = "Winter";
                break;
            case 2:
                season = "Spring";
                break;
            case 3:
                season = "Summer";
                break;
            case 4:
                season = "Fall";
                break;
            default:
                season = "Unkown season";
        }*/
        System.out.println(season);
    }

    public static void  convertSeasonSwitchToMonth(int monthNumber){
        String season = switch (monthNumber) {
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Fall";
            default -> "Unkown season";
        };

        /*switch (monthNumber){
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Fall";
                break;
            default:
                season = "Unkown season";
        }*/
        System.out.println(season);
    }

}
