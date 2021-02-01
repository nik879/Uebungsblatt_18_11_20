package Beispiel_2;

public class Winterreifendemo {
    private static boolean Winterreifenpflicht;
    public static void main(String[] args) {
        if (isWinterreifenpflicht(7, true) == true) {
            System.out.println("Winterreifenpflicht");
        } else {
            System.out.println("Keine Winterreifenpflicht");
        }
    }

    public static boolean isWinterreifenpflicht(int temperatur, boolean schneefahrbahn) {
        if (temperatur<8 && schneefahrbahn==true || temperatur<0 ){
            return Winterreifenpflicht=true;
        }
        else return Winterreifenpflicht=false;
    }
}
