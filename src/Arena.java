/**
 * Created by Ruslan on 07.03.2017.
 */
public class Arena {
    Fighter fighterArni;
    Fighter fighterEdy;
    MessageHelper messageHelper = new MessageHelper();

    public static void main(String[] args) {
        Arena arena = new Arena();
        arena.initArena();
    }

    private void initArena(){
        fighterArni = new Fighter("D");
    }

    private void setMessageHelper(){

    }
}
