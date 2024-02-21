import javax.microedition.lcdui.Graphics;

public final class q {
   private static cd[] a;
   private static Graphics a;

   public static void a() {
      if (a != null) {
         for(int var0 = 0; var0 < a.length; ++var0) {
            a[var0] = null;
         }

         a = null;
      }

      System.gc();
   }

   public static void a(Graphics var0) {
      a = var0;
      if (a != null) {
         for(int var1 = 0; var1 < a.length; ++var1) {
            cd.a(a);
         }
      }

   }

   public static void a(String var0, int var1, int var2, int var3) {
      if (a != null) {
         if (a == null) {
            (a = new cd[1])[0] = new cd(var0, a, var1, 15, 16);
            return;
         }

         cd[] var4 = new cd[a.length + 1];
         System.arraycopy(a, 0, var4, 0, a.length);
         var4[a.length] = new cd(var0, a, var1, 15, 16);
         a = var4;
      }

   }

   public static void a(int var0, int var1) {
      if (var1 >= 0 && var1 < a.length) {
         a[var1].b(-2);
      }
   }

   public static void b(String var0, int var1, int var2, int var3) {
      if (var3 >= 0 && var3 < a.length) {
         a[var3].a(var0, var1, var2);
      }
   }

   public static void a(String var0, int var1, int var2, int var3, int var4) {
      if ((var4 & 8) != 0) {
         var1 -= a[var3].a(var0) >> 1;
      }

      if ((var4 & 4) != 0) {
         var2 -= a[var3].a() >> 1;
      } else if ((var4 & 32) != 0) {
         var2 -= a[var3].a();
      }

      if ((var4 & 2) != 0) {
         a[var3].b(var0, var1, var2);
      } else {
         a[var3].a(var0, var1, var2);
      }
   }

   public static void a(String[] var0, int var1, int var2, int var3) {
      if (var3 >= 0 && var3 < a.length) {
         for(int var4 = 0; var4 < var0.length; ++var4) {
            a[var3].a(var0[var4], var1, var2 + var4 * a());
         }

      }
   }

   public static void a(String[] var0, int var1, int var2, int var3, int var4, int var5) {
      if (var3 >= 0 && var3 < a.length) {
         var5 = var5 > 0 ? var5 / a() + 1 : 0;

         for(int var6 = 0; var6 < var0.length; ++var6) {
            int var7 = var6 < var5 ? var1 + var4 : var1;
            a[var3].a(var0[var6], var7, var2 + var6 * a());
         }

      }
   }

   public static void a(String[] var0, int var1, int var2, int var3, int var4) {
      int var5 = a();
      if (var3 >= 0 && var3 < a.length) {
         int var6 = 0;

         for(int var7 = 0; var7 < var0.length; ++var7) {
            if ((var4 & 8) != 0) {
               var6 = -(a[var3].a(var0[var7]) >> 1);
            }

            if ((var4 & 2) != 0) {
               a[var3].b(var0[var7], var1, var2 + var7 * var5);
            } else {
               a[var3].a(var0[var7], var1 + var6, var2 + var7 * var5);
            }
         }

      }
   }

   public static int a(String var0) {
      return a(var0, 0);
   }

   public static int a(String var0, int var1) {
      return var1 >= 0 && var1 < a.length ? a[var1].a(var0) : 0;
   }

   public static void a(int var0) {
      a[0].a((int)0);
   }

   public static void b(int var0, int var1) {
      if (var1 >= 0 && var1 < a.length) {
         a[var1].a((int)0);
      }
   }

   public static int a() {
      return a[0].a();
   }

   public static int a(String[] var0) {
      return var0.length * a[0].a();
   }

   public static void b(int var0) {
      a[0].c(11);
   }

   public static void c(int var0, int var1) {
      if (var1 >= 0 && var1 < a.length) {
         a[var1].c(11);
      }
   }

   public static String[] a(String var0, int var1, int var2, int var3, int var4) {
      int var5 = 0;
      int var6 = 0;
      String var7 = null;
      var0 = var0 + "\n";

      for(var4 = var4 > 0 ? var4 / a() + 1 : 0; var6 < var0.length(); var6 += var7.length()) {
         int var12 = var5 < var4 ? var1 - var3 : var1;
         var7 = a(var0.substring(var6, var0.length()), var12, var2, false);
         ++var5;
      }

      String[] var13 = new String[var5];
      var6 = 0;

      for(int var8 = 0; var8 < var5; ++var8) {
         int var9 = var8 < var4 ? var1 - var3 : var1;
         var13[var8] = a(var0.substring(var6, var0.length()), var9, var2, false);
         var6 += var13[var8].length();
         var13[var8].trim();
      }

      return var13;
   }

   public static String[] a(String var0, int var1) {
      byte var2 = 0;
      var1 = var1;
      int var3 = 0;
      int var4 = 0;
      String var5 = null;

      for(var0 = var0 + "\n"; var4 < var0.length(); var4 += var5.length()) {
         var5 = a(var0.substring(var4, var0.length()), var1, var2, false);
         ++var3;
      }

      String[] var10 = new String[var3];
      var4 = 0;

      for(int var6 = 0; var6 < var3; ++var6) {
         var10[var6] = a(var0.substring(var4, var0.length()), var1, var2, false);
         var4 += var10[var6].length();
         var10[var6].trim();
      }

      return var10;
   }

   public static String a(String var0, int var1, int var2, boolean var3) {
      int var4 = 0;
      int var5 = (var2 >= 0 && var2 < a.length ? a[var2].b() : 0) >> 1;

      for(int var6 = 0; var6 < var0.length(); ++var6) {
         if (var3 || var0.charAt(var6) == ' ' || var0.charAt(var6) == '\n' || var0.charAt(var6) == '\r') {
            var4 = var6;
         }

         int var8 = var6 + 1;
         if ((var5 += a[var2].a(var0, var6, var8)) >= var1) {
            if (0 < var4) {
               return var0.substring(0, var4 + 1);
            }

            return var0.substring(0, var6 + 1);
         }

         if (var0.charAt(var6) == '\n' || var0.charAt(var6) == '\r') {
            return var0.charAt(var6) == '\n' ? var0.substring(0, var6 + 1).replace('\n', ' ') : var0.substring(0, var6 + 1).replace('\r', ' ');
         }
      }

      if (0 < var0.length() - 1) {
         return var0.substring(0, var0.length());
      } else {
         return "";
      }
   }
}
