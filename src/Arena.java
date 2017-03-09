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
        Arena arena = new Arena();
        arena.initArena();
    }

    private void initArena() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        MessageHelper.askName();

        String name = reader.readLine();

        firstFighter = new Fighter(name);

        MessageHelper.askName();

        name = reader.readLine();

        secondFighter = new Fighter(name);
    }
}
