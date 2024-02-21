public final class by {
   private cc a = new cc();
   private cc b = new cc();
   private cc c = new cc();
   private cc d = new cc();
   private p a = null;
   private static int[][] a = new int[][]{{16, 13, 47, 19}, {16, 13, 47, 19}, {16, 13, 47, 19}};
   private int a = 100;
   private int[] a;
   private int[] b;
   private int[] c;
   private boolean a = false;
   private boolean b = false;
   private ag a = ag.a(0, 10, (byte)2);

   public by(ar var1, int var2) {
      this.a.a(bo.a(0));
      this.a.a(2);
      this.b = new int[120];
      this.a = new int[120];
      this.c = new int[80];

      for(int var3 = 0; var3 < this.c.length; var3 += 8) {
         this.c[var3] = a[var2][0];
         this.c[var3 + 1] = a[var2][1];
         this.c[var3 + 2] = a[var2][2];
         this.c[var3 + 3] = a[var2][1];
         this.c[var3 + 4] = a[var2][2];
         this.c[var3 + 5] = a[var2][3];
         this.c[var3 + 6] = a[var2][0];
         this.c[var3 + 7] = a[var2][3];
      }

   }

   public final void a() {
      if (this.a) {
         at.a.a((ah)this.a);
      }

   }

   public final void a(long var1, bw var3, db var4, x var5) {
      p var6 = var3.b;
      if (this.a != null || var6 != null) {
         if (this.a == null) {
            if (!var6.g()) {
               return;
            }

            if (var6.b == null) {
               var6.b(0);
            }

            this.a = var6.b.a(this.a);
            this.a.c(var4.a().a());
            if (var6.e() || var6.f()) {
               var6.d(false);
            }

            this.a = var6;
            this.a = true;
            return;
         }

         if (this.a.b == null) {
            var3.b = null;
            var3.a = null;
            this.b = false;
            return;
         }

         this.b = this.a.b.b(this.b);
         this.c = var4.a().a.b(this.c);
         this.a = this.b.c(this.c, this.a);
         this.d.a(this.a);
         this.b = var4.a().a.c(this.b);
         this.b.a(1024);
         this.c.b(this.b);
         cc var10000 = this.d;
         var10000.a /= 10;
         var10000 = this.d;
         var10000.b /= 10;
         var10000 = this.d;
         var10000.c /= 10;

         int var7;
         int var8;
         for(var7 = 0; var7 < this.b.length >> 1; var7 += 12) {
            var8 = var7 / 12;
            this.b[var7] = this.c.a + var8 * this.d.a + this.a;
            this.b[var7 + 1] = this.c.b + var8 * this.d.b;
            this.b[var7 + 2] = this.c.c + var8 * this.d.c;
            this.b[var7 + 3] = this.c.a + var8 * this.d.a - this.a;
            this.b[var7 + 4] = this.c.b + var8 * this.d.b;
            this.b[var7 + 5] = this.c.c + var8 * this.d.c;
            this.b[var7 + 6] = this.c.a + (var8 + 1) * this.d.a - this.a;
            this.b[var7 + 7] = this.c.b + (var8 + 1) * this.d.b;
            this.b[var7 + 8] = this.c.c + (var8 + 1) * this.d.c;
            this.b[var7 + 9] = this.c.a + (var8 + 1) * this.d.a + this.a;
            this.b[var7 + 10] = this.c.b + (var8 + 1) * this.d.b;
            this.b[var7 + 11] = this.c.c + (var8 + 1) * this.d.c;
         }

         for(var7 = this.b.length >> 1; var7 < this.b.length; var7 += 12) {
            var8 = (var7 - (this.b.length >> 1)) / 12;
            this.b[var7] = this.c.a + var8 * this.d.a;
            this.b[var7 + 1] = this.c.b + var8 * this.d.b + this.a;
            this.b[var7 + 2] = this.c.c + var8 * this.d.c + this.a;
            this.b[var7 + 3] = this.c.a + var8 * this.d.a;
            this.b[var7 + 4] = this.c.b + var8 * this.d.b - this.a;
            this.b[var7 + 5] = this.c.c + var8 * this.d.c - this.a;
            this.b[var7 + 6] = this.c.a + (var8 + 1) * this.d.a;
            this.b[var7 + 7] = this.c.b + (var8 + 1) * this.d.b - this.a;
            this.b[var7 + 8] = this.c.c + (var8 + 1) * this.d.c - this.a;
            this.b[var7 + 9] = this.c.a + (var8 + 1) * this.d.a;
            this.b[var7 + 10] = this.c.b + (var8 + 1) * this.d.b + this.a;
            this.b[var7 + 11] = this.c.c + (var8 + 1) * this.d.c + this.a;
         }

         for(var7 = 0; var7 < this.b.length; var7 += 3) {
            this.a[var7] = this.b[var7] - this.c.a;
            this.a[var7 + 1] = this.b[var7 + 1] - this.c.b;
            this.a[var7 + 2] = this.b[var7 + 2] - this.c.c;
         }

         this.a.c(this.c.a, this.c.b, this.c.c);
         ((k)this.a).a(this.a, this.c);
         if (this.a.a() <= 400) {
            this.a.a(var5);
            this.a = false;
            this.a = null;
            var3.b = null;
            var3.a = null;
            this.b = false;
            return;
         }

         var3.b = null;
         this.a.a();
         this.a.a((int)var1 * 10);
         this.a.b.b(-this.a.a, -this.a.b, -this.a.c);
         if (!this.b) {
            at.a.d(2);
            this.b = true;
         }
      }

   }
}
