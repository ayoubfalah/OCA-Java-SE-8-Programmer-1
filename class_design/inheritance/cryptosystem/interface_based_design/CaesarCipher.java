package class_design.inheritance.cryptosystem.interface_based_design;

public abstract class CaesarCipher implements ShiftCipher
{
   public String encryptAndDecrypt(String txt){ return null;}
   public int getRandomShift(int max){ return -1; }
}
