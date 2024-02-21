import java.io.DataInputStream;
import java.io.InputStream;
import javax.microedition.lcdui.Image;

public final class ai {
   private static Class a;

   public static Image a(Image var0, int var1, int var2) {
      try {
         float var17 = (float)var1 / (float)var0.getWidth();
         float var18 = (float)var2 / (float)var0.getHeight();
         int var3 = var0.getWidth();
         int var4 = var0.getHeight();
         int[] var5 = new int[var3 * var4];
         int[] var6 = new int[(int)((float)var3 * var17) * (int)((float)var4 * var18)];
         var0.getRGB(var5, 0, var3, 0, 0, var3, var4);
         int[] var10000 = var5;
         int var8 = (int)((float)var3 * var17);
         int var7 = var3;
         var6 = var6;
         var5 = var5;
         int var9 = var10000.length / var3;
         int var10 = var6.length / var8;

         for(int var11 = 0; var11 < var8; ++var11) {
            for(int var12 = 0; var12 < var10; ++var12) {
               float var13 = (float)var11 * (float)(var7 - 1) / (float)(var8 - 1);
               boolean var14 = false;
               int var19;
               if ((double)var13 - Math.floor((double)var13) > 0.5D) {
                  var19 = (int)Math.ceil((double)var13);
               } else {
                  var19 = (int)Math.floor((double)var13);
               }

               var13 = (float)var12 * (float)(var9 - 1) / (float)(var10 - 1);
               boolean var15 = false;
               int var20;
               if ((double)var13 - Math.floor((double)var13) > 0.5D) {
                  var20 = (int)Math.ceil((double)var13);
               } else {
                  var20 = (int)Math.floor((double)var13);
               }

               var6[var11 + var12 * var8] = var5[var19 + var20 * var7];
            }
         }

         var0 = Image.createRGBImage(var6, (int)((float)var3 * var17), (int)((float)var4 * var18), true);
         System.gc();
      } catch (Exception var16) {
         var16.printStackTrace();
      }

      return var0;
   }

   public static Image a(String var0, boolean var1) {
      Image var10 = null;

      try {
         InputStream var7 = (a == null ? (a = a("java.lang.Class")) : a).getResourceAsStream(var0);
         int var2;
         DataInputStream var8;
         byte[] var3 = new byte[var2 = (var8 = new DataInputStream(var7)).available()];
         var8.read(var3, 0, var2);
         var8.close();
         int var9;
         if (var2 < 100) {
            var9 = 10 + var2 % 10;
         } else if (var2 < 200) {
            var9 = 50 + var2 % 20;
         } else if (var2 < 300) {
            var9 = 80 + var2 % 20;
         } else {
            var9 = 100 + var2 % 50;
         }

         for(int var4 = 0; var4 < var9; ++var4) {
            byte var5 = var3[var4];
            var3[var4] = var3[var2 - var4 - 1];
            var3[var2 - var4 - 1] = var5;
         }

         var10 = Image.createImage(var3, 0, var2);
         System.gc();
      } catch (Exception var6) {
      }

      return var10;
   }

   public static Image a(String var0) {
      return a(var0, true);
   }

   private static Class a(String var0) {
      try {
         return Class.forName(var0);
      } catch (ClassNotFoundException var1) {
         throw new NoClassDefFoundError(var1.getMessage());
      }
   }
}
