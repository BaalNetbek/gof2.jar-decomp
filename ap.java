public abstract class ap extends cy {
   private int f;
   private int g;
   private cc[] a = new cc[6];
   private cc[] b = new cc[6];
   private int[] a;
   private static cc a = new cc();
   private static cc b = new cc();
   private static cc c = new cc();
   protected int a;
   protected int d;
   private int h;
   private int i;

   protected ap(int var1, int var2, int var3, int var4, int var5) {
      for(int var6 = this.b.length - 1; var6 >= 0; --var6) {
         this.b[var6] = new cc();
      }

      this.a = new int[6];
      this.a[0] = new cc(0, 0, -4096);
      this.a[1] = new cc(0, 0, 4096);
      this.a[2] = new cc();
      this.a[3] = new cc();
      this.a[4] = new cc();
      this.a[5] = new cc();
      this.a = var1;
      this.d = var2;
      this.a(var3, var4, var5);
   }

   public final void b(boolean var1) {
      if (this.b || var1) {
         if (this.a != null) {
            this.c = this.a.c.a(this.b, this.c);
         } else {
            this.c.a(this.b);
         }

         this.b = this.c.a(this.a, this.b);
         a = this.c.a(a);
         b = this.c.b(b);
         c.a(b);
         b.a(-this.f);
         c.a(-this.g);
         b.b(a);
         c.b(a);
         this.a[0] = b.a(this.b[0]);
         this.a[1] = c.a(this.b[1]);
         this.a[2] = a.a(this.b[2]);
         this.a[3] = a.a(this.b[3]);
         this.a[4] = a.a(this.b[4]);
         this.a[5] = a.a(this.b[5]);
         this.b = false;
         this.c = false;
      }

   }

   public void a(int var1, int var2, int var3) {
      this.f = var2;
      this.g = var3;
      var2 = g.a(var1 >> 1);
      var1 = g.b(var1 >> 1);
      this.a[2].a(var1, 0, -var2);
      this.a[3].a(-var1, 0, -var2);
      this.a[4].a(0, -var1, -var2);
      this.a[5].a(0, var1, -var2);
      this.h = (var2 << 12) / var1;
      this.i = this.h * ((this.a << 12) / this.d) >> 12;
   }

   public final void a(int var1) {
      this.a(var1, this.f, this.g);
   }

   public final boolean a(cc var1) {
      if ((var1 = this.c.f(var1)).c > this.f) {
         return false;
      } else {
         int var2 = this.i * var1.c >> 12;
         int var3 = this.h * var1.c >> 12;
         if (var2 != 0 && var3 != 0) {
            var1.a = -((var1.a << 11) / var2 * this.a >> 12) + (this.a >> 1);
            var1.b = ((var1.b << 11) / var3 * this.d >> 12) + (this.d >> 1);
            return var1.a >= 0 && var1.b >= 0 && var1.a < this.a && var1.b < this.d;
         } else {
            return false;
         }
      }
   }

   public final byte a(am var1) {
      for(int var3 = 5; var3 >= 0; --var3) {
         int var2;
         if ((var2 = var1.a.a(this.b[var3]) - this.a[var3]) < -var1.a) {
            return 0;
         }

         if (g.e(var2) < var1.a) {
            return 1;
         }
      }

      return 2;
   }

   public final void a(ap var1, af var2) {
   }

   public final void b(ap var1, af var2) {
   }

   public static ap a(int var0, int var1, int var2, int var3, int var4) {
      return new j(var0, var1, var2, var3, var4);
   }
}
