public final class o extends ag implements bm {
   private az a;
   private int d = 80;
   private ag a;
   private ag b;
   private int[] a;
   private int[] b;
   private int[] c;
   private static cc a;
   private static cc b;
   private static cc c;
   private cc d;
   private static int[][] a = new int[][]{{16, 13, 47, 19}, {32, 235, 65, 242}, {17, 54, 30, 58}};
   private static int[] d = new int[]{0, 1, 9};
   private db a;
   private boolean d;

   public o(az var1, int var2, db var3) {
      this.a = var3;
      this.a = var1;
      a = new cc();
      b = new cc();
      c = new cc();
      this.d = new cc();
      var2 -= 9;
      this.b = bo.a(6781);
      this.b.a(2);
      this.b.a(d[var2], d[var2]);
      this.b.a((byte)1);
      this.b.f(600, 600, 600);
      this.a = ag.a(0, 10, (byte)2);
      this.a.a(bo.a(0));
      this.a.a(2);
      this.b = new int[120];
      this.a = new int[120];
      this.c = new int[80];

      for(int var4 = 0; var4 < this.c.length; var4 += 8) {
         this.c[var4] = a[var2][0];
         this.c[var4 + 1] = a[var2][1];
         this.c[var4 + 2] = a[var2][2];
         this.c[var4 + 3] = a[var2][1];
         this.c[var4 + 4] = a[var2][2];
         this.c[var4 + 5] = a[var2][3];
         this.c[var4 + 6] = a[var2][0];
         this.c[var4 + 7] = a[var2][3];
      }

      this.d = false;
   }

   public final void a() {
      this.a.a();
      this.a = null;
      if (this.a != null) {
         this.a.a();
      }

      this.a = null;
   }

   public final void b() {
      if (!this.a.b) {
         this.d = false;
      } else {
         if (!this.d && this.a.b) {
            b.a(da.a);
            this.d = true;
         }

         cm var1 = this.a.a().a.a();
         this.d.a(var1.a(a));
         if (this.a.a != null) {
            a.a(this.a.a);
            c = var1.c(a, c);
            this.d.b(c);
         }

         this.b.e(var1.g(), var1.h(), var1.i());
         this.b.b(this.d);
         a.a(this.d);
         cc var10000 = c = b.c(a, c);
         var10000.a /= 10;
         var10000 = c;
         var10000.b /= 10;
         var10000 = c;
         var10000.c /= 10;

         int var2;
         int var3;
         for(var3 = 0; var3 < this.b.length >> 1; var3 += 12) {
            var2 = var3 / 12;
            this.b[var3] = a.a + var2 * c.a + this.d;
            this.b[var3 + 1] = a.b + var2 * c.b;
            this.b[var3 + 2] = a.c + var2 * c.c;
            this.b[var3 + 3] = a.a + var2 * c.a - this.d;
            this.b[var3 + 4] = a.b + var2 * c.b;
            this.b[var3 + 5] = a.c + var2 * c.c;
            this.b[var3 + 6] = a.a + (var2 + 1) * c.a - this.d;
            this.b[var3 + 7] = a.b + (var2 + 1) * c.b;
            this.b[var3 + 8] = a.c + (var2 + 1) * c.c;
            this.b[var3 + 9] = a.a + (var2 + 1) * c.a + this.d;
            this.b[var3 + 10] = a.b + (var2 + 1) * c.b;
            this.b[var3 + 11] = a.c + (var2 + 1) * c.c;
         }

         for(var3 = this.b.length >> 1; var3 < this.b.length; var3 += 12) {
            var2 = (var3 - (this.b.length >> 1)) / 12;
            this.b[var3] = a.a + var2 * c.a;
            this.b[var3 + 1] = a.b + var2 * c.b + this.d;
            this.b[var3 + 2] = a.c + var2 * c.c + this.d;
            this.b[var3 + 3] = a.a + var2 * c.a;
            this.b[var3 + 4] = a.b + var2 * c.b - this.d;
            this.b[var3 + 5] = a.c + var2 * c.c - this.d;
            this.b[var3 + 6] = a.a + (var2 + 1) * c.a;
            this.b[var3 + 7] = a.b + (var2 + 1) * c.b - this.d;
            this.b[var3 + 8] = a.c + (var2 + 1) * c.c - this.d;
            this.b[var3 + 9] = a.a + (var2 + 1) * c.a;
            this.b[var3 + 10] = a.b + (var2 + 1) * c.b + this.d;
            this.b[var3 + 11] = a.c + (var2 + 1) * c.c + this.d;
         }

         for(var3 = 0; var3 < this.b.length; var3 += 3) {
            this.a[var3] = this.b[var3] - a.a;
            this.a[var3 + 1] = this.b[var3 + 1] - a.b;
            this.a[var3 + 2] = this.b[var3 + 2] - a.c;
         }

         this.a.c(a.a, a.b, a.c);
         ((k)this.a).a(this.a, this.c);
         at.a.a((ah)this.b);
         at.a.a((ah)this.a);
         if (this.a.a[0] <= 0) {
            this.a.b = false;
         }

      }
   }

   public final void a(long var1) {
      this.a.a(var1);
      if (this.a.b) {
         this.d -= (int)var1 >> 2;
         if (this.d < 0) {
            this.d = 0;
            this.a.b = false;
            return;
         }
      } else {
         this.d = 150;
      }

   }

   public final ah a() {
      return null;
   }

   public final void a(aq var1) {
   }
}
