public final class bv {
   private static cc a = new cc();
   private static cc b = new cc();
   private static boolean[] a = new boolean[100];

   public static cw a(int var0) {
      if (var0 < 0) {
         return null;
      } else {
         new av();
         cw[] var1 = av.a();
         if (bl.a() == 0L) {
            boolean[] var2 = bl.a();

            for(int var3 = 0; var3 < var2.length; ++var3) {
               var2[var3] = var1[var3].c();
            }
         }

         return var1[var0];
      }
   }

   public static bd a(int var0) {
      return var0 < 0 ? bl.a : (new av()).a(var0);
   }

   public static void a(boolean[] var0) {
      a = var0;
   }

   public static boolean[] a() {
      return a;
   }

   public static void a(int var0) {
      a[var0] = true;
   }

   public static int a(int var0, int var1, int var2, int var3) {
      return 100 - (g.a((long)((var2 - var0) * (var2 - var0) + (var3 - var1) * (var3 - var1) << 12)) >> 12);
   }

   public static int b(int var0, int var1, int var2, int var3) {
      return g.a((long)((var2 - var0) * (var2 - var0) + (var3 - var1) * (var3 - var1) << 12)) >> 12;
   }

   public static float a(cw var0, cw var1) {
      if (var0.equals(var1)) {
         return 0.0F;
      } else {
         a.a(var0.d(), var0.e(), var0.f() / 10);
         b.a(var1.d(), var1.e(), var1.f() / 10);
         a.c(b);
         return (float)(g.a((long)(a.a * a.a + a.b * a.b + a.c * a.c << 12)) >> 12) * 18.85F;
      }
   }

   public static int[] a(bd var0) {
      boolean var1 = bl.c();
      cw[] var2 = null;
      v[] var3;
      if (!var1) {
         new av();
         var3 = null;
         var2 = av.a();
      }

      var3 = ad.a();
      int[] var4 = new int[11];
      int[] var5 = new int[11];
      int var6 = 0;

      for(int var7 = 154; var7 < 164; ++var7) {
         var5[var6] = var7;
         if (var1) {
            var4[var6] = 0;
         } else {
            var4[var6] = (byte)a(var2[var0.a()].d(), var2[var0.a()].e(), var2[var3[var7].j()].d(), var2[var3[var7].j()].e());
            if (var4[var6] < 50) {
               var4[var6] = 0;
            }

            ++var6;
         }
      }

      var5[10] = 164;
      var4[10] = var1 ? 100 : 0;

      int var8;
      int var9;
      boolean var12;
      do {
         var12 = true;

         for(var8 = 1; var8 < var4.length; ++var8) {
            if (var4[var8 - 1] < var4[var8]) {
               var9 = var4[var8 - 1];
               int var11 = var5[var8 - 1];
               var4[var8 - 1] = var4[var8];
               var5[var8 - 1] = var5[var8];
               var4[var8] = var9;
               var5[var8] = var11;
               var12 = false;
            }
         }
      } while(!var12);

      for(var8 = 0; var8 < var4.length; ++var8) {
         if (var4[var8] > 0) {
            var4[var8] = (byte)(var4[var8] - var8 * 2);
         }
      }

      int[] var10 = new int[var4.length << 1];

      for(var9 = 0; var9 < var10.length; var9 += 2) {
         var10[var9] = var5[var9 / 2];
         var10[var9 + 1] = var4[var9 / 2];
      }

      return var10;
   }
}
