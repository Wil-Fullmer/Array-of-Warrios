public class Main
{

    public static void main(String[] args)
    {
        Warrior[] warriors = new Warrior[5];
        for(int x=0; x < 5; x++)
        {
            warriors[x] = new Warrior();
        }

        warriors[0].setNickName("Dagric");
        warriors[1].setNickName("Hararitte");
        warriors[2].setNickName("Brythjar");
        warriors[3].setNickName("Regrr");
        warriors[4].setNickName("Sorsine");

        for(int x=0; x <5; x++)
        {
            warriors[x].getDamage();
        }

        System.out.println("\nWarriors + Stats: ");
        for(int x=0; x < 5; x++)
        {

            warriors[x].printInfo();
        }

        //Start battle
        System.out.println("Starting Battle....");
        System.out.println("\n*** Battle! ***   All warriors start with 10 units of health for 10 rounds");
        for(int i=0; i<10; i++){
            for(int x =0;x<5;x++){
                System.out.println();
                System.out.println(warriors[x].getNickName()+"is attacked and takes "+warriors[x].getDamage()+" units of damage");
                warriors[x].takeDamage(3);
                System.out.println();
                warriors[x].printInfo();





            }
        }
        //Battle end
        System.out.println("\nBattle Wrapping Up!");
        System.out.println("How did you warriors fare?");
        System.out.println();
        for(int x =0;x<5;x++){
        warriors[x].printInfo();
        }

    }
}