package gr.aueb.cf.ch17.knight;

public class Main {

    public static void main(String[] args) {
//        Knight joa = new Knight();
//        Knight saintGeorge = new Knight();
//
//        joa.embarkOnMission(new IMision() {
//            @Override
//            public void embark() {
//                System.out.println("Save the princess");
//            }
//        }); {
//
//            saintGeorge.embarkOnMission(new IMision() {
//                @Override
//                public void embark() {
//                    //System.out.println("Kill the dragon");
//                        killTheDragon();
//                }
//            });

//            saintGeorge.embarkOnMission(() -> killTheDragon());
//            saintGeorge.embarkOnMission(Main::killTheDragon);
//            joa.embarkOnMission(Main::saveThePrincess);

    }

    public static void killTheDragon() {
        System.out.println("Save the princess");
    }

    public static void saveThePrincess() {
        System.out.println("Kill the dragon");
    }
}