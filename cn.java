public final class cn extends p {
   private static cc c = new cc();
   private static cc d = new cc();
   private int m;
   private int n;
   private int o;
   private int p;
   private boolean n;
   private int q;
   private int r;
   private int s;
   private int t;
   private static cc e;
   private boolean o;
   private cm a = new cm();
   private int u;
   private int v;
   private ag d;
   public boolean m;
   public int l;

   public cn(int var1, ag var2, int var3, boolean var4, int var5, int var6, int var7) {
      super(var1, -1, new aa(1500.0F, 30, 0, 0, 0), var2, var5, var6, var7);
      this.a.a((p)this);
      this.l = var3;
      this.n = var5;
      this.o = var6;
      this.p = var7;
      d.a(var5, var6, var7);
      this.n = var4;
      this.m = false;
      this.q = 1024 + at.a.nextInt(2448);
      this.r = 1024 + at.a.nextInt(2448);
      this.s = 1024 + at.a.nextInt(2448);
      this.u = (int)((float)((this.q + this.r + this.s) / 3) / 3072.0F * 100.0F);
      this.a.e(30 + (int)((float)this.u / 100.0F * 100.0F));
      this.v = g.c(7, 2 + (int)((float)(this.u + 15) / 100.0F * 5.0F));
      this.a.a(-4096 + at.a.nextInt(8192), -4096 + at.a.nextInt(8192), -4096 + at.a.nextInt(8192));
      this.a.a();
      this.a.a().c(this.a);
      this.a.b(d);
      this.a.b(true);
      this.a.a(var3 - 154, var3 - 154);
      this.a.e();
      this.o = true;
      this.b = true;
      this.d = true;
      this.a = 0;
   }

   public final void b() {
      super.b();
      this.d = null;
   }

   public final int b() {
      return this.u;
   }

   public final int c() {
      return this.v;
   }

   public final int d() {
      return 7 - this.v;
   }

   public final void a(cc var1) {
      e = var1;
      if (this.n) {
         this.g();
      }

   }

   public final void a(boolean var1) {
      this.o = var1;
   }

   public final void a(long var1) {
      this.m = (int)var1;
      if (!this.a.d()) {
         this.m = false;
      } else {
         this.t += this.m;
         int var6;
         int var7;
         if (this.a.e() <= 0 && this.a == 0) {
            d = this.a.a(d);
            if (this.d == null) {
               this.d = bo.a(6782);
               this.d.a(2);
               this.d.f(100);
               this.a.a((p)this);
            }

            this.d.a(this.a.a());
            this.d.a((byte)1);
            this.a.a = this.d.a();
            d.c(this.a.a().a());
            var7 = g.c(40000, d.a());
            float var5 = 1.0F - (float)var7 / 40000.0F;
            var6 = at.a.a();
            at.a.a(5, (int)((float)var6 * var5));
            this.a.a(this.a.b(), this.a.c(), this.a.d());
            this.a = 3;
            this.a.d();
            this.t = 0;
            ++bl.u;
            if (this.d && (this.v == 7 && at.a.nextInt(100) < 40 || this.v < 7 && at.a.nextInt(100) < 20) && this.l != 164) {
               this.a = new int[2];
               this.a[0] = this.l + (this.v == 7 ? 11 : 0);
               this.a[1] = this.v == 7 ? 1 : 1 + at.a.nextInt(3);
               this.b(1);
            } else {
               this.d = false;
            }
         } else {
            if (this.a == 4) {
               this.d(false);
            } else if (this.a != 3 && this.o) {
               this.a.c((int)var1 >> 2);
            }

            float var3;
            if ((var3 = this.a.a()) > 0.0F) {
               this.a.a(this.a.a());
               this.a.a((int)(1024.0F * var3 * (1.0F - (float)g.c(60, this.u) / 100.0F)));
               this.a.a(this.a);
               this.n += this.a.a;
               this.o += this.a.b;
               this.p += this.a.c;
               this.a.d((int)var1 >> 1, (int)var1 >> 1, (int)var1 >> 1);
               if ((var3 *= 0.98F) < 0.05F) {
                  var3 = 0.0F;
               }

               this.a.b(var3);
            }

            this.a = at.a.a().b(this.a);
            this.b.a(this.n, this.o, this.p);
            this.b.c(this.a, c);
            int var4 = c.a();
            if (!this.n) {
               if (var4 > 30000) {
                  c.a();
                  c.a(30000);
                  c.b(this.a);
                  this.a.b(c);
                  float var2;
                  var4 = (int)((var2 = 30000.0F / (float)var4) * (float)this.q);
                  var7 = (int)(var2 * (float)this.r);
                  var6 = (int)(var2 * (float)this.s);
                  this.a.f(var4, var7, var6);
                  this.m = true;
               } else {
                  this.a.f(this.q, this.r, this.s);
                  this.a.c(this.n, this.o, this.p);
                  this.m = false;
               }
            } else if (var4 > 35000 && this.t > 10000) {
               var6 = at.a.nextInt(20000) - 10000;
               var4 = at.a.nextInt(20000) - 10000;
               var7 = at.a.nextInt(2000) + 30000;
               this.t = 0;
               c.a(var6, var4, var7);
               if (this.a.a() != null) {
                  this.a = this.a.a().a.b();
               } else {
                  this.a.a();
               }

               this.b = this.a.b(c, this.b);
               this.a.b(this.b);
               this.n = this.b.a;
               this.o = this.b.b;
               this.p = this.b.c;
               this.d(true);
               this.g();
            }

            if (this.d != null) {
               this.d.a(this.a.a());
            }

         }
      }
   }

   private void g() {
      this.a.a(this.n, this.o, this.p);
      this.b.a(e);
      this.b.c(this.a, c);
      float var1 = (float)g.b(0, 100000 - c.a()) / 100000.0F;
      int var2 = (int)((float)this.q * var1);
      int var3 = (int)((float)this.r * var1);
      int var4 = (int)((float)this.s * var1);
      if (var2 + var3 + var4 < 256) {
         this.u = 0;
         this.v = 0;
         this.d(false);
      } else {
         this.a.f(var2, var3, var4);
         this.u = (int)((float)((var2 + var3 + var4) / 3) / 3072.0F * 100.0F);
         this.v = g.c(7, 2 + (int)((float)(this.u + 15) / 100.0F * 5.0F));
      }
   }

   public final void a() {
      if (this.v > 0) {
         if (this.b != null) {
            at.a.a((ah)this.b);
         }

         if (this.a == 3) {
            at.a.a((ah)this.d);
            if (this.t > 3000) {
               this.a = 4;
               return;
            }
         } else if (this.a == 0) {
            at.a.a((ah)this.a);
         }
      }

   }

   public final boolean a(cc var1) {
      return this.a(var1.a, var1.b, var1.c);
   }

   public final cc b(cc var1) {
      (d = this.a.a(d)).c(var1);
      var1.a(d);
      var1.a();
      return var1;
   }

   public final boolean a(int var1, int var2, int var3) {
      return (float)(var1 - this.n) < this.a.a && (float)(var1 - this.n) > -this.a.a && (float)(var2 - this.o) < this.a.a && (float)(var2 - this.o) > -this.a.a && (float)(var3 - this.p) < this.a.a && (float)(var3 - this.p) > -this.a.a;
   }
}
