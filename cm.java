public final class cm {
   private short a;
   private int a;
   private int b;
   private int c;
   private int d;
   private int e;
   private int f;
   private int g;
   private int h;
   private int i;
   private int j;
   private int k;
   private int l;
   private int m;
   private int n;
   private int o;
   private int p;
   private int q;
   private int r;
   private boolean a;
   private static cc a = new cc();

   public cm() {
      this.a();
      this.a = 0;
   }

   public final void a() {
      this.a = this.b = this.c = 4096;
      this.d = 4096;
      this.g = 0;
      this.j = 0;
      this.e = 0;
      this.h = 4096;
      this.k = 0;
      this.f = 0;
      this.i = 0;
      this.l = 4096;
      this.m = this.n = this.o = 0;
      this.p = this.q = this.r = 0;
      this.a = false;
   }

   public final void a(cm var1) {
      this.a = var1.a;
      this.b = var1.b;
      this.c = var1.c;
      this.d = var1.d;
      this.e = var1.e;
      this.f = var1.f;
      this.g = var1.g;
      this.h = var1.h;
      this.i = var1.i;
      this.j = var1.j;
      this.k = var1.k;
      this.l = var1.l;
      this.m = var1.m;
      this.n = var1.n;
      this.o = var1.o;
      this.p = var1.p;
      this.q = var1.q;
      this.r = var1.r;
      this.a = var1.a;
   }

   public final void b(cm var1) {
      int var2 = this.d;
      int var3 = this.g;
      int var4 = this.e;
      int var5 = this.h;
      int var6 = this.f;
      int var7 = this.i;
      this.m += this.a * ((this.d * var1.m >> 12) + (this.g * var1.n >> 12) + (this.j * var1.o >> 12)) >> 12;
      this.n += this.b * ((this.e * var1.m >> 12) + (this.h * var1.n >> 12) + (this.k * var1.o >> 12)) >> 12;
      this.o += this.c * ((this.f * var1.m >> 12) + (this.i * var1.n >> 12) + (this.l * var1.o >> 12)) >> 12;
      this.a = this.a * var1.a >> 12;
      this.b = this.b * var1.b >> 12;
      this.c = this.c * var1.c >> 12;
      this.d = (var2 * var1.d >> 12) + (var3 * var1.e >> 12) + (this.j * var1.f >> 12);
      this.e = (var4 * var1.d >> 12) + (var5 * var1.e >> 12) + (this.k * var1.f >> 12);
      this.f = (var6 * var1.d >> 12) + (var7 * var1.e >> 12) + (this.l * var1.f >> 12);
      this.g = (var2 * var1.g >> 12) + (var3 * var1.h >> 12) + (this.j * var1.i >> 12);
      this.h = (var4 * var1.g >> 12) + (var5 * var1.h >> 12) + (this.k * var1.i >> 12);
      this.i = (var6 * var1.g >> 12) + (var7 * var1.h >> 12) + (this.l * var1.i >> 12);
      this.j = (var2 * var1.j >> 12) + (var3 * var1.k >> 12) + (this.j * var1.l >> 12);
      this.k = (var4 * var1.j >> 12) + (var5 * var1.k >> 12) + (this.k * var1.l >> 12);
      this.l = (var6 * var1.j >> 12) + (var7 * var1.k >> 12) + (this.l * var1.l >> 12);
      this.a = true;
   }

   public final cm a(cm var1, cm var2) {
      var2.m = this.m + (this.a * ((this.d * var1.m >> 12) + (this.g * var1.n >> 12) + (this.j * var1.o >> 12)) >> 12);
      var2.n = this.n + (this.b * ((this.e * var1.m >> 12) + (this.h * var1.n >> 12) + (this.k * var1.o >> 12)) >> 12);
      var2.o = this.o + (this.c * ((this.f * var1.m >> 12) + (this.i * var1.n >> 12) + (this.l * var1.o >> 12)) >> 12);
      var2.a = this.a * var1.a >> 12;
      var2.b = this.b * var1.b >> 12;
      var2.c = this.c * var1.c >> 12;
      var2.d = (this.d * var1.d >> 12) + (this.g * var1.e >> 12) + (this.j * var1.f >> 12);
      var2.e = (this.e * var1.d >> 12) + (this.h * var1.e >> 12) + (this.k * var1.f >> 12);
      var2.f = (this.f * var1.d >> 12) + (this.i * var1.e >> 12) + (this.l * var1.f >> 12);
      var2.g = (this.d * var1.g >> 12) + (this.g * var1.h >> 12) + (this.j * var1.i >> 12);
      var2.h = (this.e * var1.g >> 12) + (this.h * var1.h >> 12) + (this.k * var1.i >> 12);
      var2.i = (this.f * var1.g >> 12) + (this.i * var1.h >> 12) + (this.l * var1.i >> 12);
      var2.j = (this.d * var1.j >> 12) + (this.g * var1.k >> 12) + (this.j * var1.l >> 12);
      var2.k = (this.e * var1.j >> 12) + (this.h * var1.k >> 12) + (this.k * var1.l >> 12);
      var2.l = (this.f * var1.j >> 12) + (this.i * var1.k >> 12) + (this.l * var1.l >> 12);
      var2.a = true;
      return var2;
   }

   public final void a(int var1, int var2, int var3) {
      this.m += var1;
      this.n += var2;
      this.o += var3;
   }

   public final void a(cc var1) {
      this.m += var1.a;
      this.n += var1.b;
      this.o += var1.c;
   }

   public final void b(int var1, int var2, int var3) {
      this.m = var1;
      this.n = var2;
      this.o = var3;
   }

   public final void b(cc var1) {
      this.m = var1.a;
      this.n = var1.b;
      this.o = var1.c;
   }

   public final void a(int var1) {
      this.m += this.j * var1 >> 12;
      this.n += this.k * var1 >> 12;
      this.o += this.l * var1 >> 12;
   }

   public final cc a(cc var1) {
      var1.a = this.m;
      var1.b = this.n;
      var1.c = this.o;
      return var1;
   }

   public final cc a() {
      return new cc(this.m, this.n, this.o);
   }

   public final int a() {
      return this.m;
   }

   public final int b() {
      return this.n;
   }

   public final int c() {
      return this.o;
   }

   public final int d() {
      return this.j;
   }

   public final int e() {
      return this.k;
   }

   public final int f() {
      return this.l;
   }

   public final cc b(cc var1) {
      var1.a = this.j;
      var1.b = this.k;
      var1.c = this.l;
      return var1;
   }

   public final cc b() {
      return new cc(this.j, this.k, this.l);
   }

   public final cc c(cc var1) {
      var1.a = this.g;
      var1.b = this.h;
      var1.c = this.i;
      return var1;
   }

   public final cc c() {
      return new cc(this.g, this.h, this.i);
   }

   public final cc d(cc var1) {
      var1.a = this.d;
      var1.b = this.e;
      var1.c = this.f;
      return var1;
   }

   public final cc d() {
      return new cc(this.d, this.e, this.f);
   }

   public final void a(short var1) {
      if (this.a != var1) {
         this.a = var1;
         this.b();
         this.a = false;
      }
   }

   public final void c(int var1, int var2, int var3) {
      if (this.a) {
         this.b();
         this.a = false;
      }

      this.p += var1;
      this.q += var2;
      this.r += var3;
      this.d(this.p, this.q, this.r);
   }

   public final void b(int var1) {
      int var2 = g.a(var1);
      var1 = g.b(var1);
      int var3;
      int var4 = ((var3 = 4096 - var1) * this.j >> 12) * this.l >> 12;
      int var5 = (var3 * this.k >> 12) * this.l >> 12;
      int var6 = (var3 * this.j >> 12) * this.k >> 12;
      int var7 = var2 * this.k >> 12;
      int var8 = var2 * this.j >> 12;
      var2 = var2 * this.l >> 12;
      int var9 = ((var3 * this.j >> 12) * this.j >> 12) + var1;
      int var10 = var6 - var2;
      int var11 = var4 + var7;
      var2 += var6;
      var6 = ((var3 * this.k >> 12) * this.k >> 12) + var1;
      int var12 = var5 - var8;
      var4 -= var7;
      var5 += var8;
      var1 += (var3 * this.l >> 12) * this.l >> 12;
      var3 = this.d;
      var7 = this.e;
      this.d = (this.d * var9 >> 12) + (this.e * var10 >> 12) + (this.f * var11 >> 12);
      this.e = (var3 * var2 >> 12) + (this.e * var6 >> 12) + (this.f * var12 >> 12);
      this.f = (var3 * var4 >> 12) + (var7 * var5 >> 12) + (this.f * var1 >> 12);
      this.g = (this.k * this.f >> 12) - (this.l * this.e >> 12);
      this.h = (this.l * this.d >> 12) - (this.j * this.f >> 12);
      this.i = (this.j * this.e >> 12) - (this.k * this.d >> 12);
      var1 = g.d((this.g * this.g >> 12) + (this.h * this.h >> 12) + (this.i * this.i >> 12));
      this.g = this.g * var1 >> 12;
      this.h = this.h * var1 >> 12;
      this.i = this.i * var1 >> 12;
      this.d = (this.l * this.h >> 12) - (this.k * this.i >> 12);
      this.e = (this.j * this.i >> 12) - (this.l * this.g >> 12);
      this.f = (this.k * this.g >> 12) - (this.j * this.h >> 12);
      this.a = true;
   }

   public final void c(int var1) {
      int var2 = g.a(var1);
      var1 = g.b(var1);
      int var3;
      int var4 = ((var3 = 4096 - var1) * this.g >> 12) * this.i >> 12;
      int var5 = (var3 * this.h >> 12) * this.i >> 12;
      int var6 = (var3 * this.g >> 12) * this.h >> 12;
      int var7 = var2 * this.h >> 12;
      int var8 = var2 * this.g >> 12;
      var2 = var2 * this.i >> 12;
      int var9 = ((var3 * this.g >> 12) * this.g >> 12) + var1;
      int var10 = var6 - var2;
      int var11 = var4 + var7;
      var2 += var6;
      var6 = ((var3 * this.h >> 12) * this.h >> 12) + var1;
      int var12 = var5 - var8;
      var4 -= var7;
      var5 += var8;
      var1 += (var3 * this.i >> 12) * this.i >> 12;
      var3 = this.j;
      var7 = this.k;
      this.j = (this.j * var9 >> 12) + (this.k * var10 >> 12) + (this.l * var11 >> 12);
      this.k = (var3 * var2 >> 12) + (this.k * var6 >> 12) + (this.l * var12 >> 12);
      this.l = (var3 * var4 >> 12) + (var7 * var5 >> 12) + (this.l * var1 >> 12);
      this.d = (this.l * this.h >> 12) - (this.k * this.i >> 12);
      this.e = (this.j * this.i >> 12) - (this.l * this.g >> 12);
      this.f = (this.k * this.g >> 12) - (this.j * this.h >> 12);
      var1 = g.d((this.d * this.d >> 12) + (this.e * this.e >> 12) + (this.f * this.f >> 12));
      this.d = this.d * var1 >> 12;
      this.e = this.e * var1 >> 12;
      this.f = this.f * var1 >> 12;
      this.j = (this.i * this.e >> 12) - (this.h * this.f >> 12);
      this.k = (this.g * this.f >> 12) - (this.i * this.d >> 12);
      this.l = (this.h * this.d >> 12) - (this.g * this.e >> 12);
      this.a = true;
   }

   public final void d(int var1) {
      int var2 = g.a(var1);
      var1 = g.b(var1);
      int var3;
      int var4 = ((var3 = 4096 - var1) * this.d >> 12) * this.f >> 12;
      int var5 = (var3 * this.e >> 12) * this.f >> 12;
      int var6 = (var3 * this.d >> 12) * this.e >> 12;
      int var7 = var2 * this.e >> 12;
      int var8 = var2 * this.d >> 12;
      var2 = var2 * this.f >> 12;
      int var9 = ((var3 * this.d >> 12) * this.d >> 12) + var1;
      int var10 = var6 - var2;
      int var11 = var4 + var7;
      var2 += var6;
      var6 = ((var3 * this.e >> 12) * this.e >> 12) + var1;
      int var12 = var5 - var8;
      var4 -= var7;
      var5 += var8;
      var1 += (var3 * this.f >> 12) * this.f >> 12;
      var3 = this.g;
      var7 = this.h;
      this.g = (this.g * var9 >> 12) + (this.h * var10 >> 12) + (this.i * var11 >> 12);
      this.h = (var3 * var2 >> 12) + (this.h * var6 >> 12) + (this.i * var12 >> 12);
      this.i = (var3 * var4 >> 12) + (var7 * var5 >> 12) + (this.i * var1 >> 12);
      this.j = (this.e * this.i >> 12) - (this.f * this.h >> 12);
      this.k = (this.f * this.g >> 12) - (this.d * this.i >> 12);
      this.l = (this.d * this.h >> 12) - (this.e * this.g >> 12);
      var1 = g.d((this.j * this.j >> 12) + (this.k * this.k >> 12) + (this.l * this.l >> 12));
      this.j = this.j * var1 >> 12;
      this.k = this.k * var1 >> 12;
      this.l = this.l * var1 >> 12;
      this.g = (this.k * this.f >> 12) - (this.l * this.e >> 12);
      this.h = (this.l * this.d >> 12) - (this.j * this.f >> 12);
      this.i = (this.j * this.e >> 12) - (this.k * this.d >> 12);
      this.a = true;
   }

   public final void e(int var1) {
      this.d(this.p, var1, this.r);
   }

   public final void d(int var1, int var2, int var3) {
      this.p = var1;
      this.q = var2;
      this.r = var3;
      this.a = false;
      int var4 = g.a(var1);
      int var5 = g.a(var2);
      int var6 = g.a(var3);
      var1 = g.b(var1);
      var2 = g.b(var2);
      var3 = g.b(var3);
      int var7;
      int var8;
      int var9;
      switch(this.a) {
      case 0:
         var7 = var1 * var3 >> 12;
         var8 = var3 * var4 >> 12;
         var9 = var5 * var6 >> 12;
         this.d = var2 * var3 >> 12;
         this.g = -(var2 * var6 >> 12);
         this.j = var5;
         this.e = (var8 * var5 >> 12) + (var1 * var6 >> 12);
         this.h = var7 - (var9 * var4 >> 12);
         this.k = -(var2 * var4 >> 12);
         this.f = -(var7 * var5 >> 12) + (var4 * var6 >> 12);
         this.i = var8 + (var9 * var1 >> 12);
         this.l = var1 * var2 >> 12;
         return;
      case 1:
         var7 = var2 * var6 >> 12;
         var8 = var5 * var6 >> 12;
         this.d = var2 * var3 >> 12;
         this.g = -var6;
         this.j = var3 * var5 >> 12;
         this.e = (var4 * var5 >> 12) + (var7 * var1 >> 12);
         this.h = var1 * var3 >> 12;
         this.k = -(var2 * var4 >> 12) + (var8 * var1 >> 12);
         this.f = -(var1 * var5 >> 12) + (var7 * var4 >> 12);
         this.i = var3 * var4 >> 12;
         this.l = (var1 * var2 >> 12) + (var8 * var4 >> 12);
         return;
      case 2:
         var7 = var2 * var3 >> 12;
         var8 = var4 * var6 >> 12;
         var9 = var5 * var3 >> 12;
         this.d = var7 + (var8 * var5 >> 12);
         this.g = (var9 * var4 >> 12) - (var2 * var6 >> 12);
         this.j = var1 * var5 >> 12;
         this.e = var1 * var6 >> 12;
         this.h = var1 * var3 >> 12;
         this.k = -var4;
         this.f = -var9 + (var8 * var2 >> 12);
         this.i = (var7 * var4 >> 12) + (var5 * var6 >> 12);
         this.l = var1 * var2 >> 12;
         return;
      case 3:
         var7 = var4 * var5 >> 12;
         var8 = var1 * var2 >> 12;
         var9 = var2 * var4 >> 12;
         this.d = var2 * var3 >> 12;
         this.g = var7 - (var8 * var6 >> 12);
         this.j = (var1 * var5 >> 12) + (var9 * var6 >> 12);
         this.e = var6;
         this.h = var1 * var3 >> 12;
         this.k = -(var3 * var4 >> 12);
         this.f = -(var3 * var5 >> 12);
         this.i = var9 + ((var1 * var5 >> 12) * var6 >> 12);
         this.l = var8 - (var7 * var6 >> 12);
         return;
      case 4:
         var7 = var4 * var5 >> 12;
         var8 = var2 * var4 >> 12;
         this.d = (var2 * var3 >> 12) - (var7 * var6 >> 12);
         this.g = -(var1 * var6 >> 12);
         this.j = (var3 * var5 >> 12) + (var8 * var6 >> 12);
         this.e = (var7 * var3 >> 12) + (var2 * var6 >> 12);
         this.h = var1 * var3 >> 12;
         this.k = -(var8 * var3 >> 12) + (var5 * var6 >> 12);
         this.f = -(var1 * var5 >> 12);
         this.i = var4;
         this.l = var1 * var2 >> 12;
         return;
      case 5:
         var7 = var5 * var6 >> 12;
         var9 = var3 * var5 >> 12;
         this.d = var2 * var3 >> 12;
         this.g = (var9 * var4 >> 12) - (var1 * var6 >> 12);
         this.j = (var9 * var1 >> 12) + (var4 * var6 >> 12);
         this.e = var2 * var6 >> 12;
         this.h = (var1 * var3 >> 12) + (var7 * var4 >> 12);
         this.k = -(var3 * var4 >> 12) + (var7 * var1 >> 12);
         this.f = -var5;
         this.i = var2 * var4 >> 12;
         this.l = var1 * var2 >> 12;
      default:
      }
   }

   public final int g() {
      if (this.a) {
         this.b();
         this.a = false;
      }

      return this.p;
   }

   public final int h() {
      if (this.a) {
         this.b();
         this.a = false;
      }

      return this.q;
   }

   public final int i() {
      if (this.a) {
         this.b();
         this.a = false;
      }

      return this.r;
   }

   private void b() {
      switch(this.a) {
      case 0:
         this.q = g.c(this.j);
         if (this.q < 2048) {
            if (this.q > -2048) {
               this.p = g.a(-this.k, this.l);
               this.r = g.a(-this.g, this.d);
               return;
            }

            this.p = -g.a(this.e, this.h);
            this.r = 0;
            return;
         }

         this.p = g.a(this.e, this.h);
         this.r = 0;
         return;
      case 1:
         this.r = g.c(-this.g);
         if (this.r < 2048) {
            if (this.r > -2048) {
               this.p = g.a(this.i, this.h);
               this.q = g.a(this.j, this.d);
               return;
            }

            this.p = -g.a(-this.f, this.l);
            this.q = 0;
            return;
         }

         this.p = g.a(-this.f, this.l);
         this.q = 0;
         return;
      case 2:
         this.p = g.c(-this.k);
         if (this.p < 2048) {
            if (this.p > -2048) {
               this.q = g.a(this.j, this.l);
               this.r = g.a(this.e, this.h);
               return;
            }

            this.q = -g.a(-this.g, this.d);
            this.r = 0;
            return;
         }

         this.q = g.a(-this.g, this.d);
         this.r = 0;
         return;
      case 3:
         this.r = g.c(this.e);
         if (this.r < 2048) {
            if (this.r > -2048) {
               this.q = g.a(-this.f, this.d);
               this.p = g.a(-this.k, this.h);
               return;
            }

            this.q = -g.a(this.i, this.l);
            this.p = 0;
            return;
         }

         this.q = g.a(this.i, this.l);
         this.p = 0;
         return;
      case 4:
         this.p = g.c(this.i);
         if (this.p < 2048) {
            if (this.p > -2048) {
               this.r = g.a(-this.g, this.h);
               this.q = g.a(-this.f, this.l);
               return;
            }

            this.r = -g.a(this.j, this.d);
            this.q = 0;
            return;
         }

         this.r = g.a(this.j, this.d);
         this.q = 0;
         return;
      case 5:
         this.q = g.c(-this.f);
         if (this.q < 2048) {
            if (this.q > -2048) {
               this.r = g.a(this.e, this.d);
               this.p = g.a(this.i, this.l);
               return;
            }

            this.r = -g.a(-this.g, this.j);
            this.p = 0;
            return;
         } else {
            this.r = g.a(-this.g, this.j);
            this.p = 0;
         }
      default:
      }
   }

   public final void a(w var1) {
      int var5 = var1.d;
      int var4 = var1.c;
      int var3 = var1.b;
      int var2 = var1.a;
      this.d = 4096 - (var3 * 2 * var3 >> 12) - (var4 * 2 * var4 >> 12);
      this.g = (var2 * 2 * var3 >> 12) - (var5 * 2 * var4 >> 12);
      this.j = (var2 * 2 * var4 >> 12) + (var5 * 2 * var3 >> 12);
      this.e = (var2 * 2 * var3 >> 12) + (var5 * 2 * var4 >> 12);
      this.h = 4096 - (var2 * 2 * var2 >> 12) - (var4 * 2 * var4 >> 12);
      this.k = (var3 * 2 * var4 >> 12) - (var5 * 2 * var2 >> 12);
      this.f = (var2 * 2 * var4 >> 12) - (var5 * 2 * var3 >> 12);
      this.i = (var5 * 2 * var2 >> 12) + (var3 * 2 * var4 >> 12);
      this.l = 4096 - (var2 * 2 * var2 >> 12) - (var3 * 2 * var3 >> 12);
      this.a = true;
   }

   private static int a(int var0) {
      return var0 < 2 ? var0 + 1 : 0;
   }

   private final int b(int var1) {
      switch(var1) {
      case 0:
         return this.d;
      case 1:
         return this.e;
      case 2:
         return this.f;
      case 3:
         return this.g;
      case 4:
         return this.h;
      case 5:
         return this.i;
      case 6:
         return this.j;
      case 7:
         return this.k;
      case 8:
         return this.l;
      default:
         return 0;
      }
   }

   public final w a(w var1) {
      int var2;
      if ((var2 = 4096 + this.d + this.h + this.l) > 0) {
         var2 = g.a((long)var2);
         var1.d = var2 >> 1;
         var2 = 8388608 / var2;
         var1.a = (this.i - this.k) * var2 >> 12;
         var1.b = (this.j - this.f) * var2 >> 12;
         var1.c = (this.e - this.g) * var2 >> 12;
         return var1;
      } else {
         byte var6 = 0;
         if (this.h > this.d) {
            var6 = 1;
         }

         if (this.l > this.b(var6 << 2)) {
            var6 = 2;
         }

         int var3;
         int var4 = a(var3 = a((int)var6));
         int var5 = g.a((long)(4096 + this.b(var6 << 2) - this.b(var3 << 2) - this.b(var4 << 2)));
         switch(var6) {
         case 0:
            var1.a = var5 >> 1;
            break;
         case 1:
            var1.b = var5 >> 1;
            break;
         case 2:
         default:
            var1.c = var5 >> 1;
         }

         if (var5 != 0) {
            var5 = 8388608 / var5;
         }

         switch(var3) {
         case 0:
            var1.a = (this.b(var6 + var3 * 3) + this.b(var3 + var6 * 3)) * var5 >> 12;
            break;
         case 1:
            var1.b = (this.b(var6 + var3 * 3) + this.b(var3 + var6 * 3)) * var5 >> 12;
            break;
         case 2:
            var1.c = (this.b(var6 + var3 * 3) + this.b(var3 + var6 * 3)) * var5 >> 12;
         }

         switch(var4) {
         case 0:
            var1.a = (this.b(var6 + var4 * 3) + this.b(var4 + var6 * 3)) * var5 >> 12;
            break;
         case 1:
            var1.b = (this.b(var6 + var4 * 3) + this.b(var4 + var6 * 3)) * var5 >> 12;
            break;
         case 2:
            var1.c = (this.b(var6 + var4 * 3) + this.b(var4 + var6 * 3)) * var5 >> 12;
         }

         var1.d = (this.b(var3 + var4 * 3) - this.b(var4 + var3 * 3)) * var5 >> 12;
         return var1;
      }
   }

   public final void e(int var1, int var2, int var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public final cc e(cc var1) {
      var1.a = this.a;
      var1.b = this.b;
      var1.c = this.c;
      return var1;
   }

   public final cc e() {
      return this.e(new cc());
   }

   public final cm a(cm var1) {
      var1.a = 16777216 / this.a;
      var1.b = 16777216 / this.b;
      var1.c = 16777216 / this.c;
      var1.d = this.d;
      var1.g = this.e;
      var1.j = this.f;
      var1.e = this.g;
      var1.h = this.h;
      var1.k = this.i;
      var1.f = this.j;
      var1.i = this.k;
      var1.l = this.l;
      var1.m = var1.a * (-(var1.d * this.m >> 12) - (var1.g * this.n >> 12) - (var1.j * this.o >> 12)) >> 12;
      var1.n = var1.b * (-(var1.e * this.m >> 12) - (var1.h * this.n >> 12) - (var1.k * this.o >> 12)) >> 12;
      var1.o = var1.c * (-(var1.f * this.m >> 12) - (var1.i * this.n >> 12) - (var1.l * this.o >> 12)) >> 12;
      var1.a = true;
      return var1;
   }

   public final void a(cc var1, cc var2, cc var3) {
      this.d = var1.a;
      this.g = var2.a;
      this.j = var3.a;
      this.e = var1.b;
      this.h = var2.b;
      this.k = var3.b;
      this.f = var1.c;
      this.i = var2.c;
      this.l = var3.c;
      this.a = true;
   }

   public final void a(int[] var1) {
      var1[0] = this.a * this.d >> 12;
      var1[1] = this.b * this.g >> 12;
      var1[2] = this.c * this.j >> 12;
      var1[3] = this.m;
      var1[4] = -(this.a * this.e >> 12);
      var1[5] = -(this.b * this.h >> 12);
      var1[6] = -(this.c * this.k >> 12);
      var1[7] = -this.n;
      var1[8] = -(this.a * this.f >> 12);
      var1[9] = -(this.b * this.i >> 12);
      var1[10] = -(this.c * this.l >> 12);
      var1[11] = -this.o;
   }

   public final String toString() {
      String var1 = "";
      var1 = var1 + "|\t" + (this.a * this.d >> 12) + ",\t" + (this.b * this.g >> 12) + ",\t" + (this.c * this.j >> 12) + ",\t" + this.m + "\t|\n";
      var1 = var1 + "|\t" + (this.a * this.e >> 12) + ",\t" + (this.b * this.h >> 12) + ",\t" + (this.c * this.k >> 12) + ",\t" + this.n + "\t|\n";
      return var1 + "|\t" + (this.a * this.f >> 12) + ",\t" + (this.b * this.i >> 12) + ",\t" + (this.c * this.l >> 12) + ",\t" + this.o + "\t|\n";
   }

   public final cc a(cc var1, cc var2) {
      var2.a = ((this.a * this.d >> 12) * var1.a >> 12) + ((this.b * this.g >> 12) * var1.b >> 12) + ((this.c * this.j >> 12) * var1.c >> 12) + this.m;
      var2.b = ((this.a * this.e >> 12) * var1.a >> 12) + ((this.b * this.h >> 12) * var1.b >> 12) + ((this.c * this.k >> 12) * var1.c >> 12) + this.n;
      var2.c = ((this.a * this.f >> 12) * var1.a >> 12) + ((this.b * this.i >> 12) * var1.b >> 12) + ((this.c * this.l >> 12) * var1.c >> 12) + this.o;
      return var2;
   }

   public final cc b(cc var1, cc var2) {
      long var3 = ((long)(this.a * this.d >> 12) * (long)var1.a >> 12) + ((long)(this.b * this.g >> 12) * (long)var1.b >> 12) + ((long)(this.c * this.j >> 12) * (long)var1.c >> 12) + (long)this.m;
      long var5 = ((long)(this.a * this.e >> 12) * (long)var1.a >> 12) + ((long)(this.b * this.h >> 12) * (long)var1.b >> 12) + ((long)(this.c * this.k >> 12) * (long)var1.c >> 12) + (long)this.n;
      long var7 = ((long)(this.a * this.f >> 12) * (long)var1.a >> 12) + ((long)(this.b * this.i >> 12) * (long)var1.b >> 12) + ((long)(this.c * this.l >> 12) * (long)var1.c >> 12) + (long)this.o;
      var2.a = (int)var3;
      var2.b = (int)var5;
      var2.c = (int)var7;
      return var2;
   }

   public final cc c(cc var1, cc var2) {
      var2.a = (this.d * var1.a >> 12) + (this.g * var1.b >> 12) + (this.j * var1.c >> 12);
      var2.b = (this.e * var1.a >> 12) + (this.h * var1.b >> 12) + (this.k * var1.c >> 12);
      var2.c = (this.f * var1.a >> 12) + (this.i * var1.b >> 12) + (this.l * var1.c >> 12);
      return var2;
   }

   public final cc d(cc var1, cc var2) {
      long var3 = ((long)this.d * (long)var1.a >> 12) + ((long)this.g * (long)var1.b >> 12) + ((long)this.j * (long)var1.c >> 12);
      long var5 = ((long)this.e * (long)var1.a >> 12) + ((long)this.h * (long)var1.b >> 12) + ((long)this.k * (long)var1.c >> 12);
      long var7 = ((long)this.f * (long)var1.a >> 12) + ((long)this.i * (long)var1.b >> 12) + ((long)this.l * (long)var1.c >> 12);
      var2.a = (int)var3;
      var2.b = (int)var5;
      var2.c = (int)var7;
      return var2;
   }

   public final cc[] a(cc[] var1, cc[] var2) {
      for(int var3 = var2.length - 1; var3 >= 0; --var3) {
         var2[var3].a = (this.d * var1[var3].a >> 12) + (this.g * var1[var3].b >> 12) + (this.j * var1[var3].c >> 12);
         var2[var3].b = (this.e * var1[var3].a >> 12) + (this.h * var1[var3].b >> 12) + (this.k * var1[var3].c >> 12);
         var2[var3].c = (this.f * var1[var3].a >> 12) + (this.i * var1[var3].b >> 12) + (this.l * var1[var3].c >> 12);
      }

      return var2;
   }

   public final cc f(cc var1) {
      int var2 = 16777216 / this.a;
      int var3 = 16777216 / this.b;
      int var4 = 16777216 / this.c;
      int var5 = var2 * (-(this.d * this.m >> 12) - (this.e * this.n >> 12) - (this.f * this.o >> 12)) >> 12;
      int var6 = var3 * (-(this.g * this.m >> 12) - (this.h * this.n >> 12) - (this.i * this.o >> 12)) >> 12;
      int var7 = var4 * (-(this.j * this.m >> 12) - (this.k * this.n >> 12) - (this.l * this.o >> 12)) >> 12;
      int var8 = var1.a;
      int var9 = var1.b;
      int var10 = var1.c;
      var1.a = ((var2 * this.d >> 12) * var8 >> 12) + ((var3 * this.e >> 12) * var9 >> 12) + ((var4 * this.f >> 12) * var10 >> 12) + var5;
      var1.b = ((var2 * this.g >> 12) * var8 >> 12) + ((var3 * this.h >> 12) * var9 >> 12) + ((var4 * this.i >> 12) * var10 >> 12) + var6;
      var1.c = ((var2 * this.j >> 12) * var8 >> 12) + ((var3 * this.k >> 12) * var9 >> 12) + ((var4 * this.l >> 12) * var10 >> 12) + var7;
      return var1;
   }

   public final cc g(cc var1) {
      int var2 = var1.a;
      int var3 = var1.b;
      int var4 = var1.c;
      var1.a = (this.d * var2 >> 12) + (this.e * var3 >> 12) + (this.f * var4 >> 12);
      var1.b = (this.g * var2 >> 12) + (this.h * var3 >> 12) + (this.i * var4 >> 12);
      var1.c = (this.j * var2 >> 12) + (this.k * var3 >> 12) + (this.l * var4 >> 12);
      return var1;
   }

   public final void c(cc var1) {
      a.a(var1);
      a.a();
      this.j = a.a;
      this.k = a.b;
      this.l = a.c;
      this.g = 0;
      this.h = 4096;
      this.i = 0;
      this.d = (this.h * this.l >> 12) - (this.i * this.k >> 12);
      this.e = (this.i * this.j >> 12) - (this.g * this.l >> 12);
      this.f = (this.g * this.k >> 12) - (this.h * this.j >> 12);
      a.a = this.d;
      a.b = this.e;
      a.c = this.f;
      a.a();
      this.d = a.a;
      this.e = a.b;
      this.f = a.c;
      this.g = (this.k * this.f >> 12) - (this.l * this.e >> 12);
      this.h = (this.l * this.d >> 12) - (this.j * this.f >> 12);
      this.i = (this.j * this.e >> 12) - (this.k * this.d >> 12);
      a.a = this.g;
      a.b = this.h;
      a.c = this.i;
      a.a();
      this.g = a.a;
      this.h = a.b;
      this.i = a.c;
   }
}
