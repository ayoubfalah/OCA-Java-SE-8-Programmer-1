package inheritance.cryptosystem.abstractclass_based_design;

/**
 *
 * @author ayoubfalah
 */
public abstract class ShiftCipher 
{
    public abstract String encrypt(String plaintext, int shift);
    public abstract String decrypt(String ciphertext, int shift);
}
