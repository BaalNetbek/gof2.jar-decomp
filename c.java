public final class c extends bx {
   private int o;
   private int p;

   public c(int var1, ag var2, int var3, int var4, int var5, boolean var6) {
      super(6805, var2, var3, var4, var5);
      this.a = at.a.a(269);
      this.b(var6);
      this.a = new ar();
      if (var6) {
         this.a.f(30);
         this.a.e(-128, -128, 0);
         this.a.a((byte)2);
      }

      this.a.a(this.a);
      this.a.c(0, 0, 0);
      this.a.c(var3, var4, var5);
      char var7 = '鱀';
      this.a.a = (float)var7;

      for(var1 = 0; var1 < 10; ++var1) {
         (var2 = bo.a(6806)).a(this.a.a());
         var2.c((var1 + 1) * at.a.nextInt(400));
         var2.a((byte)2);
         var2.f(20 + at.a.nextInt(50));
         this.a.a(var2);
      }

      this.a(false);
   }

   public final void a(boolean var1) {
      this.o = var1 ? '願' : 0;
      this.p = 4096;
   }

   public final boolean a() {
      return this.o > 40000;
   }

   public final void a(int var1, int var2, int var3) {
      this.l = var1;
      this.m = var2;
      this.n = var3;
      this.a.c(var1, var2, var3);
   }

   public final void a() {
      if (this.l) {
         at.a.a((ah)this.a);
      }

   }

   public final void a(long var1) {
      if (this.l) {
         this.o = (int)((long)this.o + var1);
         int var2;
         int var5;
         if (this.o < 0) {
            this.p = 4096 - (int)((float)(-this.o) / 3000.0F * 4096.0F);
            if (this.o >= 0) {
               this.p = 4096;
            }
         } else if (this.o > 40000) {
            if ((var5 = bl.a()) == 40 || var5 == 42) {
               this.o = 40000;
            }

            this.p = 4096 - (int)((float)(this.o - '鱀') / 3000.0F * 4096.0F);
            if (this.o > 43000) {
               if (!bl.c() && !bl.a().a()) {
                  this.l = false;
                  this.a.a(false);
               } else {
                  this.o = -3000;
                  var2 = (20000 + at.a.nextInt(40000)) * (at.a.nextInt(2) == 0 ? 1 : -1);
                  int var3 = (20000 + at.a.nextInt(40000)) * (at.a.nextInt(2) == 0 ? 1 : -1);
                  int var4 = (20000 + at.a.nextInt(40000)) * (at.a.nextInt(2) == 0 ? 1 : -1);
                  if (var5 == 29 || var5 == 41) {
                     this.a = this.a.a().a();
                     var2 += this.a.a + var2 * 3;
                     var3 += this.a.b + var3 * 3;
                     var4 += this.a.c + var4 * 3;
                  }

                  this.a(var2, var3, var4);
                  if (this.a.a().j()) {
                     this.a.a().a().a(6, this.a.a());
                     this.a.a().a((p)null);
                  }
               }
            }
         }

         this.a = at.a.a().b(this.a);
         this.b.a(this.l, this.m, this.n);
         this.b.c(this.a, c);
         if ((var5 = c.a()) > 28000) {
            c.a();
            c.a(28000);
            c.b(this.a);
            this.a.b(c);
            var2 = (int)(28000.0F / (float)var5 * (float)this.p);
            this.a.f(var2, var2, var2);
         } else {
            this.a.f(this.p, this.p, this.p);
            this.a.c(this.l, this.m, this.n);
         }

         c = this.a.a();
         this.a.c(c);
         this.a.a();
         c.a(0, 4096, 0);
         this.b = c.a(this.a, this.b);
         this.b.a();
         (c = this.b.a(this.a, c)).a();
         this.a.a(this.b, c, this.a);
      }

   }

   public final cc a(cc var1) {
      var1.a = this.l;
      var1.b = this.m;
      var1.c = this.n;
      return var1;
   }
}
