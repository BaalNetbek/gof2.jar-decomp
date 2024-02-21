public final class aa {
   public az[][] a;
   private aa[] a;
   float a;
   private int d;
   private int e;
   private int f;
   private int g;
   private float b;
   private int h;
   private int i;
   private int j;
   private int k;
   private int l;
   private int m;
   private int n;
   private int o;
   private boolean f;
   private boolean g;
   public boolean a;
   public boolean b;
   public boolean c;
   public cm a;
   private cc a = new cc();
   private p a;
   private boolean h;
   public boolean d;
   private float c;
   private float d;
   private int p;
   private int q;
   private boolean i;
   private int r;
   private int s;
   private boolean j;
   private boolean k;
   private boolean l;
   public boolean e;
   public int a;
   public int b;
   public int c;

   public aa(float var1, int var2, int var3, int var4, int var5) {
      this.a = var1;
      this.f = var2;
      this.g = var2;
      this.f();
      this.a = new az[3][];
      if (var3 > 0) {
         this.a[0] = new az[var3];
      }

      if (var4 > 0) {
         this.a[1] = new az[var4];
      }

      if (var5 > 0) {
         this.a[2] = new az[var5];
      }

      this.a = new cm();
      this.f = true;
      this.g = true;
      this.a = null;
      this.h = false;
      this.d = false;
      this.e = false;
   }

   public final boolean a() {
      return this.a != null ? this.a.b : false;
   }

   public final void a(boolean var1) {
      this.k = var1;
      this.a = true;
      this.b = false;
      this.i = true;
   }

   public final void b(boolean var1) {
      this.l = var1;
      this.a = false;
      this.b = true;
      this.i = false;
   }

   public final boolean b() {
      return this.l;
   }

   public final void a(int var1, int var2) {
      this.d = var1;
      if (this.d > this.e) {
         this.e = this.d;
      }

      this.f();
      this.r = var2;
   }

   public final void c(boolean var1) {
      this.h = true;
   }

   public final void a(int var1) {
      this.a = (float)var1;
   }

   public final void a(p var1) {
      this.a = var1;
   }

   public final p a() {
      return this.a;
   }

   public final void a() {
      this.f = this.g;
      this.b = (float)this.h;
      this.f();
      this.f = true;
      this.g = true;
      this.a.a();
      this.d = false;
      this.i = false;
      this.p = 0;
      this.q = 0;
      this.c = false;
   }

   public final void a(aa[] var1) {
      this.a = var1;
      if (this.a != null) {
         for(int var3 = 0; var3 < this.a.length; ++var3) {
            if (this.a[var3] != null) {
               for(int var2 = 0; var2 < this.a[var3].length; ++var2) {
                  if (this.a[var3][var2] != null) {
                     this.a[var3][var2].a(this.a);
                  }
               }
            }
         }
      }

   }

   public final void b(aa[] var1) {
      if (this.a == null) {
         this.a(var1);
      } else {
         aa[] var2 = new aa[this.a.length + var1.length];

         int var3;
         for(var3 = 0; var3 < this.a.length; ++var3) {
            var2[var3] = this.a[var3];
         }

         for(var3 = 0; var3 < var1.length; ++var3) {
            var2[this.a.length + var3] = var1[var3];
         }

         this.a(var2);
      }
   }

   public final aa[] a() {
      return this.a;
   }

   public final aa a(int var1) {
      return this.a[var1];
   }

   public final void b(int var1) {
      this.f = var1;
      if (this.f > this.g) {
         this.g = this.f;
      }

      this.f();
   }

   public final void c(int var1) {
      this.b = (float)var1;
      if (this.b > (float)this.h) {
         this.b = (float)this.h;
      }

      this.f();
   }

   public final void d(int var1) {
      this.i = var1;
      if (this.i > this.j) {
         this.i = this.j;
      }

      this.f();
   }

   public final void e(int var1) {
      this.g = var1;
      this.f = var1;
      this.f();
   }

   public final void f(int var1) {
      this.h = var1;
      this.b = (float)var1;
      this.f();
   }

   public final void g(int var1) {
      this.j = var1;
      this.i = var1;
      this.f();
   }

   public final int a() {
      return (int)this.b;
   }

   public final int b() {
      return (int)this.b + this.i + this.f;
   }

   public final int c() {
      return this.i;
   }

   public final int d() {
      return this.j;
   }

   public final void a(float var1) {
      if (this.b + var1 < (float)this.h) {
         this.b += var1;
      } else {
         this.b = (float)this.h;
      }

      this.f();
   }

   public final void b() {
      if (this.i + 1 < this.j) {
         ++this.i;
      } else {
         this.i = this.j;
      }

      this.f();
   }

   public final void c() {
      if (this.f + 1 < this.g) {
         ++this.f;
      } else {
         this.f = this.g;
      }

      this.f();
   }

   public final int e() {
      return this.f;
   }

   public final int f() {
      return this.g;
   }

   private void f() {
      this.k = (int)((float)this.f / (float)this.g * 100.0F);
      this.l = (int)(this.b / (float)this.h * 100.0F);
      this.m = (int)((float)this.i / (float)this.j * 100.0F);
      this.n = (int)((float)this.d / (float)this.e * 100.0F);
   }

   public final int g() {
      return this.k;
   }

   public final int h() {
      return this.n;
   }

   public final int i() {
      return this.l;
   }

   public final int j() {
      return this.m;
   }

   public final void d(boolean var1) {
      this.g = var1;
   }

   public final void a(int var1, int var2, int var3) {
      this.a.a = var1;
      this.a.b = var2;
      this.a.c = var3;
   }

   public final void b(float var1) {
      this.c = var1;
   }

   public final void c(float var1) {
      this.d = var1;
   }

   public final float a() {
      return this.c;
   }

   public final float b() {
      return this.d;
   }

   public final cc a() {
      return this.a;
   }

   public final void a(int var1, boolean var2) {
      if (this.g && this.f && this.d > 0 && this.f > 0) {
         if (!var2 && this.a != null && !this.k && this.a.d != 9 && bl.a() != null && this.a.d == bl.a().c()) {
            this.q += var1;
            if (this.q > this.e / 3) {
               this.i = true;
               this.a.a.c(this.a.d);
            }
         }

         this.d -= var1;
         if (this.d <= 0) {
            if (!var2 && this.a != null) {
               if (!this.k && this.a.d != 9 && bl.a() != null && this.a.d == bl.a().c()) {
                  this.a.a.a(this.a.d, false);
               }

               if (!this.a.b && !this.a.c) {
                  bl.a().e(this.a.d);
               }
            }

            float var3 = (float)this.r;
            this.d = var3;
            this.j = true;
            this.d = 0;
            this.s = 0;
         }

         this.f();
      }
   }

   public final void b(int var1, boolean var2) {
      if (this.g && this.f && this.f > 0) {
         if (!var2 && this.a != null && !this.k && this.a.d != 9 && bl.a() != null && this.a.d == bl.a().c()) {
            this.p += var1;
            if (this.p > this.g / 3) {
               this.i = true;
               this.a.a.c(this.a.d);
            }

            if (this.a != null && this.p > this.g - this.g / 3) {
               this.a.a.a(this.a.d, true);
            }
         }

         if ((var1 = (int)this.b - var1) < 0) {
            this.b = 0.0F;
            if ((var1 = this.i - -var1) < 0) {
               this.i = 0;
               this.f -= -var1;
            } else {
               this.i = var1;
            }
         } else {
            this.b = (float)var1;
         }

         if (this.f <= 0) {
            this.f = 0;
            if (var2) {
               this.d = true;
            } else if (this.a != null && !this.a.b && !this.a.c) {
               bl.a().b(this.a.d);
            }
         }

         this.f();
      }
   }

   public final boolean c() {
      return this.i;
   }

   public final void d() {
      this.i = true;
   }

   public final boolean a(int var1) {
      if (var1 < 3 && var1 >= 0) {
         return this.a[var1] != null;
      } else {
         return false;
      }
   }

   public final cc a(cc var1) {
      return this.a.a(var1);
   }

   public final void e(boolean var1) {
      this.f = var1;
   }

   public final boolean d() {
      return this.f;
   }

   public final boolean e() {
      return this.f <= 0;
   }

   public final void e() {
      this.a = null;
   }

   public final void h(int var1) {
      if (this.a != null && 0 < this.a.length && this.a[0] != null) {
         for(var1 = 0; var1 < this.a[0].length; ++var1) {
            this.a[0][var1].c = 0;
         }
      }

   }

   public final void a(int var1, long var2, boolean var4, cm var5) {
      if (this.a != null && var1 < this.a.length && var1 >= 0 && this.a[var1] != null) {
         for(int var6 = 0; var6 < this.a[var1].length; ++var6) {
            if (this.a[var1][var6].c > this.a[var1][var6].d && this.a[var1][var6].a(var5, var2, var4)) {
               this.a[var1][var6].c = 0;
               if (this.h) {
                  switch(this.a[var1][var6].f) {
                  case 4:
                     at.a.d(8);
                     break;
                  case 5:
                     at.a.d(9);
                     break;
                  case 6:
                     at.a.d(10);
                     break;
                  case 7:
                     at.a.d(10);
                  }
               }
            }
         }
      }

   }

   public final void a(int var1, long var2, boolean var4) {
      this.a(var1, var2, false, this.a);
   }

   public final boolean a(int var1, int var2, long var3, boolean var5) {
      cm var13 = this.a;
      boolean var4 = false;
      long var9 = var3;
      int var12 = var2;
      var2 = var1;
      aa var11 = this;
      boolean var6 = true;
      if (this.a != null && var1 < this.a.length && var1 >= 0 && this.a[var1] != null) {
         for(int var7 = 0; var7 < var11.a[var2].length; ++var7) {
            az var8;
            if (((var8 = var11.a[var2][var7]).f == 7 || var8.f == 6) && var8.a[0] >= 0) {
               var8.b();
            } else if (var8.e == var12 && var8.c > var8.d) {
               if (var8.a(var13, var9, var4)) {
                  if (var11.h) {
                     switch(var11.a[var2][var7].f) {
                     case 4:
                        at.a.d(8);
                        break;
                     case 5:
                        at.a.d(9);
                        break;
                     case 6:
                        at.a.d(10);
                        break;
                     case 7:
                        at.a.d(10);
                     }
                  }

                  var8.c = 0;
                  break;
               }

               if (var8.a <= 0) {
                  var6 = false;
               }
            }
         }
      }

      return var6;
   }

   public final void a(long var1) {
      this.o = (int)((long)this.o + var1);
      if (this.o > 3000) {
         this.o = 0;
      }

      if (this.j) {
         this.s = (int)((long)this.s + var1);
         this.d = (int)((float)this.s / (float)this.r * (float)this.e);
         if (this.d > this.e) {
            this.d = this.e;
            this.j = false;
            this.s = 0;
         }

         this.f();
      }

   }
}
