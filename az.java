public final class az {
   private static final short[][][] a = new short[][][]{{{0, 0, 0}}, {{270, 0, 100}, {-270, 0, 100}}, {{320, 0, 100}, {0, 0, 100}, {-320, 0, 100}}, {{370, 0, 100}, {170, 100, 150}, {-170, 100, 150}, {-370, 0, 100}}, {{350, 100, 200}, {270, -100, 150}, {0, 0, 100}, {-270, -100, 150}, {-350, 100, 200}}, {{500, 100, 150}, {500, -100, 150}, {200, 0, 100}, {-200, 0, 100}, {-500, -100, 150}, {-500, 100, 150}}, {{500, -100, 150}, {400, 100, 150}, {200, -50, 100}, {0, 0, 150}, {-200, -50, 100}, {-400, 100, 150}, {-500, -100, 150}}, {{550, -100, 100}, {550, 100, 100}, {300, 0, 100}, {100, 0, 150}, {-100, 0, 150}, {-300, 0, 100}, {-550, 100, 100}, {-550, -100, 100}}, {{550, -100, 100}, {550, 100, 100}, {300, 0, 100}, {100, 100, 150}, {0, -100, 100}, {-100, 100, 150}, {-300, 0, 100}, {-550, 100, 100}, {-550, -100, 100}}, {{600, -120, 100}, {600, 120, 100}, {400, 0, 100}, {200, 100, 150}, {200, -100, 100}, {-200, -100, 100}, {-200, 100, 150}, {-400, 0, 100}, {-600, 120, 100}, {-600, -120, 100}}};
   private db a;
   private aa[] a;
   public cc[] a;
   cc[] b;
   private cc b;
   private cc c;
   private aa a;
   public int[] a;
   private int g;
   private int h;
   public int a;
   public float a;
   public int b;
   public cc a;
   public boolean a;
   private cc d;
   public int c;
   public int d;
   boolean b;
   private boolean c;
   public int e;
   public int f;
   private int i;
   private bk a;
   private boolean d;
   private boolean e;
   private int j;

   public az(int var1, int var2, int var3, int var4, int var5, int var6, float var7, cc var8, cc var9) {
      this.h = var2;
      this.a = var7;
      this.g = var1;
      this.a = var8;
      this.b = var5;
      this.d = var6;
      this.c = 0;
      if (var4 < 0) {
         var4 = Integer.MAX_VALUE;
      }

      this.a = var4;
      this.a = new int[var3];
      this.a = new cc[var3];
      this.b = new cc[var3];
      this.b = new cc();
      this.c = new cc();

      for(var1 = 0; var1 < var3; ++var1) {
         this.a[var1] = new cc(50000, 0, 0);
         this.b[var1] = new cc();
         this.a[var1] = -1;
      }

      this.c = true;
      this.a = false;
      this.d = new cc();
      this.b = false;
      this.a = null;
      this.a = null;
      this.d = false;
      this.e = false;
      this.j = 0;
   }

   public final void a(int var1) {
      this.j = 1000;
   }

   public final void a(boolean var1) {
      this.e = true;
   }

   public final void b(int var1) {
      this.i = var1;
   }

   public final int a() {
      return this.i;
   }

   public final void a(int var1, int var2) {
      short[] var3 = a[var2 - 1][var1];
      this.d.a(this.a);
      this.a = new cc(var3[0] + this.d.a, var3[1] + this.d.b, var3[2] + this.d.c);
   }

   public final void a() {
      this.a = null;
      this.a = null;
      this.a = null;
      this.b = null;
      this.b = null;
      this.c = null;
      this.a = null;
      this.a = null;
      this.a = null;
      this.a = null;
   }

   public final void a(bk var1) {
      this.a = var1;
   }

   public final void a(db var1) {
      this.a = var1;
   }

   public final void a(aa[] var1) {
      this.a = var1;
   }

   public final aa[] a() {
      return this.a;
   }

   public final boolean a(cm var1, long var2, boolean var4) {
      cm var10001 = var1;
      var1 = null;
      cm var10 = var10001;
      az var9 = this;
      this.c = 0;
      this.a = true;
      this.b = true;
      v var3 = null;
      if (this.e || (var3 = bl.a().a()[this.g]) != null && var3.l() != 0) {
         for(int var11 = 0; var11 < var9.a.length; ++var11) {
            if (var9.a[var11] <= 0) {
               var9.a[var11].a(var10.a(var9.d));
               if (var9.a != null) {
                  var9.d.a(var9.a);
                  var9.b = var10.c(var9.d, var9.b);
                  var9.a[var11].b(var9.b);
               }

               var9.d.a(var10.b(var9.d));
               var9.b[var11].a(var9.d);
               cc var10000;
               if (var9.j > 0) {
                  var10000 = var9.b[var11];
                  var10000.a += -(var9.j >> 1) + at.a.nextInt(var9.j);
                  var10000 = var9.b[var11];
                  var10000.b += -(var9.j >> 1) + at.a.nextInt(var9.j);
                  var10000 = var9.b[var11];
                  var10000.c += -(var9.j >> 1) + at.a.nextInt(var9.j);
               }

               var9.b[var11].a();
               var9.b[var11].a((int)(var9.a * (float)var2) << 12);
               var10000 = var9.b[var11];
               var10000.a >>= 12;
               var10000 = var9.b[var11];
               var10000.b >>= 12;
               var10000 = var9.b[var11];
               var10000.c >>= 12;
               var9.a[var11] = var9.b;
               if (!var9.e && var9.a > 0 && var3 != null && var3.b() == 1) {
                  --var9.a;
                  var3.c(-1);
                  if (var9.a == 0) {
                     bl.a().d(var3);
                  }
               }

               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   public final void b() {
      if (this.f == 7) {
         ++bl.q;
      }

      if (this.a != null) {
         for(int var1 = 0; var1 < this.a.length; ++var1) {
            this.a = this.a[var1];
            if ((this.f != 6 || !this.a.a()) && this.a.d()) {
               for(int var2 = 0; var2 < this.a.length; ++var2) {
                  this.b.a(this.a[var2]);
                  this.d = this.a.a.a(this.d);
                  this.d.c(this.b);
                  int var3;
                  if ((var3 = this.d.a()) < this.i) {
                     float var6;
                     if ((var6 = (float)(this.i - var3) / (float)this.i) > 1.0F) {
                        var6 = 1.0F;
                     }

                     int var4 = ad.a()[this.e].a(10);
                     if (this.f == 7) {
                        if (var4 != -979797979) {
                           this.a.c((float)var4 * var6);
                        }

                        this.a.b(var6);
                        if (this.a.a()) {
                           var6 *= 0.6F;
                        }

                        this.a.b((int)((float)this.h * var6), this.e);
                     } else {
                        this.a.a((int)((float)var4 * var6), this.e);
                     }

                     this.d.a();
                     this.a.a(this.d.a, this.d.b, this.d.c);
                     this.a[var2] = -1;
                     this.d.a(this.b[var2]);
                     this.d.a();
                  }
               }
            }
         }
      }

      boolean var5 = this.f == 7;
      this.a.a(var5 ? 3 : 4);
      at.a.d(var5 ? 11 : 12);
      if (this.a != null) {
         this.a.c(this.a[0]);
      }

   }

   public final void a(long var1) {
      this.c = (int)((long)this.c + var1);
      if (this.a != null) {
         this.a.a(var1);
      }

      if (this.b) {
         az var3 = this;
         boolean var6 = false;
         if (this.a != null) {
            boolean var7;
            boolean var8 = (var7 = this.f == 7 || this.f == 6) || this.f == 4 || this.f == 5;

            label96:
            for(int var9 = 0; var9 < var3.a.length; ++var9) {
               var3.a = var3.a[var9];
               if (var3.a.d()) {
                  for(int var10 = 0; var10 < var3.a.length; ++var10) {
                     var3.b.a(var3.a[var10]);
                     var3.c.a(var3.b[var10]);
                     int var4;
                     int var5;
                     int var13;
                     if (var3.a.e) {
                        var4 = var3.a.a - var3.b.a + var3.c.a;
                        var5 = var3.a.b - var3.b.b + var3.c.b;
                        var13 = var3.a.c - var3.b.c + var3.c.c;
                     } else {
                        var4 = var3.a.a.a() - var3.b.a + var3.c.a;
                        var5 = var3.a.a.b() - var3.b.b + var3.c.b;
                        var13 = var3.a.a.c() - var3.b.c + var3.c.c;
                     }

                     int var11 = (int)var3.a.a;
                     if (var4 < var11 && var4 > -var11 && var5 < var11 && var5 > -var11 && var13 < var11 && var13 > -var11) {
                        if (var8 && var3.a.a()) {
                           var3.a.b(9999, false);
                           break label96;
                        }

                        if (var7) {
                           var3.b();
                           break label96;
                        }

                        if ((var4 = ad.a()[var3.e].a(10)) != -979797979) {
                           var3.a.a(var4, var3.e);
                        }

                        var3.a.b(var3.h, var3.e);
                        var3.a.a(-var3.c.a, -var3.c.b, -var3.c.c);
                        var3.a[var10] = -1;
                        var3.d.a(var3.b[var10]);
                        var3.d.a();
                        if (var3.a != null) {
                           var3.a.c(var3.a[var10]);
                        }
                     }
                  }
               }
            }
         }

         for(int var12 = 0; var12 < this.a.length; ++var12) {
            if (this.a[var12] > 0) {
               int[] var10000 = this.a;
               var10000[var12] -= (int)var1;
               this.a[var12].b(this.b[var12]);
               if (this.a[var12] <= 0 && (this.f == 7 || this.f == 6)) {
                  this.b();
               }
            } else {
               this.a[var12].a(50000, 50000, 50000);
               this.b[var12].a(0, 0, 0);
            }
         }
      }

   }

   public final void c() {
      if (this.a != null) {
         this.a.b();
      }

   }
}
