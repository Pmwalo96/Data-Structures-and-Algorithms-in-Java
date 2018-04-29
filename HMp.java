public class HMp
{
   private final static int AMOUNT = 128;
   HE[] tab;
   HMp()
   {
      tab = new HE[AMOUNT];
      for(int i = 0; i<AMOUNT; i++)
      {
         tab[i] = null;
      }
   }
   public int get(int Key) 
   {
      int h = (Key % AMOUNT);
      while (tab[h] != null && tab[h].getKey() != Key)
      {
         h = (h + 1) % AMOUNT;
         if (tab[h] == null)
         {
            return -1;
         }
         else
         {
            return tab[h].getE();
         }
      }
   }
 
      public void put(int Key, int E) 
      {
            int h = (Key % AMOUNT);
            while (tab[h] != null && tab[h].getKey() != Key)
            {
               h = (h + 1) % AMOUNT;
            }
            tab[h] = new HE(Key, E);
      }
  }

