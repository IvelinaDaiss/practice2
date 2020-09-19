package cpen221practice;

class Resistor {
    //
    int colorCode(String color) {
        int colorNumber = 0;
        switch(color){
            case "black":
              colorNumber = 0 ;
              break;
            case "brown":
                colorNumber = 1 ;
                break;
            case "red":
                colorNumber = 2 ;
                break;
            case "orange":
                colorNumber = 3 ;
                break;
            case "yellow":
                colorNumber = 4 ;
                break;
            case "green":
                colorNumber = 5;
                break;
            case "blue":
                colorNumber = 6;
                break;
            case "violet":
                colorNumber = 7;
                break;
            case "grey":
                colorNumber = 8;
                break;
            case "white":
                colorNumber = 9;
                break;
            default:
                break;
        }

        return colorNumber;
    }
//
    String[] colors() {
        String [] resistorColors = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        return resistorColors;
    }
}
