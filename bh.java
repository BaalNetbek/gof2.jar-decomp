public final class bh extends p {
   private int l = 5000;
   private int m = 50000;
   private int n = 500;
   private float a = 2.0F;
   private float b = 2.0F;
   private int o = 20;
   private cc c = new cc();
   private cc d = new cc();
   private cc e = new cc();
   private cc f = new cc();
   private static cm a = new cm();
   private int p;
   private boolean m;
   private int q;
   private int r;
   private int s;
   private int t;
   private int u;
   private aa b;
   private boolean n;
   private long a;
   private int v;
   private int w;
   private boolean o;
   private static bf b = new bf(new int[]{20000, 0, 20000, 20000, 0, -20000, -20000, 0, -20000, -20000, 0, 20000});
   private static bf c = new bf(new int[]{40000, 0, 40000, 40000, 0, -40000, -40000, 0, -40000, -40000, 0, 40000});
   private bf d;
   private int x;
   private int y;
   private t a;
   private boolean p;
   private float c;
   private float d;
   private y[] a;
   private boolean q;
   private boolean r;
   private boolean s;
   private int z;

   public bh(int var1, int var2, aa var3, ag var4, int var5, int var6, int var7) {
      super(var1, var2, var3, (ag)null, var5, var6, var7);
      this.d = var2;
      this.d.a(var5, var6, var7);
      this.d = true;
      this.a = new t(var2 != 9 && var2 != 8 ? 0 : 1);
      this.a.a(50);
      this.a.b(this.d);
      this.m = true;
      this.c = this.a;
      this.d = this.b;
      b.a(true);
      c.a(true);
      this.a = var2 == 9 ? c.b() : b.b();
      this.p = false;
      if (var2 == 9) {
         this.a = null;
      } else {
         be var8 = new be();
         this.a = var8.a();
      }

      this.m = bl.c() ? 100000 : '썐';
      this.r = true;
      this.v = this.a.e();
      this.w = 0;
      this.o = false;
      this.j = 0;
      this.k = true;
   }

   public final void b() {
      super.b();
      if (this.a != null) {
         this.a.a();
      }

      this.a = null;
      this.b = null;
      this.a = null;
   }

   public final void a(boolean var1) {
      this.a = var1;
      if (var1) {
         this.a = null;
         this.a = new int[2];
         this.a[0] = bl.a().d() == 5 ? 116 : 117;
         this.a[1] = 1;
      }

   }

   public final boolean a() {
      return this.f;
   }

   public final boolean h() {
      return this.e;
   }

   public final boolean i() {
      return !this.d;
   }

   public final boolean j() {
      return false;
   }

   public final void a(int var1, int var2, int var3) {
      this.e = var1;
      this.f = var2;
      this.g = var3;
      this.a.c(var1, var2, var3);
      this.d.a(var1, var2, var3);
      if (this.a != null) {
         this.a.b(this.d);
      }

   }

   public final void a(int var1, p var2) {
      super.a(var1, var2);
      switch(var1) {
      case 0:
         this.o = false;
         this.m = false;
         break;
      case 1:
         this.y = this.y == 0 ? 1 : 0;
         break;
      case 2:
         this.o = false;
         this.m = false;
         break;
      case 3:
      case 4:
         this.q = 5001;
         if (this.c != 3.0F) {
            this.s = 5001;
         }

         if (var1 == 3 && this.a.a() != null) {
            this.d = this.a.a().a();
            this.x = this.d.a();
         }
      }

      this.c = this.a;
      this.d = this.b;
   }

   public final void a(int var1) {
      this.m = false;
      this.a = (float)var1;
      this.c = this.a;
   }

   public final void c(int var1) {
      this.m = false;
      this.b = (float)3;
      this.d = this.b;
   }

   public final void d(int var1) {
      this.o = 0;
   }

   public final void g() {
      this.a = null;
   }

   public final void f(boolean var1) {
      for(ah var2 = this.a.a(); var2 != null; var2 = var2.b()) {
         if (var2.a() == 13067 || var2.a() == 13068 || var2.a() == 13070 || var2.a() == 13064 || var2.a() == 13065 || var2.a() == 13071) {
            var2.a(var1);
         }
      }

   }

   public final void a(long var1) {
      if (this.a == 4 && !this.d) {
         this.d(false);
      } else {
         this.s = (int)((long)this.s + var1);
         this.q = (int)((long)this.q + var1);
         if (this.d == 1) {
            this.d = 1;
         }

         this.a = var1;
         this.c = this.a.a(this.c);
         this.a.a = this.d != 8 && this.d != 9 ? (this.d() ? false : bl.a().a(this.d)) : true;
         this.a.b = this.d != 8 && this.d != 9 ? (this.d() ? true : bl.a().b(this.d)) : false;
         if (this.a.c()) {
            this.a.a = true;
            this.a.b = false;
         }

         if (this.a.b()) {
            this.a.b = true;
            this.a.a = false;
         }

         if (!this.h && this.a == null) {
            this.a = b.b();
         }

         this.u = (int)((long)this.u + var1);
         if (this.u > 200) {
            if (this.a != null) {
               this.a.a(this.c);
            }

            this.u = 0;
         }

         this.a.a = this.a.a();
         if (this.h && this.a != 4 && this.a != null) {
            this.a = this.a.a().a.a(this.a);
            if (this.j == 2) {
               cc var10000;
               switch(this.i) {
               case 0:
                  this.b = this.a.a().a.f(this.b);
                  var10000 = this.b;
                  var10000.a >>= 1;
                  var10000 = this.b;
                  var10000.b >>= 1;
                  var10000 = this.b;
                  var10000.c >>= 1;
                  this.a.c(this.b);
                  this.a.b(this.a.a().a.c(this.b));
                  break;
               case 1:
                  this.b = this.a.a().a.f(this.b);
                  var10000 = this.b;
                  var10000.a >>= 1;
                  var10000 = this.b;
                  var10000.b >>= 1;
                  var10000 = this.b;
                  var10000.c >>= 1;
                  this.a.b(this.b);
                  this.a.b(this.a.a().a.c(this.b));
                  break;
               case 2:
                  this.b = this.a.a().a.c(this.b);
                  this.a.c(this.b);
               }
            }

            if (this.a.b() > 1) {
               this.a = new bf(new int[]{this.a.a, this.a.b, this.a.c});
            } else {
               this.a.a(this.a);
            }

            this.a.a(true);
         }

         int var4;
         int var5;
         if (this.a != 4 && this.a != 3) {
            this.a.a(var1);
            aa[] var3;
            if ((var3 = this.a.a()) != null) {
               if (!this.q) {
                  this.p = -1;
               } else if (this.p >= 0 && !var3[this.p].d()) {
                  this.q = false;
               }

               this.b = null;
               if (this.q > 5000) {
                  bh var17;
                  boolean var10001;
                  label684: {
                     if (this.p) {
                        var17 = this;
                     } else {
                        var17 = this;
                        if (at.a.nextInt(100) < 20) {
                           var10001 = true;
                           break label684;
                        }
                     }

                     var10001 = false;
                  }

                  label679: {
                     var17.p = var10001;
                     this.q = 0;
                     if (at.a.nextInt(100) < 30 && var3.length > 1) {
                        this.q = false;

                        for(var4 = 0; var4 < 5 && !this.q; ++var4) {
                           this.p = at.a.nextInt(var3.length);
                           if (var3[this.p].d()) {
                              this.a = var3[this.p].a(this.a);
                              if (this.d != 8 && this.a.c() || this.c.a - this.a.a < this.m && this.c.a - this.a.a > -this.m && this.c.b - this.a.b < this.m && this.c.b - this.a.b > -this.m && this.c.c - this.a.c < this.m && this.c.c - this.a.c > -this.m) {
                                 this.q = true;
                                 break;
                              }
                           }
                        }

                        if (this.q) {
                           break label679;
                        }
                     }

                     this.p = 0;
                  }

                  if (this.h && this.j == 4 && this.a != null) {
                     for(var4 = 0; var4 < var3.length; ++var4) {
                        if (var3[var4].equals(this.a.a) && var3[var4].d() && !var3[var4].b()) {
                           this.p = var4;
                        }
                     }
                  }

                  if (var3[this.p].d() && !var3[this.p].e()) {
                     this.a = var3[this.p].a(this.a);
                     if (this.c.a - this.a.a >= this.m || this.c.a - this.a.a <= -this.m || this.c.b - this.a.b >= this.m || this.c.b - this.a.b <= -this.m || this.c.c - this.a.c >= this.m || this.c.c - this.a.c <= -this.m) {
                        this.p = -1;
                     }
                  } else {
                     this.p = -1;
                  }
               } else if (!this.q) {
                  for(var4 = 0; var4 < var3.length; ++var4) {
                     if (var3[var4] != null && var3[var4].d() && !var3[var4].e()) {
                        this.a = var3[var4].a(this.a);
                        if (this.d != 8 && this.a.c() || this.c.a - this.a.a < this.m && this.c.a - this.a.a > -this.m && this.c.b - this.a.b < this.m && this.c.b - this.a.b > -this.m && this.c.c - this.a.c < this.m && this.c.c - this.a.c > -this.m) {
                           this.p = var4;
                           this.q = true;
                           break;
                        }
                     }
                  }
               }

               if (!this.a.a && this.p == 0) {
                  this.p = 1;
                  this.q = false;
               }

               if (!this.h && this.p > 0) {
                  this.p = -1;

                  for(var4 = 1; var4 < var3.length; ++var4) {
                     if (var3[var4].d() && !var3[var4].e() && var3[var4].a() != null) {
                        var5 = var3[var4].a().d;
                        if (this.d() ? var3[var4].a : this.d != 8 && var5 == 8 || this.d == 8 && var5 != 8 || this.d != 9 && var5 == 9 || this.d == 9 && var5 != 9 || this.d == 1 && var5 == 0 || this.d == 0 && var5 == 1 || this.d == 2 && var5 == 3 || this.d == 3 && var5 == 2) {
                           this.p = var4;
                           this.q = true;
                           break;
                        }
                     }
                  }
               }

               if (this.h && !this.q && this.j == 2) {
                  this.p = -1;
               }

               this.n = false;
               if (this.p == -1 && this.a != null) {
                  if (this.a.a() != null && this.a.d()) {
                     this.a.a(this.a.a.a(), this.a.a.b(), this.a.a.c());
                     if (this.a.a() != null) {
                        this.e.a = this.a.a().l;
                        this.e.b = this.a.a().m;
                        this.e.c = this.a.a().n;
                        this.n = true;
                     }
                  } else {
                     this.p = 0;
                     this.b = this.a.a(this.p);
                     if (this.b != null) {
                        this.a = this.b.a(this.a);
                        this.e.a = this.a.a;
                        this.e.b = this.a.b;
                        this.e.c = this.a.c;
                     }
                  }
               } else {
                  if (this.p < 0) {
                     this.p = 0;
                  }

                  this.b = this.a.a(this.p);
                  this.a = this.b.a(this.a);
                  this.e.a = this.a.a;
                  this.e.b = this.a.b;
                  this.e.c = this.a.c;
               }
            } else if (this.a != null) {
               this.a.a(this.a.a.a(), this.a.a.b(), this.a.a.c());
               if (this.a.a() != null) {
                  this.e.a = this.a.a().l;
                  this.e.b = this.a.a().m;
                  this.e.c = this.a.a().n;
                  this.n = true;
               }
            } else {
               this.a = 5;
            }

            if (this.i && this.n) {
               this.k = (int)((long)this.k + var1);
               if (this.k >= 20000) {
                  this.k = 0;
                  this.a = 6;
                  this.n = false;
               }
            } else {
               this.k = 0;
            }

            if (this.h && this.j == 3 && this.d != null) {
               this.d.a(this.a.a.a(), this.a.a.b(), this.a.a.c());
               if (this.d.a() > this.x) {
                  this.d = null;
                  this.a(0, (p)null);
               } else if (this.d.a() != null) {
                  this.e.a = this.d.a().l;
                  this.e.b = this.d.a().m;
                  this.e.c = this.d.a().n;
                  this.n = true;
               }
            }
         }

         this.f.a = this.e.a - this.c.a;
         this.f.b = this.e.b - this.c.b;
         this.f.c = this.e.c - this.c.c;
         if (this.a.a && (this.a == 5 || this.h && this.j == 0)) {
            this.a = this.a.a().a.a(this.a);
            this.f.a = this.a.a - this.c.a;
            this.f.b = this.a.b - this.c.b;
            this.f.c = this.a.c - this.c.c;
            if (this.f.a < 25000 && this.f.a > -25000 && this.f.b < 25000 && this.f.b > -25000 && this.f.c < 25000 && this.f.c > -25000) {
               this.a = 1;
               this.a.e(true);
               if (this.h && this.j == 0) {
                  this.j = 2;
               }
            }
         }

         int var6;
         int var7;
         int var8;
         float var9;
         if ((var8 = this.a.e()) <= 0 && this.a != 3 && this.a != 4) {
            if (this.a.a) {
               if (this.d == 8) {
                  if (!this.a.d) {
                     bl.g();
                  }
               } else if (this.d == 9) {
                  this.a = new int[2];
                  this.a[0] = 131;
                  this.a[1] = 1 + at.a.nextInt(3);
               }

               this.a.a(this.a.d);
            } else {
               this.a.c();
               if (this.h) {
                  db.b(this.i);
               }
            }

            this.a = 3;
            this.z = 0;
            if (this.a != null) {
               this.a.a(this.c.a, this.c.b, this.c.c);
            }

            var4 = g.c(40000, this.f.a());
            var9 = 1.0F - (float)var4 / 40000.0F;
            var6 = at.a.a();
            at.a.a(1, (int)((float)var6 * var9));
            this.d = this.g();
            if (this.d) {
               this.b(this.d == 9 ? 3 : 0);
            }

            this.f(false);
            this.r = 10000;
            var7 = 0;

            for(ah var12 = this.a.a(); var12 != null; var12 = var12.b()) {
               cc var10;
               (var10 = var12.a().b()).a = -4096 + at.a.nextInt(8192);
               var10.b = -4096 + at.a.nextInt(8192);
               var10.c = -4096 + at.a.nextInt(8192);
               var10.a();
               var12.a().c(var10);
               ++var7;
            }

            this.s = var7 > 3;
         }

         boolean var13 = false;
         float var11;
         switch(this.a) {
         case 0:
            this.a = 1;
            break;
         case 1:
            if (this.m) {
               if (this.v > var8) {
                  this.w += this.v - var8;
                  this.v = var8;
                  if ((float)this.w / (float)this.a.f() * 100.0F > 40.0F) {
                     this.w = 0;
                     this.s = 10000;
                     this.o = true;
                  }
               }

               if (this.s > 5000 && this.c != 3.0F) {
                  if (this.o || at.a.nextInt(100) < this.o) {
                     this.t = at.a.nextInt(3000) + 5000;
                  }

                  this.s = 0;
                  this.c = 3.0F;
                  this.d = 1.3F;
               }

               if (this.c > this.a && this.s > this.t) {
                  this.s = 0;
                  this.o = false;
                  this.c = this.a;
                  this.d = this.b;
               }
            }

            if (this.b != null && !this.n && this.f.a < 8000 && this.f.a > -8000 && this.f.b < 8000 && this.f.b > -8000 && this.f.c < 8000 && this.f.c > -8000) {
               this.f = this.a.f(this.f);
            }

            this.f.a();
            this.b.a(this.f);
            this.f = this.a.a(a).d(this.b, this.f);
            this.f.b = -this.f.b;
            var9 = this.a.a();
            var11 = this.a.b();
            if (this.q && !this.n && this.b != null) {
               if (!this.b.c) {
                  if (this.f.a < this.n && this.f.a > -this.n && this.f.b < this.n && this.f.b > -this.n && this.e.a - this.c.a < 35000 && this.e.a - this.c.a > -35000 && this.e.b - this.c.b < 35000 && this.e.b - this.c.b > -35000 && this.e.c - this.c.c < 35000 && this.e.c - this.c.c > -35000) {
                     if (this.b.d() && !this.b.e() && var9 < 0.05F && var11 < 0.05F) {
                        this.a.a(this.y, var1, false);
                     } else {
                        this.q = false;
                     }
                  }
               } else {
                  this.q = false;
               }
            }

            if (!this.p) {
               this.a.a(this.a.c(this.a));
               this.b.c(this.a);
               this.b.a();
               this.b.a((int)((float)var1 * this.d));
               this.f = this.a.b(this.b, this.f);
               this.f.a();
               this.a.a().c(this.f);
            }

            if (!this.h || this.j != 0) {
               if (var11 < 0.05F && var9 < 0.05F) {
                  this.a.b((int)((float)var1 * this.c));
               } else {
                  if (var9 > 0.0F) {
                     this.a.a(this.a.a());
                     this.a.a((int)(512.0F * var9));
                     this.a.a(this.a);
                     var7 = (int)var1;
                     this.a.d(var7, var7, var7);
                     if ((var9 *= 0.98F) < 0.05F) {
                        var9 = 0.0F;
                     }

                     this.a.b(var9);
                  }

                  if (var11 > 0.0F) {
                     this.j = true;
                     var7 = (int)var1 >> 1;
                     this.a.d(var7, var7, var7);
                     if ((var11 -= (float)var1) < 0.05F) {
                        var11 = 0.0F;
                        this.j = false;
                     }

                     this.a.c(var11);
                  }
               }
            }
         case 2:
         default:
            break;
         case 3:
            var13 = true;
            this.r = false;
            var5 = (int)var1 >> 1;
            if (this.b != null) {
               this.b.d(var5, var5, var5);
            }

            if (this.a != null) {
               if (this.a.b()) {
                  this.a = 4;
                  this.a.a();
               } else {
                  this.z = (int)((long)this.z + var1);
                  if (this.z > this.l) {
                     this.z = 0;
                     this.a = 4;
                  }
               }
            } else {
               this.a = 4;
            }
            break;
         case 4:
            var13 = true;
            this.h = (int)((long)this.h + var1);
            if (this.d && this.a.d() && this.b != null) {
               var5 = (int)var1 >> 1;
               this.b.d(var5, var5, var5);
               if (this.h > 45000 && this.a != null) {
                  if (this.h < 90000) {
                     this.a.a(this.c.a, this.c.b, this.c.c);
                     if (this.a.a().a.b == this) {
                        this.a.a().a.b = null;
                     }

                     this.h = 90000;
                  } else if (this.a.b()) {
                     if (this.a && !this.f) {
                        this.e = true;
                     }

                     this.b = null;
                     this.h = 0;
                     this.d(false);
                  }
               }
            } else {
               if (this.a && !this.f) {
                  this.e = true;
               }

               if (this.h > 45000) {
                  this.d(false);
               }
            }
            break;
         case 5:
            if (this.b != null && !this.b.c && this.f.a < this.m && this.f.a > -this.m && this.f.b < this.m && this.f.b > -this.m && this.f.c < this.m && this.f.c > -this.m) {
               this.a = 1;
               this.a.e(true);
            }
            break;
         case 6:
            this.c *= 1.1F;
            this.a.b((int)((float)var1 * this.c));
            if (this.c > 100.0F) {
               this.c();
            }
         }

         if (var13) {
            this.r = (int)((long)this.r - var1);
            if (this.r < 0) {
               this.r = 0;
            }

            var5 = 1;
            var11 = (float)this.r / 10000.0F;

            for(ah var14 = this.a.a(); var14 != null; var14 = var14.b()) {
               var14.b((int)((float)((int)(var1 >> 1) * var5) * var11));
               ++var5;
            }
         }

         p[] var15;
         if (this.r && (var15 = this.a.b()) != null) {
            for(var6 = 0; var6 < var15.length; ++var6) {
               cc var16;
               if (var15[var6] != null && var15[var6].a(this.a.a(this.b)) && (var16 = var15[var6].b(this.a.a(this.b))) != null) {
                  this.a.a(this.a.c(this.a));
                  var16.c(this.a);
                  var16.a((int)((float)var1 * 5.0F));
                  this.c = this.a.b(var16, this.c);
                  this.c.a();
                  this.a.a().c(this.c);
                  this.a.b((int)((float)var1 * this.c));
               }
            }
         }

      }
   }

   public final void a() {
      if (this.b != null) {
         at.a.a((ah)this.b);
      }

      if (this.a.d() || this.a == 5) {
         if (this.a != 4 && this.a != 3) {
            at.a.a((ah)this.a);
            if (this.a != null) {
               this.a.b();
            }
         } else if (this.a == 3 || this.a == 4) {
            if (this.s) {
               at.a.a((ah)this.a);
            }

            if (this.a != null && !this.a.b()) {
               this.a.a(this.a);
            }
         }

         if (this.a == 6) {
            at.a.a((ah)this.c);
         }

      }
   }

   public final boolean a(int var1, int var2, int var3) {
      return this.a != 4 && this.a != 3 ? false : false;
   }

   public final void f() {
      ad.a(this.a, this.c);
      boolean var1 = this.a.c();
      this.a.a();
      if (var1) {
         this.a.d();
      }

      this.a = 1;
      this.b = null;
      this.q = false;
      this.p = -1;
      this.a.b();
      this.v = this.a.e();
      this.w = 0;
      this.o = false;
      this.h = 0;
      this.d(true);
      this.k = 0;
      this.c = this.a;
      this.f(true);
      if (this.d == 9) {
         this.a = null;
      } else {
         be var2 = new be();
         this.a = var2.a();
      }
   }
}
