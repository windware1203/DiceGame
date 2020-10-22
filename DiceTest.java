
public class DiceTest {
	public static void main(String[] args)
    {
        boolean check = true;
        while(check)
        {
            Dice dice1 = new Dice();
            Dice dice2 = new Dice();
			System.out.println("Dice1 is " + dice1.getFace());
			System.out.println("Dice2 is " + dice2.getFace());
            int sum = dice1.getFace() + dice2.getFace();
            boolean winCheck = false;
            switch (sum)
            {
                case 7:
                    check = false;
                    winCheck = true;
                    break;
                case 11:
                    check = false;
                    winCheck = true;
                    break;
                case 2:
                    check = false;
                    break;
                case 3:
                    check = false;
                    break;
                case 12:
                    check = false;
                    break;
                default:
                    break;
            }
			if(check)
			{
				System.out.println("Roll Again!");
				System.out.println("");
				dice1.reSetFace();
				dice2.reSetFace();
			}
			else
			{
				if(winCheck)System.out.println("you win!");
				else System.out.println("you win!");
			}
        }
    }
}
