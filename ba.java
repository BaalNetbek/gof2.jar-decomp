public final class ba {
   public static final int[][] a;
   private static int[] a;
   private static int[] b;
   private static int a;
   private static int b;
   private static int c;
   private static boolean a;
   private static int d;
   private static boolean b;
   private static boolean c;
   private static int e;
   private static int f;

   public static void a(cr var0) {
      int var1 = 0;
      int var2 = 0;
      int var4;
      if (bl.a() > 7) {
         v[] var3;
         if ((var3 = bl.a().a()) != null) {
            for(var4 = 0; var4 < var3.length; ++var4) {
               if (var3[var4] != null && var3[var4].b() != 4) {
                  if (var3[var4].b() == 0) {
                     ++c;
                  } else if (var3[var4].b() == 3) {
                     ++var1;
                     continue;
                  }

                  ++var2;
               }
            }
         }

         a = var2 > 0 && var1 > 0;
      } else {
         a = true;
      }

      boolean var7 = false;

      for(var2 = 0; var2 < a.length; ++var2) {
         int var8 = 0;
         if (a[var2] != 1) {
            for(var4 = 0; var4 < a[var2].length && var8 <= 0; ++var4) {
               var7 = false;
               int var6;
               switch(var2) {
               case 1:
                  var7 = var0.c() <= a[var2][var4];
                  break;
               case 2:
               case 3:
               case 9:
               case 12:
                  boolean[] var5 = var2 == 2 ? bl.b : (var2 == 3 ? bl.c : (var2 == 9 ? bl.d : bl.e));
                  var1 = 0;
                  var6 = 0;

                  for(; var6 < var5.length; ++var6) {
                     if (var5[var6]) {
                        ++var1;
                     }
                  }

                  var7 = var1 >= a[var2][var4];
                  break;
               case 4:
                  var7 = bl.j() >= a[var2][var4];
                  break;
               case 5:
                  var7 = bl.k > a[var2][var4];
                  break;
               case 6:
                  var7 = bl.l > a[var2][var4];
                  break;
               case 7:
                  var7 = bl.m > a[var2][var4];
                  break;
               case 8:
                  var7 = bl.n > a[var2][var4];
                  break;
               case 10:
                  var7 = bl.o > a[var2][var4];
                  break;
               case 11:
                  var7 = bl.e() >= a[var2][var4];
                  break;
               case 13:
                  var1 = 0;

                  for(var6 = 0; var6 < bl.a.length; ++var6) {
                     if (bl.a[var6].a) {
                        ++var1;
                     }
                  }

                  var7 = var1 >= a[var2][var4];
                  break;
               case 14:
                  var1 = 0;

                  for(var6 = 0; var6 < bl.a.length; ++var6) {
                     if (bl.a[var6].c > 0) {
                        ++var1;
                     }
                  }

                  var7 = var1 >= a[var2][var4];
                  break;
               case 15:
                  var7 = bl.a() > (long)(a[var2][var4] * 3600000);
                  break;
               case 16:
                  var7 = bl.l() > a[var2][var4];
                  break;
               case 17:
                  var7 = bl.b() >= a[var2][var4];
                  break;
               case 18:
                  var7 = bl.p > a[var2][var4];
                  break;
               case 19:
                  var7 = bl.d / 60000L >= (long)a[var2][var4];
                  break;
               case 20:
                  var7 = bl.q > a[var2][var4];
                  break;
               case 21:
                  var7 = bl.r > a[var2][var4];
                  break;
               case 22:
                  var7 = !a;
                  break;
               case 23:
                  var7 = c >= a[var2][var4];
                  break;
               case 24:
                  var7 = bl.c() >= a[var2][var4];
                  break;
               case 25:
                  var7 = d >= a[var2][var4];
                  break;
               case 26:
                  var7 = bl.s > a[var2][var4];
                  break;
               case 27:
                  var7 = bl.t > a[var2][var4];
                  break;
               case 28:
                  var7 = bl.a().a();
                  break;
               case 29:
                  var7 = bl.u > a[var2][var4];
                  break;
               case 30:
                  var7 = bl.a();
                  break;
               case 31:
                  var7 = bl.v > a[var2][var4];
                  break;
               case 32:
                  var7 = bl.w > a[var2][var4];
                  break;
               case 33:
                  var7 = bl.x > a[var2][var4];
                  break;
               case 34:
                  var7 = bl.y > a[var2][var4];
                  break;
               case 35:
                  var7 = bl.z > a[var2][var4];
                  break;
               case 36:
                  var7 = true;

                  for(var6 = 0; var6 < a.length - 1; ++var6) {
                     if (a[var6] == 0) {
                        var7 = false;
                        break;
                     }
                  }
               }

               if (var7) {
                  var8 = var4 + 1;
               }
            }
         }

         if (a[var2] > var8 || a[var2] == 0) {
            b[var2] = var8;
         }
      }

   }

   private static void f() {
      f = 0;
      e = 0;

      for(int var0 = 0; var0 < a.length; ++var0) {
         if (a[var0] == 1) {
            ++f;
            ++e;
         } else if (a[var0] != 0) {
            ++f;
         }
      }

      b = f == a.length;
      c = e == a.length;
   }

   public static boolean a() {
      return b;
   }

   public static boolean b() {
      return c;
   }

   public static int[] a() {
      return a;
   }

   public static int[] b() {
      return b;
   }

   public static void a() {
      ++a;
   }

   public static void b() {
      ++b;
   }

   public static void a(int var0) {
      if (var0 > d) {
         d = var0;
      }

   }

   public static void a(int[] var0) {
      a = var0;
   }

   public static void c() {
      for(int var0 = 0; var0 < a.length; ++var0) {
         a[var0] = 0;
      }

      a[0] = 1;
      e();
      d = 0;
   }

   public static void d() {
      for(int var0 = 0; var0 < a.length; ++var0) {
         if (b[var0] > 0 && (b[var0] < a[var0] || a[var0] == 0)) {
            a[var0] = b[var0];
         }
      }

      f();
      if (f == a.length - 1) {
         b[a.length - 1] = 1;
         a[a.length - 1] = 1;
         f();
      }

   }

   public static void e() {
      for(int var0 = 0; var0 < b.length; ++var0) {
         b[var0] = 0;
      }

      a = 0;
      b = 0;
      c = 0;
      a = false;
   }

   static {
      a = new int[(a = new int[][]{{0}, {5, 15, 30}, {11, 8, 5}, {11, 8, 5}, {250, 100, 50}, {200, 100, 25}, {1000, 500, 100}, {25, 10, 3}, {1000, 100, 25}, {22, 16, 5}, {150, 100, 30}, {100, 50, 25}, {22, 10, 5}, {13, 6, 3}, {13, 6, 3}, {20, 10, 5}, {50, 25, 5}, {100, 50, 10}, {50, 20, 5}, {5, 3, 2}, {50, 20, 5}, {25, 10, 5}, {0}, {4, 3, 2}, {500, 200, 50}, {1000000, 500000, 125000}, {100, 50, 20}, {20, 10, 3}, {1}, {500, 250, 50}, {0}, {500, 250, 100}, {50}, {5}, {10}, {12}, {0}}).length];
      b = new int[a.length];
   }
}
