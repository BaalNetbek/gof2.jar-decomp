public final class db {
   private int k;
   private y a;
   private final int[] a;
   private cc a;
   private ck a;
   private ag a;
   private bk a;
   private bk b;
   private ag[] a;
   private ag[] b;
   private f a;
   private cr a;
   private p[] a;
   private p[] b;
   private p[] c;
   private bf a;
   private bf b;
   private bf c;
   private bq[] a;
   private int l;
   private int m;
   private int n;
   private int o;
   public int a;
   public int b;
   public int c;
   public br a;
   public br b;
   private int p;
   private int q;
   private boolean d;
   private int r;
   private boolean e;
   public static float a;
   public static float b;
   public static float c;
   public static int d;
   public static int e;
   public static int f;
   public static int g;
   public static int h;
   public static int i;
   private float d;
   private float e;
   private float f;
   private int s;
   private int t;
   private boolean f;
   private int u;
   private int v;
   private int w;
   private int x;
   private int y;
   private int z;
   private int A;
   private int B;
   private bf d;
   private int C;
   private boolean g;
   private boolean h;
   public static boolean a = false;
   public static boolean b = false;
   public static int j;
   public static bd a;
   public static boolean c = false;
   private cc b;

   public db() {
      this(3);
   }

   public db(int var1) {
      this.a = new int[]{630, 0, 175, 1570, 0, 340, 1024, 0, 600, 1260, 0, 650, 880, 0, 950};
      this.f = false;
      this.b = new cc();
      this.k = var1;
      this.q = 0;
      this.d = false;
   }

   public static void a() {
      a = true;
   }

   public final boolean a() {
      if (this.q == 0 || this.d) {
         this.a = null;
         this.c = null;
         this.b = null;
         this.b = null;
         this.a = null;
         this.a = new bk(bo.a(0), 33, 225, 63, 255, 10, 700, 100, 500);
         this.b = new bk(bo.a(0), 33, 225, 63, 255, 10, 700, 100, 500);
         db var1 = this;
         if (this.a == null) {
            this.a = bo.a(9991);
         }

         int var4;
         int var6;
         if (this.k != 23 && this.k != 4) {
            boolean var2 = b || bl.a().a() || bl.c();
            if (bl.a() > 42) {
               var2 = false;
            }

            this.c = new p[4];
            if (bl.b()) {
               this.c[0] = null;
            } else {
               this.c[0] = new cb(bl.a());
            }

            cc var3 = new cc(this.b);
            this.r = 0;
            at.a.setSeed(bl.a() != null ? (long)(bl.a().b() << 1) : -1L);
            var4 = 1;

            while(true) {
               if (var4 >= 3) {
                  at.a.setSeed(System.currentTimeMillis());
                  if (bl.c()) {
                     var4 = (at.a.nextInt(2) == 0 ? 1 : -1) * ('썐' + at.a.nextInt(50000));
                     int var16 = (at.a.nextInt(2) == 0 ? 1 : -1) * ('썐' + at.a.nextInt(50000));
                     var6 = (at.a.nextInt(2) == 0 ? 1 : -1) * ('썐' + at.a.nextInt(50000));
                     var1.c[2].a(var4, var16, var6);
                     var1.c[2].a.e(-4096 + at.a.nextInt(8192), -4096 + at.a.nextInt(8192), -4096 + at.a.nextInt(8192));
                  }

                  if (!bl.a()) {
                     var1.c[3] = new c(6805, bo.a(6805), -40000 + at.a.nextInt(80000), -20000 + at.a.nextInt(40000), '鱀' + at.a.nextInt(40000), var2);
                     var1.c[3].a(var1);
                  }

                  var1.r += 2048;
                  if (!a) {
                     var1.r = 0;
                  }
                  break;
               }

               if (var4 == 1 && (bl.a() == null || !bl.a().a())) {
                  var1.c[var4] = null;
               } else {
                  if (bl.a() != null) {
                     if (var4 == 0) {
                        var1.r = bl.a().a().length() + bl.a().d() * 3;
                        var1.r = var1.r % 16 << 8;
                     } else {
                        var1.r += at.a.nextInt(2) == 0 ? -250 - at.a.nextInt(500) : 250 + at.a.nextInt(500);
                     }

                     var1.b.c = var4 == 1 ? 90000 : 120000;
                     cc var10000 = var1.b;
                     var10000.c += var1.r * 3;
                     cm var5;
                     (var5 = new cm()).e(var1.r);
                     (var3 = var5.c(var1.b, var3)).b = 0;
                  }

                  var1.c[var4] = new bi(15, bo.a(15), var3.a, var3.b, var3.c, var4 != 2);
               }

               ++var4;
            }
         }

         var1.a = new f();
         cw var10;
         if ((var10 = bl.a()) == null) {
            a = 10.0F;
            b = 136.0F;
            c = 10.0F;
         } else {
            a = (float)var10.a;
            b = (float)var10.b;
            c = (float)var10.c;
         }

         d = (int)(a / 3.0F);
         e = (int)(b / 3.0F);
         f = (int)(c / 3.0F);
         if (this.k == 3) {
            var1 = this;

            try {
               ch var11 = bl.a();
               v[] var13 = bl.a().a();
               int[] var15;
               (var15 = new int[3])[0] = var11.b(0);
               var15[1] = var11.b(1);
               var15[2] = var11.b(2);
               aa var17;
               (var17 = new aa(1200.0F, bl.a().g(), var15[0], var15[1], var15[2])).f(bl.a().h());
               var17.g(bl.a().f());
               var1.a = new cr(var17);
               var1.a.a(bl.a().b(), bl.a().a());
               var1.a.a(var1);
               var1.a.a.e(0, var1.r, 0);
               int[] var20 = new int[]{0, 0, 0};
               cf var18 = new cf(var20.length / 3);
               var1.a.a(var18);
               az[][] var21 = new az[3][];

               for(var6 = 0; var6 < 3; ++var6) {
                  if (var15[var6] > 0) {
                     var21[var6] = new az[var15[var6]];
                  }
               }

               if (var13 != null) {
                  for(var6 = 0; var6 < var13.length; ++var6) {
                     if (var13[var6] != null) {
                        az var7 = null;
                        if (var13[var6].b()) {
                           int var22 = var13[var6].b() == 1 ? var13[var6].l() : -1;
                           (var7 = var1.a(var13[var6].a(), var6, var13[var6].d(), var22, var13[var6].a(9), var13[var6].a(11), var13[var6].a(12), var13[var6].a(13))).e = var13[var6].a();
                           var7.f = var13[var6].d();
                           var7.b(var13[var6].a(14));
                           int var10001;
                           int var10004;
                           az[] var23;
                           switch(var13[var6].b()) {
                           case 0:
                              var7.a(var15[0] - 1, var11.b(0));
                              var23 = var21[0];
                              var10004 = var15[0];
                              var10001 = var15[0];
                              var15[0] = var10004 - 1;
                              var23[var10001 - 1] = var7;
                              break;
                           case 1:
                              var23 = var21[1];
                              var10004 = var15[1];
                              var10001 = var15[1];
                              var15[1] = var10004 - 1;
                              var23[var10001 - 1] = var7;
                              break;
                           case 2:
                              var23 = var21[2];
                              var10004 = var15[2];
                              var10001 = var15[2];
                              var15[2] = var10004 - 1;
                              var23[var10001 - 1] = var7;
                           }
                        }
                     }
                  }
               }

               for(var6 = 0; var6 < var21.length; ++var6) {
                  if (var21[var6] != null) {
                     var1.a.a(var21[var6], var6);
                  }
               }
            } catch (Exception var8) {
               var8.printStackTrace();
            }

            if (a && this.a.a != null) {
               bd[] var9;
               if ((var9 = bl.a()) != null && var9[1] != null && bl.a() != null && !bl.a().a()) {
                  int[] var12 = bl.a().a();
                  int var14 = 0;

                  for(var4 = 0; var4 < var12.length; ++var4) {
                     if (var12[var4] == var9[1].b()) {
                        var14 = var4;
                        break;
                     }
                  }

                  cc var19;
                  (var19 = new cc(this.a.a()[var14 + 1].b())).a(16384);
                  this.a.a(var19);
                  var19.a = -var19.a;
                  var19.b = -var19.b;
                  var19.c = -var19.c;
                  var19.a();
                  this.a.a.a().c(var19);
               } else {
                  this.a.a(this.c[2].a.b(), this.c[2].a.c(), this.c[2].a.d());
               }
            } else {
               this.a.a(10, 10, 10000);
            }

            if (bl.a() == 1) {
               this.a.a(0, 0, -110000);
            }
         }
      }

      if (this.q != 1 && !this.d) {
         if (this.d) {
            this.q = 0;
            return true;
         }
      } else {
         if (this.k != 4) {
            this.i();
         }

         if (bl.a() == null) {
            bl.a(cl.a);
         }

         if ((this.k != 3 || bl.a().g()) && (this.k != 3 || !bl.a())) {
            if (this.k != 3) {
               this.m();
               this.k = 3;
            } else if (!bl.a().a() && bl.a().g()) {
               this.l();
            }
         } else {
            this.k();
         }

         this.j();
         this.n();
         this.o();
         if (this.a != null) {
            this.a.a(this.a);
         }

         this.l = this.a != null ? this.a.length : 0;
         this.n = 0;
         this.n = this.b != null ? this.b.length : 0;
         this.C = 0;
         this.g = false;
         this.h = false;
         this.a = 0;
         this.o = 0;
         this.e = false;
         this.d = true;
      }

      ++this.q;
      return this.d;
   }

   private void i() {
      int var1 = 154;
      int var2 = 0;
      boolean var3 = false;
      this.b = new p[50];
      int[] var4 = bv.a(bl.a());
      at.a.setSeed((long)bl.a().b());
      int var5 = -50000 + at.a.nextInt(100000);
      int var6 = -50000 + at.a.nextInt(100000);
      int var7 = 10000 + at.a.nextInt(100000);
      at.a.setSeed(System.currentTimeMillis());
      this.a = new cc(var5, var6, var7);
      this.a = new ck(var5, var6, var7, (bf)null);
      this.a = new bb(var5, var6, var7, 0, 0, 0, 50000);

      for(int var8 = 0; var8 < this.b.length; ++var8) {
         if (bl.c()) {
            var1 = 164;
         } else if (bl.b()) {
            var1 = 154;
         } else {
            var3 = false;

            while(!var3) {
               if (at.a.nextInt(100) < var4[var2 + 1]) {
                  if ((var1 = var4[var2]) < 164) {
                     var3 = true;
                  }

                  var2 += 2;
                  if (var2 >= var4.length) {
                     var2 = 0;
                  }
               } else {
                  var2 = 0;
               }
            }
         }

         var3 = var8 < this.b.length / 2;
         ck var9 = null;
         if (var3) {
            var9 = new ck(0, 0, 20000, (bf)null);
         } else {
            var9 = new ck(var5, var6, var7, (bf)null);
         }

         p[] var10000 = this.b;
         int var12 = bl.c() ? 6804 : 6769;
         boolean var13 = false;
         boolean var14 = false;
         boolean var15 = false;
         char var19 = '\uea60';
         int var17 = var9.l - 30000 + at.a.nextInt(var19);
         int var18 = var9.m - 30000 + at.a.nextInt(var19);
         int var20 = var9.n - 30000 + at.a.nextInt(var19);
         cn var21;
         (var21 = new cn(var12, bo.a(var12), var1, var3, var17, var18, var20)).a((db)this);
         var21.a(this.a);
         if (this.k == 23) {
            var21.a.a(1);
         } else {
            var21.a.a(2);
         }

         cf var16 = new cf(1);
         var21.a((cf)var16);
         var10000[var8] = var21;
      }

   }

   private az a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      az var9 = null;
      Object var10 = null;
      var10 = null;
      bk var11 = this.a;
      ag var14;
      switch(var3) {
      case 0:
      case 1:
      case 3:
         if (ad.b[var1] >= 0) {
            int var15 = var3 == 0 ? 800 : 400;
            var9 = new az(var2, var5, 15, var4, var7, var6, (float)var8, new cc(0, 0, var15), new cc());
            var14 = bo.a(ad.b[var1]);
            if (var3 == 3) {
               var3 = 300 + 70 * (var1 - 28);
               var14.f(var3, var3, var3);
               var14.a(var1 - 28 + 10, var1 - 28 + 10);
               var14.a((byte)1);
               (var9 = new az(var2, var5, 15, var4, var7, var6, (float)var8, new cc(0, 0, 200), new cc())).a(20);
            }

            var10 = new n(var9, var14);
         } else {
            var9 = new az(var2, var5, 1, var4, var7, var6, (float)var8, new cc(0, 0, 400), new cc());
            var10 = new o(var9, var1, this);
         }
         break;
      case 2:
         var9 = new az(var2, var5, 15, var4, var7, var6, (float)var8, new cc(0, 0, 200), new cc());
         var10 = new n(var9, bo.a(ad.b[var1]));
         break;
      case 4:
      case 5:
         var9 = new az(var2, var5, 1, var4, var7, var6, (float)var8, new cc(), new cc());
         (var14 = bo.a(ad.b[var1])).a(2);
         var10 = new l(var9, var14, var3 == 5);
         var11 = this.b;
         break;
      case 6:
      case 7:
         var9 = new az(var2, var5, 1, var4, var7, var6, (float)var8, new cc(0, -200, 400), new cc());
         ag var12 = null;
         int var13;
         if (var3 == 7) {
            var12 = bo.a(18);
            var13 = var1 - 44 + 1 << 9;
            var12.f(var13, var13, var13);
         } else {
            var12 = bo.a(16);
            var13 = var1 - 41 + 1 << 9;
            var12.f(var13, var13, var13);
         }

         var12.a(2);
         var10 = new l(var9, var12, false);
         var11 = this.b;
         break;
      case 8:
         var9 = new az(var2, var5, 15, var4, var7, var6, (float)var8, new cc(0, 0, 0), new cc());
         var10 = new n(var9, bo.a(ad.b[var1]));
      }

      var9.a(this);
      var9.a(var11);
      if (this.a == null) {
         this.a = new ag[]{(ag)var10};
      } else {
         ag[] var16 = new ag[this.a.length + 1];
         System.arraycopy(this.a, 0, var16, 0, this.a.length);
         var16[var16.length - 1] = (ag)var10;
         this.a = var16;
      }

      return var9;
   }

   private void j() {
      if (bl.b() != null && bl.b <= 0) {
         bl.a((String[])null);
         bl.b = 0;
         bl.a = null;
      } else {
         if (bl.b() != null && this.a != null) {
            p[] var1 = new p[bl.b().length];

            for(int var2 = 0; var2 < var1.length; ++var2) {
               at.a.setSeed((long)(bl.b()[var2].length() * 5));
               int var3 = ad.a(bl.a);
               at.a.setSeed(System.currentTimeMillis());
               var1[var2] = this.a(5, 0, var3, (ck)null);
               if (a && this.a.a != null) {
                  ((bh)var1[var2]).a(this.c[2].a.b() - 3000, this.c[2].a.c() + 1000, this.c[2].a.d() + 5000);
               } else {
                  ((bh)var1[var2]).a(this.a.a.b() + -700 + at.a.nextInt(1400), this.a.a.c() + -700 + at.a.nextInt(1400), this.a.a.d() + 2000);
               }

               var1[var2].a(true, var2);
               var1[var2].a.b(true);
               var1[var2].a.b(600);
               var1[var2].a = bl.b()[var2];
               var1[var2].d = bl.a;
               if (bl.a().d() == 12) {
                  var1[var2].k = false;
               }
            }

            if (this.a != null) {
               p[] var4 = new p[this.a.length + var1.length];
               System.arraycopy(this.a, 0, var4, 0, this.a.length);
               System.arraycopy(var1, 0, var4, this.a.length, var1.length);
               this.a = var4;
               return;
            }

            this.a = var1;
         }

      }
   }

   private void k() {
      cl var1;
      if ((var1 = bl.a()) != null) {
         int var2;
         int var3;
         if (bl.c()) {
            var2 = 1 + at.a.nextInt(3);
            this.a = new p[var2];

            for(var3 = 0; var3 < var2; ++var3) {
               this.a[var3] = this.a(9, 0, ad.a(9), (ck)null);
               this.a[var3].a(-40000 + at.a.nextInt(80000), -40000 + at.a.nextInt(80000), -40000 + at.a.nextInt(80000));
               this.a[var3].a.a(true);
            }

         } else {
            int var5;
            int var6;
            int var7;
            int var8;
            int var9;
            bf var12;
            int var13;
            if (var1.a()) {
               this.k = 0;
               this.m();
               this.k = 3;
               boolean var10 = bl.a().a() == 15 && bl.a() < 16;
               boolean var15 = bl.a().b() == 78;
               var13 = at.a.nextInt(100);
               var5 = 0;
               cl var17;
               if ((var17 = bl.b()) != null && (var17.d() == 0 || var17.d() == 11)) {
                  var5 = (int)((float)var17.i() / 10.0F * 5.0F);
               }

               var7 = bl.a().b();
               boolean var11 = !var10 && var13 < (var7 == 0 ? 80 : (var7 == 1 ? 60 : (var7 == 2 ? 35 : 10)));
               this.d = new bf(new int[]{-50000 + at.a.nextInt(100000), 0, '썐' + at.a.nextInt(50000)});
               var13 = bl.a().c();
               var8 = at.a.nextInt(100) < 75 ? 8 : cs.b(var13);
               this.y = var11 ? 0 + at.a.nextInt(4) : 0;
               this.w = var15 ? 0 : 0 + at.a.nextInt(2);
               this.x = !var15 && !var10 ? 0 + at.a.nextInt(5) : 0;
               this.v = (var15 ? 0 : at.a.nextInt(2)) + (var10 ? 0 : var7) + this.x / 4;
               if (bl.a().b() == 10 || this.v + this.w + this.x + this.y + var5 == 0) {
                  this.v = 4;
               }

               this.a = new p[this.v + this.w + this.x + this.y + var5];
               var12 = new bf(new int[]{0, 0, 10000});

               for(var2 = 0; var2 < this.v; ++var2) {
                  this.a[var2] = this.a(var13, 0, ad.a(var13), var12.a());
               }

               ag var14 = null;
               if (this.w > 0) {
                  (var14 = bo.a(6783)).a(2);
               }

               for(var6 = this.v; var6 < this.v + this.w; ++var6) {
                  this.a[var6] = this.a(var13, 0, ad.a(var8), (ck)null);
                  this.a[var6].c();
                  bf var19 = new bf(new int[]{-200000 + at.a.nextInt(400000), -100000 + at.a.nextInt(200000), '썐' + at.a.nextInt(100000)});
                  this.a[var6].a(var19);
                  this.a[var6].c(true);
                  this.a[var6].a(var14);
               }

               boolean var18 = var13 == 0 && at.a.nextInt(100) < 30;

               for(var7 = this.v + this.w; var7 < this.v + this.w + this.x; ++var7) {
                  if (var18 && var7 == this.v + this.w) {
                     this.a[var7] = this.a(var13, 1, 14, (ck)null);
                     ((ak)this.a[var7]).a(false);
                     this.a[var7].a(-40000 + at.a.nextInt(80000), -5000 + at.a.nextInt(10000), '鱀' + at.a.nextInt(80000));
                  } else {
                     this.a[var7] = this.a(var13, 1, var13 == 1 ? 13 : 15, (ck)null);
                     ((ak)this.a[var7]).a(true);
                     this.a[var7].a((-80000 + at.a.nextInt(60000)) * (at.a.nextInt(2) == 0 ? 1 : -1), -20000 + at.a.nextInt(40000), -80000 + at.a.nextInt(160000));
                  }
               }

               if (var11) {
                  var7 = ad.a(var8);

                  for(var9 = this.v + this.w + this.x; var9 < this.a.length - var5; ++var9) {
                     this.a[var9] = this.a(var8, 0, var7, this.d.a());
                  }
               }

               for(var7 = this.v + this.w + this.x + this.y; var7 < this.a.length; ++var7) {
                  this.a[var7] = this.a(8, 0, ad.a(8), (ck)null);
                  this.b = this.a.a();
                  this.a[var7].a(-30000 + this.b.a + at.a.nextInt(60000), -30000 + this.b.b + at.a.nextInt(60000), -30000 + this.b.c + at.a.nextInt(60000));
               }

            } else {
               var2 = bl.a().c();
               var3 = at.a.nextInt(100) < 75 ? 8 : cs.b(var2);
               boolean var4 = at.a.nextInt(2) == 0;
               switch(var1.d()) {
               case 1:
                  this.c = new bf(new int[]{-50000 + at.a.nextInt(100000), 0, var4 ? -50000 : '썐', -50000 + at.a.nextInt(100000), 0, var4 ? -75000 : 75000, -50000 + at.a.nextInt(100000), 0, var4 ? -100000 : 100000});
                  var9 = 3 + (int)(5.0F * ((float)bl.a().i() / 10.0F));
                  var13 = 2 + at.a.nextInt(6);
                  this.a = new p[var9 + var13];

                  for(var13 = 0; var13 < var9; ++var13) {
                     this.a[var13] = this.a(var3, 0, ad.a(var3), (ck)null);
                     this.a[var13].a.a(true);
                  }

                  for(var13 = var9; var13 < this.a.length; ++var13) {
                     this.a[var13] = this.a(var2, 0, ad.a(var2), this.c.a(at.a.nextInt(this.c.b())));
                     this.a[var13].a.b(true);
                  }

                  this.a = new br(7, var9, this);
                  return;
               case 2:
                  cc var16 = new cc();
                  this.c = new bf(new int[]{var16.a + (var4 ? 1 : -1) * (20000 + at.a.nextInt(20000)), var16.b, var16.c + (var4 ? 1 : -1) * (20000 + at.a.nextInt(20000)), var16.a, var16.b, var16.c});
                  var7 = var1.b();
                  var9 = 2 + (int)(4.0F * ((float)var1.i() / 10.0F));
                  this.a = new p[var9 + var7];

                  for(var13 = 0; var13 < var9; ++var13) {
                     this.a[var13] = this.a(var3, 0, ad.a(var3), (ck)null);
                     ((bh)this.a[var13]).a(this.c.a(0).l + var13 * 2000, this.c.a(0).m + var13 * 2000, this.c.a(0).n + var13 * 2000);
                     this.a[var13].a.a(true);
                     this.a[var13].a(this.c.b());
                     this.a[var13].a().a(0);
                  }

                  var13 = 0;

                  for(var8 = var9; var8 < this.a.length; ++var8) {
                     this.a[var8] = this.a(var2, 0, ad.a(var2), (ck)null);
                     this.a[var8].a.b(true);
                     var3 = this.b.length / 2 + var13++;
                     var16.a(this.b[var3].a(var16));
                     this.a[var8].a(var16.a, var16.b + 2000, var16.c);
                     this.a[var8].d = false;
                     this.a[var8].a = null;
                     this.a[var8].a(0);
                     this.a[var8].a.b(this.a[var8].a.f() * 3);
                  }

                  this.a = new br(18, 0, var9, this);
                  this.b = new br(18, var9, var9 + var7, this);
                  return;
               case 3:
               case 5:
                  this.a = new bf(new int[]{('鱀' + at.a.nextInt(80000)) * (at.a.nextInt(2) == 0 ? 1 : -1), 0, ('鱀' + at.a.nextInt(80000)) * (at.a.nextInt(2) == 0 ? 1 : -1)});
                  this.a = new p[var1.b()];

                  for(var6 = 0; var6 < this.a.length; ++var6) {
                     this.a[var6] = this.a(8, 0, ad.a(8), this.a.a(0));
                     this.a[var6].d();
                  }

                  ((bh)this.a[this.a.length - 1]).a(true);
                  ((bh)this.a[this.a.length - 1]).a = at.a.a(833);
                  this.a = new br(11, this.a.length - 1, this);
                  this.b = new br(12, this.a.length - 1, this);
                  return;
               case 4:
                  if (at.a.nextInt(2) == 0) {
                     this.a = new bf(new int[]{this.a.a, this.a.b, this.a.c});
                  } else {
                     this.a = a(2 + at.a.nextInt(2));
                  }

                  var8 = 2 + (int)(5.0F * ((float)bl.a().i() / 10.0F));
                  this.a = new p[var8];

                  for(var3 = 0; var3 < this.a.length; ++var3) {
                     this.a[var3] = this.a(8, 0, ad.a(8), this.a.a(at.a.nextInt(this.a.b())));
                     this.a[var3].d();
                  }

                  this.a = new br(18, 0, var8, this);
                  return;
               case 6:
                  this.a = new bf(new int[]{('\uea60' + at.a.nextInt(80000)) * (at.a.nextInt(2) == 0 ? 1 : -1), 0, ('\uea60' + at.a.nextInt(80000)) * (at.a.nextInt(2) == 0 ? 1 : -1)});
                  this.a = new p[1];
                  this.a[0] = this.a(8, 0, ad.a(8), this.a.a(0));
                  this.a[0].d();
                  var7 = bl.a().i() * g.c(bl.m(), 20);
                  this.a[0].a.e(var7 + 300);
                  this.a = new br(1, 0, this);
                  return;
               case 7:
                  var12 = new bf(new int[]{-20000 + at.a.nextInt(40000), 0, 20000 + at.a.nextInt(40000)});
                  var2 = (int)(2.0F * ((float)bl.a().i() / 10.0F));
                  var6 = 15 + (int)(35.0F * ((float)bl.a().i() / 10.0F));
                  this.a = new p[var6 + var2];

                  for(var7 = 0; var7 < this.a.length - var2; ++var7) {
                     this.a[var7] = this.a(var12.a(0), 9996);
                     this.a[var7].a.a(true);
                  }

                  for(var7 = this.a.length - var2; var7 < this.a.length; ++var7) {
                     this.a[var7] = this.a(8, 0, ad.a(8), (ck)null);
                  }

                  this.a = new br(7, this.a.length - var2, this);
                  this.p = 121000;
                  return;
               case 9:
                  this.c = new bf(new int[]{10000, 0, 100000, 10000, 0, 150000, 10000, 0, 200000});
                  var2 = 2 + (int)(6.0F * ((float)bl.a().i() / 10.0F));
                  this.a = new p[var2 + 5];
                  var3 = cs.b(var1.e());
                  var9 = var1.e();

                  for(var13 = 0; var13 < this.a.length; ++var13) {
                     if (var13 < var2) {
                        this.a[var13] = this.a(var3, 0, ad.a(var3), this.c.a(at.a.nextInt(this.c.b())));
                        this.a[var13].d();
                        this.a[var13].a.a(true);
                     } else {
                        this.a[var13] = this.a(var9, 1, var9 == 1 ? 13 : 15, (ck)null);
                        this.a[var13].a.e(100 + (g.c(bl.m(), 20) << 1) + (bl.a() << 1));
                        ((ak)this.a[var13]).a(true);
                        this.a[var13].a.b(true);
                        this.a[var13].d = false;
                        this.a[var13].a = null;
                     }
                  }

                  ((ak)this.a[var2]).a(-2500, -300, 27000);
                  ((ak)this.a[var2 + 1]).a(6500, 3000, 24000);
                  ((ak)this.a[var2 + 2]).a(-4000, -2000, 19000);
                  ((ak)this.a[var2 + 3]).a(9000, -6000, 17000);
                  ((ak)this.a[var2 + 4]).a(3000, 7000, 15000);
                  this.a = new br(18, 0, var2, this);
                  this.b = new br(18, var2, var2 + 5, this);
                  return;
               case 10:
                  this.a = new bf(new int[]{-2500 + at.a.nextInt(5000), -2500 + at.a.nextInt(5000), 80000 + at.a.nextInt(30000), -2500 + at.a.nextInt(5000), -2500 + at.a.nextInt(5000), 120000 + at.a.nextInt(30000)});
                  var2 = 2 + at.a.nextInt(2);
                  var13 = 2 + (int)(2.0F * ((float)bl.a().i() / 10.0F));
                  var3 = cs.b(var1.e());
                  this.a = new p[var2 + var13];

                  for(var9 = 0; var9 < var2; ++var9) {
                     this.a[var9] = this.a(var3, 1, var3 == 1 ? 13 : 15, this.a.a(1));
                     this.a[var9].d();
                     this.a[var9].a.a(true);
                     ((ak)((ak)this.a[var9])).a(false);
                     ((ak)((ak)this.a[var9])).a(this.a.a(1).l + -10000 + at.a.nextInt(20000), this.a.a(1).m + -10000 + at.a.nextInt(20000), this.a.a(1).n + -10000 + at.a.nextInt(20000));
                  }

                  for(var9 = var2; var9 < this.a.length; ++var9) {
                     this.a[var9] = this.a(var3, 0, ad.a(var3), this.a.a(at.a.nextInt(this.a.b())));
                     this.a[var9].d();
                     this.a[var9].a.a(true);
                  }

                  this.a = new br(7, var2, this);
               case 8:
               default:
                  return;
               case 11:
                  return;
               case 12:
                  this.a = a(3 + at.a.nextInt(2));
                  if ((var5 = 3 + (int)(4.0F * ((float)var1.i() / 10.0F))) % 2 == 0) {
                     ++var5;
                  }

                  if (var1.g()) {
                     var5 = 7;
                     this.a = new bf(new int[]{80000, -20000, 80000, 70000, 0, -80000, -100000, 10000, -80000, -80000, 20000, 90000});
                  }

                  this.a = new p[var5 + 1];
                  this.a[0] = this.a(var1.a().c(), 0, ad.a(var1.a().c()), (ck)null);
                  ((bh)this.a[0]).a(this.a.a.b() + -700 + at.a.nextInt(1400), this.a.a.c() + -700 + at.a.nextInt(1400), this.a.a.d() + 1000);
                  ((bh)this.a[0]).a(3);
                  ((bh)this.a[0]).c(3);
                  this.a[0].a.b(9999999);
                  this.a[0].a(this.a.b());
                  this.a[0].a.b(true);
                  this.a[0].a = var1.a().a();
                  this.a[0].a = null;

                  for(var6 = 1; var6 < this.a.length; ++var6) {
                     this.a[var6] = this.a(8, 0, ad.a(8), this.a.a(at.a.nextInt(this.a.b())));
                     this.a[var6].d();
                  }

                  this.a = new br(20, 1, var5 + 1, this);
                  this.b = new br(21, 1, var5 + 1, this);
               }
            }
         }
      }
   }

   private void l() {
      cc var1 = new cc();
      int var2;
      int var3;
      int var4;
      int var5;
      label214:
      switch(bl.a()) {
      case 0:
         this.a = new p[3];

         for(var2 = 0; var2 < this.a.length; ++var2) {
            this.a[var2] = this.a(8, 0, 10, (ck)null);
            this.a[var2].d();
            this.a[var2].a.a(true);
            var1 = this.b[this.b.length - 1 - var2].a(var1);
            this.a[var2].a(var1.a, var1.b, var1.c + 2000);
            this.a[var2].d = false;
            this.a[var2].a = null;
            this.a[var2].a.b(150);
            if (var2 < 3) {
               ((bh)this.a[var2]).f(false);
            }
         }

         this.a[2].a(0, 0, -40000);
         this.c = new bf(new int[]{0, 0, -30000, 0, 0, 0});
         this.a[2].a(this.c);
         this.a.a.b(9999999);
         break;
      case 1:
         this.a = new p[1];
         this.a[0] = this.a(3, 0, 1, (ck)null);
         this.a[0].a(300, 50, -8000);
         this.c = new bf(new int[]{0, 0, -5000, 0, 0, 0});
         this.a[0].a(this.c);
         this.a[0].a(0);
      case 2:
      case 3:
      case 5:
      case 6:
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      case 15:
      case 17:
      case 18:
      case 19:
      case 20:
      case 22:
      case 23:
      case 27:
      case 30:
      case 31:
      case 32:
      case 33:
      case 34:
      case 35:
      case 37:
      case 39:
      default:
         break;
      case 4:
         this.a = new p[1];
         this.a[0] = this.a(8, 0, 1, (ck)null);
         this.a[0].e(false);
         this.a[0].a.a(true);
         this.a[0].a(0, 0, -200000);
         this.a[0].d();
         break;
      case 7:
         this.a = new bf(new int[]{20000, 7000, 120000});
         this.a = new p[4];

         for(var5 = 0; var5 < 3; ++var5) {
            this.a[var5] = this.a(8, 0, 2, this.a.a());
            this.a[var5].d();
         }

         this.a[3] = this.a(3, 0, 1, (ck)null);
         this.a[3].a.b(true);
         this.a[3].a(this.a.a.b() + 700, this.a.a.c() + 50, this.a.a.d() + 1000);
         this.a[3].a(this.a.b());
         this.a[3].a.b(9999999);
         this.a[3].a = at.a.a(821);
         ((bh)this.a[3]).d(0);
         this.a = new br(18, 0, 3, this);
         break;
      case 14:
         this.c = new bf(new int[]{0, 0, 50000});
         this.a = new p[7];

         for(var5 = 0; var5 < 3; ++var5) {
            this.a[var5] = this.a(8, 0, 0, this.c.a());
         }

         for(var5 = 3; var5 < 5; ++var5) {
            this.a[var5] = this.a(0, 0, 1, this.c.a());
         }

         for(var5 = 5; var5 < 7; ++var5) {
            this.a[var5] = this.a(0, 1, 14, this.c.a());
         }

         this.a = new br(22, 0, this);
         break;
      case 16:
         this.c = new bf(new int[]{0, 0, 130000});
         this.a = new p[7];

         for(var5 = 0; var5 < 4; ++var5) {
            this.a[var5] = this.a(9, 0, 8, this.c.a());
         }

         for(var5 = 4; var5 < 7; ++var5) {
            this.a[var5] = this.a(0, 0, 1, (ck)null);
            this.a[var5].a.b(true);
            this.a[var5].a.b(600);
            ((bh)this.a[var5]).a(this.a.a.b() + -2000 + at.a.nextInt(4000), this.a.a.c() + -1700 + at.a.nextInt(3400), this.a.a.d() + 2000 + -2000 + at.a.nextInt(4000));
         }

         this.a = new br(18, 0, 4, this);
         break;
      case 21:
         this.c = new bf(new int[]{40000, -40000, 120000});
         this.a = this.c.b();
         this.c.a(true);
         this.a = new p[3];
         this.a[1] = this.a(0, 0, 0, this.c.a());
         this.a[2] = this.a(0, 0, 0, this.c.a());
         this.a[0] = this.a(0, 0, 1, this.c.a());
         this.a[0].a = at.a.a(833);

         for(var5 = 0; var5 < this.a.length; ++var5) {
            this.a[var5].d();
            this.a[var5].a(this.c.b());
            this.a[var5].a.e(0, 2048, 0);
         }

         this.a = new br(22, 0, this);
         this.b = new br(7, 1, this);
         break;
      case 24:
         this.c = new bf(new int[]{100000, 0, 0, 100000, 0, -30000});
         this.a = new p[3];

         for(var5 = 0; var5 < 3; ++var5) {
            this.a[var5] = this.a(9, 0, 8, this.c.a());
            this.a[var5].a(this.c.b());
         }

         this.c[3].b(false);
         this.a = new br(22, 0, this);
         break;
      case 25:
      case 29:
         this.a = new p[3];
         var5 = 0;

         while(true) {
            if (var5 >= 3) {
               break label214;
            }

            this.a[var5] = this.a(9, 0, 8, (ck)null);
            var2 = (at.a.nextInt(2) == 0 ? 1 : -1) * (20000 + at.a.nextInt(80000));
            var3 = (at.a.nextInt(2) == 0 ? 1 : -1) * (20000 + at.a.nextInt(80000));
            var4 = (at.a.nextInt(2) == 0 ? 1 : -1) * (20000 + at.a.nextInt(80000));
            this.a[var5].a(var2, var3, var4);
            ++var5;
         }
      case 26:
         this.a = new p[2];

         for(var5 = 0; var5 < 2; ++var5) {
            this.a[var5] = this.a(9, 0, 8, (ck)null);
            ((bh)this.a[var5]).a.a(this.a.a.a());
            ((bh)this.a[var5]).a(this.a.a.b() + -700 + at.a.nextInt(1400), this.a.a.c() + -700 + at.a.nextInt(1400), this.a.a.d() + 2000);
         }

         this.a = new br(7, 2, this);
         break;
      case 28:
         this.b = this.c[3].a(this.b);
         this.c = new bf(new int[]{this.b.a, this.b.b, this.b.c});
         this.a = new p[5];
         var5 = 0;

         while(true) {
            if (var5 >= 5) {
               break label214;
            }

            this.a[var5] = this.a(9, 0, 8, this.c.a());
            ++var5;
         }
      case 36:
         bl.a().a(new ca(-1, at.a.a(826), 29, 5, 1, true, -1, -1, -1));
         this.k();
         break;
      case 38:
         this.c = new bf(new int[]{0, 10000, 50000});
         this.a = new p[7];

         for(var3 = 0; var3 < 2; ++var3) {
            this.a[var3] = this.a(2, 1, 15, this.c.a());
            this.a[var3].a.b(true);
            ((ak)((ak)this.a[var3])).a(false);
            ((ak)((ak)this.a[var3])).a(this.c.a().l + -10000 + at.a.nextInt(20000), this.c.a().m + -10000 + at.a.nextInt(20000), this.c.a().n + -10000 + at.a.nextInt(20000));
         }

         for(var3 = 2; var3 < this.a.length; ++var3) {
            this.a[var3] = this.a(3, 0, ad.a(3), this.c.a());
            this.a[var3].d();
            this.a[var3].a.a(true);
         }

         this.a = new br(18, 2, 7, this);
         this.b = new br(7, 2, this);
         break;
      case 40:
         this.c = new bf(new int[]{-20000, -3000, 200000});
         this.b = new bf(new int[]{-20000, -3000, 65000, -20000, -3000, 200000});
         this.a = new p[9];
         this.a[0] = this.a(0, 1, 13, (ck)null);
         this.a[0].a.b(true);
         this.a[0].a = at.a.a(826);
         this.a[0].a.e(1200 + 5 * bl.m());
         ((ak)((ak)this.a[0])).a(true);
         ((ak)((ak)this.a[0])).a(this.b.a(0).l, this.b.a(0).m, this.b.a(0).n);

         for(var4 = 1; var4 < 5; ++var4) {
            this.a[var4] = this.a(0, 0, ad.a(0), (ck)null);
            this.a[var4].a(this.b.b());
            this.a[var4].a.b(true);
            if (var4 == 2) {
               this.a[2].a = at.a.a(827);
            }
         }

         for(var4 = 5; var4 < 9; ++var4) {
            this.a[var4] = this.a(9, 0, 8, this.c.a());
            this.a[var4].a.a(true);
         }

         this.c[3].a(-20000, -3000, 200000);
         if (a) {
            this.a.a(-65000, 0, 80000);
            this.a.a.e(0, 1024, 0);
         }

         this.b = new br(7, 1, this);
         break;
      case 41:
         this.a = new p[5];
         this.a[0] = this.a(1, 1, 13, (ck)null);
         this.a[0].a.b(true);
         this.a[0].a = at.a.a(826);
         this.a[0].a.b(j);
         ((ak)((ak)this.a[0])).a(true);
         ((ak)((ak)this.a[0])).a(0, 0, -200000);

         for(var4 = 1; var4 < 5; ++var4) {
            this.a[var4] = this.a(9, 0, 8, (ck)null);
            this.a[var4].a.a(true);
            var5 = (at.a.nextInt(2) == 0 ? 1 : -1) * (20000 + at.a.nextInt(80000));
            var2 = (at.a.nextInt(2) == 0 ? 1 : -1) * (20000 + at.a.nextInt(80000));
            var3 = (at.a.nextInt(2) == 0 ? 1 : -1) * (20000 + at.a.nextInt(80000));
            this.a[var4].a(var5, var2, var3);
         }

         this.a.a(3000, 2000, -220000);
         this.a.a.e(0, 0, 0);
         this.a = new br(25, 0, this);
         this.b = new br(7, 1, this);
      }

      this.a = this.a(bl.a());
   }

   private void m() {
      int var1;
      int var3;
      label88:
      switch(this.k) {
      case 4:
         int var11;
         var1 = (var11 = bl.a().c() == 1 ? 2 : (bl.a().c() == 0 ? 0 : 1)) == 0 ? 20 : 6;
         ca[] var9;
         var3 = (var9 = bl.a().a()).length;
         this.a = new p[var3 + var1];
         boolean[] var5 = new boolean[this.a.length / 3];

         int var6;
         for(var6 = 0; var6 < var5.length; ++var6) {
            var5[var6] = false;
         }

         for(var6 = 0; var6 < var3; ++var6) {
            short var7 = ad.a[var9[var6].c()];
            if (var9[var6].c() == 0 && !var9[var6].a()) {
               var7 = 14224;
            }

            boolean var8 = false;

            int var13;
            do {
               var13 = at.a.nextInt(var5.length);
            } while(var5[var13]);

            var5[var13] = true;
            this.a[var6] = new u(-1, bo.a(var7), this.a[var13 * 3], this.a[var13 * 3 + 1], this.a[var13 * 3 + 2]);
            this.a[var6].a.a(2);
            this.a[var6].a.e();
         }

         if (var1 <= 0) {
            return;
         }

         at.a.setSeed((long)(bl.a().b() + 1000));
         var6 = 4096 / var1;
         int var12 = var3;

         while(true) {
            if (var12 >= this.a.length) {
               break label88;
            }

            short var14 = ad.a[var11][at.a.nextInt(ad.a[var11].length)];
            this.a[var12] = new u(-1, bo.a(var14), 0, 0, 0);
            this.a[var12].a.a(2);
            this.a[var12].a.e(0, var12 * var6, 0);
            ++var12;
         }
      case 23:
         var1 = bl.a().c() == 1 ? 2 : (bl.a().c() == 0 ? 0 : 1);
         this.a = new p[7];
         this.a[0] = this.a(bl.a().a(), 0, bl.a().b(), (ck)null);
         this.a[0].a(0, 1200, 10240 - ch.b[bl.a().b()] + 100);
         this.a[0].a.e(0, 2048, 0);
         this.a[0].a(new bf(new int[]{0, 500, -100000}));
         ((bh)this.a[0]).g();
         ((bh)this.a[0]).f(false);
         this.a[0].d();
         this.a[0].a.b(true);
         at.a.setSeed((long)bl.a().b());
         int var2 = 0;

         for(var3 = 1; var3 < 6; ++var3) {
            short var4 = ad.b[var1][at.a.nextInt(ad.b[var1].length - 3)];
            if (var3 == 5) {
               var4 = ad.b[var1][ad.b[var1].length - 2];
            } else if (var3 == 1) {
               var4 = ad.b[var1][ad.b[var1].length - 1];
            }

            this.a[var3] = new bx(-1, bo.a(var4), 0, 0, var2 << 12);
            this.a[var3].a.a(1);
            this.a[var3].a.e(0, 2048, 0);
            ++var2;
         }

         short var10 = ad.b[var1][ad.b[var1].length - 3];
         this.a[this.a.length - 1] = new bx(-1, bo.a(var10), 0, 0, 8192);
         this.a[this.a.length - 1].a.a(2);
         this.a[this.a.length - 1].a.e(0, 2048, 0);
         break;
      default:
         return;
      }

      at.a.setSeed(System.currentTimeMillis());
   }

   private void n() {
      this.b = null;
      int var1 = (int)((float)g.c(bl.m(), 20) / 1.8F) + (int)((float)bl.a() / 5.0F);
      int var2 = 0;
      if (this.a != null) {
         int var3;
         for(var3 = 0; var3 < this.a.length; ++var3) {
            if (this.a[var3] != null && this.a[var3].k) {
               ++var2;
               if (this.a[var3].d()) {
                  ++var2;
               }
            }
         }

         this.b = new ag[var2];
         var3 = 0;

         for(var2 = 0; var2 < this.a.length; ++var2) {
            az var6;
            if (this.a[var2] != null && this.a[var2].k) {
               int var4 = var1 + 2;
               if (bl.a().d() == 12 && this.a[var2].a.b()) {
                  var4 = bl.a().n() + 2;
               } else if (bl.a() == 4) {
                  var4 = 1;
               }

               (var6 = new az(0, var4, 4, -1, 3000, 600 - (bl.a() << 1), 16.0F, (cc)null, (cc)null)).a(true);
               var6.a(this);
               var6.a(this.a);
               int var5 = this.a[var2].d == 9 ? 7 : (this.a[var2].d == 0 ? 1 : (this.a[var2].d == 1 ? 3 : 4));
               this.b[var3] = new n(var6, bo.a(ad.b[var5]));
               this.b[var3].a(2);
               ++var3;
               this.a[var2].a((az)var6, 0);
            }

            if (this.a[var2].d() && this.a[var2].k) {
               (var6 = new az(18, 0, 4, -1, 3000, 400, 16.0F, (cc)null, (cc)null)).a(true);
               var6.a(this);
               var6.a(this.a);
               var6.e = 18;
               var6.f = 1;
               this.b[var3] = new n(var6, bo.a(ad.b[18]));
               this.b[var3].a(2);
               ++var3;
               this.a[var2].a((az)var6, 1);
            }
         }
      }

   }

   private void o() {
      if (at.a.a() != at.a[1]) {
         aa[] var1;
         int var2;
         if (this.a != null && this.a != null) {
            var1 = new aa[this.a.length];

            for(var2 = 0; var2 < var1.length; ++var2) {
               var1[var2] = this.a[var2].a;
            }

            this.a.a.a(var1);
         }

         if (this.b != null && this.a != null) {
            var1 = new aa[this.b.length];

            for(var2 = 0; var2 < var1.length; ++var2) {
               var1[var2] = this.b[var2].a;
            }

            this.a.a.b(var1);
         }

         if (this.a != null) {
            for(int var7 = 0; var7 < this.a.length; ++var7) {
               var2 = this.a[var7].d;
               boolean var3 = this.a[var7].d();
               int var4 = 0;

               for(int var5 = 0; var5 < this.a.length; ++var5) {
                  if (this.a[var5] != this.a[var7] && (this.a[var5].d != var2 || var3)) {
                     ++var4;
                  }
               }

               aa[] var9 = new aa[(this.a == null ? 0 : 1) + var4];
               int var6;
               cl var8;
               if (((var8 = bl.a()).d() != 12 || var7 % 2 != 1) && var8.d() != 2 && var8.d() != 9 && (!var8.g() || bl.a() != 40) && (!var8.g() || bl.a() != 41)) {
                  var4 = 0;
                  if (this.a != null) {
                     var9[0] = this.a.a;
                     var4 = 1;
                  }

                  for(var6 = 0; var6 < this.a.length; ++var6) {
                     if (this.a[var6] != this.a[var7] && (this.a[var6].d != var2 || var3)) {
                        var9[var4++] = this.a[var6].a;
                     }
                  }
               } else {
                  if (this.a[var7].a.b()) {
                     var9 = new aa[1];
                  } else {
                     var4 = 0;

                     for(var6 = 0; var6 < this.a.length; ++var6) {
                        if (this.a[var6] != this.a[var7] && (this.a[var6].d != var2 || var3)) {
                           var9[var4++] = this.a[var6].a;
                        }
                     }
                  }

                  var9[var9.length - 1] = this.a.a;
               }

               this.a[var7].a.b(var9);
            }
         }

      }
   }

   private p a(ck var1, int var2) {
      var2 = var1 != null ? var1.l : 0;
      int var3 = var1 != null ? var1.m : 0;
      int var6 = var1 != null ? var1.n : 0;
      var2 = var2 + at.a.nextInt(20000) - 10000;
      var3 = var3 + at.a.nextInt(20000) - 10000;
      var6 = var6 + at.a.nextInt(20000) - 10000;
      ag var4;
      (var4 = bo.a(9996)).a(2);
      aa var5 = null;
      var5 = null;
      var5 = new aa(1000.0F, 1, 0, 0, 0);
      cq var7;
      (var7 = new cq(9996, var5, var4, var2, var3, var6)).a(new cf(1));
      var7.a.d(var2, var3, var6);
      var7.a(this);
      return var7;
   }

   private p a(int var1, int var2, int var3, ck var4) {
      int var5 = var4 != null ? var4.l : 0;
      int var6 = var4 != null ? var4.m : 0;
      int var12 = var4 != null ? var4.n : 0;
      int var7 = at.a.nextInt(40000) - 20000;
      int var8 = at.a.nextInt(40000) - 20000;
      int var9 = at.a.nextInt(40000) - 20000;
      var5 += var7;
      var6 += var8;
      var12 += var9;
      Object var14 = null;
      cf var15 = null;
      aa var13 = null;
      var7 = 20 + g.c(bl.m(), 20) * 15 + (bl.a() << 2);
      int var10 = 40 + g.c(bl.m(), 20) * 5;
      int var11 = 15000;
      if (var2 == 1) {
         var7 <<= 2;
         var10 *= 3;
         var11 = 15000 * 3;
         if (var3 == 14) {
            var7 *= 5;
         }
      }

      (var13 = new aa(2000.0F, var7, 1, 1, 0)).a(var10, var11);
      switch(var2) {
      case 0:
         var14 = new bh(var3, var1, var13, (ag)null, var5, var6, var12);
         var15 = new cf(1);
         ((p)var14).a(ad.a(var3, var1), var3);
         break;
      case 1:
         var14 = new ak(var3, var1, var13, (ag)null, var5, var6, var12);
         y[] var16;
         (var16 = new y[1])[0] = new ct(var5, var6, var12, 0, 300, 0, 4000, 4000, 15000);
         ((ak)((ak)var14)).a(var16);
         (var15 = new cf(1)).b();
         ((p)var14).a(ad.a(var3, var1), var3);
      }

      ((p)var14).a(this);
      ((p)var14).a(var15);
      return (p)var14;
   }

   private static bf a(int var0) {
      int[] var3 = new int[var0 * 3];

      for(int var1 = 0; var1 < var3.length; var1 += 3) {
         int var2 = at.a.nextInt(2) == 0 ? 1 : -1;
         var3[var1] = '썐' + at.a.nextInt(30000);
         var3[var1] *= var2;
         var3[var1 + 1] = -10000 + at.a.nextInt(20000);
         if (var1 != 0) {
            var3[var1 + 2] = var3[var1 - 3 + 2] + '썐' + at.a.nextInt(30000);
         } else {
            var3[var1 + 2] = '썐' + at.a.nextInt(30000);
         }
      }

      return new bf(var3);
   }

   private bq[] a(int var1) {
      this.a = null;
      switch(var1) {
      case 0:
         this.a = new bq[22];
         this.a[0] = new bq(844, 17, 5, 15000);
         this.a[1] = new bq(845, 0, 6, 0);
         this.a[2] = new bq(846, 0, 6, 1);
         this.a[3] = new bq(847, 10, 6, 2);
         this.a[4] = new bq(848, 9, 6, 3);
         this.a[5] = new bq(849, 9, 6, 4);
         this.a[6] = new bq(850, 11, 6, 5);
         this.a[7] = new bq(851, 9, 6, 6);
         this.a[8] = new bq(852, 0, 6, 7);
         this.a[9] = new bq(854, 0, 9, new int[]{0, 1, 2});
         this.a[10] = new bq(855, 0, 6, 9);
         this.a[11] = new bq(856, 0, 6, 10);
         this.a[12] = new bq(857, 15, 6, 11);
         this.a[13] = new bq(858, 0, 6, 12);
         this.a[14] = new bq(859, 0, 6, 13);
         this.a[15] = new bq(860, 15, 6, 14);
         this.a[16] = new bq(861, 0, 6, 15);
         this.a[17] = new bq(862, 15, 6, 16);
         this.a[18] = new bq(863, 0, 6, 17);
         this.a[19] = new bq(864, 0, 6, 18);
         this.a[20] = new bq(865, 15, 6, 19);
         this.a[21] = new bq(866, 0, 6, 20);
         break;
      case 1:
         this.a = new bq[3];
         this.a[0] = new bq(867, 2, 5, 10000);
         this.a[1] = new bq(868, 2, 6, 0);
         this.a[2] = new bq(869, 2, 6, 1);
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      case 15:
      case 17:
      case 18:
      case 19:
      case 20:
      case 22:
      case 23:
      case 25:
      case 26:
      case 27:
      case 28:
      case 30:
      case 31:
      case 32:
      case 33:
      case 34:
      case 35:
      case 36:
      case 37:
      case 39:
      default:
         break;
      case 7:
         this.a = new bq[2];
         this.a[0] = new bq(909, 2, 16, 0);
         this.a[1] = new bq(910, 0, 6, 0);
         break;
      case 14:
         this.a = new bq[4];
         this.a[0] = new bq(968, 18, 5, 6000);
         this.a[1] = new bq(969, 0, 20, 2);
         this.a[2] = new bq(970, 0, 6, 1);
         this.a[3] = new bq(971, 18, 6, 2);
         break;
      case 16:
         this.a = new bq[2];
         this.a[0] = new bq(983, 19, 5, 6000);
         this.a[1] = new bq(984, 0, 6, 0);
         break;
      case 21:
         this.a = new bq[3];
         this.a[0] = new bq(1018, 14, 8, 0);
         this.a[1] = new bq(1019, 0, 6, 0);
         this.a[2] = new bq(1020, 14, 21, 0);
         break;
      case 24:
         this.a = new bq[2];
         this.a[0] = new bq(1047, 6, 22, 3);
         this.a[1] = new bq(1048, 6, 6, 0);
         break;
      case 29:
         this.a = new bq[5];
         this.a[0] = new bq(1073, 0, 23, 0);
         this.a[1] = new bq(1074, 0, 6, 0);
         this.a[2] = new bq(1075, 0, 6, 1);
         this.a[3] = new bq(1076, 19, 5, 120000);
         this.a[4] = new bq(1077, 0, 6, 3);
         break;
      case 38:
         this.a = new bq[1];
         this.a[0] = new bq(1146, 21, 5, 5000);
         break;
      case 40:
         this.a = new bq[2];
         this.a[0] = new bq(1163, 7, 12, 0);
         this.a[1] = new bq(1164, 0, 24, 0);
         break;
      case 41:
         this.a = new bq[1];
         this.a[0] = new bq(1163, 7, 12, 0);
      }

      return this.a;
   }

   public final cr a() {
      return this.a;
   }

   public final p[] a() {
      return this.a;
   }

   public final p[] b() {
      return this.c;
   }

   public final p[] c() {
      return this.b;
   }

   public final ck a() {
      return this.a;
   }

   public final bf a() {
      return this.a;
   }

   public final void a(bf var1) {
      this.a = null;
   }

   public final void a(int var1) {
      if (this.u < 3 || this.s <= this.t >> 1) {
         this.f = true;
         this.u = var1;
         this.t = var1 >= 3 ? 10000 : (var1 == 1 ? 7000 : 2000);
         this.s = this.t;
         if (var1 == 3) {
            this.d = 255.0F;
            this.e = 255.0F;
            this.f = 255.0F;
            this.a.i();
         } else if (var1 == 2) {
            this.d = (float)g * 1.5F;
            this.e = (float)h * 1.5F;
            this.f = (float)i * 1.5F;
         } else if (var1 == 4) {
            this.d = 0.0F;
            this.e = 0.0F;
            this.f = 255.0F;
         } else {
            float var2 = var1 == 1 ? 8.0F : 5.0F;
            this.d = (float)g.b(10, g.c(255, (int)((float)g * var2)));
            this.e = (float)g.b(10, g.c(255, (int)((float)h * var2)));
            this.f = (float)g.b(10, g.c(255, (int)((float)i * var2)));
         }
      }
   }

   public final void a(boolean var1) {
      --this.l;
      ++this.o;
      if (!var1) {
         bl.f();
         ++this.c;
      } else {
         ++this.b;
      }

      this.a(1);
   }

   public final void b() {
      ++bl.o;
      --this.l;
   }

   public final void c() {
      --this.m;
   }

   public static void b(int var0) {
      if (bl.a.length > 1) {
         bl.a[var0] = null;
         String[] var3 = new String[bl.a.length - 1];
         int var1 = 0;

         for(int var2 = 0; var2 < bl.a.length; ++var2) {
            if (bl.a[var2] != null) {
               var3[var1++] = bl.a[var2];
            }
         }

         bl.a = var3;
      } else {
         bl.a = null;
         bl.a = null;
      }
   }

   public final void d() {
      --this.n;
   }

   public final int a() {
      return 0;
   }

   public final int b() {
      return this.l;
   }

   public final int c() {
      return this.m;
   }

   public final bq[] a() {
      return this.a;
   }

   public final int d() {
      return this.p;
   }

   public final f a() {
      return this.a;
   }

   public final boolean a(cc var1) {
      return this.a.a(var1.a, var1.b, var1.c);
   }

   public final boolean b(cc var1) {
      return this.c[1] != null ? this.c[1].a(var1.a, var1.b, var1.c) : false;
   }

   public final boolean c(cc var1) {
      return this.c != null && this.c[0] != null && !bl.b() ? this.c[0].a(var1.a, var1.b, var1.c) : false;
   }

   public final void a(long var1) {
      if (this.f) {
         at.a.setColor((int)this.d, (int)this.e, (int)this.f);
      } else {
         at.a.setColor(g, h, i);
      }

      at.a.fillRect(0, 0, at.f, at.g);
      this.a.b();
      at.a.a((ah)this.a);
      int var3;
      if (this.a != null) {
         for(var3 = 0; var3 < this.a.length; ++var3) {
            this.a[var3].b();
         }
      }

      if (this.b != null) {
         for(var3 = 0; var3 < this.b.length; ++var3) {
            this.b[var3].b();
         }
      }

      if (this.a != null) {
         for(var3 = 0; var3 < this.a.length; ++var3) {
            this.a[var3].a(var1);
            this.a[var3].a();
         }
      }

      if (this.b != null) {
         for(var3 = 0; var3 < this.b.length; ++var3) {
            this.b[var3].a(var1);
            this.b[var3].a();
         }
      }

      if (this.c != null) {
         for(var3 = 0; var3 < this.c.length; ++var3) {
            if (this.c[var3] != null) {
               this.c[var3].a(var1);
               this.c[var3].a();
            }
         }
      }

      this.a.a();
   }

   public final void e() {
      this.a.c();
      if (this.a != null) {
         for(int var1 = 0; var1 < this.a.length; ++var1) {
            if (this.a[var1] instanceof l) {
               ((l)this.a[var1]).c();
            }
         }
      }

   }

   public final void b(long var1) {
      at.a.setColor(g, h, i);
      at.a.fillRect(0, 0, at.f, at.g);
      this.a.b();
      at.a.a((ah)this.a);
      int var3;
      if (this.a != null) {
         for(var3 = 0; var3 < this.a.length; ++var3) {
            this.a[var3].b();
         }
      }

      if (this.b != null) {
         for(var3 = 0; var3 < this.b.length; ++var3) {
            this.b[var3].b();
         }
      }

      if (this.a != null) {
         for(var3 = 0; var3 < this.a.length; ++var3) {
            this.a[var3].a();
         }
      }

      if (this.b != null) {
         for(var3 = 0; var3 < this.b.length; ++var3) {
            this.b[var3].a();
         }
      }

      if (this.c != null) {
         for(var3 = 0; var3 < this.c.length; ++var3) {
            if (this.c[var3] != null) {
               this.c[var3].a();
            }
         }
      }

      this.a.a();
   }

   public final void c(long var1) {
      if (bl.c() && at.a.nextInt(25) == 0) {
         this.a(2);
      }

      if (this.f) {
         this.s = (int)((long)this.s - var1);
         if (this.s < 0) {
            this.f = false;
         }

         float var3 = (float)this.s / (float)this.t;
         this.d = g.a((float)g, this.d * var3);
         this.e = g.a((float)h, this.e * var3);
         this.f = g.a((float)i, this.f * var3);
      }

      int var4;
      p var5;
      db var8;
      if (bl.a() == null || bl.a().a()) {
         var4 = (int)var1;
         var8 = this;
         this.A += var4;
         this.B += var4;
         if (this.B > 20000) {
            this.B = 0;
            if (this.a != null) {
               for(var4 = 0; var4 < var8.a.length; ++var4) {
                  if ((var5 = var8.a[var4]).c() && var5.e() && !var5.a.d()) {
                     var5.f();
                     if (var4 < var8.v + var8.w) {
                        ((bh)var5).a(0, 0, 0);
                     } else {
                        ((ak)var5).a(10000, 0, -70000);
                     }
                     break;
                  }
               }
            }
         }

         if (var8.A > 40000) {
            var8.A = 0;
            var4 = 0;
            if (var8.y > 0 && var8.a != null) {
               for(int var10 = 0; var10 < var8.a.length; ++var10) {
                  if (var10 >= var8.a.length - var8.y && !var8.a[var10].d() && var8.a[var10].e() && !var8.a[var10].a.d()) {
                     ++var4;
                  }
               }
            }

            if (var8.a != null) {
               boolean var11 = false;

               for(int var6 = 0; var6 < var8.a.length; ++var6) {
                  p var7 = var8.a[var6];
                  if ((var8.v > 0 && var6 < var8.v || var8.w > 0 && var6 < var8.v + var8.w && var6 > var8.v) && var7.e() && !var7.a.d()) {
                     var7.f();
                     ((bh)var7).a(0, 0, 0);
                  }

                  if (var4 >= 2 && var8.C < 2 && var8.y > 0 && var6 >= var8.a.length - var8.y && var7.e() && !var7.a.d()) {
                     var11 = true;
                     var7.f();
                     ((bh)var7).a(var7.e, var7.f, var8.a.a().c + '鱀');
                  }
               }

               if (var11) {
                  ++var8.C;
               }
            }
         }
      }

      if (bl.a().a() || bl.c()) {
         var4 = (int)var1;
         var8 = this;
         this.z += var4;
         if (this.z > 40000) {
            this.z = 0;
            if (this.a != null) {
               for(var4 = 0; var4 < var8.a.length; ++var4) {
                  if ((var5 = var8.a[var4]).d == 9 && var5.e() && !var5.a.d()) {
                     var5.f();
                     bh var10000;
                     int var10001;
                     int var10002;
                     int var10003;
                     if (!bl.c() && bl.a().a()) {
                        var10000 = (bh)var5;
                        var10001 = var8.c[3].a(var8.b).a - 10000 + at.a.nextInt(20000);
                        var10002 = var8.c[3].a(var8.b).b - 10000 + at.a.nextInt(20000);
                        var10003 = var8.c[3].a(var8.b).c - 10000 + at.a.nextInt(20000);
                     } else {
                        var10000 = (bh)var5;
                        var10001 = var8.a.a().a - 30000 + at.a.nextInt(60000);
                        var10002 = var8.a.a().b - 30000 + at.a.nextInt(60000);
                        var10003 = var8.a.a().c + at.a.nextInt(2) == 0 ? 30000 : -30000;
                     }

                     var10000.a(var10001, var10002, var10003);
                  }
               }
            }
         }
      }

      int var9;
      if (this.a != null) {
         for(var9 = 0; var9 < this.a.length; ++var9) {
            ((bm)this.a[var9]).a(var1);
         }
      }

      if (this.b != null) {
         for(var9 = 0; var9 < this.b.length; ++var9) {
            ((bm)this.b[var9]).a(var1);
         }
      }

   }

   public final boolean a(int var1) {
      return this.a != null ? this.a.a(var1) : false;
   }

   public final void f() {
      this.e = true;
   }

   public final boolean b() {
      return this.e;
   }

   public final void g() {
      this.a = null;
      this.b = null;
   }

   public final ag[] a() {
      return this.a;
   }

   public final boolean b(int var1) {
      return this.b != null ? this.b.a(var1) : false;
   }

   private void a(boolean var1, int var2) {
      if (this.a != null && this.a.a != null && bl.a().a()) {
         this.a = new bq[1];
         var2 = var2 == 2 ? 24 : (var2 == 0 ? 23 : (var2 == 3 ? 21 : 22));
         int var3;
         short var4 = (short)((var3 = var1 ? 250 : 247) + at.a.nextInt(3));
         this.a[0] = new bq(var4, var2, 5, 0);
         this.a.a.a(this.a);
         this.a.a.b();
      }

   }

   public final void a(int var1, boolean var2) {
      if (this.a != null) {
         for(int var3 = 0; var3 < this.a.length; ++var3) {
            if (this.a[var3].d == var1) {
               this.a[var3].a.a(true);
            }
         }
      }

      if (!this.h && var2) {
         this.h = true;
         this.a(true, var1);
      }

   }

   public final void c(int var1) {
      if (!this.g) {
         this.g = true;
         this.a(false, var1);
      }

   }

   public final void h() {
      bo.c();
      bo.b();
      int var1;
      if (this.c != null) {
         for(var1 = 0; var1 < this.c.length; ++var1) {
            if (this.c[var1] != null) {
               this.c[var1].b();
               this.c[var1] = null;
            }
         }
      }

      this.c = null;
      if (this.a != null) {
         ((bk)this.a).a();
      }

      this.a = null;
      if (this.b != null) {
         ((bk)this.b).a();
      }

      this.b = null;
      if (this.a != null) {
         for(var1 = 0; var1 < this.a.length; ++var1) {
            this.a[var1].a();
         }
      }

      this.a = null;
      if (this.b != null) {
         for(var1 = 0; var1 < this.b.length; ++var1) {
            this.b[var1].a();
         }
      }

      this.b = null;
      if (this.a != null) {
         this.a.h();
      }

      this.a = null;
      if (this.a != null) {
         for(var1 = 0; var1 < this.a.length; ++var1) {
            this.a[var1].b();
         }
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
      if (this.c != null) {
         this.c.a();
      }

      this.c = null;
      this.a = null;
      this.a = null;
      this.b = null;
      this.q = 0;
      System.gc();
   }
}
