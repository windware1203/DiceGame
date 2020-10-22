
class DiceGame
{
    public static void main(String[] args)
    {
        boolean check = true;
        while(check)
        {
            Dice dice1 = new Dice();
            Dice dice2 = new Dice();
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
				System.out.println("Again!");
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
