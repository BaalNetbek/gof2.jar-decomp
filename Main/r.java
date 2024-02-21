package Main;

import com.mascotcapsule.micro3d.v3.Effect3D;
import com.mascotcapsule.micro3d.v3.Light;
import com.mascotcapsule.micro3d.v3.Texture;
import com.mascotcapsule.micro3d.v3.Vector3D;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.game.Sprite;

public final class r {
   private final int[] a = new int[]{320, 192, 256, 256, 192, 256, 192, 192, 320, 256, 192, 192, 320, 256, 320, 256, 256, 256, 320, 192};
   private int a;
   private int b;
   private int c;
   private int d;
   private int e;
   private int f;
   private float a;
   private float b;
   private float c;
   private float d;
   private int g;
   private int h;
   private int i;
   private boolean b;
   private boolean c;
   private boolean d;
   private boolean e;
   private float e;
   private float f;
   private float g;
   private float h;
   private Image a;
   private Image b;
   private Image c;
   private Image d;
   private Image e;
   private Image f;
   private Image g;
   private Sprite a;
   private Sprite b;
   private Sprite c;
   private .cw[] a;
   private .bd[] a;
   private .ay a;
   private int j;
   private int k;
   private .ag a;
   private .ag[] a;
   private .aj a;
   private .ap a;
   private .ap b;
   private .cc a;
   private .cc b;
   private .cm a;
   private .ag[] b;
   private .ag[] c;
   private int[] b;
   private int[] c;
   private int[] d;
   private .ar a;
   private boolean f;
   private boolean g;
   private boolean h;
   private boolean i;
   private boolean j;
   private .m a;
   private .m b;
   private .m c;
   private boolean k;
   private Image h;
   private int l;
   private int m;
   private int n;
   private float i;
   private boolean l;
   public boolean a;
   private .ag b;
   private .ag c;
   private Image[] a = new Image[5];
   private boolean[] a = new boolean[10];
   private int o;
   private boolean m;
   private int p;
   private int q;
   private boolean n;
   private int r;
   private boolean o;

   public r(boolean var1, .cl var2, boolean var3, int var4) {
      this.a = .at.g - 14;
      this.f = 0;
      this.j = -1;
      this.b = 2;
      this.c = 15;
      this.d = .at.f - 4;
      this.e = this.a - this.c;
      String var5 = "/data/interface/fog.png";
      this.a = .ai.a("/data/interface/fog.png", true);
      var5 = "/data/interface/menu_map_jumpgate.png";
      this.e = .ai.a("/data/interface/menu_map_jumpgate.png", true);
      var5 = "/data/interface/menu_map_mainmission.png";
      this.c = .ai.a("/data/interface/menu_map_mainmission.png", true);
      var5 = "/data/interface/menu_map_sidemission.png";
      this.d = .ai.a("/data/interface/menu_map_sidemission.png", true);
      var5 = "/data/interface/map_blueprint.png";
      this.b = .ai.a("/data/interface/map_blueprint.png", true);
      var5 = "/data/interface/menu_map_visited.png";
      this.f = .ai.a("/data/interface/menu_map_visited.png", true);
      var5 = "/data/interface/menu_map_direction.png";
      Image var7 = .ai.a("/data/interface/menu_map_direction.png", true);
      this.a = new Sprite(var7);
      var5 = "/data/interface/logos_small.png";
      var7 = .ai.a("/data/interface/logos_small.png", true);
      this.c = new Sprite(var7, var7.getHeight(), var7.getHeight());
      this.g = this.a.getWidth() << 1;
      this.h = this.a.getHeight() << 1;
      new .av();
      this.a = .av.a();
      this.a = .ag.a(0, 48, 14, 62, 200, 200, (byte)2);
      this.a.a(.bo.a(0));
      int[] var8 = ((.ac)((.ac)this.a)).a();
      .at.a.setSeed(10000L);

      int var6;
      for(var6 = 0; var6 < var8.length; var6 += 3) {
         var8[var6] = 5000 - .at.a.nextInt(20000);
         var8[var6 + 1] = 5000 - .at.a.nextInt(20000);
         var8[var6 + 2] = 2000 + .at.a.nextInt(5000);
      }

      this.a.a(2);
      var5 = "/data/interface/map_sun_glow.png";
      this.h = .ai.a("/data/interface/map_sun_glow.png", true);
      this.a = new .aj();
      this.a = new .ag[this.a.length];

      for(var6 = 0; var6 < this.a.length; ++var6) {
         int var9 = this.a[var6].g();
         this.a[var6] = .bo.a(6781);
         this.a[var6].a(var9, var9);
         this.a[var6].a((byte)1);
         this.a[var6].a(2);
         this.a[var6].g(5000);
         this.a[var6].d(0, 2048, 0);
         this.a[var6].f(1024, 1024, 1024);
         this.a[var6].c(-8000 + (int)((float)(100 - this.a[var6].d()) / 100.0F * 10000.0F), -7000 + (int)((float)(100 - this.a[var6].e()) / 100.0F * 9000.0F), 2000 + (int)((float)(100 - this.a[var6].f()) / 100.0F * 2500.0F));
         this.a.a(this.a[var6]);
      }

      if (.bl.a() >= 32 && .bl.g >= 0) {
         this.b = .bo.a(6805);
         this.b.a(true);
         this.b.f(30);
         this.b.f(512, 512, 512);
         this.b.a((byte)2);
         this.b.b(this.a[.bl.g].a());
         this.a.a(this.b);
      }

      this.a.b(true);
      this.a = new .cc();
      this.b = new .cc();
      new .cc();
      this.a = new .cm();
      .at.a.setSeed(System.currentTimeMillis());
      this.a(var1, var2, var3, var4);
   }

   public final void a(boolean var1, .cl var2, boolean var3, int var4) {
      this.g = var1;
      this.n = var3;
      this.q = var4;
      this.a = (float)(.at.f >> 1);
      this.b = (float)(this.c + (this.e >> 1));
      this.c = 0.0F;
      this.d = 0.0F;
      this.b = .at.a.a();
      if (this.a == null) {
         this.a = .ap.a(this.d, this.e + 20, 1000, 10, 31768);
         this.a.b(0, 0, -2500);
         this.a.d(0, 2048, 0);
         this.a.c((int)this.c * 20, (int)this.d * 20, 0);
         this.a.b(true);
      }

      .at.a.a(this.a);
      this.l = .bl.a() >= 16;
      this.f = this.l ? 0 : 3;
      this.j = .bl.a().a();
      if (this.f == 3) {
         this.d();
         this.a.a(500);
         this.f = false;
         this.k = 0;

         while(this.a[this.k].b() != .bl.a().b()) {
            this.a(32);
         }

         this.c();
      } else {
         this.f = true;
         if (var3) {
            this.a.a(this.a[var4].a());
         } else {
            this.a.a(this.a[.bl.a().a()].a());
         }

         this.a.c(this.a.a, this.a.b, 0);
         this.c = (float)(this.a.a / 20);
         this.d = (float)(this.a.b / 20);
         this.a(0.0F, 0.0F);
         this.a.b(true);
         this.a.a(this.a);
         this.a((float)this.a.a - this.a, (float)this.a.b - this.b);
         this.k = false;
      }

      this.m = false;
      this.i = false;
      this.j = false;
      this.a = false;

      for(int var8 = 0; var8 < this.a.length; ++var8) {
         this.a[var8].a(.bl.a()[var8]);
      }

      this.d = null;
      this.o = -1;
      int var5;
      int var7;
      if (var1) {
         .cl var9 = var2;
         if (!var2.a() && var2.b() && .bl.a().b() != null) {
            for(var5 = 0; var5 < this.a.length; ++var5) {
               if (this.a[var5].a() != null) {
                  for(var7 = 0; var7 < this.a[var5].a().length; ++var7) {
                     if (var9.h() == this.a[var5].a()[var7]) {
                        this.o = var5;
                        break;
                     }
                  }
               }
            }

            if (this.o >= 0) {
               .ae var6 = new .ae();
               this.d = var6.a(this.a, .bl.a().a(), this.o);
            }
         }
      }

      this.p = 0;
      short[] var10 = new short[]{223, 224, 271, 279, 278, 132};

      for(var5 = 0; var5 < var10.length; ++var5) {
         if ((var7 = .q.a(.at.a.a(var10[var5]), 1)) > this.p) {
            this.p = var7;
         }
      }

      this.p += 32;
      this.r = 0;
   }

   public final void a() {
      if (this.a != null) {
         this.a.a();
         this.a = null;
      }

      this.a = null;
      this.b = null;
      this.c = null;
   }

   public final boolean a(int var1) {
      if (var1 == 256) {
         if (this.f == 0 && this.j >= 0 && !this.g && !this.n) {
            if (this.h) {
               this.h = false;
               if (this.o && this.a.a()) {
                  .db.a = .bl.a;
                  this.a = true;
                  .at.a.a(this.b);
                  .bg.a.setLight(.bg.a);
               }

               this.o = false;
               return true;
            }

            if (!this.j && !.bl.a().b(this.a[this.j].a())) {
               if (this.a == null) {
                  this.a = new .ay();
               }

               this.a.a(.at.a.a(241), false);
               this.h = true;
            } else {
               this.f = 1;
            }
         } else if (this.f == 3) {
            if (this.h) {
               if (this.a.a()) {
                  if (!this.g) {
                     if (this.i) {
                        .db.a = this.a[this.k];
                        this.a = true;
                        .at.a.a(this.b);
                        .bg.a.setLight(.bg.a);
                        return true;
                     }

                     if (this.i) {
                        .bl.a(this.a[this.k]);
                        .db.a = null;
                        .db.a();
                        .bl.c();
                     } else if (.bl.a() != 3) {
                        .bl.f = -1;
                        .bl.d = -1;
                        .bl.e = -1;
                        .bl.a(.bl.a());
                        if (!this.a[this.k].a(.bl.a())) {
                           .db.a = this.a[this.k];
                        }

                        if (this.j) {
                           .db.c = true;
                        }

                        .ba.e();
                     }

                     .at.a.a(.at.a[2]);
                  }

                  return true;
               }

               this.h = false;
               return true;
            }

            if (!this.g && this.a[this.k].b() != .bl.a().b()) {
               if (this.a == null) {
                  this.a = new .ay();
               }

               this.a.a(.at.a.a(295) + ": " + this.a[this.k].a() + "\n" + .at.a.a(242), true);
               this.h = true;
            }
         }
      }

      if (var1 == 16384 && !this.h && !this.n) {
         this.m = !this.m;
      }

      if (var1 == 8192) {
         if (this.f == 0) {
            .at.a.a(this.b);
            .bg.a.setLight(.bg.a);
            return false;
         }

         if (this.f == 3) {
            if (!this.l) {
               .at.a.a(this.b);
               .bg.a.setLight(.bg.a);
               return false;
            }

            this.k = true;
            this.k = 0;
            this.c();
         }
      }

      if (this.h) {
         if (var1 == 4) {
            this.a.a();
         } else if (var1 == 32) {
            this.a.b();
         }
      } else if (this.f == 3) {
         if (var1 != 64 && var1 != 32) {
            if (var1 == 2 || var1 == 4) {
               --this.k;
               if (this.k < 0) {
                  this.k = this.a.length - 1;
               }

               this.c();
            }
         } else {
            ++this.k;
            if (this.k >= this.a.length) {
               this.k = 0;
            }

            this.c();
         }
      }

      return true;
   }

   private void c() {
      int var1 = this.k ? 0 : this.k + 2;
      int var2 = this.k ? -6000 : -4000;
      this.a = this.b[var1].b(this.a);
      this.a.a(this.a.b(), this.a.a);
      this.b.a(this.a.c(), this.a.b);
      this.c.a(this.a.d(), this.a.c + var2);
   }

   public final void a(int var1, int var2) {
      if (this.n) {
         var1 = 0;
         this.r += var2;
      }

      this.i = var2;
      if (this.f == 0) {
         this.b = false;
         this.c = false;
         this.d = false;
         this.e = false;
         float var7 = 0.0F;
         float var3 = 0.0F;
         if ((var1 & 4) != 0) {
            var7 = -this.e;
            this.b = true;
         }

         if ((var1 & 32) != 0) {
            var7 = this.e;
            this.c = true;
         }

         if ((var1 & 2) != 0) {
            var3 = -this.f;
            this.d = true;
         }

         if ((var1 & 64) != 0) {
            var3 = this.f;
            this.e = true;
         }

         if (!this.b && !this.c) {
            this.e *= 0.8F;
            var7 = this.g < 0.0F ? -this.e : this.e;
         } else {
            this.g = var7;
            if (this.e < 0.8F) {
               this.e = 0.8F;
            }

            this.e *= 1.5F;
            if (this.e > 5.5F) {
               this.e = 5.5F;
            }
         }

         if (!this.d && !this.e) {
            this.f *= 0.8F;
            var3 = this.h < 0.0F ? -this.f : this.f;
         } else {
            this.h = var3;
            if (this.f < 0.8F) {
               this.f = 0.8F;
            }

            this.f *= 1.5F;
            if (this.f > 5.5F) {
               this.f = 5.5F;
            }
         }

         this.a(var7, var3);
         this.i = -1.0F;

         for(var1 = 0; var1 < this.a.length; ++var1) {
            if (.bl.a()[var1]) {
               this.a.a(this.a[var1].b(this.a));
               if (this.a.c < 0 && this.a > (float)(this.a.a - 20) && this.a < (float)(this.a.a + 20) && this.b > (float)(this.a.b - 20) && this.b < (float)(this.a.b + 20)) {
                  float var8 = ((float)this.a.a - this.a) / 4.0F;
                  float var4 = ((float)this.a.b - this.b) / 4.0F;
                  float var5 = (var8 < 0.0F ? -var8 : var8) * 4.0F;
                  float var6 = (var4 < 0.0F ? -var4 : var4) * 4.0F;
                  this.i = var5 > var6 ? var5 : var6;
                  this.i = 10.0F - this.i;
                  if ((float)this.a.a < this.a) {
                     var7 = var8;
                  } else if ((float)this.a.a > this.a) {
                     var7 = var8;
                  }

                  if ((float)this.a.b > this.b) {
                     var3 = var4;
                  } else if ((float)this.a.b < this.b) {
                     var3 = var4;
                  }

                  if (.g.e((int)var7) > .g.e((int)((float)this.a.a - this.a))) {
                     var7 *= 0.5F;
                  }

                  if (.g.e((int)var3) > .g.e((int)((float)this.a.b - this.b))) {
                     var3 *= 0.5F;
                  }

                  if (!this.b && !this.c && !this.d && !this.e) {
                     this.a(var7, var3);
                  }
                  break;
               }
            }
         }
      } else if (this.f == 1) {
         this.a = this.a.b(this.a);
         if (this.a.c < this.a[this.j].e() - 150) {
            this.a.c(this.a[this.j].b());
            this.a.a(-1024);
            this.a.a((.cc)this.a);
         } else {
            if (this.f) {
               this.d();
               this.a.a(500);
            } else {
               for(var2 = 0; var2 < this.b.length; ++var2) {
                  this.b[var2] = null;
               }

               this.b = null;
               if (this.b != null && this.a != null) {
                  this.a.b(this.b);
               }

               this.a = null;

               for(var2 = 0; var2 < this.c.length; ++var2) {
                  this.c[var2] = null;
               }

               this.c = null;
               this.a.a(1000);
               this.a.e(0, 2048, 0);
               this.a.c((int)this.c * 20, (int)this.d * 20, this.a.d());
               if (this.b != null && this.a != null) {
                  this.a.a(this.b);
                  this.b.a().a();
                  this.b.f(512, 512, 512);
                  this.b.b(this.a[.bl.g].a());
               }
            }

            this.f = 2;
         }
      } else if (this.f == 2) {
         this.a = this.a.a((.cc)this.a);
         if (this.f) {
            if (this.a.c > this.a[this.j].d() - 6000) {
               this.b.a(this.a[this.j].a(this.b));
               .cc var10000 = this.b;
               var10000.c -= 6000;
               this.a.c(this.b);
               this.a.a(-1024);
               this.a.a((.cc)this.a);
            } else {
               this.f = false;
               this.f = 3;
               this.c();
            }
         } else if (this.a.c > 0) {
            this.b.a(this.a[this.j].a(this.b));
            this.b.c = 0;
            this.a.c(this.b);
            this.a.a(-1024);
            this.a.b(0, 0, this.a.c);
         } else {
            this.f = true;
            this.f = 0;
         }
      } else if (this.f == 3) {
         this.a.a(var2 << 1);
         this.b.a(var2 << 1);
         this.c.a(var2 << 1);
         this.a.c(this.a.a(), this.b.a(), this.c.a());
         if (this.k && this.a.a(true) && this.b.a(true) && this.c.a(true)) {
            this.f = 1;
            this.k = false;
         }
      }

      if (this.a != null) {
         for(var2 = 2; var2 < this.b.length; ++var2) {
            this.a.a();
            int var9 = this.b[var2 - 2];
            this.a.c(0, var9, 0);
            this.a.a(0, 0, this.c[var2 - 2]);
            this.b.a(0, 0, 0);
            this.b = this.a.a(this.a, this.b);
            this.b[var2].b(this.b);
            this.a.a(this.b[var2].a(this.b));
            this.a.a();
            ((.bg)this.b[var2]).b.getLight().setDirection(new Vector3D(-this.a.a, -this.a.b, this.a.c));
         }
      }

      this.g();
      this.e();
      this.f();
   }

   private void d() {
      int var1 = this.a[this.j].a().length;
      this.a = new .bd[var1];
      new .av();
      this.a = .av.a(this.a[this.j]);
      this.b = new int[var1];
      this.c = new int[var1];
      .at.a.setSeed((long)(this.a[this.j].a() * 1000));
      this.b = new .ag[var1 + 2];
      this.a = new .ar();

      int var2;
      for(var2 = 0; var2 < this.a.length; ++var2) {
         this.a[var2] = false;
      }

      int var3;
      for(var2 = 0; var2 < this.b.length; ++var2) {
         if (var2 > 1) {
            this.b[var2] = .bo.a(6778);
         } else {
            var3 = this.a[this.j].g();
            this.b[var2] = .bo.a(6781);
            this.b[var2].a(var3, var3);
         }

         this.b[var2].a((byte)1);
         this.b[var2].g(5000);
         if (var2 > 1) {
            .cm var7 = new .cm();
            int var4 = 0;
            boolean var5 = false;

            int var6;
            while(!var5) {
               var6 = .at.a.nextInt(this.a.length);
               if (!this.a[var6]) {
                  this.a[var6] = true;
                  var4 = 4096 / this.a.length * var6;
                  var5 = true;
               }
            }

            this.b[var2 - 2] = var4;
            var7.c(0, var4, 0);
            var6 = var2 == 2 ? 512 : this.c[var2 - 3];
            this.c[var2 - 2] = var6 + 128 + .at.a.nextInt(376);
            .cc var10 = new .cc(0, 0, this.c[var2 - 2]);
            .cc var11 = new .cc();
            var11 = var7.a(var10, var11);
            this.b[var2].a(var11);
            var3 = this.a[var2 - 2].c();
            var4 = this.a[var3];
            this.b[var2].f(var4, var4, var4);
            (var10 = new .cc(this.b[var2].a())).a();
            this.b[var2].a(var3, var3);
            Light var9 = new Light(new Vector3D(-var10.a, -var10.b, var10.c), 4096, 1024);
            ((.bg)this.b[var2]).b = new Effect3D(var9, 0, true, .bg.a);
            ((.bg)this.b[var2]).b.setTransparency(false);
            ((.bg)this.b[var2]).b.setSemiTransparentEnabled(false);
         } else {
            ((.bg)this.b[var2]).b = new Effect3D((Light)null, 0, true, .bg.a);
            ((.bg)this.b[var2]).b.setTransparency(true);
            ((.bg)this.b[var2]).b.setSemiTransparentEnabled(true);
            this.b[var2].b(0, 0, var2 * 32);
            this.b[var2].d(0, 2048, 256);
            this.b[var2].f(256, 256, 256);
         }

         this.b[var2].a(2);
         this.a.a(this.b[var2]);
      }

      this.b[1].a(false);
      this.c = new .ag[var1];

      for(var2 = 0; var2 < this.c.length; ++var2) {
         this.c[var2] = .bo.a(6779);
         this.c[var2].a(2);
         this.c[var2].d(-1024, 0, 0);
         this.a.a(this.c[var2]);
         var3 = this.c[var2];
         this.c[var2].f(var3 << 1, var3 << 1, var3 << 1);
         ((.bg)this.c[var2]).b = new Effect3D((Light)null, 0, true, (Texture)null);
         ((.bg)this.c[var2]).b.setTransparency(true);
         ((.bg)this.c[var2]).b.setSemiTransparentEnabled(true);
      }

      this.a.b(this.a.a((.cc)this.a));
      this.a.e(-256, 0, 256);
      this.a = new .m(0, 0);
      this.b = new .m(0, 0);
      this.c = new .m(0, 0);
      this.a.b(true);
      Image var8 = .ai.a("/data/interface/sun_" + this.a[this.j].g() + ".png", true);
      this.b = new Sprite(var8);
      this.b.defineReferencePixel(this.b.getWidth(), this.b.getHeight());
      if (this.b != null && this.j == .bl.g) {
         if (this.a != null) {
            this.a.b(this.b);
         }

         this.b.f(256, 256, 256);
         this.b.b(this.b[this.a[this.j].a(.bl.h) + 2].a());
         this.a.a(this.b);
      }

      if (this.c == null) {
         this.c = .bo.a(13999);
      }

      if (this.a[this.j].a() == .bl.a().a()) {
         this.c.a(this.b[this.a[this.j].a(.bl.a().b()) + 2].a());
         this.c.e(512, 0, -1024);
         this.a.a(this.c);
      }

      .at.a.setSeed(System.currentTimeMillis());
   }

   private void a(float var1, float var2) {
      if (!this.h) {
         if (this.a >= (float)(.at.f >> 1) && var1 > 0.0F || this.a <= (float)(.at.f >> 1) && var1 < 0.0F) {
            this.c -= var1;
         }

         if (this.b >= (float)(this.c + (this.e >> 1)) && var2 > 0.0F || this.b <= (float)(this.c + (this.e >> 1)) && var2 < 0.0F) {
            this.d -= var2;
         }

         if (this.c >= 0.0F) {
            this.c = 0.0F;
            this.a += var1;
            if (this.a > (float)(.at.f >> 1)) {
               this.a = (float)(.at.f >> 1);
            }

            if (this.a <= (float)(this.b + 5)) {
               this.a = (float)(this.b + 5);
            }
         }

         if (this.d >= 0.0F) {
            this.d = 0.0F;
            this.b += var2;
            if (this.b > (float)(this.c + (this.e >> 1))) {
               this.b = (float)(this.c + (this.e >> 1));
            }

            if (this.b <= (float)(this.c + 5)) {
               this.b = (float)(this.c + 5);
            }
         }

         if (this.c <= (float)(-this.g + this.d)) {
            this.c = (float)(-this.g + this.d);
            this.a += var1;
            if (this.a < (float)(.at.f >> 1)) {
               this.a = (float)(.at.f >> 1);
            }

            if (this.a >= (float)(this.b + this.d - 5)) {
               this.a = (float)(this.b + this.d - 5);
            }
         }

         if (this.d <= (float)(-this.h + this.e)) {
            this.d = (float)(-this.h + this.e);
            this.b += var2;
            if (this.b < (float)(this.c + (this.e >> 1))) {
               this.b = (float)(this.c + (this.e >> 1));
            }

            if (this.b >= (float)(this.c + this.e - 5)) {
               this.b = (float)(this.c + this.e - 5);
            }
         }

         this.a.c((int)this.c * 20, (int)this.d * 20, 0);
      }
   }

   public final boolean a() {
      return this.f == 3;
   }

   public final void a(boolean var1, boolean var2) {
      this.i = var1;
      this.j = var2;
   }

   private void e() {
      try {
         .at.a.a(.at.a);
         .at.a.a((.ah)this.a);
         if (this.a != null) {
            .at.a.a((.ah)this.a);
         } else {
            this.l += this.i;

            for(int var1 = 0; var1 < this.a.length; ++var1) {
               boolean var2 = false;
               int var4;
               if (var1 == this.j && this.n && this.r < 4000) {
                  var4 = (int)((float)this.r / 4000.0F * (float)(1024 + (.g.a(this.l + (var1 << 8)) >> 5)));
               } else {
                  var4 = 1024 + (.g.a(this.l + (var1 << 8)) >> 5);
               }

               this.a[var1].f(var4, var4, var4);
            }

            .at.a.a((.ah)this.a);
         }

         .at.a.a(System.currentTimeMillis());
         .at.a.a();
         .at.a.b(.at.a);
      } catch (Exception var3) {
         .at.a.b(.at.a);
         var3.printStackTrace();
      }
   }

   private void f() {
      int var1;
      int var3;
      switch(this.f) {
      case 0:
         .at.a.setColor(.a.b);
         this.a.a(this.a[.bl.a().a()].b(this.b));
         var1 = this.j;
         this.j = -1;
         int[] var2 = .bl.a().b();

         float var6;
         float var7;
         float var12;
         for(var3 = 0; var3 < this.a.length; ++var3) {
            if (.bl.a()[var3]) {
               this.a.a(this.a[var3].b(this.a));
               if (this.a.c < 0) {
                  if (this.a > (float)(this.a.a - 10) && this.a < (float)(this.a.a + 10) && this.b > (float)(this.a.b - 10) && this.b < (float)(this.a.b + 10)) {
                     this.j = var3;
                  }

                  if (var2 != null && !this.j) {
                     boolean var4 = false;

                     for(int var5 = 0; var5 < var2.length; ++var5) {
                        if (var2[var5] == var3) {
                           var4 = true;
                           break;
                        }
                     }

                     if (var4) {
                        var12 = (float)(this.a.a - this.b.a) / 10.0F;
                        var6 = (float)(this.a.b - this.b.b) / 10.0F;
                        var7 = var12 * 2.0F;
                        float var8 = var6 * 2.0F;

                        for(int var10 = 0; var10 < 8; ++var10) {
                           .at.a.setColor(var10 == this.n ? -4138775 : -12950906);
                           .at.a.fillArc((int)((float)this.b.a + var7) - 2, (int)((float)this.b.b + var8) - 2, 4, 4, 0, 360);
                           var7 += var12;
                           var8 += var6;
                        }
                     }
                  }
               }

               if (var1 < 0) {
                  this.a(var3, false);
               }
            }
         }

         if (this.d != null) {
            for(var3 = 0; var3 < this.d.length - 1; ++var3) {
               this.a.a(this.a[this.d[var3]].b(this.b));
               this.a.a(this.a[this.d[var3 + 1]].b(this.a));
               float var11 = (float)(this.a.a - this.b.a) / 10.0F;
               var12 = (float)(this.a.b - this.b.b) / 10.0F;
               var6 = var11 * 2.0F;
               var7 = var12 * 2.0F;

               for(int var13 = 0; var13 < 8; ++var13) {
                  .at.a.setColor((var3 << 3) + var13 == this.n ? -1 : -4740812);
                  .at.a.fillArc((int)((float)this.b.a + var6) - 2, (int)((float)this.b.b + var7) - 2, 4, 4, 0, 360);
                  var6 += var11;
                  var7 += var12;
               }
            }
         }

         if (this.j >= 0 && (!this.n || this.r >= 4000)) {
            this.a(this.j, false);
         }

         if (!this.j) {
            this.m += this.i;
            if (this.m > 400) {
               ++this.n;
               if (this.n > (this.d == null ? 20 : this.d.length << 3)) {
                  this.n = 0;
               }
            }
         }
         break;
      case 3:
         this.g = .ai.a("/data/interface/logo_" + this.a[this.j].c() + ".png", true);
         .at.a.drawImage(this.g, 5, 18, 20);

         for(var3 = 0; var3 < this.a.length; ++var3) {
            if (var3 != this.k) {
               this.a(var3, true);
            }
         }

         this.a(this.k, true);
         break;
      default:
         .a.a("", "");
      }

      if (this.a == null && !this.n) {
         if ((var1 = (int)(this.i * 1.5F)) > 0) {
            .at.a.setColor(-8086094);
            .at.a.drawLine((int)this.a, (int)this.b + var1, (int)this.a - var1, (int)this.b);
            .at.a.drawLine((int)this.a - var1, (int)this.b, (int)this.a, (int)this.b - var1);
            .at.a.drawLine((int)this.a, (int)this.b - var1, (int)this.a + var1, (int)this.b);
            .at.a.drawLine((int)this.a + var1, (int)this.b, (int)this.a, (int)this.b + var1);
         }

         this.a.setTransform(0);
         this.a.setRefPixelPosition((int)this.a, (int)this.b + var1);
         this.a.paint(.at.a);
         this.a.setTransform(3);
         this.a.setRefPixelPosition((int)this.a, (int)this.b - var1);
         this.a.paint(.at.a);
         this.a.setTransform(5);
         this.a.setRefPixelPosition((int)this.a - var1, (int)this.b);
         this.a.paint(.at.a);
         this.a.setTransform(6);
         this.a.setRefPixelPosition((int)this.a + var1, (int)this.b);
         this.a.paint(.at.a);
      }

      if (this.f == 3) {
         .a.a(.at.a.a(72) + ": " + this.a[this.j].a() + " " + .at.a.a(41), false);
         .a.a(.at.a.a(223), .at.a.a(65));
         .q.a((String)(!this.g && .bl.a().b(this.a[this.j].a()) && this.a[this.k].b() != .bl.a().b() ? .at.a.a(222) : ""), .at.f >> 1, .at.g - 4, 1, 40);
      } else {
         .a.a(.at.a.a(72), false);
         if (this.n) {
            .a.a("", .at.a.a(65));
         } else {
            .a.a(.at.a.a(223), .at.a.a(65));
            .q.a((String)(this.g ? "" : .at.a.a(221)), .at.f >> 1, .at.g - 4, 1, 40);
         }
      }

      if (this.m && (this.f == 0 || this.f == 3)) {
         .a.a(.at.a.a(223), 1, .at.g - 16 - 90 - 4, this.p, 94);
         int var9 = .at.g - 3 - 16 - 13;
         .at.a.drawImage(this.b, 10, var9, 20);
         .q.a((String).at.a.a(132), 25, var9, 1, 17);
         var9 -= 15;
         .at.a.drawImage(this.f, 10, var9, 20);
         .q.a((String).at.a.a(224), 25, var9, 1, 17);
         var9 -= 15;
         .at.a.drawImage(this.e, 10, var9, 20);
         .q.a((String).at.a.a(271), 25, var9, 1, 17);
         var9 -= 15;
         .at.a.drawImage(this.d, 10, var9, 20);
         .q.a((String).at.a.a(279), 25, var9, 1, 17);
         var9 -= 15;
         .at.a.drawImage(this.c, 10, var9, 20);
         .q.a((String).at.a.a(278), 25, var9, 1, 17);
      }

      if (this.h) {
         this.a.c();
      }

   }

   private void a(int var1, boolean var2) {
      int var3;
      for(var3 = 0; var3 < this.a.length; ++var3) {
         this.a[var3] = null;
      }

      if (var2 && this.a[var1].b() || !var2 && this.a[var1].b()) {
         this.a[0] = this.f;
      }

      .cl var7 = .bl.c();
      .cl var4 = .bl.b();
      if (var7 != null && !var7.a() && (var2 && this.a[var1].b() == var7.h() || !var2 && this.a[var1].a(var7.h()) >= 0 || .bl.a() > 32 && (var2 && this.a[var1].b() == .bl.h && var7.h() == -1 || !var2 && this.a[var1].a(.bl.h) >= 0 && var7.h() == -1))) {
         this.a[1] = this.c;
      }

      if (var4 != null && !var4.a() && (var2 && this.a[var1].b() == var4.h() || !var2 && this.a[var1].a(var4.h()) >= 0)) {
         this.a[2] = this.d;
      }

      if (var2 && this.a[this.j].h() == this.a[var1].b()) {
         this.a[3] = this.e;
      }

      .bp[] var8;
      int var9;
      if ((var8 = .bl.a()) != null) {
         for(var9 = 0; var9 < var8.length; ++var9) {
            if (var8[var9] != null && (var2 && var8[var9].a == this.a[var1].b() || !var2 && this.a[var1].a(var8[var9].a) >= 0)) {
               this.a[4] = this.b;
               break;
            }
         }
      }

      if (var2) {
         this.a.a(this.b[var1 + 2].b(this.a));
      } else {
         this.a.a(this.a[var1].b(this.a));
      }

      boolean var11 = false;
      boolean var10 = false;
      if (var2) {
         var9 = this.a.b - 4;
         var3 = this.a.a + 10 + .q.a(this.a[var1].a(), 0) + 7;
         .q.a((String)this.a[var1].a(), this.a.a + 10, var9, this.k == var1 ? 2 : (this.a[var1].b() ? 0 : 1), 17);
         if (var1 == this.k) {
            .q.b(.at.a.a(37) + ": " + this.a[var1].d(), this.a.a + 10, var9 + .q.a(), this.a[var1].b() ? 0 : 1);
         }
      } else {
         var9 = this.a.b - .q.a() - 4;
         byte var5 = 10;
         if (this.j == var1) {
            this.c.setFrame(this.a[var1].c());
            this.c.setPosition(this.a.a + 10, var9 - 4);
            this.c.paint(.at.a);
            var5 = 27;
         }

         var3 = this.a.a + var5 + .q.a(this.a[var1].a(), 0) + 7;
         boolean var6 = true;
         if (this.g && !var2 && this.o == this.a[var1].a()) {
            var6 = .a.b();
         }

         if (var6) {
            .q.a((String)this.a[var1].a(), this.a.a + var5, var9 - 2, this.j != var1 && this.j != .bl.a().a() ? 1 : 2, 17);
         }

         if (var1 == this.j) {
            .q.b(.at.a.a(219) + ": ", this.a.a + 10, var9 + 2 * .q.a(), 0);
            .q.b(.at.a.a(229 + this.a[this.j].c()), this.a.a + 10, var9 + 3 * .q.a(), 1);
            .q.b(.at.a.a(220) + ": ", this.a.a + 10, var9 + 4 * .q.a(), 0);
            .q.b(.at.a.a(225 + this.a[this.j].b()), this.a.a + 10, var9 + 5 * .q.a(), 1);
         }
      }

      for(int var12 = 0; var12 < this.a.length; ++var12) {
         if (this.a[var12] != null) {
            .at.a.drawImage(this.a[var12], var3, var9 - 1, 20);
            var3 += this.a[var12].getWidth() + 2;
         }
      }

   }

   private void g() {
      .at.a.setColor(0);
      .at.a.fillRect(0, 0, .at.f, .at.g);
      if (this.f == 3) {
         .a.a(.at.a.a(72) + ": " + this.a[this.j].a() + " " + .at.a.a(41));
      } else {
         .a.a(.at.a.a(72));
      }

      int var3;
      if (this.a != null) {
         .cw var4 = this.a[this.j];
         .at.a.setColor(var4.a, var4.b, var4.c);
         .at.a.fillRect(this.b, this.c, this.d, this.e);
         this.a = this.b[0].b(this.a);
         this.a.a(this.a);
         int var5 = this.a.a;
         var3 = this.a.b;
         this.b.setTransform(0);
         this.b.setRefPixelPosition(var5, var3);
         this.b.paint(.at.a);
         this.b.setTransform(5);
         this.b.setRefPixelPosition(var5 - 1, var3);
         this.b.paint(.at.a);
         this.b.setTransform(3);
         this.b.setRefPixelPosition(var5 - 1, var3 - 1);
         this.b.paint(.at.a);
         this.b.setTransform(6);
         this.b.setRefPixelPosition(var5, var3 - 1);
         this.b.paint(.at.a);
      } else {
         .at.a.drawImage(this.a, (int)((float)this.b + this.c), (int)((float)this.c + this.d), 0);
         .at.a.drawImage(this.a, (int)((float)this.b + this.c) + (this.g >> 1), (int)((float)this.c + this.d), 0);
         .at.a.drawImage(this.a, (int)((float)this.b + this.c), (int)((float)this.c + this.d) + (this.h >> 1), 0);
         .at.a.drawImage(this.a, (int)((float)this.b + this.c) + (this.g >> 1), (int)((float)this.c + this.d) + (this.h >> 1), 0);

         for(int var1 = 0; var1 < this.a.length; ++var1) {
            if (this.a[var1].a() && (!this.n || this.q != var1 || this.r >= 4000)) {
               int[] var2;
               if ((var2 = this.a[var1].b()) != null) {
                  this.a.a(this.a[var1].b(this.a));
                  .at.a.setColor(.a.b);

                  for(var3 = 0; var3 < var2.length; ++var3) {
                     if (this.a[var2[var3]].a() && (!this.n || this.q != var3 || this.r >= 4000)) {
                        this.a.a(this.a[var2[var3]].b(this.b));
                        .at.a.drawLine(this.a.a, this.a.b, this.b.a, this.b.b);
                     }
                  }
               }

               .at.a.a().a(this.a[var1].b(this.a));
               if (this.a.c < 0) {
                  .at.a.drawImage(this.h, this.a.a, this.a.b, 3);
               }
            }
         }

      }
   }

   public final void b() {
      this.o = true;
      if (this.a == null) {
         this.a = new .ay();
      }

      this.a.a(.at.a.a(243), true);
      this.h = true;
   }
}
