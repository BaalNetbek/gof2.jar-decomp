import java.util.Vector;

public final class bl {
   private static int A;
   private static int B;
   private static long e;
   private static int C;
   private static int D;
   private static int E = 1;
   private static int F;
   private static int G;
   private static int H;
   private static int I;
   private static int J;
   private static int K;
   private static int L;
   private static int M;
   public static cs a;
   private static ch a;
   private static cl a;
   private static cl[] a = new cl[2];
   private static bd b;
   private static bd[] a = new bd[3];
   public static h[] a;
   private static cw a;
   private static String[] b;
   private static int[] c;
   public static bp[] a;
   public static ca[] a;
   public static String[] a;
   public static byte[] a;
   public static int a;
   public static int b;
   public static int c;
   public static boolean[] a = new boolean[22];
   public static int[] a;
   public static int[] b;
   public static byte[] b;
   public static byte[] c;
   public static int d;
   public static int e;
   public static int f;
   public static long a;
   public static bd a = new bd();
   public static int g;
   public static int h;
   public static int i;
   public static int j;
   public static long b;
   public static long c;
   public static boolean[] b = new boolean[11];
   public static boolean[] c = new boolean[11];
   public static int k;
   public static int l;
   public static int m;
   public static int n;
   public static boolean[] d = new boolean[22];
   public static int o;
   public static boolean[] e = new boolean[22];
   public static int p;
   public static long d;
   public static int q;
   public static int r;
   public static int s;
   public static int t;
   public static int u;
   public static int v;
   public static int w;
   public static int x;
   public static int y;
   public static int z;

   public static void a(h var0) {
      int var1 = 0;
      if (a == null) {
         a = new bp[1];
      } else {
         int var2;
         for(var2 = 0; var2 < a.length; ++var2) {
            if (a[var2] != null && a[var2].c == var0.a() && a[var2].a == var0.d) {
               bp var10000 = a[var2];
               var10000.b += var0.d();
               return;
            }
         }

         for(var2 = 0; var2 < a.length; ++var2) {
            if (a[var2] == null) {
               a[var2] = new bp(var0);
               return;
            }
         }

         bp[] var4 = new bp[a.length + 1];

         for(int var3 = 0; var3 < a.length; ++var3) {
            var4[var1++] = a[var3];
         }

         a = null;
         a = var4;
      }

      a[var1] = new bp(var0);
   }

   public static bp[] a() {
      return a;
   }

   public static boolean[] a() {
      return a;
   }

   public static void a(int var0, boolean var1) {
      a[var0] = true;
   }

   public static bd[] a() {
      return a;
   }

   public static void a(bd[] var0) {
      a = var0;
   }

   private static bd a(bd var0) {
      for(int var1 = 0; var1 < 3; ++var1) {
         if (a[var1] != null && a[var1].a(var0)) {
            return a[var1];
         }
      }

      return null;
   }

   public static void a(bd var0) {
      if (var0 != a) {
         bd var1;
         label240: {
            var1 = a(var0);
            bd var4;
            boolean var10000;
            if ((var4 = a(var0)) != null) {
               b(var4);
            } else {
               int var5;
               if (a[0] != null) {
                  for(var5 = 2; var5 > 0; --var5) {
                     a[var5] = a[var5 - 1];
                  }

                  a[0] = var0;
                  b(var0);
                  var10000 = true;
                  break label240;
               }

               for(var5 = 2; var5 >= 0; --var5) {
                  if (a[var5] == null) {
                     a[var5] = var0;
                     b(var0);
                     var10000 = true;
                     break label240;
                  }
               }
            }

            var10000 = false;
         }

         if (var1 == null) {
            be var2 = new be();
            bd var3 = var0;
            v[] var10001;
            if (var0.b() == 78 && M < 7) {
               v[] var19;
               (var19 = new v[3])[0] = ad.a()[0].a(1, 0);
               var19[1] = ad.a()[22].a(1, 0);
               var19[2] = ad.a()[55].a(1, 0);
               var10001 = var19;
            } else {
               Vector var18 = new Vector();
               v[] var20 = ad.a();
               new av();
               cw[] var14 = av.a();
               int var6;
               int var7 = (var6 = var0.d()) < 4 ? 1 : var6 / 2;
               if (M > 16 && M < 25 && at.a.nextInt(100) < 40) {
                  v var8 = var20[68].a();
                  var18.addElement(var8);
               }

               at.a.setSeed(System.currentTimeMillis());

               int var21;
               int var23;
               for(var21 = 0; var21 < var20.length; ++var21) {
                  v var9 = var20[var21];
                  boolean var10 = false;
                  if (var3.b() == var9.a(36)) {
                     var10 = true;
                  }

                  int var11 = var9.c();
                  boolean var12 = var9.a() >= 132 && var9.a() < 154;
                  if (var10 || var9.a() == null && var21 != 175 && var21 != 164 && var11 <= var3.d() && var9.k() != 0 && var9.e() != 0 && (var9.a(35) != 1 || var14[var3.a()].c() == 1) && (!var12 || var9.a() == 132 + var3.a())) {
                     int var13 = var9.k();
                     if (var10 || (var12 || var11 <= var6 && var11 >= var7) && at.a.nextInt(100) < var13) {
                        var23 = var14[var9.j()].d();
                        var11 = var14[var9.j()].e();
                        var23 = bv.a(var14[var3.a()].d(), var14[var3.a()].e(), var23, var11);
                        var11 = 5 + at.a.nextInt(15);
                        if (var9.b() != 4 && var9.b() != 1) {
                           var11 = g.b(1, var11 / 5);
                        } else if (var9.b() == 4 && var23 > 50) {
                           var11 *= g.b(1, (int)((float)(var23 - 50) / 50.0F * 20.0F));
                        }

                        var18.addElement(var9.a(var11));
                     }
                  }
               }

               v[] var22 = new v[var21 = var18.size()];

               for(var23 = 0; var23 < var21; ++var23) {
                  var22[var23] = (v)var18.elementAt(var23);
               }

               var10001 = var22;
            }

            var0.a(var10001);
            var0.a(be.a(var0));
            var0.a(var2.a(var0));
         }

         a = e;
      }

      a = cl.a;

      for(int var15 = 0; var15 < a.length; ++var15) {
         if (a[var15] != null) {
            if (a[var15].g() && a[var15].d() == 25 && var0.b() == h) {
               a = a[var15];
               break;
            }

            if (a[var15].h() == var0.b() && a[var15].d() != 8 && a[var15].d() != 19 && a[var15].d() != 16 && a[var15].d() != 14 && a[var15].d() != 13) {
               if (a[var15].g() || a[var15].d() != 11) {
                  a = a[var15];
               }
               break;
            }
         }
      }

      if (!a() && M >= 32 && var0.b() != a[0].h()) {
         if (++j > 10) {
            j = 0;
            boolean var16 = false;

            while(true) {
               do {
                  do {
                     do {
                        do {
                           if (var16) {
                              return;
                           }

                           g = at.a.nextInt(22);
                        } while(!a[g]);
                     } while(g == 10);
                  } while(g == 15);
               } while(a.g() && a.h() == h);

               var16 = true;
               cw var17;
               h = (var17 = bv.a(g)).a()[at.a.nextInt(var17.a().length)];
            }
         }
      } else if (a()) {
         h = -10;
         g = -10;
      }

   }

   public static void a(int var0) {
      c = var0;
   }

   public static cl a() {
      return a;
   }

   public static void a(cl var0) {
      a = var0;
   }

   public static cl b() {
      return a[1];
   }

   public static void b(cl var0) {
      a[1] = var0;
   }

   public static cl c() {
      return a[0];
   }

   public static void c(cl var0) {
      var0.d(true);
      a[0] = var0;
   }

   public static void a() {
      ++D;
   }

   public static void b(int var0) {
      M = var0;
   }

   public static int a() {
      return M;
   }

   public static void b() {
      boolean var0;
      int var1;
      v[] var2;
      switch(++M) {
      case 1:
         c(new cl(11, 0, 78));
         return;
      case 2:
         c(new cl(18, 0, 78));
         a[0].a(10);
         return;
      case 3:
         c(new cl(11, 0, 78));
         return;
      case 4:
         a.b((v[])null);
         c(new cl(18, 0, 78));
         a[0].a(25);
         return;
      case 5:
         c(new cl(11, 0, 78));
         return;
      case 6:
         a.a();
         c(new cl(22, 0, 78));
         return;
      case 7:
         c(new cl(4, 0, 78));
         return;
      case 8:
         if ((var2 = a.a()) != null) {
            for(var1 = 0; var1 < var2.length; ++var1) {
               if (var2[var1] != null) {
                  var2[var1].a(false);
                  var2[var1].a(ad.a()[var1].e());
               }
            }
         }

         v[] var6;
         if ((var6 = a.b()) != null) {
            for(int var5 = 0; var5 < var6.length; ++var5) {
               if (var6[var5] != null) {
                  var6[var5].a(false);
                  var6[var5].a(ad.a()[var5].e());
               }
            }
         }

         c(new cl(11, 0, 78));
         return;
      case 9:
         c(new cl(11, 0, 78));
         return;
      case 10:
         v var4 = a.a(19);
         a.c(var4);
         c(new cl(11, 0, 79));
         return;
      case 11:
         c(new cl(11, 0, 76));
         return;
      case 12:
         c(new cl(11, 0, 79));
         return;
      case 13:
         c(new cl(13, 0, 0));
         a[0].a(D + 2);
         a[0].a(false);
         return;
      case 14:
         c(new cl(4, 0, 79));
         return;
      case 15:
         c(new cl(11, 0, 98));
         return;
      case 16:
         c(new cl(4, 0, 98));
         return;
      case 17:
         c(new cl(11, 0, 98));
         return;
      case 18:
         a.a(0);
         c(new cl(20, 0, 56));
         return;
      case 19:
         c(new cl(20, 0, 55));
         return;
      case 20:
         c(new cl(23, 0, 55));
         a[0].a(6);
         return;
      case 21:
         c(new cl(4, 0, 55));
         return;
      case 22:
         c(new cl(11, 0, 55));
         return;
      case 23:
         var0 = true;
         byte var3 = 6;
         a[var3] = true;
         c(new cl(11, 20000, 10));
         return;
      case 24:
         h = 48;
         g = 9;
         c(new cl(4, 0, 48));
         return;
      case 25:
         if ((var2 = a.b()) != null) {
            for(var1 = 0; var1 < var2.length; ++var1) {
               if (var2[var1].a() == 131) {
                  var2[var1].a(true);
                  break;
               }
            }
         }

         c(new cl(20, 0, -1));
         return;
      case 26:
         h = -1;
         g = -1;
         c(new cl(4, 0, 48));
         return;
      case 27:
         c(new cl(11, 0, 10));
         return;
      case 28:
         h = 91;
         g = 18;
         c(new cl(4, 0, 91));
         return;
      case 29:
         c(new cl(4, 0, -1));
         return;
      case 30:
         c(new cl(20, 0, 91));
         return;
      case 31:
         c(new cl(11, 30000, 98));
         return;
      case 32:
         c(new cl(11, 0, 10));
         return;
      case 33:
         c(new cl(8, 0, 10));
         a[0].a(164, 50);
         return;
      case 34:
         a.a(164, 50);

         for(var1 = 0; var1 < a.length; ++var1) {
            if (a[var1].a() == 85) {
               a[var1].a = true;
               a[var1].a(ad.a()[164].a(), 50, -1);
               h var10000 = a[var1];
               var0 = false;
               var10000.b = 0;
            }
         }

         c(new cl(11, 0, 30));
         return;
      case 35:
         c(new cl(11, 0, 29));
         return;
      case 36:
         c(new cl(12, 0, 27));
         return;
      case 37:
         c(new cl(24, 0, 27));
         a[0].a(false);
         return;
      case 38:
         c(new cl(4, 0, 22));
         return;
      case 39:
         c(new cl(11, 0, 30));
         return;
      case 40:
         c(new cl(25, 0, -1));
         return;
      case 41:
         c(new cl(4, 0, -1));
         return;
      case 42:
         h = -10;
         g = -10;
         c(new cl(24, 0, -1));
         return;
      case 43:
         c(new cl(11, 0, 98));
         return;
      case 44:
         c(new cl(11, 0, 98));
         return;
      case 45:
         h = -10;
         g = -10;
         c(cl.a);
         a[0].a(false);
         o(40000);
      default:
      }
   }

   public static boolean a() {
      return M > 44;
   }

   public static boolean b() {
      return M < 2 && b.b() == 78 || c() && M > 42;
   }

   public static boolean c() {
      return b.a(a);
   }

   public static cl a(boolean var0, long var1) {
      label140:
      for(int var3 = 0; var3 < a.length; ++var3) {
         cl var4;
         if ((var4 = a[var3]).d()) {
            return null;
         }

         if (var4 != null) {
            v[] var5;
            int var6;
            switch(var4.d()) {
            case 0:
            case 11:
               if (var0 && b.b() == var4.h()) {
                  return var4;
               }
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 12:
            case 17:
            default:
               break;
            case 8:
               if (var0 && b.b() == var4.h() && v.a(var4.a(), var4.b(), a.b())) {
                  return var4;
               }
               break;
            case 13:
               if (D >= var4.c()) {
                  var4.c(true);
                  return var4;
               }
               break;
            case 14:
               if (C >= var4.c()) {
                  var4.c(true);
                  return var4;
               }
               break;
            case 15:
               var5 = a.a();
               var6 = 0;

               while(true) {
                  if (var6 >= var5.length) {
                     continue label140;
                  }

                  if (var5[var6] != null && var5[var6].a() == var4.c()) {
                     return var4;
                  }

                  ++var6;
               }
            case 16:
               if (G >= var4.c()) {
                  var4.c(true);
                  return var4;
               }
               break;
            case 18:
               if (a.q() >= var4.c()) {
                  var4.c(true);
                  return var4;
               }
               break;
            case 19:
               if (H >= var4.c()) {
                  var4.c(true);
                  return var4;
               }
               break;
            case 20:
               if (!var0 && b.b() == var4.h() && var1 > 10000L) {
                  return var4;
               }
               break;
            case 21:
               var5 = a.a();
               var6 = 0;

               while(true) {
                  if (var6 >= var5.length) {
                     continue label140;
                  }

                  if (var5[var6] != null && var5[var6].b() == var4.c()) {
                     return var4;
                  }

                  ++var6;
               }
            case 22:
               var5 = a.a();
               boolean var9 = false;
               boolean var7 = false;

               for(int var8 = 0; var8 < var5.length; ++var8) {
                  if (var5[var8] != null && var5[var8].b() == 0) {
                     var9 = true;
                  } else if (var5[var8] != null && var5[var8].d() == 10) {
                     var7 = true;
                  }
               }

               if (var9 && var7) {
                  return var4;
               }
               break;
            case 23:
               if (var0) {
                  var5 = a.a();

                  for(var6 = 0; var6 < var5.length; ++var6) {
                     if (var5[var6] != null && var5[var6].d() == var4.c()) {
                        return var4;
                     }
                  }
               }
               break;
            case 24:
               if (var0 || !var0 && b.b() != var4.h() && var1 > 10000L) {
                  return var4;
               }
            }
         }
      }

      return null;
   }

   public static void c(int var0) {
      J = var0;
   }

   public static void c() {
      ++J;
   }

   public static int b() {
      return J;
   }

   public static void d(int var0) {
      K += var0;
   }

   public static void e(int var0) {
      K = var0;
   }

   public static int c() {
      return K;
   }

   public static void f(int var0) {
      L = var0;
   }

   public static int d() {
      return L;
   }

   public static void d(cl var0) {
      for(int var1 = 0; var1 < a.length; ++var1) {
         if (a[var1] == var0) {
            a[var1] = cl.a;
         }
      }

      if (a == var0) {
         a = null;
      }

   }

   public static void d() {
      ++G;
   }

   public static int e() {
      return G;
   }

   public static ch a() {
      return a;
   }

   public static void a(ch var0) {
      a = var0;
   }

   public static bd a() {
      return b;
   }

   public static void b(bd var0) {
      b = var0;
      if ((a = bv.a(var0.a())) != null) {
         e[b.a()] = true;
         new av();
         bd[] var3 = av.a(a);
         b = null;
         b = new String[var3.length];
         c = new int[var3.length];

         for(int var1 = 0; var1 < a.a().length; ++var1) {
            for(int var2 = 0; var2 < var3.length; ++var2) {
               if (a.a()[var1] == var3[var2].b()) {
                  if (M == 0) {
                     b[var1] = "";
                  } else {
                     b[var1] = var3[var2].a();
                  }

                  c[var1] = var3[var2].c();
                  break;
               }
            }
         }

      }
   }

   public static String[] a() {
      return b;
   }

   public static int[] a() {
      return c;
   }

   public static cw a() {
      return a;
   }

   public static int f() {
      return A;
   }

   public static void g(int var0) {
      B = var0;
   }

   public static void a(long var0) {
      e = var0;
   }

   public static void h(int var0) {
      C = var0;
   }

   public static void i(int var0) {
      D = var0;
   }

   public static void j(int var0) {
      E = var0;
   }

   public static void k(int var0) {
      F = var0;
   }

   public static void l(int var0) {
      H = var0;
   }

   public static int g() {
      return H;
   }

   public static void m(int var0) {
      ++H;
   }

   public static void n(int var0) {
      G = var0;
   }

   public static void o(int var0) {
      A += var0;
   }

   public static void p(int var0) {
      A = var0;
   }

   public static void e() {
      int var0 = C + t / 2 + l / 50 + m + 2 * D;
      if ((float)F * 1.3F < (float)var0) {
         F = var0;
         ++E;
      }

   }

   public static int h() {
      return B;
   }

   public static int i() {
      return F;
   }

   public static int j() {
      return C;
   }

   public static void f() {
      ++C;
      ba.a();
   }

   public static void q(int var0) {
      I = var0;
   }

   public static int k() {
      return I;
   }

   public static void g() {
      ++I;
      ba.b();
   }

   public static int l() {
      return D;
   }

   public static int m() {
      return E;
   }

   public static cs a() {
      return a;
   }

   public static h[] a() {
      return a;
   }

   public static ca[] a() {
      return a;
   }

   public static void b(long var0) {
      e += var0;
   }

   public static long a() {
      return e;
   }

   public static String[] b() {
      return a;
   }

   public static void a(String[] var0) {
      a = var0;
   }

   public static String a(String var0, String var1) {
      int var2;
      return (var2 = var0.indexOf(35)) >= 0 ? var0.substring(0, var2) + var1 + var0.substring(var2 + 1) : var0;
   }

   public static String a(String var0, String var1, String var2) {
      int var3;
      return (var3 = var0.indexOf(var2)) >= 0 ? var0.substring(0, var3) + var1 + var0.substring(var3 + var2.length()) : var0;
   }

   public static void h() {
      new av();
      cw[] var0 = av.a();

      for(int var1 = 0; var1 < 3; ++var1) {
         v[] var2;
         if ((var2 = var1 == 0 ? a.b() : (var1 == 1 ? a.a() : b.a())) != null) {
            for(int var5 = 0; var5 < var2.length; ++var5) {
               v var6;
               if ((var6 = var2[var5]) != null) {
                  int var4 = bv.b(var0[var6.j()].d(), var0[var6.j()].e(), var0[var6.i()].d(), var0[var6.i()].e());
                  int var3 = bv.b(var0[var2[var5].j()].d(), var0[var2[var5].j()].e(), var0[b.a()].d(), var0[b.a()].e());
                  var3 = var6.h() + (int)(g.b(1.0F, 100.0F / (float)var4 * (float)var3 / 100.0F) * (float)(var6.g() - var6.h()));
                  if (var6.e() > 0) {
                     at.a.setSeed((long)b.b());
                     var4 = g.b(1, (int)((float)var3 * 0.05F));
                     var3 += -var4 + at.a.nextInt((var4 << 1) + 1);
                     var6.a(var3);
                  }
               }
            }

            at.a.setSeed(System.currentTimeMillis());
         }
      }

   }

   public static void i() {
      A = 0;
      B = 0;
      C = 0;
      D = 0;
      H = 0;
      I = 0;
      J = 0;
      K = 0;
      L = 0;
      E = 1;
      F = 15;
      G = 0;
      e = 0L;
      a = null;
      a = null;
      b = 0;

      int var0;
      for(var0 = 0; var0 < b.length; ++var0) {
         b[var0] = false;
      }

      for(var0 = 0; var0 < c.length; ++var0) {
         c[var0] = false;
      }

      k = 0;
      l = 0;
      m = 0;
      n = 0;

      for(var0 = 0; var0 < d.length; ++var0) {
         d[var0] = false;
      }

      o = 0;

      for(var0 = 0; var0 < e.length; ++var0) {
         e[var0] = false;
      }

      p = 0;
      d = 0L;
      q = 0;
      r = 0;
      s = 0;
      t = 0;
      u = 0;
      v = 0;
      w = 0;
      x = 0;
      y = 0;
      z = 0;
      ba.c();
      b = new int[176];
      a = new int[176];
      c = new byte[176];
      b = new byte[176];
      boolean[] var3 = bv.a();

      int var1;
      for(var1 = 0; var1 < var3.length; ++var1) {
         var3[var1] = false;
      }

      bv.a(var3);
      var1 = 0;
      v[] var4 = ad.a();

      int var2;
      for(var2 = 0; var2 < var4.length; ++var2) {
         if (var4[var2].a() != null) {
            ++var1;
         }
      }

      if (var1 > 0) {
         a = new h[var1];
         var2 = 0;

         for(var1 = 0; var1 < var4.length; ++var1) {
            if (var4[var1].a() != null) {
               a[var2++] = new h(var1);
            }
         }
      }

      a = null;
      new av();
      a = av.a();
      a = new cs();
      h = -1;
      g = -1;
      i = 0;
      at.a();
      cl var6 = cl.a;
      a[1] = var6;
      boolean var8 = false;
      M = 0;
      c(new cl(4, 0, 78));
      a = a[0];
      (a = ad.a()[10].a()).a(0);
      a.b();
      b(bv.a(78));
      a.b((v[])null);
      v var7 = ad.a()[3].a();
      a.a(var7, 0);
      v var5 = ad.a()[3].a();
      a.a(var5, 1);
      v var9 = ad.a()[54].a();
      a.a(var9, 0);
      var9 = ad.a()[59].a();
      a.a(var9, 0);
      var9 = ad.a()[82].a();
      a.a(var9, 0);
      f = a.g();
      d = a.h();
      e = a.f();
   }
}
