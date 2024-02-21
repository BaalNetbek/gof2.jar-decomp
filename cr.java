public final class cr {
   private static int b = 5;
   private static int c = 5000;
   private static int d = 20000;
   private static int[][] a = new int[][]{{1, 0, 228, -72}, {7, 0, 215, 46}, {11, 0, 165, 147}, {17, 0, 224, 404}, {23, 0, 140, -21}, {24, 0, 195, 88}, {28, 0, 269, -69}, {33, 0, 255, -176}, {36, 0, 255, 1015}};
   public aa a;
   public ar a;
   private ar b;
   private ag a;
   private ag b;
   private cc a;
   private cc b;
   private bz a;
   private da a;
   private cf a;
   public db a;
   private bf a;
   public int a;
   private int e;
   private int f;
   private int g;
   private int h = -1;
   private long a;
   private long b;
   private long c;
   private int i;
   private boolean a;
   private long d;
   private int j;
   private boolean b;
   private int k;
   private boolean c;
   private boolean d;
   private boolean e;
   private cc c;
   private cm a = new cm();
   private float a;
   private int l;
   private boolean f;
   private p a;
   private boolean g;
   private cc d;
   private boolean h;
   private b a;
   private ap a;
   private ar c;
   private ar d;
   private ar e;
   private boolean i = false;
   private float b;
   private float c;
   private boolean j;
   private v a;
   private by a;
   private p b;
   private boolean k;
   private int m;
   private cc e;
   private boolean l;
   private int n;
   private int o;
   private int p;
   private int q;
   private al a;
   private boolean m;
   private boolean n;
   private boolean o;
   private int r;
   private boolean p;
   private int s;
   private int t;
   private int u;
   private int v;
   private float d;
   private x a;
   public bw a;
   public an a;
   private boolean q;
   private int[][] b;
   private int w;
   private boolean r;

   public cr(aa var1) {
      this.a = var1;
      this.a.c(true);
      this.a = new cc();
      this.b = new cc();
      this.d = new cc();
      this.c = new cc();
      this.g = 1;
      this.a = new bz();
      this.a = new da();
      this.i = this.a.b();
      this.a = 2;
      this.b = false;
      this.c = true;
      this.f = false;
      this.a = null;
      d = bl.a().l();
      b = 2 + (int)((float)bl.a().j() / 100.0F * 2.0F);
      c = bl.a().k();
      this.e = d > 0;
      this.a = bl.a().a();
      this.l = bl.a().m();
      this.a += (float)this.l / 100.0F;

      try {
         this.d = (float)bl.a().h() / ((float)bl.a().i() / 100.0F);
      } catch (Exception var2) {
         this.d = 0.0F;
      }

      this.k = false;
      this.l = false;
      this.q = false;
      this.a = bl.a().a(21);
      this.t = -1;
      this.u = this.a == null ? 0 : this.a.a(33);
      this.v = this.a == null ? 0 : this.a.a(34);
      this.j = false;
      this.p = false;
   }

   public final void a(int var1, int var2) {
      this.a = new ar();
      this.b = ad.a(var1, var2);
      var1 = 0;

      for(ah var4 = this.b.a(); var4 != null; var4 = var4.b()) {
         if (var4.a() == 13067 || var4.a() == 13068 || var4.a() == 13070 || var4.a() == 13064 || var4.a() == 13065 || var4.a() == 13071) {
            ++var1;
         }
      }

      if (var1 > 0) {
         this.b = new int[var1][3];
      }

      var2 = 0;

      for(ah var3 = this.b.a(); var3 != null; var3 = var3.b()) {
         if (var3.a() == 13067 || var3.a() == 13068 || var3.a() == 13070 || var3.a() == 13064 || var3.a() == 13065 || var3.a() == 13071) {
            this.a = var3.g(this.a);
            this.b[var2][0] = this.a.a;
            this.b[var2][1] = this.a.b;
            this.b[var2][2] = this.a.c;
            ++var2;
         }
      }

      this.a.a(this.b);
      if (bl.a().a(13) != null) {
         this.a = new by(this.a, bl.a().a(13).a() - 68);
      }

   }

   public final void a(boolean var1) {
      for(ah var2 = this.b.a(); var2 != null; var2 = var2.b()) {
         if (var2.a() == 13067 || var2.a() == 13068 || var2.a() == 13070 || var2.a() == 13064 || var2.a() == 13065 || var2.a() == 13071) {
            var2.a(var1);
         }
      }

   }

   public final void a() {
      this.i = this.a.b();
   }

   public final boolean a() {
      if (this.j) {
         this.a.c = false;
         this.j = false;
      } else if (this.t < 0) {
         this.a.c = true;
         this.j = true;
         this.t = 0;
      }

      return this.j;
   }

   public final boolean b() {
      return this.a != null;
   }

   public final boolean c() {
      return this.i;
   }

   public final void a(b var1, cp var2) {
      this.a = var1;
   }

   public final boolean a(boolean var1) {
      if (this.h && !this.p()) {
         this.i = var1;
         if (var1) {
            if (this.a == null) {
               this.a = ap.a(at.f, at.g, 700, 100, 31768);
               this.a.b(0, 500, -1400);
               this.a.d(0, 2048, 0);
               this.c = new ar();
               this.c.a(this.a);
               this.c.a((short)2);
               this.c.b(a[this.w][1], a[this.w][2], a[this.w][3]);
               this.c.d(0, 2048, 0);
               this.d = new ar();
               this.d.a(this.c);
            }

            this.d.b(this.c);
            this.d.a(this.a.a());
            at.a.a(this.a);
         } else {
            at.a.a((ap)this.a.a());
            bn.a(this.a, this.a);
         }

         return true;
      } else {
         return false;
      }
   }

   public final void b() {
      if (!this.b && this.e && this.j >= 0) {
         at.a.d(0);
         this.j = 0;
         this.a = b;
         this.b = true;
      }

   }

   public final void c() {
      this.j = 0;
      this.b = true;
      this.a = 8;
      c = 10000;
      d = 0;
   }

   public final int a() {
      return this.a != null ? this.a.a() : 0;
   }

   public final boolean d() {
      return this.b;
   }

   public final boolean e() {
      return this.j >= 0;
   }

   public final float a() {
      float var1;
      if ((var1 = (float)this.j / (float)(c / 6)) < 1.0F) {
         return var1;
      } else {
         return var1 > 5.0F ? 6.0F - var1 : 1.0F;
      }
   }

   public final float b() {
      float var1;
      return (var1 = (float)this.j / (float)d) > 0.0F ? 1.0F : var1 + 1.0F;
   }

   public final float c() {
      float var1;
      return (var1 = this.j ? (float)this.t / (float)this.u : (float)this.t / (float)this.v) > 0.0F ? var1 : 1.0F;
   }

   public final boolean f() {
      return !this.j && this.t == -1;
   }

   public final boolean g() {
      return this.j;
   }

   public final void b(boolean var1) {
      this.c = var1;
   }

   public final void a(db var1) {
      this.a = var1;
   }

   public final void a(bf var1) {
      this.a = var1;
   }

   public final bf a() {
      return this.a;
   }

   public final void d() {
      this.a = null;
   }

   private boolean w() {
      return this.a.e() <= 0;
   }

   public final void b(int var1, int var2) {
      if (this.i) {
         this.a.a(this.b.b());
         this.a.a(2, (long)var1, false, this.a);
      } else {
         if (var2 == 1) {
            if (!this.a.a(var2, this.h, (long)var1, false)) {
               this.h = -1;
               return;
            }
         } else {
            this.a.a(var2, (long)var1, false);
         }

      }
   }

   public final void a(az[] var1, int var2) {
      aa var6;
      if ((var6 = this.a).a != null && var2 <= 3 && var2 >= 0) {
         var6.a[var2] = new az[var1.length];
         var6.a[var2] = var1;
      }

      if (!this.h) {
         this.h = this.a.a(2);
         if (this.h) {
            v[] var8 = bl.a().a(2);
            short var9 = -1;
            short var4 = -1;
            byte var5 = -1;
            this.s = var8[0].a(15);
            switch(var8[0].a()) {
            case 47:
               var9 = 6770;
               var4 = 6771;
               var5 = 91;
               break;
            case 48:
               var9 = 6772;
               var4 = 6773;
               var5 = 75;
               break;
            case 49:
               var9 = 6774;
               var4 = 6775;
               var5 = 121;
            }

            this.a = bo.a(var9);
            this.b = bo.a(var4);
            this.a.a(2);
            this.b.a(2);
            this.b.a((short)2);
            this.e = new ar();

            for(var2 = 0; var2 < a.length; ++var2) {
               if (a[var2][0] == bl.a().b()) {
                  this.a.c(a[var2][1], a[var2][2], a[var2][3]);
                  this.b.c(a[var2][1], a[var2][2], a[var2][3]);
                  this.w = var2;
                  break;
               }
            }

            this.b.b(0, var5, 0);
            this.a.d(0, 2048, 0);
            this.b.d(0, 2048, 0);
            this.e.a(this.a);
            this.e.a(this.b);
         }
      }

   }

   public final int b() {
      return this.a.e();
   }

   public final int c() {
      return this.a.g();
   }

   public final int d() {
      return this.h;
   }

   public final void a(int var1) {
      this.h = var1;
   }

   public final cc a() {
      return this.a.b(this.a);
   }

   public final void c(boolean var1) {
      this.a.e(false);
   }

   public final void d(boolean var1) {
      this.p = var1;
   }

   public final void e(boolean var1) {
      this.a = var1;
   }

   public final void a(p var1) {
      this.a = var1;
      this.g = false;
      this.f = this.a != null;
      if (this.a != null && this.a instanceof ck) {
         this.g = true;
      }

   }

   public final p a() {
      return this.a;
   }

   public final boolean h() {
      return this.f && !this.k() && !this.l() && !this.g;
   }

   public final boolean i() {
      return this.f;
   }

   public final boolean j() {
      return this.a == this.a.b()[3];
   }

   public final boolean k() {
      return this.a == this.a.b()[1];
   }

   public final boolean l() {
      if (this.a.b()[0] != null) {
         return this.a == this.a.b()[0];
      } else {
         return false;
      }
   }

   public final boolean m() {
      return this.g;
   }

   public final void a(int var1, int var2, int var3) {
      this.a.c(var1, var2, var3);
      this.a.a.b(var1, var2, var3);
      this.a.a(var1, var2, var3);
   }

   public final void a(cc var1) {
      this.a.b(var1);
      this.a.a.b(var1);
   }

   public final boolean n() {
      return this.q;
   }

   public final void a(int var1, bw var2, x var3, an var4, int var5) {
      if (this.a == null) {
         this.a = var3;
         this.a = var2;
         this.a = var4;
      }

      if (!this.a) {
         this.c = this.a.b(this.c);
         this.d = (long)var1;
         if (this.j < 0 && this.j + var1 * 3 > 0) {
            var3.a(4, this);
            this.j = 0;
         }

         this.j += var1;
         int var9;
         if (this.b) {
            var9 = 0;
            int var6 = (int)(this.a() * 2048.0F);

            ah var7;
            int[] var8;
            for(var7 = this.b.a(); var7 != null; var7 = var7.b()) {
               if (var7.a() == 13067 || var7.a() == 13068 || var7.a() == 13070 || var7.a() == 13064 || var7.a() == 13065 || var7.a() == 13071) {
                  var8 = this.b[var9++];
                  var7.f(var8[0] + var6, var8[1] + var6, var8[2] + var6 * 2);
               }
            }

            if (this.j > c) {
               var9 = 0;
               this.a = 2;
               this.b = false;
               this.j = -d;
               if (!this.e) {
                  c = 0;
                  b = 2;
                  d = 0;
               }

               for(var7 = this.b.a(); var7 != null; var7 = var7.b()) {
                  if (var7.a() == 13067 || var7.a() == 13068 || var7.a() == 13070 || var7.a() == 13064 || var7.a() == 13065 || var7.a() == 13071) {
                     var8 = this.b[var9++];
                     var7.f(var8[0], var8[1], var8[2]);
                  }
               }
            }
         }

         if (this.j) {
            if (this.q >= 0) {
               this.p = (int)((long)this.p + (this.d << 3));
               this.q = (int)(-4.8828125E-4F * (float)((this.p - 4096) * (this.p - 4096)) + 8192.0F + 4096.0F);
               this.a.f(this.q, 4096, 4096);
            } else {
               this.a.f(4096, 4096, 4096);
            }

            this.t = (int)((long)this.t + this.d);
            bl.d += this.d;
            if (this.t > this.u) {
               this.t = 0;
               this.j = false;
               this.a.c = false;
            }
         } else {
            if (this.p > 0) {
               this.p = (int)((long)this.p - (this.d << 3));
               this.q = (int)(-4.8828125E-4F * (float)((this.p - 4096) * (this.p - 4096)) + 8192.0F + 4096.0F);
               this.a.f(this.q, 4096, 4096);
            } else {
               this.p = 0;
               this.a.f(4096, 4096, 4096);
            }

            if (this.t >= 0) {
               this.t = (int)((long)this.t + this.d);
               if (this.t > this.v) {
                  this.t = -1;
               }
            }
         }

         if (this.a != null) {
            this.a.a(this.d, var2, this.a, var3);
         }

         this.a.a((int)this.d);
         this.d = false;
         if (this.p || this.o || this.n) {
            this.d = true;
            if (this.o) {
               this.r = (int)((long)this.r + this.d);
            }

            this.a.b(var1 * this.a);
         }

         if (this.c) {
            this.r = false;
            this.a(this.a.b());
            this.a(this.a.a());
            this.a(this.a.c());
         }

         if (this.k) {
            this.d = true;
            if (this.b.e()) {
               this.a((p)null, this.a, var2);
               return;
            }

            this.a(var3, var5);
         }

         if (this.f && this.a != null && !this.d) {
            if (this.g && ((ck)this.a).a != null) {
               this.a = ((ck)this.a).a.a();
            }

            if (this.a != null && !this.n) {
               this.b = this.a.a(this.b);
               this.b(this.b);
            } else {
               this.a((p)null);
            }
         } else if (!this.d) {
            if (this.i) {
               ((ap)this.a.a()).b(true);
               this.a.c();
               this.d.b(this.c);
               this.a = this.a.e(this.a);
               this.a.a(512);
               this.d.a(this.a);
               this.e = this.f = 0;
               this.f((int)this.d);
            } else {
               this.a.d((int)(this.a * (float)(this.e * var1 / 3)));
               this.k = (int)(this.a * (float)(this.f * var1 / 3));
               this.a.e(this.k);
               if (this.e == 0 && this.f == 0) {
                  this.f((int)this.d);
               }
            }

            this.a.b(var1 * this.a);
         }

         if (this.k || !this.d && !this.i) {
            this.b.e(0, 0, -this.g);
            if (this.g > 0 && this.f == 0) {
               this.g -= var1 / 2;
            } else if (this.g < -var1 / 2 && this.f == 0) {
               this.g += var1 / 2;
            }

            this.e = this.f = 0;
         }

         if (this.h) {
            this.e.a(this.a.a());
            this.e.c(-this.g);
            if (this.i) {
               this.d.a(this.a.a());
               this.d.c(-this.g);
               this.d.b(true);
            }
         }

         if (bl.a().i() > 0) {
            this.a += (long)var1;
            if (this.a > 100L) {
               this.a = 0L;
               this.a.a(this.d);
            }
         }

         if (bl.a().d()) {
            this.b += (long)var1;
            this.c += (long)var1;
            if (this.b > 600L) {
               this.b = 0L;
               if (this.a.e() < this.a.f()) {
                  this.a.c();
               }
            }

            if (this.c > 1000L) {
               this.c = 0L;
               if (this.a.c() < this.a.d()) {
                  this.a.b();
               }
            }
         }

         this.a.a((long)var1);
         this.a.a((long)var1, this.a.a);
         if (this.i) {
            this.a.a(this.b.b(), at.a.a());
         } else {
            this.a.a(this.a.a(), at.a.a());
         }

         this.a.a = this.b.b();
         if (this.a != null) {
            var9 = this.a.a();
            this.a.a(this.a.b(), this.a.c(), this.a.d());
            if (this.a.a() != var9) {
               if (!this.a.a() && this.a.a() == 0) {
                  var3.a(24, this);
               } else {
                  var3.a(23, this);
               }
            }
         }

         if (this.i > this.a.b()) {
            at.a(110);
            var3.b();
            this.i = this.a.b();
         }

         if (this.c.a() > 500000) {
            this.a.c(20000, this.c.b, 20000);
         }

         if (this.w()) {
            if (this.a.d()) {
               this.a.a(this.a.b(), this.a.c(), this.a.d());
            }

            this.a.e(false);
         }

      }
   }

   public final boolean o() {
      return this.r;
   }

   public final boolean p() {
      return this.a != null;
   }

   private void a(p[] var1) {
      if (var1 != null) {
         for(int var2 = 0; var2 < var1.length; ++var2) {
            p var3;
            if ((var3 = var1[var2]) != null && var3.a(this.a.a(this.b))) {
               int var8;
               if (var3.a() == 6805 && var3.b()) {
                  if (!((c)var3).a() && !this.p()) {
                     this.b = var3.a(this.b);
                     this.b.c(this.a.a(this.a));
                     int var9 = this.b.a();
                     var8 = '鱀' - var9;
                     int var6;
                     int var7 = (var6 = g.b(1, (int)((float)(this.d << 1) * ((float)var8 / 40000.0F)))) << 1;
                     this.a.b(-var6 + at.a.nextInt(var7), -var6 + at.a.nextInt(var7), -var6 + at.a.nextInt(var7));
                     var8 >>= 8;
                     this.b.a();
                     this.a.a(this.b);
                     this.a.a(var8);
                     this.a.a(this.a);
                     if (var9 < 4096) {
                        this.q = true;
                     }
                  }
               } else {
                  cc var4;
                  if (var3.b) {
                     if (!var3.f() && !var3.e() && (!this.k || var3 != this.b) && (var4 = var3.b(this.a.a(this.b))) != null) {
                        var3.a.a(var4.a, var4.b, var4.c);
                        var3.a.b(this.b ? 0.7F : 0.4F);
                        short var5 = 9999;
                        var3.a.b(var5, false);
                        if (((cn)var3).b() > 30) {
                           byte var10 = 40;
                           this.a.b(var10, false);
                           this.a.d();
                        }
                     }
                  } else if ((var4 = var3.b(this.a.a(this.b))) != null) {
                     this.a.a(this.a.c(this.a));
                     var4.c(this.a);
                     var8 = var4.a();
                     var4.a((int)((float)(this.d >> 2) * (float)(var8 >> 7)));
                     this.b = this.a.b(var4, this.b);
                     this.b.a();
                     this.a.a().c(this.b);
                     this.a.b((int)this.d * this.a);
                     this.f((int)this.d);
                     this.d = true;
                     if (var2 == 0) {
                        this.r = true;
                        return;
                     }
                     break;
                  }
               }
            }
         }
      }

   }

   public final void b(int var1) {
      if (this.i) {
         var1 /= 200 / this.s;
         this.c.d(0, var1, 0);
         this.a.d(0, var1, 0);
         this.b.d(0, var1, 0);
      } else if (!this.k && this.g < 384) {
         this.g += (int)(this.a * (float)var1);
      }

      this.f = 1;
   }

   public final void c(int var1) {
      if (this.i) {
         var1 /= 200 / this.s;
         this.c.d(0, -var1, 0);
         this.a.d(0, -var1, 0);
         this.b.d(0, -var1, 0);
      } else if (!this.k && this.g > -384) {
         this.g -= (int)(this.a * (float)var1);
      }

      this.f = -1;
   }

   public final void d(int var1) {
      if (this.i) {
         if (this.c < 0.0F) {
            this.c += (float)var1;
            this.b.d(var1, 0, 0);
         }

         if (this.b < 0.0F) {
            float var2 = (float)var1 / 2.0F;
            this.b += var2;
            this.c.d((int)var2, 0, 0);
         }
      }

      this.e = 1;
   }

   public final void e(int var1) {
      if (this.i) {
         if (this.c > -500.0F) {
            this.c -= (float)var1;
            this.b.d(-var1, 0, 0);
         }

         if (this.b > -250.0F) {
            float var2 = (float)var1 / 2.0F;
            this.b -= var2;
            this.c.d(-((int)var2), 0, 0);
         }
      }

      this.e = -1;
   }

   private void f(int var1) {
      this.a.a();
      var1 = g.c(var1, 60);
      this.a = this.a.e(this.a);
      this.b = this.a.f(this.b);
      this.a.a();
      int var2 = this.a.c().b(this.b);
      if (this.a.c().b(this.a) < 0) {
         if (var2 <= 0) {
            this.a.c(var1 >> 1);
            return;
         }
      } else {
         if ((var2 <= 128 || var2 >= 3968) && (var2 >= -128 || var2 <= -3968)) {
            return;
         }

         if (var2 < 0) {
            this.a.c(var1 >> 1);
            return;
         }
      }

      this.a.c(-var1 >> 1);
   }

   public final void e() {
      this.a.a(this.a.b(), this.a.c(), this.a.d());
   }

   public final void a(cf var1) {
      this.a = var1;
   }

   public final void f() {
      this.a.h(0);
   }

   public final boolean q() {
      return this.k && this.m != 1;
   }

   public final boolean r() {
      return false;
   }

   public final boolean s() {
      return this.n;
   }

   public final void a(b var1) {
      var1.a(false);
      this.o = true;
      this.a = 8;
      this.r = 0;
   }

   public final boolean t() {
      return this.o;
   }

   public final boolean u() {
      return this.r > 3000;
   }

   public final void a(b var1, boolean var2) {
      this.a = ((bx)this.a.b()[1]).c(this.a);
      if (var2) {
         this.n = true;
         this.m = false;
      } else {
         this.a = 2;
         this.b = this.a.c(this.b);
         this.b.a(8192);
         this.a.b(this.b);
         this.a(this.a);
         this.d = false;
         this.a = false;
         var1.a(true);
         this.m = false;
         this.n = false;
         this.a((p)null);
      }
   }

   public final boolean v() {
      return this.k;
   }

   private boolean a(x var1, int var2) {
      if (this.b == null) {
         return false;
      } else {
         int var3;
         switch(this.m) {
         case 0:
            if (this.i) {
               this.a(false);
            }

            this.b.a(this.b.a.a(this.b));
            this.b.c(this.a.a(this.c));
            if ((var3 = this.b.a()) >= this.n) {
               this.b(this.b.a.a(this.b));
            } else if (this.l) {
               if (this.b instanceof cn) {
                  ((cn)this.b).a(false);
               }

               this.m = 1;
            }

            if (var3 < this.n + 2000) {
               if (this.e == null) {
                  this.j = c - c / 6;
                  this.a.a(false);
                  this.e = new cc(this.a.e(this.a));
                  this.e.a();
               }

               this.a.a(this.a.c(this.a));
               this.a.a();
               this.a.c(this.e);
               if (g.e(this.a.a()) > 1500) {
                  if (this.o > -1024) {
                     var3 = -((int)this.d) >> 1;
                     this.o += var3;
                     this.a.d(var3);
                  } else {
                     this.l = true;
                  }
               } else {
                  this.l = true;
               }
            }
            break;
         case 1:
            if (this.o > -1024) {
               var3 = -((int)this.d) >> 1;
               this.o += var3;
               this.a.d(var3);
            } else if (this.a == null) {
               this.a = new al(((cn)this.b).c(), ((cn)this.b).l, var1);
               this.a(false);
               at.a.d(6);
            } else if (!this.a.a((int)this.d, var2)) {
               if (!this.a.a() && this.a.a() > 0) {
                  this.g();
               } else if (this.a.a()) {
                  this.g();
                  var1.a(8, this);
               }

               return true;
            }
         }

         return false;
      }
   }

   public final void g() {
      int var1;
      int var2 = (var1 = ((cn)this.b).l) - 154 + 165;
      int var3;
      int var4 = g.c(var3 = bl.a().r(), this.a.a());
      if (var3 > 0) {
         v var5 = null;
         boolean var6 = var3 >= 1;
         if (this.a.b() && var6) {
            var5 = ad.a()[var2].a(1);
            bl.a().b(var5);
            this.a.a(var2, 1, false, false, false, false);
            ++bl.m;
            bl.c[var2 - 165] = true;
            if ((var3 = bl.a().r()) < var4) {
               var4 = var3;
            }
         }

         if (var4 > 0) {
            var5 = ad.a()[var1].a(var4);
            bl.a().b(var5);
            this.a.a(var1, var4, false, false, true, false);
            bl.l += var4;
            bl.b[var1 - 154] = true;
         }

         if (bl.a().r() <= 0) {
            this.a.a(var1, var4, true, false, true, false);
         }
      } else {
         this.a.a(var1, 0, true, false, true, false);
      }

      this.a(true);
      this.b.a = null;
      this.b.d = false;
      this.b.a.b(-1);
      --bl.u;
      this.a = null;
      this.a((p)null, this.a, this.a);
   }

   private void b(cc var1) {
      this.b.a(var1);
      this.b.c(this.a.a(this.c));
      this.b.a();
      this.a.a(this.a.c(this.a));
      this.a.a();
      this.b.c(this.a);
      this.b.a((int)((float)this.d * 4.0F));
      this.d = this.a.b(this.b, this.d);
      this.d.a();
      this.a.a().c(this.d);
      if (this.e == 0 && this.f == 0) {
         this.f((int)this.d);
      }

      this.a.b((int)this.d * this.a);
   }

   public final void a(p var1, b var2, bw var3) {
      if (this.k) {
         ((cn)this.b).a(true);
         this.k = false;
         this.d = false;
         this.b = null;
         this.e = null;
         var2.a(true);
         at.a.a((ap)var2.a());
         bn.a(var2, this.a);
         this.a.h(0);
         this.a = null;
         var3.b();
      } else if (var1 != null) {
         this.o = 0;
         this.a = var2;
         this.k = true;
         this.b = var1;
         this.a = var1.a.g(this.a);
         this.n = (this.a.a + this.a.b + this.a.c) / 2;
         this.d = true;
         this.m = 0;
      }
   }

   public final void h() {
      this.a = null;
      if (this.a != null) {
         this.a.c();
      }

      this.a = null;
      if (this.a != null) {
         this.a.a();
      }

      this.a = null;
      if (this.a != null) {
         this.a.a();
      }

      this.a = null;
      if (this.a != null) {
         this.a.a();
      }

      this.a = null;
      if (this.b != null) {
         this.b.a();
      }

      this.b = null;
      System.gc();
   }

   public final void f(boolean var1) {
      if (this.w()) {
         this.a.a(this.d);
         this.a.b();
      } else {
         if (this.a.a()) {
            this.a.a(this.d);
         }

         if (this.q >= 0) {
            at.a.a((ah)this.a);
            if (this.h) {
               at.a.a((ah)this.e);
            }
         } else {
            this.a.b(true);
            if (this.h) {
               this.e.b(true);
            }
         }

         if (this.a != null) {
            this.a.a();
         }

         if (!this.a && var1 && this.m != 1) {
            this.a.b();
         }

      }
   }

   public final void a(boolean var1, ap var2) {
      if (this.a != null) {
         this.a.a();
      } else {
         if (!this.p && !this.w() && !this.a && var1 && !this.k && !this.o && !this.n && !this.f) {
            this.a.b();
         }

      }
   }

   public final void i() {
      this.a.d();
   }

   public final x a() {
      return this.a;
   }
}
