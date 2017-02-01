package inheritance.cryptosystem.interface_based_design;

public interface AutoShiftCipher extends ShiftCipher
{
  public byte[] encrypt(byte[] plaintext);
  public byte[] decrypt(byte[] ciphertext);
}
