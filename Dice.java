/**
  *takeda
  *v.1
  */
import java.security.*;
public class Dice {
	private final int face;
	public Dice()
	{
		SecureRandom random = new SecureRandom();
		face = random.nextInt(6)+1;
	}
	public String toString()
	{
		return String.valueOf(face);
	}
}
