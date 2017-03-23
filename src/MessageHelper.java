import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by aslanov.r on 09.03.2017.
 */
public class MessageHelper {
    public static void askName(){
        System.out.println("Введите имя бойца");
    }

    public static void startMassage(Fighter firstFighter, Fighter secondFighter){
        System.out.println("Начинаем бой между: " + "Fighter 1 {" + "name = " + firstFighter.getName() + ", " + "strength = " + firstFighter.getStrength() + ", " + "health = "  + firstFighter.getHealth() + "}" + " и " +
                                                    "Fighter 2 {" + "name = " + secondFighter.getName() + ", " + "strength = " + secondFighter.getStrength() + ", " + "health = " + secondFighter.getHealth() + "}");
        System.out.println("Fight!");
    }

    public static void printKickInfo (Fighter firstFighter, Fighter secondFighter){
        printLine();
        System.out.println(firstFighter + " kicked " + secondFighter);
    }

    public static void printWinner(Fighter winner, Fighter looser){
        printLine();
        System.out.println(winner.getName() + " wins!");
        if (looser.getHealth() < -5){
            System.out.println(looser.getName() + " FATALITY!");
        } else {
            System.out.println(looser.getName() + " lost");
        }
    }
    public static void printLine(){
        System.out.println("===============================================");
        System.out.println("===============================================");
    }
}
