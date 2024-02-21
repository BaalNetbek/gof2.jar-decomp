public class n extends ag implements bm {
   protected az a;
   private ag[] a;
   protected ag a;
   protected static cc a;

   public n(az var1, ag var2) {
      this.a = var1;
      a = new cc();
      if (var2 == null) {
         this.a = null;
      } else {
         this.a = new ag[var1.a.length];

         for(int var3 = 0; var3 < this.a.length; ++var3) {
            a.a(var2.g());
            this.a[var3] = (ag)var2.a();
            this.a[var3].f(a.a, a.b, a.c);
            this.a[var3].a(2);
         }

      }
   }

   public void a() {
      this.a.a();
      this.a = null;
   }

   public void b() {
      this.a.c();
      if (this.a.b && this.a != null) {
         int var1 = 0;

         for(int var2 = 0; var2 < this.a.a.length; ++var2) {
            if (this.a.a[var2].a != 50000) {
               this.a[var2].b(this.a.a[var2]);
               a.a(this.a.b[var2]);
               a.a();
               this.a[var2].a().c(a);
               at.a.a((ah)this.a[var2]);
            } else {
               ++var1;
            }
         }

         if (var1 >= this.a.a.length) {
            this.a.b = false;
         }
      }

   }

   public void a(long var1) {
      this.a.a(var1);
   }

   public final ah a() {
      return null;
   }

   public final void a(aq var1) {
   }
}
