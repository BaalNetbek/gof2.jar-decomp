public final class v {
   private static final boolean[] a = new boolean[]{true, true, true, true, true, true, true, true, false, false, false, true, true, false, false, false, false, false, false, false, true, false, true, true, true};
   private int a;
   private int b;
   private int c;
   private int d;
   private int e;
   private int f;
   private int g;
   private int h;
   private int i;
   private int j;
   private int[] a;
   private int[] b;
   private int[] c;
   private int k;
   private int l;
   private int m;
   private boolean a;

   public v(int[] var1, int[] var2, int[] var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.a = this.c[1];
      this.b = this.c[3];
      this.c = this.c[5];
      this.d = this.c[7];
      this.h = this.c[13];
      this.i = this.c[15];
      this.j = this.c[17];
      this.e = this.c[9];
      this.f = this.c[11];
      this.g = this.i + (this.j - this.i) / 2;
      boolean var4 = false;
      this.a = var4;
   }

   public final boolean a() {
      return a[this.c];
   }

   public final int a() {
      return this.a;
   }

   public final int b() {
      return this.b;
   }

   public final int c() {
      return this.d;
   }

   public final int d() {
      return this.c;
   }

   public final int e() {
      return this.g;
   }

   public final int f() {
      return this.g * this.k;
   }

   public final int g() {
      return this.j;
   }

   public final int h() {
      return this.i;
   }

   public final int i() {
      return this.f;
   }

   public final int j() {
      return this.e;
   }

   public final void a(int var1) {
      this.g = var1;
   }

   public final void b(int var1) {
      this.k = var1;
   }

   public final int k() {
      return this.h;
   }

   public final int l() {
      return this.k;
   }

   public final void c(int var1) {
      this.k += var1;
   }

   public final void d(int var1) {
      this.l = var1;
   }

   public final int m() {
      return this.l;
   }

   private void f(int var1) {
      this.l += var1;
   }

   public final void e(int var1) {
      this.m = var1;
   }

   public final int n() {
      return this.m;
   }

   private void g(int var1) {
      this.m += var1;
   }

   public final int[] a() {
      return this.a;
   }

   public final int[] b() {
      return this.b;
   }

   public final int a(int var1) {
      for(int var2 = 0; var2 < this.c.length; var2 += 2) {
         if (this.c[var2] == var1) {
            return this.c[var2 + 1];
         }
      }

      return -979797979;
   }

   public final int a(boolean var1) {
      boolean var2 = false;
      int var3;
      if (var1 && this.l > 0 && bl.f() >= this.g) {
         this.f(-1);
         this.c(1);
         var3 = -this.g;
      } else {
         if (var1 || this.k <= 0) {
            return 0;
         }

         this.c(-1);
         this.f(1);
         var3 = this.g;
      }

      return var3;
   }

   public final int b(boolean var1) {
      if (var1 && this.m > 0) {
         this.g(-1);
         this.c(1);
         return -this.g;
      } else if (!var1 && this.k > 0) {
         this.c(-1);
         this.g(1);
         return this.g;
      } else {
         return 0;
      }
   }

   public static boolean a(int var0, int var1, v[] var2) {
      if (var2 == null) {
         return false;
      } else {
         for(int var3 = 0; var3 < var2.length; ++var3) {
            if (var2[var3].a == var0 && var2[var3].k >= var1) {
               return true;
            }
         }

         return false;
      }
   }

   public static v[] a(v[] var0, boolean var1) {
      if (var0 == null) {
         return null;
      } else {
         v[] var2 = new v[var0.length];
         v[] var3 = new v[var0.length];
         System.arraycopy(var0, 0, var3, 0, var0.length);
         int var6 = 0;

         for(int var4 = 0; var4 < var3.length; ++var4) {
            if (var1 && var3[var4].k > 0) {
               var2[var6] = var3[var4].a(var3[var4].k);
               ++var6;
            } else if (!var1 && var3[var4].l > 0) {
               var2[var6] = var3[var4].a(var3[var4].l);
               ++var6;
            }
         }

         v[] var7 = new v[var6];
         System.arraycopy(var2, 0, var7, 0, var6);
         if (var7.length == 0) {
            return null;
         } else {
            return var7;
         }
      }
   }

   public static v[] a(v[] var0, v[] var1) {
      int var2 = var0 == null ? 0 : var0.length;
      int var3 = var1 == null ? 0 : var1.length;
      v[] var4 = new v[var2 + var3];
      if (var2 > 0 && var3 == 0) {
         for(var3 = 0; var3 < var0.length; ++var3) {
            var4[var3] = var0[var3].a(var0[var3].k);
         }

         return var4;
      } else {
         v var10000;
         if (var3 > 0 && var2 == 0) {
            for(var3 = 0; var3 < var1.length; ++var3) {
               var4[var3] = var1[var3].a(0);
               var10000 = var4[var3];
               var2 = var1[var3].k;
               var10000.l = var2;
            }

            return var4;
         } else if (var3 == 0 && var2 == 0) {
            return null;
         } else {
            for(var3 = 0; var3 < var0.length; ++var3) {
               var4[var3] = var0[var3].a(var0[var3].k);
            }

            var3 = var2;

            for(int var6 = 0; var6 < var1.length; ++var6) {
               for(var2 = 0; var2 < var4.length; ++var2) {
                  if (var4[var2] == null) {
                     var4[var2] = var1[var6].a(0);
                     var10000 = var4[var2];
                     var2 = var1[var6].k;
                     var10000.l = var2;
                     ++var3;
                     break;
                  }

                  if (var1[var6].a(var4[var2])) {
                     var4[var2] = var1[var6].a(var4[var2].k);
                     var10000 = var4[var2];
                     var2 = var1[var6].k;
                     var10000.l = var2;
                     break;
                  }
               }
            }

            var0 = new v[var3];
            System.arraycopy(var4, 0, var0, 0, var3);

            boolean var8;
            do {
               var8 = true;

               for(int var7 = 1; var7 < var0.length; ++var7) {
                  if (var0[var7 - 1].a > var0[var7].a) {
                     v var9 = var0[var7 - 1];
                     var0[var7 - 1] = var0[var7];
                     var0[var7] = var9;
                     var8 = false;
                  }
               }
            } while(!var8);

            return var0;
         }
      }
   }

   public static v[] b(v[] var0, v[] var1) {
      if (var0 == null) {
         return var1;
      } else if (var1 == null) {
         return var0;
      } else {
         v[] var2 = new v[var1.length];

         for(int var3 = 0; var3 < var1.length; ++var3) {
            var2[var3] = var1[var3];
         }

         v[] var7 = null;
         int var6 = var2.length;

         int var4;
         int var5;
         for(var4 = 0; var4 < var0.length; ++var4) {
            for(var5 = 0; var5 < var2.length; ++var5) {
               if (var2[var5] != null && var0[var4].a == var2[var5].a) {
                  var0[var4].c(var2[var5].k);
                  --var6;
                  var2[var5] = null;
               }
            }
         }

         if (var6 <= 0) {
            return var0;
         } else {
            var7 = new v[var6];
            var4 = 0;

            for(var5 = 0; var5 < var2.length; ++var5) {
               if (var2[var5] != null) {
                  var7[var4++] = var2[var5];
               }
            }

            v[] var8 = new v[var0.length + var7.length];

            for(var6 = 0; var6 < var0.length; ++var6) {
               var8[var6] = var0[var6];
            }

            for(var6 = 0; var6 < var7.length; ++var6) {
               var8[var6 + var0.length] = var7[var6];
            }

            return var8;
         }
      }
   }

   public final boolean b() {
      return this.b == 0 || this.b == 1 || this.b == 2;
   }

   public final v a(int var1) {
      return this.a(var1, this.g);
   }

   public final v a(int var1, int var2) {
      v var4;
      v var10000 = var4 = new v(this.a, this.b, this.c);
      int var6 = this.g;
      var10000.g = var6;
      boolean var7 = this.a;
      var4.a = var7;
      var4.g = var2;
      var4.k = var1;
      return var4;
   }

   public final v a() {
      return this.a(1, this.g);
   }

   public final boolean a(v var1) {
      if (var1 == null) {
         return false;
      } else {
         return this.a == var1.a;
      }
   }

   public final String toString() {
      return ad.a(this.a);
   }

   public final boolean c() {
      return this.a;
   }

   public final void a(boolean var1) {
      this.a = var1;
   }
}
