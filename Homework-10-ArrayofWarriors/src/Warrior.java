/*
Update the Warrior class (attached) to include a printInfo() method that will print all of the information in the Warrior object.
Write a Java program that creates an array of five Warrior objects. Assign each Warrior a different nickName.
Give each warrior a random amount of damage between 1 and 10 (inclusive).
Print the information for each of the five Warriors by using the printInfo() function of the Warrior class.
 */


public class Warrior
{

    private String nickName = "Fred";
    private int lifeForce = 10;
    private int damage = (int)(Math.random() * 10 + 1);
    private String armory [] = {"Pumpkin", "Candy Corn","Peeps"};

    //The "+" equals public in UML
    public void printInfo()
    {
        System.out.println("Warrior " + nickName +":(health="+lifeForce+", damage="+damage+")");
    }

    public void battle()
    {

    }

    public void setNickName(String n)
    {
        nickName = n;
    }

    public String getNickName()
    {
        return nickName;
    }

    public int getDamage()
    {
        return damage;
    }
    public void takeDamage(int d)
    {
        damage += d;
        reaction();
        if(damage >= 10)
        {
            lifeForce--;
            damage = 0;
        }
    }
    public void reaction()
    {
        String[] sounds = {"Ow!","POW!","Boffo!!","KaPow"};
        int r = (int)(Math.random()*sounds.length);
        System.out.println(sounds[r]); //Prints a random sound
    }
    public void respawn()
    {
        lifeForce = 10;
        damage = 0;
    }
    public boolean isAlive()
    {
        if(lifeForce > 0) return true;
        else return false;
    }
    public boolean isDead()
    {
        if(lifeForce < 1) return true;
        else return false;
    }





    @Override
    public String toString()
    {
        String returnString = "";
        returnString += "Nickname: " + nickName + "\n";
        returnString += "Lifeforce: " + lifeForce + "\n";
        returnString += "Damage: " + damage + "\n";

        return returnString;
    }
}