import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Ruslan on 07.03.2017.
 */
public class Arena {
    Fighter firstFighter;
    Fighter secondFighter;

    public static void main(String[] args) throws IOException {
        new Arena().fight();
    }

    private void initArena() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        MessageHelper.askName();

        String name = reader.readLine();

        firstFighter = new Fighter(name);

        MessageHelper.askName();

        name = reader.readLine();

        secondFighter = new Fighter(name);

        MessageHelper.startMassage(firstFighter, secondFighter);
    }

    private boolean fightIsOver(){
        if (firstFighter.getHealth() <= 0 || secondFighter.getHealth() <= 0){
            return true;
        }else {
            return false;
        }
    }

    private Fighter getWinner(){
        if (firstFighter.getHealth() > 0){
            return firstFighter;
        }else {
            return secondFighter;
        }
    }

    private Fighter getLooser(){
        if (firstFighter.getHealth() <= 0){
            return firstFighter;
        }
        else {
            return secondFighter;
        }
    }

    private void kick(int i){
        if (i % 2 == 0){
            firstFighter.kick(secondFighter);
        } else {
            secondFighter.kick(firstFighter);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void fight() throws IOException {
        initArena();
        int i = 0;
        while (!fightIsOver()){
            kick(++i);
        }
        MessageHelper.printWinner(getWinner(), getLooser());
    }
}
