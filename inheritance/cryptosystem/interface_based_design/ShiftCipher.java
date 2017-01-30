package inheritance.cryptosystem.interface_based_design;

import java.util.Random;

public interface ShiftCipher
{
   String encrypt(String plaintext, int shift);
   String decrypt(String ciphertext, int shift);
   default int getRandomShift(int max)
   {
     return (new Random()).nextInt(max) + 1;
   }
}
