public final class ak extends p {
   private y[] a;
   private long a;
   private boolean m;
   private cc c = new cc();
   private cc d = new cc();
   private cc e = new cc();
   private cc f = new cc();
   private cc g = new cc();
   private aa b;
   private int l;
   private boolean n;
   private int m;
   private cc[] a;
   private cc[] b;
   private int n;
   private int o;
   private int p;

   public ak(int var1, int var2, aa var3, ag var4, int var5, int var6, int var7) {
      super(var1, var2, var3, (ag)null, var5, var6, var7);
      this.c.a(var5, var6, var7);
      this.n = var5;
      this.o = var6;
      this.p = var7;
      this.m = false;
      if (!bl.a().g() || bl.a() != 40 && bl.a() != 41) {
         be var8 = new be();
         this.a = var8.a();
         if (this.a != null) {
            for(var2 = 0; var2 < this.a.length; var2 += 2) {
               int[] var10000;
               if (var1 == 14) {
                  var10000 = this.a;
                  var10000[var2 + 1] *= 5 + at.a.nextInt(8);
               } else {
                  var10000 = this.a;
                  var10000[var2 + 1] *= 1 + at.a.nextInt(4);
               }
            }
         }
      } else {
         this.a = null;
      }

      this.a.e = true;
   }

   public final void b() {
      super.b();
      this.a = null;
      this.b = null;
      this.c = null;
      this.d = null;
      this.e = null;
      this.f = null;
   }

   public final void a(boolean var1) {
      this.m = var1;
   }

   public final void a(int var1, int var2, int var3) {
      this.n = var1;
      this.o = var2;
      this.p = var3;
      this.e = var1;
      this.f = var2;
      this.g = var3;
      this.a.c(var1, var2, var3);
      this.a.a = this.a.a();
      this.c = this.a.b(this.c);
      this.d = this.a.b(this.d);
      if (this.a != null) {
         for(var1 = 0; var1 < this.a.length; ++var1) {
            this.a[var1].a(this.a.a.a(), this.a.a.b(), this.a.a.c());
         }
      }

   }

   public final void a(y[] var1) {
      this.a = var1;
   }

   public final cc a(cc var1) {
      var1.a(this.n, this.o, this.p);
      return var1;
   }

   public final void c(int var1) {
      this.p += var1;
      this.a.b(var1);
      this.a.a = this.a.a();
      this.c = this.a.b(this.c);
      if (this.a != null) {
         for(var1 = 0; var1 < this.a.length; ++var1) {
            this.a[var1].a(this.a.a.a(), this.a.a.b(), this.a.a.c());
         }
      }

   }

   public final void a(long var1) {
      this.a = var1;
      this.a.a(var1);
      this.a.a = this.d != 8 && this.d != 9 ? bl.a().a(this.d) : true;
      this.a.b = this.d != 8 && this.d != 9 ? bl.a().b(this.d) : false;
      if (this.a.c()) {
         this.a.a = true;
         this.a.b = false;
      }

      if (this.a.b()) {
         this.a.b = true;
         this.a.a = false;
      }

      if (this.a != 6) {
         float var3 = this.a.a();
         float var4 = this.a.b();
         if (var3 > 0.0F) {
            if ((var3 *= 0.98F) < 0.05F) {
               var3 = 0.0F;
            }

            this.a.b(var3);
         }

         if (var4 > 0.0F) {
            this.j = true;
            if ((var4 -= (float)var1) < 0.05F) {
               var4 = 0.0F;
               this.j = false;
            }

            this.a.c(var4);
         }
      }

      if (!this.j && this.m && this.a != 3 && this.a != 4) {
         this.c((int)var1);
      }

      this.a = at.a.a().b(this.a);
      this.b.a(this.n, this.o, this.p);
      this.b.c(this.a, this.g);
      int var6;
      int var9;
      if ((var6 = this.g.a()) > 28000) {
         this.a.a(this.a.a());
         this.g.a();
         this.g.a(28000);
         this.g.b(this.a);
         this.a.b(this.g);
         var9 = (int)(28000.0F / (float)var6 * 4096.0F);
         this.a.f(var9, var9, var9);
      } else {
         this.a.f(4096, 4096, 4096);
         this.a.c(this.n, this.o, this.p);
      }

      ah var8;
      if (this.a.e() <= 0 && this.a != 3 && this.a != 4) {
         if (this.a.a) {
            this.a.a(this.a.d);
         } else {
            this.a.c();
         }

         this.a = 3;
         if (this.a != null) {
            this.b = this.a.b(this.b);
            this.a.a(this.b.a, this.b.b, this.b.c);
         }

         this.d = this.g();
         if (this.d) {
            this.b(0);
         }

         boolean var7 = false;

         for(var8 = this.a.a(); var8 != null; var8 = var8.b()) {
            if (var8.a() == 13067 || var8.a() == 13068 || var8.a() == 13070 || var8.a() == 13064 || var8.a() == 13065 || var8.a() == 13071) {
               var8.a(false);
            }
         }

         at.a.d(1);
         this.m = 10000;
         var9 = 0;

         for(var8 = this.a.a(); var8 != null; var8 = var8.b()) {
            ++var9;
         }

         this.n = var9 > 3;
         this.a = new cc[var9];
         this.b = new cc[var9];
         var6 = 0;

         for(ah var5 = this.a.a(); var5 != null; var5 = var5.b()) {
            this.a = var5.a().a(this.a);
            this.a.a();
            this.a.a(100 + at.a.nextInt(100));
            this.a[var6] = new cc(this.a);
            this.b[var6] = new cc(-10 + at.a.nextInt(20), -10 + at.a.nextInt(20), -10 + at.a.nextInt(20));
            ++var6;
         }
      }

      boolean var11 = false;
      int var10;
      switch(this.a) {
      case 3:
         var11 = true;
         if (this.a != null) {
            if (this.a.b()) {
               this.a = 4;
            }
         } else {
            this.a = 4;
         }
         break;
      case 4:
         var11 = true;
         this.h = (int)((long)this.h + var1);
         if (this.d && this.a.d() && this.b != null) {
            var6 = (int)var1 >> 1;
            this.b.d(var6, var6, var6);
            if (this.h > 45000 && this.a != null) {
               if (this.h < 90000) {
                  this.a.a(this.c.a, this.c.b, this.c.c);
                  if (this.a.a().a.b == this) {
                     this.a.a().a.b = null;
                  }

                  this.h = 90000;
               } else if (this.a.b()) {
                  this.b = null;
                  this.h = 0;
                  this.d(false);
               }
            }
         } else if (this.h > 45000) {
            this.d(false);
         }
         break;
      case 5:
         aa[] var12;
         if (this.a != 4 && this.a != 3 && (var12 = this.a.a()) != null) {
            this.b = null;

            for(var10 = 0; var10 < var12.length; ++var10) {
               if (var12[var10].d()) {
                  this.a = var12[var10].a(this.a);
                  if (this.c.a - this.a.a < 50000 && this.c.a - this.a.a > -50000 && this.c.b - this.a.b < 50000 && this.c.b - this.a.b > -50000 && this.c.c - this.a.c < 50000 && this.c.c - this.a.c > -50000) {
                     this.b = this.a.a(var10);
                     this.a = this.b.a(this.a);
                     this.e.a = this.a.a;
                     this.e.b = this.a.b;
                     this.e.c = this.a.c;
                     break;
                  }
               }
            }
         }

         this.f.a = this.e.a - this.c.a;
         this.f.b = this.e.b - this.c.b;
         this.f.c = this.e.c - this.c.c;
         if (this.f.a < 50000 && this.f.a > -50000 && this.f.b < 50000 && this.f.b > -50000 && this.f.c < 50000 && this.f.c > -50000) {
            this.a = 1;
            this.a.e(true);
         }
      }

      if (var11) {
         var6 = (int)var1 >> 1;
         this.m -= var6;
         if (this.m < 0) {
            this.m = 0;
         }

         var10 = 1;

         for(var8 = this.a.a(); var8 != null; var8 = var8.b()) {
            this.a[var10 - 1].a(4096 - (int)var1);
            var8.a(this.a[var10 - 1]);
            var8.d(this.b[var10 - 1].a, this.b[var10 - 1].b, this.b[var10 - 1].c);
            ++var10;
         }
      }

      this.a.a = this.n;
      this.a.b = this.o;
      this.a.c = this.p;
   }

   public final void a() {
      if (this.b != null) {
         at.a.a((ah)this.b);
      }

      if (this.a == 3 || this.a == 4) {
         if (this.a != null && !this.a.b()) {
            this.a.a(this.a);
         }

         if (this.n) {
            at.a.a((ah)this.a);
            return;
         }
      }

      if (this.a.d()) {
         at.a.a((ah)this.a);
      }
   }

   public final boolean a(int var1, int var2, int var3) {
      if (this.a != 4 && this.a != 4) {
         for(int var4 = 0; var4 < this.a.length; ++var4) {
            if (this.a[var4].a(var1, var2, var3)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   public final cc b(cc var1) {
      return this.a != null ? this.a[this.l].a(var1) : null;
   }

   public final boolean a(cc var1) {
      int var4 = var1.c;
      int var3 = var1.b;
      int var2 = var1.a;
      ak var6 = this;
      if (this.a != 4) {
         for(int var5 = 0; var5 < var6.a.length; ++var5) {
            if (var6.a[var5].b(var2, var3, var4)) {
               var6.l = var5;
               return true;
            }
         }
      }

      return false;
   }
}
