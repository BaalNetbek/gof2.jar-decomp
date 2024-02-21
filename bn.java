import com.nokia.mid.ui.DeviceControl;

public final class bn {
   private db a;
   private int b;
   private boolean b;
   private boolean c;
   private boolean d;
   private cp a;
   private int c;
   private cc a = new cc();
   private cc b = new cc();
   private cc c = new cc();
   public boolean a;
   private x a;
   private bw a;
   private ag a;
   public int a;
   public long a;

   public bn(b var1, cp var2, db var3, x var4, bw var5) {
      this.a = var4;
      this.a = var5;
      this.a = var3;
      this.b = 0;
      this.b = true;
      this.c = true;
      this.d = false;
      this.a = var2;
      this.a = false;
      this.a = var3.d();
      this.a = 0L;
      var1.a(false);
      var2.a(true);
      if (var3.a() == null) {
         this.c = false;
      }

      if (bl.a() == 0) {
         var4.a = false;
         var5.a = false;
         var3.a().e(true);
         var3.a().d(true);
         at.a.a().c(0, 0, 0);
         at.a.a().e(0, 1800, 0);
         this.d = true;
         var1.a(false);
         var2.a(false);
         var3.a().a(0, 0, 120000);
      } else if (bl.a() == 1) {
         var4.a = false;
         var5.a = false;
         var3.a().a.e(300, 300, 1000);
         var3.a().e(true);
         var3.a().d(true);
         var3.a().a(0, 0, 0);
         var3.a().a(false);
         at.a.a().c(1500, 600, -3000);
         this.d = true;
         var2.a(true);
         var2.a(var3.a().a);
      } else {
         if (db.a) {
            this.a.a = 500 + at.a.nextInt(500);
            this.a.b = 500 + at.a.nextInt(500);
            this.a.c = 10000;
         } else {
            this.a.a = 1000 + at.a.nextInt(2000);
            this.a.b = 500 + at.a.nextInt(2000);
            this.a.c = 9000;
         }

         cc var10000;
         if (at.a.nextInt(2) == 0) {
            var10000 = this.a;
            var10000.a = -var10000.a;
         }

         if (at.a.nextInt(2) == 0) {
            var10000 = this.a;
            var10000.b = -var10000.b;
         }

         cm var6;
         (var6 = new cm()).e(var3.a().a.g());
         this.b = var6.c(this.a, this.b);
         this.b.b(var3.a().a.a(this.a));
         at.a.a().b(this.b);
         var1.a(this.b);
         var2.a(var3.a().a.e(), 2);
         if (bl.c() || db.b) {
            if (bl.a() < 43) {
               this.c = var3.a().a.c(this.c);
               this.c.a(8192);
               this.a.c(this.c);
               ((c)var3.b()[3]).a(true);
               var3.b()[3].a(this.a.a, this.a.b, this.a.c);
               var3.b()[3].b(true);
            }

            db.b = false;
         }
      }

      var3.a().b(false);
   }

   public final boolean a(int var1, b var2) {
      bq[] var3 = this.a.a();
      cr var4 = this.a.a();
      ap var5 = at.a.a();
      p[] var6 = this.a.a();
      int var7;
      if (this.c) {
         this.c += var1;
         if (bl.a() == 0) {
            try {
               DeviceControl.setLights(0, 100);
            } catch (Exception var9) {
            }

            if (!var3[1].a()) {
               var5.d(0, var1 >> 4, 0);
               var6[0].d();
               var6[1].d();
            } else if (this.b == 0) {
               this.a.a(true);
               var4.e(false);
               var4.a.e(0, 2048, 0);
               var5.c(-1000, -500, 110000);
               this.b = 1;
            } else {
               if (this.b < 6) {
                  for(var7 = 0; var7 < 2; ++var7) {
                     int var8 = g.a(this.c) >> 10;
                     var6[var7].a.b(0, var8, 0);
                  }

                  var6[0].d();
                  var6[1].d();
               }

               if (var3[2].b() && this.b == 1) {
                  var4.e(true);
                  this.a.a(var6[0].a);
                  var5.b(var6[0].a(this.a));
                  var5.b(1000, 700, 1500);
                  this.b = 2;
               }

               if (var3[3].b() && this.b == 2) {
                  this.a.a(var6[1].a);
                  var5.b(var6[1].a(this.a));
                  var5.b(-2300, 300, 200);
                  this.b = 3;
               }

               if (var3[5].b() && this.b == 3) {
                  var6[2].e();
                  this.a.a(var6[2].a);
                  var5.b(var6[2].a(this.a));
                  var5.b(1000, 200, 6000);
                  this.b = 4;
               }

               if (var3[6].b() && this.b == 4) {
                  this.a.a(var6[1].a);
                  var5.b(var6[1].a(this.a));
                  var5.b(-1300, 300, 1700);
                  this.b = 5;
               }

               if (var3[7].b() && this.b == 5) {
                  this.a.a = true;
                  this.a.a().b(true);
                  var4.e(false);
                  this.a.a(var4.a);
                  this.a.a(false);
                  var2.a(true);
                  this.b = 6;
                  at.a.c(3);
               }

               if (var3[8].b() && this.b == 6) {
                  var6[0].e();
                  var6[1].e();
                  var6[2].e();
                  ((bh)var6[0]).f(true);
                  ((bh)var6[1]).f(true);
                  var4.d(false);
                  this.b = false;
                  this.b = 7;
               }

               if (var3[10].a() && this.b == 7) {
                  this.a.a().b(false);
                  this.a.a = false;
                  var4.d(true);
                  var4.a.e();
                  var2.a(false);
                  this.a.a(true);
                  this.a.a(var4.a);
                  var4.a.e(0, 2048, 0);
                  var5.b(var4.a.a());
                  var5.b(1000, -200, -60000);
                  this.b = 8;
                  this.c = 0;
               }

               if (var3[12].b() && this.b == 8) {
                  var4.e(true);
                  this.b = 9;
                  var4.e();
                  this.a.a(3);
                  var4.a(false);
               }

               if (this.b == 9) {
                  var4.a.d(var1 >> 1, var1 >> 1, var1 >> 1);
                  if (var3[16].b()) {
                     this.b = 10;
                  }
               }

               if (this.b == 10) {
                  var4.e(false);
                  var5.b(var4.a.a());
                  var5.e(0, 0, 0);
                  var5.b(-1000, -700, -1500);
                  if (var3[14].b()) {
                     var4.a(true);
                     this.b = 11;
                     var4.a.e(0, 0, 0);
                     var5.b(var4.a.a());
                     var5.b(1000, 200, 15000);
                  }
               }

               if (var3[21].b()) {
                  bl.b();
                  at.a.a(at.a[2]);
                  db.a = false;
                  return false;
               }
            }
         } else if (bl.a() == 1) {
            var4.a.d(0, var1 >> 3, 0);
            if (var6[0].a(this.a).c < -1800) {
               var6[0].a.b(var1 >> 1);
            } else {
               ((bh)var6[0]).a = 5;
               ((bh)var6[0]).f(false);
            }

            if (var3[2].b()) {
               at.a.a(at.a[1]);
               return false;
            }
         }

         if (this.a.a() != null && bl.a() > 1 && this.c > 7000) {
            this.c = 0;
            this.c = false;
            this.d = true;
            this.a.a(false);
            var2.b(at.a.a().a());
            var2.a(true);
            a(var2, this.a);
            this.b = false;
            this.a.a().b(true);
            if (db.a != null && !db.a.a(bl.a())) {
               this.a.a(5, this.a.a());
            }

            db.a = false;
            if (!db.c) {
               this.d();
            }
         }
      }

      if (bl.a() == 5 && this.b == 0) {
         this.a = var4.a();
         var6[0].a(this.a.a + 5000, this.a.b, this.a.c + 30000);
         var6[0].a.d(0, 2048, 0);
         var6[0].e();
         this.b = 1;
      }

      if (bl.a().g() && !bl.a().a()) {
         switch(bl.a()) {
         case 14:
            if (var3[1].b() && this.b == 0) {
               this.a.a = false;
               this.a.a = false;
               this.a.a(4);
               var4.d(true);
               var4.a = 0;
               var4.a.e();
               var2.a(false);
               this.a.a(true);
               this.a.a(var4.a);
               var5.b(var4.a());
               var5.b(1000, 700, 1000);

               for(var7 = 0; var7 < this.a.a().length; ++var7) {
                  if (this.a.a()[var7].d == 8) {
                     this.a.a()[var7].a.b(0);
                  }
               }

               this.b = 1;
            } else if (this.b == 1) {
               var4.a.d(0, var1 >> 1, 0);
               var5.b(0, 0, var1);
            }
            break;
         case 16:
         case 21:
            if (var3[0].a() && this.b == 0) {
               this.a.a = false;
               this.a.a = false;
               var4.d(true);
               var2.a((ah)this.a.a()[0].a);
               this.a.a(300, 400, 3500);
               var2.d(this.a);
               this.a.a(0, 0, 0);
               var2.c(this.a);
               this.b = 1;
            } else if (var3[bl.a() == 16 ? 1 : 0].b() && this.b == 1) {
               var4.d(false);
               this.a.a = true;
               this.a.a = true;
               a(var2, this.a);
               this.b = 2;
            }
            break;
         case 24:
            if (var3[0].a() && this.b == 0) {
               this.a.a = false;
               this.a.a = false;
               this.a.a(true);
               var2.a(false);
               var4.a.b(9999999);
               var4.a.e(0, 1024, 0);
               var4.d(true);
               var4.a.e();
               this.a.a(var4.a);
               var5.b(var4.a.a(this.a));
               var5.b(30500, 700, 1000);
               this.a = var4.a.a(this.a);
               this.c = var4.a.c(this.c);
               this.c.a(40960);
               this.a.b(this.c);
               this.a.b()[3].a(this.a.a, this.a.b, this.a.c);

               for(var7 = 0; var7 < this.a.a().length; ++var7) {
                  this.a.a()[var7].a.a((aa[])null);
               }

               this.b = 1;
            } else if (var3[0].b() && this.b == 1) {
               ((c)this.a.b()[3]).a(false);
               this.a.b()[3].b(true);
               this.b = 2;
            }
            break;
         case 29:
            if (var3[0].a() && this.b == 0) {
               this.b = 1;
               var4.a.d(false);
               this.a.a = false;
               this.a.a = false;
               this.a.a(true);
               var2.a(false);
               var4.d(true);
               this.a.a(var4.a);
               var5.b(var4.a.a(this.a));
               this.a = var4.a.c();
               this.a.a(16384);
               new cc();
               cc var10 = null;
               (var10 = var4.a.f()).a(1024);
               this.a.b(var10);
               var5.a((cc)this.a);
               this.a = bo.a(18);
               this.a.a(var4.a.a());
               this.a.f(768, 768, 768);
            } else if (var3[2].b() && this.b == 1) {
               this.b = 2;
               this.a.a = true;
               this.a.a = true;
               this.a.a(false);
               var2.a(true);
               var4.d(false);
               var4.a.d(true);
               this.a = null;
               this.a = 180000;
               this.a = 0L;
               this.a.a = new br(3, this.a, this.a);
            }

            if (this.a != null) {
               this.a.b(var1 * 3);
            }
            break;
         case 40:
            if (this.b == 0) {
               var6[0].d = 1;
               this.b = 1;
            } else if (this.b == 1 && var6[0].a(this.c).c >= ((c)this.a.b()[3]).a(this.a).c) {
               this.b = 2;
            } else if (this.b == 2) {
               ((ak)var6[0]).c(var6[0].a(this.c).c - 200000 - var1);
               if (var6[0].a(this.c).c > 500000) {
                  var6[0].a(0, 0, -200000);
                  var6[0].d(false);
                  this.b = 3;
               }
            }
            break;
         case 41:
            if (this.b == 0 && var6[0].a.d() > -10000) {
               this.b = 1;
               var6[0].a(0);
               var6[0].a.e(9999999);
               this.a.b()[3].a(5000, -40000, 10000);
            }
         }
      }

      return this.b;
   }

   public final void a() {
      if (this.a != null) {
         at.a.a((ah)this.a);
      }

   }

   public final void b() {
      if (bl.a() > 0) {
         this.c = 7001;
      }

   }

   public final void c() {
      this.d = false;
      this.c = 0;
   }

   public final boolean a() {
      return this.d;
   }

   public final boolean b() {
      return this.c;
   }

   public static void a(b var0, db var1) {
      if (var1.a() != null) {
         var0.a((ah)var1.a().a);
         var0.c(new cc(0, 850, 0));
         var0.d(new cc(0, 700, -2000));
         var0.b();
      }

   }

   public static void a(b var0) {
      var0.c(new cc(0, 300, 0));
      var0.d(new cc(0, 600, 3100));
   }

   public final void d() {
      if (db.a != null) {
         if (bl.a().a(db.a)) {
            db.a = null;
            return;
         }

         cw var10000 = bl.a();
         bd var2 = db.a;
         if (var10000.a(var2.b())) {
            this.a.a().a(this.a.a().a()[bl.a().a(db.a.b())]);
            return;
         }

         if (bl.a().a()) {
            this.a.a().a(this.a.b()[1]);
            return;
         }

         int var1;
         if ((var1 = bl.a().i()) >= 0) {
            this.a.a().a(this.a.a().a()[var1]);
         }
      }

   }
}
