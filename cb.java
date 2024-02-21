public final class cb extends bx {
   private final int[] b = new int[]{-10, -791, -1776, 2509, 3625, 22248, -18, -786, 2466, 2499, 4681, 30734, -10, -1851, 29, 7568, 13971, 7568, 21, -2629, -6, 8627, 15527, 8627, 21, -9152, -7, 20335, 28573, 20340, -192, -1795, 0, 11008, 13859, 13952, 0, -2268, -7, 19164, 14804, 19177, -1250, -4456, 1261, 15033, 19181, 15027, -11, 3719, -29, 2512, 12400, 25744, 18, -729, 0, 2499, 3502, 16384, 18, -729, 0, 2499, 3502, 8192, 10, 13, -4, 11307, 10240, 11305, 0, -7924, 0, 19284, 26417, 19284, 10, 571, -4, 26296, 10240, 26296, 0, -1179, 0, 12650, 11632, 12650, -20, -648, 3, 21118, 12522, 11317, -1004, -659, 3, 15913, 11559, 11389, -2, -940, 7, 11358, 7008, 7610, 11, -1241, -970, 11392, 8260, 9453, -839, -3912, 2790, 13113, 12952, 13093, 21, 1102, 28, 12370, 7866, 12443, -356, 3009, 455, 15605, 16258, 15792, -10, 135, -2, 10652, 10483, 10652, -10, 3533, -2, 11360, 17279, 11360, 3, 1034, -8, 16067, 12281, 16067, -30, -1170, 1263, 17529, 15612, 20229, 37, -1069, 0, 33845, 11291, 33770, -10, 1016, -2, 7641, 12244, 7631, 1, 2565, 28, 11733, 15342, 7568, -10, 6381, 22, 7568, 22975, 7582, -1783, 7259, 22, 11115, 24731, 7582, 1117, 6019, 22, 11364, 22251, 7582, 18, -459, 16, 2499, 4043, 16350, 0, 0, 0, 1940, 1940, 1940, 0, 0, 0, 1940, 1940, 1940, 0, -5143, 0, 55879, 69796, 55879, 0, -4444, 0, 22222, 55555, 22222, -9617, 8646, -9617, 11781, 10784, 11781, 0, -15497, 0, 4866, 13737, 5263, 0, -4021, 0, 11493, 9778, 11493, 0, 12391, 0, 16896, 10793, 16896, 0, 3931, 0, 11240, 6126, 11240, -10361, 25852, -11525, 25379, 16129, 23051, 0, 0, 0, 0, 0, 0};
   private ag[] a;
   private int[] c;
   private int o;
   private int p;

   public cb(bd var1) {
      super(-1, (ag)null, 0, 0, 0);
      this.a.a(15000);
      new av();
      int[] var2 = null;
      if (!bl.c()) {
         var2 = av.a(var1.b(), bl.a().c());
      }

      int var3;
      int var4;
      if (var2 == null) {
         this.a = new ag[1];
         ag[] var10000 = this.a;
         bl.c();
         var10000[0] = bo.a(3337);
         this.a[0].a(2);
      } else {
         this.a = new ag[var2.length / 7];

         for(int var7 = 0; var7 < this.a.length; ++var7) {
            var3 = var7 * 7;
            this.a[var7] = bo.a(var2[var3]);
            this.a[var7].a((short)0);
            this.a[var7].c(var2[var3 + 1], var2[var3 + 2], var2[var3 + 3]);
            this.a[var7].e(var2[var3 + 4], var2[var3 + 5], var2[var3 + 6]);
            this.a[var7].a(2);
            if (this.a[var7].a() == 3334 || this.a[var7].a() == 3335) {
               this.a[var7].a(false);
            }

            ((bg)this.a[var7]).a(ad.a + "stat_all.mtra");
            this.d = bl.a().c();
            var4 = this.d == 8 ? 0 : (this.d == 0 ? 1 : (this.d == 2 ? 2 : 3));
            this.a[var7].a(var4, var4);
            this.a[var7].a((byte)1);
         }
      }

      this.p = 0;
      this.a = new y[this.a.length];
      cm var8 = new cm();

      for(var3 = 0; var3 < this.a.length; ++var3) {
         var4 = (this.a[var3].a() - 3301) * 6;
         this.a = this.a[var3].a(this.a);
         if (g.e(this.a.a) > this.p) {
            this.p = g.e(this.a.a);
         }

         if (g.e(this.a.b) > this.p) {
            this.p = g.e(this.a.b);
         }

         if (g.e(this.a.c) > this.p) {
            this.p = g.e(this.a.c);
         }

         int var9 = this.a.a;
         int var5 = this.a.b;
         int var6 = this.a.c;
         var8.d(this.a[var3].f(), this.a[var3].g(), this.a[var3].h());
         c.a(this.b[var4], this.b[var4 + 1], this.b[var4 + 2]);
         this.b = var8.c(c, this.b);
         c.a(this.b[var4 + 3] + 5000, this.b[var4 + 4] + 5000, this.b[var4 + 5] + 5000);
         this.a = var8.c(c, this.a);
         this.a[var3] = new ct(var9, var5, var6, this.b.a, this.b.b, this.b.c, this.a.a, this.a.b, this.a.c);
         if (bl.a() != null) {
            var2 = ad.a(bl.a().c());
            this.a[var3].a(var2[0], var2[1]);
            this.a[var3].e();
         }
      }

      this.p += 5000;
      this.c = new int[this.a.length * 3];

      for(var3 = 0; var3 < this.a.length; ++var3) {
         this.c[var3 * 3] = this.a[var3].b();
         this.c[var3 * 3 + 1] = this.a[var3].c();
         this.c[var3 * 3 + 2] = this.a[var3].d();
      }

   }

   public final void a(long var1) {
      if (this.a != null) {
         for(int var3 = 0; var3 < this.a.length; ++var3) {
            this.a = at.a.a().b(this.a);
            this.b.a(this.c[var3 * 3], this.c[var3 * 3 + 1], this.c[var3 * 3 + 2]);
            this.b.c(this.a, c);
            int var2;
            if ((var2 = c.a()) > 20000) {
               c.a();
               c.a(20000);
               c.b(this.a);
               this.a[var3].b(c);
               var2 = (int)(20000.0F / (float)var2 * 4096.0F);
               this.a[var3].f(var2, var2, var2);
            } else {
               this.a[var3].f(4096, 4096, 4096);
               this.a[var3].c(this.c[var3 * 3], this.c[var3 * 3 + 1], this.c[var3 * 3 + 2]);
            }
         }

      }
   }

   public final void a() {
      if (this.a != null) {
         for(int var1 = 0; var1 < this.a.length; ++var1) {
            at.a.a((ah)this.a[var1]);
         }

      }
   }

   public final cc a(cc var1) {
      var1.a(0, 0, 0);
      return var1;
   }

   public final boolean a(int var1, int var2, int var3) {
      return (float)var1 < this.a.a && (float)var1 > -this.a.a && (float)var2 < this.a.a && (float)var2 > -this.a.a && (float)var3 < this.a.a && (float)var3 > -this.a.a;
   }

   public final boolean a(cc var1) {
      int var4 = var1.c;
      int var3 = var1.b;
      int var2 = var1.a;
      cb var6 = this;
      if (var2 < this.p && var2 > -this.p && var3 < this.p && var3 > -this.p && var4 < this.p && var4 > -this.p && this.a != null) {
         for(int var5 = 0; var5 < var6.a.length; ++var5) {
            if (var6.a[var5].b(var2, var3, var4)) {
               var6.o = var5;
               return true;
            }
         }
      }

      return false;
   }

   public final cc b(cc var1) {
      return this.a != null ? this.a[this.o].a(var1) : null;
   }

   public final void b() {
      if (this.a != null) {
         for(int var1 = 0; var1 < this.a.length; ++var1) {
            if (this.a[var1] != null) {
               this.a[var1].a();
               this.a[var1] = null;
            }
         }
      }

      this.a = null;
      this.c = null;
   }
}
