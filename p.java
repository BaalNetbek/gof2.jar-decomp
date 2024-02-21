public abstract class p {
   protected short a = 0;
   protected int a = 2;
   public aa a;
   public ag a;
   public ar a;
   protected int b;
   protected int c;
   protected int d;
   protected db a;
   protected bf a;
   protected cf a;
   protected cc a = new cc();
   protected cc b = new cc();
   protected int e;
   protected int f;
   protected int g;
   protected boolean a;
   public boolean b;
   public boolean c;
   public boolean d;
   protected int[] a;
   public ag b;
   protected ag c;
   protected boolean e;
   protected boolean f;
   protected boolean g;
   protected int h;
   protected boolean h;
   protected int i;
   protected int j;
   protected p a;
   protected boolean i;
   protected int k;
   public String a;
   public boolean j;
   public boolean k;
   protected boolean l;

   public p(int var1, int var2, aa var3, ag var4, int var5, int var6, int var7) {
      this.d = var2;
      this.a = var3;
      this.a = var4;
      this.b = var1;
      if (this.a != null) {
         this.a.c(var5, var6, var7);
         this.a.e(0, 0, 0);
         this.a.a = var4.a();
      }

      this.a.a(this);
      this.k = false;
      this.e = var5;
      this.f = var6;
      this.g = var7;
      this.b = false;
      this.c = false;
      this.d = false;
      this.a = false;
      this.e = false;
      this.f = false;
      this.g = false;
      this.h = false;
      if (this.a == null) {
         this.a = new cc();
      }

      this.i = false;
      this.a = null;
      this.l = true;
   }

   public final boolean b() {
      return this.l;
   }

   public final void b(boolean var1) {
      this.l = var1;
      if (this.a != null) {
         this.a.a(var1);
      }

      if (this.a != null) {
         this.a.a(var1);
      }

   }

   public final void a(ar var1, int var2) {
      this.c = var2;
      this.a = var1;
      this.a.c(this.e, this.f, this.g);
      this.a.e(0, 0, 0);
      this.a.a = var1.a();
   }

   public final void c(boolean var1) {
      this.i = true;
   }

   public final boolean c() {
      return this.i;
   }

   public void b() {
      this.a = null;
      if (this.a != null) {
         this.a.a();
      }

      this.a = null;
      this.a = null;
      this.a = null;
      this.a = null;
      if (this.a != null) {
         this.a.c();
      }

      this.a = null;
      this.c = null;
   }

   public void d(boolean var1) {
      this.a.e(var1);
   }

   public final void e(boolean var1) {
      this.d(false);
   }

   public final void a(x var1) {
      if (this.e() || this.f()) {
         this.d = false;
         this.d(false);
      }

      this.b = null;
      v var2 = null;

      for(int var3 = 0; var3 < this.a.length; var3 += 2) {
         if (this.a[var3 + 1] > 0) {
            int var4 = g.b(1, at.a.nextInt(this.a[var3 + 1]));
            var2 = ad.a()[this.a[var3]].a(var4);
            int[] var10000 = this.a;
            var10000[var3 + 1] -= var4;
            break;
         }
      }

      if (var2 != null) {
         if (this.a.b) {
            this.a.f();
         }

         bl.a().c(this.d);
         boolean var5 = this.a && (var2.a() == 116 || var2.a() == 117);
         if (bl.a().c(var2.l())) {
            bl.d(var2.l());
            if (var5) {
               var2.a(true);
            }

            bl.a().b(var2);
            db var6 = this.a;
            var6.a += var2.l();
            if (var5) {
               this.f = true;
            } else if (this.d == 9) {
               bl.r += var2.l();
            } else if (var2.a() >= 132 && var2.a() < 154) {
               bl.d[var2.a() - 132] = true;
            }

            var1.a(var2.a(), var2.l(), false, var5, false, false);
            return;
         }

         if (var5) {
            this.e = true;
         }

         var1.a(var2.a(), var2.l(), true, false, false, false);
      }

   }

   public final boolean d() {
      return this.h;
   }

   public final void a(boolean var1, int var2) {
      this.h = true;
      this.i = var2;
      this.j = 2;
   }

   public void a(int var1, p var2) {
      this.j = var1;
      this.a = var2;
   }

   public void a(int var1) {
      this.a = var1;
   }

   public final void a(db var1) {
      this.a = var1;
   }

   public final void a(cf var1) {
      this.a = var1;
   }

   public final void a(bf var1) {
      this.a = var1;
   }

   public final bf a() {
      return this.a;
   }

   public final void a(az var1, int var2) {
      aa var10000 = this.a;
      int var3 = var2;
      az var5 = var1;
      aa var4 = var10000;
      if (var10000.a != null && var3 <= 3 && var3 >= 0) {
         var4.a[var3] = new az[1];
         var4.a[var3][0] = var5;
      }

   }

   public final int a() {
      return this.b;
   }

   public cc a(cc var1) {
      if (this.a != null) {
         return this.a.b(var1);
      } else {
         return this.a != null ? this.a.b(var1) : null;
      }
   }

   public final boolean e() {
      return this.a == 4;
   }

   public final boolean f() {
      return this.a == 3;
   }

   public final void c() {
      this.a = 4;
      this.d(false);
   }

   public final void d() {
      this.a = 5;
      this.a.e(false);
   }

   public final void e() {
      this.a = 1;
      this.a.e(true);
   }

   public final void a(ag var1) {
      this.c = var1;
   }

   public final void b(int var1) {
      if (var1 == 0) {
         this.b = bo.a(17);
         this.b.f(16384, 16384, 16384);
      } else if (var1 == 2) {
         this.b = bo.a(9996);
         this.b.f(2048, 2048, 2048);
      } else if (var1 == 3) {
         this.b = bo.a(6767);
         this.b.f(2048, 2048, 2048);
      } else {
         this.b = bo.a(6769);
         this.b.f(512, 512, 512);
      }

      this.b.a(2);
      this.b.b(this.a != null ? this.a.a() : this.a.a());
      this.a.a = this.b.a();
      this.a.a(this);
   }

   public final boolean g() {
      boolean var1 = false;
      if (this.a != null) {
         for(int var2 = 0; var2 < this.a.length; var2 += 2) {
            if (this.a[var2 + 1] > 0) {
               var1 = true;
               break;
            }
         }
      }

      return var1;
   }

   public abstract void a(long var1);

   public abstract boolean a(int var1, int var2, int var3);

   public boolean a(cc var1) {
      return false;
   }

   public cc b(cc var1) {
      return null;
   }

   public void f() {
   }

   public void a(int var1, int var2, int var3) {
   }

   public void a() {
      if (this.a != null) {
         at.a.a((ah)this.a);
      } else {
         at.a.a((ah)this.a);
      }
   }
}
