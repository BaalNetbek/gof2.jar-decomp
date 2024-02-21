public class bx extends u {
   protected y[] a;

   public bx(int var1, ag var2, int var3, int var4, int var5) {
      super(var1, var2, var3, var4, var5);
      this.e = var3;
      this.f = var4;
      this.g = var5;
      if (var2 != null) {
         short var6 = 7500;
         this.a.a = (float)var6;
         this.a.a(2);
      }
   }

   public void a() {
      super.a();
   }

   public void a(long var1) {
      if (this.a != null) {
         this.a = at.a.a().b(this.a);
         this.b.a(this.l, this.m, this.n);
         this.b.c(this.a, c);
         int var3;
         if ((var3 = c.a()) > 28000) {
            c.a();
            c.a(28000);
            c.b(this.a);
            this.a.b(c);
            var3 = (int)(28000.0F / (float)var3 * 4096.0F);
            this.a.f(var3, var3, var3);
         } else {
            this.a.f(4096, 4096, 4096);
            this.a.c(this.l, this.m, this.n);
         }
      }
   }

   public boolean a(int var1, int var2, int var3) {
      return (float)(var1 - this.l) < this.a.a && (float)(var1 - this.l) > -this.a.a && (float)(var2 - this.m) < this.a.a && (float)(var2 - this.m) > -this.a.a && (float)(var3 - this.n) < this.a.a && (float)(var3 - this.n) > -this.a.a;
   }

   public final cc c(cc var1) {
      var1.a = this.e;
      var1.b = this.f;
      var1.c = this.g;
      return var1;
   }

   public boolean a(cc var1) {
      return this.a(var1.a, var1.b, var1.c);
   }

   public cc b(cc var1) {
      return this.a != null ? this.a[0].a(var1) : null;
   }
}
