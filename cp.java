public final class cp implements cu {
   private ah a;
   private ah b;
   private int a;
   private ah c;
   private static cc a;
   private static cc b;
   private static cc c;
   private cc d;
   private boolean a;

   public cp(ah var1, ah var2) {
      this(var1, var2, (cc)null, 0);
   }

   private cp(ah var1, ah var2, cc var3, int var4) {
      this.a = var1;
      this.c = var2;
      this.a = 0;
      this.a = true;
      this.d = null;
      if (a == null) {
         a = new cc();
      }

      if (b == null) {
         b = new cc();
      }

      if (c == null) {
         c = new cc();
      }

      for(this.b = var1; this.b.a() != null; this.b = this.b.a()) {
      }

      Object var5;
      for(var5 = var2; ((ah)var5).a() != null; var5 = ((ah)var5).a()) {
      }

      if (var5 == this.b) {
         this.b = null;
      }

   }

   public final void a(ah var1) {
      this.a = var1;
   }

   public final void b(ah var1) {
      this.c = var1;
   }

   public final void a(cc var1, int var2) {
      this.d = var1;
      this.a = var2;
      if (var1 != null) {
         this.d.a();
      }

   }

   public final void c() {
      if (this.a) {
         if (this.b != null) {
            this.b.b(false);
         }

         a = this.a.b(a);
         a = this.c.a().b().f(a);
         (b = this.c.a(b)).c(a);
         b.a();
         if (this.d != null) {
            c.a(this.d);
         } else {
            c.a(0, 4096, 0);
         }

         (a = c.a(b, a)).a();
         if (g.e(a.a + a.b + a.c) < 4) {
            c.a(4096, 0, 0);
            (a = c.a(b, a)).a();
         }

         switch(this.a) {
         case 0:
         case 2:
            c = b.a(a, c);
            break;
         case 1:
            b = a.a(c, b);
         }

         this.c.a(a, c, b);
      }

   }

   public final boolean a() {
      return this.a;
   }

   public final void a(boolean var1) {
      this.a = var1;
   }
}
