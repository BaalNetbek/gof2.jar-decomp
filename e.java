import javax.microedition.lcdui.Image;

public final class e {
   public static int a = 31;
   private static int e = 15;
   private static int f = 31;
   public static int b = 15;
   public static int c = 42;
   public static int d = 52;
   private static byte[][] a = new byte[][]{{11, 11, 9, 11, 4}, {5, 4, 6, 10}, {5, 5, 5, 5}, {2, 2, 2, 2}, {2, 2, 3, 3}, {0, 0, 0, 0, 0}, {2, 3, 5, 1}, {2, 2, 2, 2}, {1, 1, 1, 1}, {1, 1, 1, 1}, {4, 4, 4, 14}, {2, 0, 0, 0}};

   private e() {
   }

   public static byte[] a(boolean var0, int var1) {
      if (var1 == 3) {
         var1 = at.a.nextInt(4) == 0 ? 0 : 2;
      }

      if (!var0 && var1 == 0) {
         var1 = 10;
      }

      Object var3 = null;
      byte[] var4;
      if (var1 == 0) {
         var4 = new byte[a[var1].length];
      } else {
         var4 = new byte[a[var1].length + 1];
      }

      if (var1 == 5) {
         var1 = 0;
      }

      var4[0] = (byte)var1;

      for(int var2 = 1; var2 < var4.length; ++var2) {
         var4[var2] = (byte)at.a.nextInt(a[var1][var2 - 1]);
      }

      return var4;
   }

   public static Image[] a(byte[] var0) {
      if (var0 == null) {
         return null;
      } else {
         Image[] var1 = new Image[var0.length - 1];
         byte var2 = var0[0];

         for(int var3 = 1; var3 < var0.length; ++var3) {
            if (var0[var3] >= 0) {
               int var10001 = var3 - 1;
               int var10003 = var3 - 1;
               byte var6 = var0[var3];
               int var5 = var10003;
               var1[var10001] = ai.a("/data/interface/faces/" + var2 + "_" + var5 + "_" + var6 + ".png", true);
            }
         }

         return var1;
      }
   }

   public static void a(Image[] var0, int var1, int var2, int var3) {
      at.a.setColor(a.a);
      at.a.drawRect(var1, var2, c - 1, d - 1);

      for(int var4 = 0; var4 < var0.length; ++var4) {
         if (var0[var4] != null) {
            at.a.drawImage(var0[var4], var1 + 1, var2 + 1, var3);
         }
      }

   }

   public static void a(int var0, int var1, Image var2, Image var3, int var4, int var5, int var6) {
      at.a.drawRegion(var3, var1 * a, 0, a, e, 0, var4, var5, 6);
      at.a.drawRegion(var2, var0 * f, 0, f, b, 0, var4, var5, 6);
   }

   public static void a(int var0, Image var1, int var2, int var3, int var4) {
      at.a.drawRegion(var1, var0 * f, 0, f, b, 0, var2, var3, var4);
   }

   public static void b(int var0, int var1, Image var2, Image var3, int var4, int var5, int var6) {
      var1 = var1 == 0 ? 0 : (var1 == 2 ? 1 : (var1 == 8 ? 3 : 2));
      at.a.drawRegion(var3, var1 * a, 0, a, e, 0, var4, var5, 6);
      at.a.drawRegion(var2, var0 * f, 0, f, b, 0, var4, var5, 6);
   }
}
