/**
  *takeda
  *v.1
  */
import java.security.*;
public class Dice {
	private final int face;
	public Dice()
	{
		SecureRandom randomf = new SecureRandom();
		face = randomf.nextInt(6)+1;
	}
	public void reSetFace()
	{
		SecureRandom random_re = new SecureRandom();
		face = (face + random_re.nextInt(6)+1)%6+1;
	}
	public int getFace()
	{
		return face;
	}
	public String toString()
	{
		return String.valueOf(face);
	}
}
