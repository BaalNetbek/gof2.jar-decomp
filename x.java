import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.game.Sprite;

public final class x {
   private String[][] a = new String[][]{{"", "", "", ""}, {"", "", "", ""}, {"", "", "", ""}, {"", "", "", ""}, {"", "", "", ""}};
   private byte[][] a;
   private static int a;
   private static int b = -1;
   private int c;
   private int d;
   private int e;
   private int f;
   private Image b;
   private Image c;
   private Image d;
   private Sprite a;
   private Sprite b;
   private Sprite c;
   private Image e;
   private Image f;
   private Sprite d;
   private Sprite e;
   private Sprite f;
   private Image g;
   private Image h;
   public Image a;
   private Image i;
   private int g;
   private String a;
   private String b = "";
   private boolean b;
   private boolean c;
   private boolean d;
   private boolean e;
   private int h;
   public boolean a;
   private boolean f;
   private boolean g;
   private int i;
   private int j;
   private int k;
   private boolean h;
   private boolean i;
   private boolean j;
   private boolean k;
   private int l;
   private int m;
   private int n;
   private v[] a;
   private v[] b;
   private ce[] a;
   private int o;
   private boolean l;
   private int p;
   private boolean m;

   public x() {
      this.d();
   }

   private void d() {
      try {
         this.a = new ce[20];
         String var1 = "/data/interface/items.png";
         this.a = ai.a("/data/interface/items.png", true);
         var1 = "/data/interface/hud_hull_alarm_numbers.png";
         this.f = new Sprite(ai.a("/data/interface/hud_hull_alarm_numbers.png", true), 13, 12);
         var1 = "/data/interface/hud_hull_alarm.png";
         this.g = ai.a("/data/interface/hud_hull_alarm.png", true);
         var1 = "/data/interface/hud_symbol_shield_png24.png";
         this.b = ai.a("/data/interface/hud_symbol_shield_png24.png", true);
         var1 = "/data/interface/hud_symbol_hull_png24.png";
         this.c = ai.a("/data/interface/hud_symbol_hull_png24.png", true);
         var1 = "/data/interface/hud_hull_bar_empty_png24.png";
         this.e = ai.a("/data/interface/hud_hull_bar_empty_png24.png", true);
         var1 = "/data/interface/hud_hull_bar_full_png24.png";
         this.f = ai.a("/data/interface/hud_hull_bar_full_png24.png", true);
         var1 = "/data/interface/hud_hull_bar_hit_png24.png";
         ai.a("/data/interface/hud_hull_bar_hit_png24.png", true);
         var1 = "/data/interface/hud_panel_upper_left_png24.png";
         Image var7 = ai.a("/data/interface/hud_panel_upper_left_png24.png", true);
         this.d = new Sprite(var7);
         var1 = "/data/interface/hud_panel_lower_left_png24.png";
         var7 = ai.a("/data/interface/hud_panel_lower_left_png24.png", true);
         this.e = new Sprite(var7);
         var1 = "/data/interface/hud_icons.png";
         var7 = ai.a("/data/interface/hud_icons.png", true);
         this.k = var7.getHeight();
         this.a = new Sprite(var7, this.k, this.k);
         var1 = "/data/interface/quickmenu_crosshair_anim.png";
         var7 = ai.a("/data/interface/quickmenu_crosshair_anim.png", true);
         this.b = new Sprite(var7, var7.getHeight(), var7.getHeight());
         this.b.defineReferencePixel(this.b.getWidth() >> 1, this.b.getHeight() >> 1);
         var1 = "/data/interface/quickmenu.png";
         var7 = ai.a("/data/interface/quickmenu.png", true);
         this.c = new Sprite(var7, var7.getHeight(), var7.getHeight());
         this.c.defineReferencePixel(this.c.getWidth() >> 1, this.c.getHeight() >> 1);
         var1 = "/data/interface/hud_hit_png24.png";
         this.d = ai.a("/data/interface/hud_hit_png24.png", true);
         this.d = at.f / 2 - 21;
         this.e = this.d + 14;
         this.f = this.e + 14;
         this.c = at.f >> 1;
         this.b = bl.a().l() > 0;
         this.c = bl.a().h() > 0;
         this.d = bl.a().f() > 0;
         this.e = bl.a().n() > 0;
         this.a = new byte[5][4];
         v[] var8 = bl.a().a(1);
         boolean var2 = true;
         if (var8 != null) {
            for(int var3 = 0; var3 < var8.length; ++var3) {
               if (var8[var3] != null) {
                  var2 = false;
               }
            }
         }

         if (!var2) {
            this.a[0][0] = 1;
            this.e();
            this.a[0][0] = at.a.a(124);
         } else {
            this.a[0][0] = "";
            this.a[0][0] = 0;
         }

         v var6 = bl.a().a(21);
         v var9 = bl.a().a(18);
         if (var6 == null && var9 == null) {
            this.b = null;
         } else {
            this.b = new v[var6 != null && var9 != null ? 2 : 1];
         }

         int var5 = 0;
         if (var6 != null) {
            this.a[0][1] = 1;
            this.a[0][1] = at.a.a(569 + var6.a());
            ++var5;
            this.b[0] = var6;
         } else {
            this.a[0][1] = 0;
            this.a[0][1] = "";
         }

         if (var9 != null) {
            this.a[0][3] = 1;
            this.a[0][3] = at.a.a(569 + var9.a());
            this.b[var5] = var9;
         } else {
            this.a[0][3] = 0;
            this.a[0][3] = "";
         }

         if (bl.b() != null) {
            this.a[0][2] = 1;
            this.a[3][0] = 1;
            this.a[3][1] = 1;
            this.a[3][2] = 1;
            this.a[3][3] = 1;
            this.a[0][2] = at.a.a(146);
            this.a[3][0] = at.a.a(147);
            this.a[3][1] = at.a.a(148);
            this.a[3][2] = at.a.a(149);
            this.a[3][3] = at.a.a(151);
         } else {
            this.a[0][2] = "";
         }

         this.b = "";
         this.f = false;
         this.g = false;
         this.a = true;
         this.m = false;
      } catch (Exception var4) {
         var4.printStackTrace();
      }
   }

   private void e() {
      this.a = bl.a().a(1);
      v[] var1 = this.a;

      for(int var2 = 0; var2 < this.a[1].length; ++var2) {
         if (var2 < var1.length && var1[var2] != null && var1[var2].l() > 0) {
            this.a[1][var2] = 1;
            this.a[1][var2] = var1[var2].toString() + "(" + var1[var2].l() + ")";
         } else {
            if (var2 < var1.length && var1[var2] == null) {
               this.a[1][var2] = 0;
            }

            this.a[1][var2] = "";
         }
      }

   }

   public final void a() {
      this.c = null;
      this.b = null;
   }

   private void f() {
      int var1 = 25 - this.p;
      int var2 = e.b - 2;
      if (this.p > 0 && this.p < var2) {
         ++this.p;
      }

      at.a.setClip(0, var2 + 25, at.f, var2 * 2);

      for(int var3 = 0; var3 < 4; ++var3) {
         ce var4;
         if ((var4 = this.a[var3]) != null) {
            boolean var5;
            if (var5 = var4.a != null) {
               e.a(var4.b, var4.a, (at.f >> 1) + e.c / 2 - (q.a(var4.a, 0) >> 1) - 5, var1 + var3 * var2 - 2, 24);
            }

            q.a((String)var4.a, (at.f >> 1) + (var5 ? e.c / 2 - 5 : 0), var1 + var3 * var2, var3 != 1 && (var3 != 2 || this.p != var2) ? 1 : (var4.c == 1 ? 2 : 0), 24);
         }
      }

      at.a.setClip(0, 0, at.f, at.g);
   }

   private void a(ce var1) {
      for(int var2 = 1; var2 < this.a.length; ++var2) {
         if (this.a[var2] == null) {
            this.a[var2] = var1;
            this.l = true;
            return;
         }
      }

   }

   private void b(int var1) {
      this.o += var1;
      if (this.o <= 4000) {
         if (this.p == 0 && this.o > 2000) {
            this.p = 1;
         }

      } else {
         this.o = 0;

         for(var1 = 1; var1 < this.a.length; ++var1) {
            this.a[var1 - 1] = this.a[var1];
         }

         if (this.a[1] == null) {
            this.l = false;
         }

         this.p = 0;
      }
   }

   public final void a(int var1, cr var2) {
      switch(var1) {
      case 1:
         if (!this.e) {
            return;
         }

         this.a = at.a.a(13) + " " + at.a.a(15);
         break;
      case 2:
         if (!this.e) {
            return;
         }

         this.a = at.a.a(13) + " " + at.a.a(16);
         break;
      case 3:
         if (!this.b || !var2.e()) {
            return;
         }

         this.a = at.a.a(154);
         break;
      case 4:
         if (!this.b) {
            return;
         }

         this.a = at.a.a(155);
         break;
      case 5:
         this.a = at.a.a(292) + " " + at.a.a(15);
         break;
      case 6:
         this.a = at.a.a(292) + " " + at.a.a(16);
         break;
      case 7:
         this.a = at.a.a(276);
         break;
      case 8:
         this.a = at.a.a(263);
         break;
      case 9:
         this.a = at.a.a(264);
         break;
      case 10:
         this.a = at.a.a(270) + ": " + bl.a().a() + " " + at.a.a(40);
         break;
      case 11:
         this.a = at.a.a(270) + ": " + at.a.a(274);
         break;
      case 12:
         this.a = at.a.a(270) + ": " + at.a.a(271);
         break;
      case 13:
         this.a = at.a.a(270) + ": " + at.a.a(272);
         break;
      case 14:
         this.a = at.a.a(270) + ": " + at.a.a(273);
         break;
      case 15:
         this.a = at.a.a(270) + ": " + at.a.a(269);
         break;
      case 16:
         this.a = at.a.a(147);
         break;
      case 17:
         this.a = at.a.a(148);
         break;
      case 18:
         this.a = at.a.a(149);
         break;
      case 19:
         this.a = this.a[4][3];
         break;
      case 20:
         this.a = at.a.a(265);
         break;
      case 21:
         this.a = at.a.a(254);
         break;
      case 22:
         this.a = at.a.a(266);
         break;
      case 23:
         this.a = at.a.a(267);
         break;
      case 24:
         this.a = at.a.a(268);
      }

      if (!this.a(this.a)) {
         this.a(new ce(this.a));
         q.a(this.a, 0);
      }
   }

   private boolean a(String var1) {
      for(int var2 = this.a.length - 1; var2 > 0; --var2) {
         if (this.a[var2] != null && this.a[var2].a.equals(var1)) {
            return true;
         }
      }

      return false;
   }

   public final void b() {
      this.h = true;
   }

   public final void a(int var1, int var2, boolean var3, boolean var4, boolean var5, boolean var6) {
      this.f = var3;
      ce var7;
      if (var4) {
         this.b = at.a.a(261);
         this.b = bl.a(this.b, at.a.a(569 + (bl.a().d() == 3 ? 116 : 117)), "#N");
         this.b = bl.a(this.b, "1", "#Q");
         (var7 = new ce(this.b)).a = this.a;
         var7.b = var1;
      } else {
         if (var3) {
            this.b = at.a.a(159);
            this.a(new ce(this.b, 1));
            return;
         }

         if (var2 <= 0) {
            return;
         }

         if (var5) {
            this.b = var2 + "t " + at.a.a(var1 + 569);
         } else if (var6) {
            this.b = at.a.a(var1 + 569);
         } else {
            this.b = var2 + "x " + at.a.a(var1 + 569);
         }

         (var7 = new ce(this.b)).a = this.a;
         var7.b = var1;
         if (var6) {
            var7.a = true;
         }
      }

      this.a(var7);
   }

   public final boolean a() {
      return this.f;
   }

   public final void a(long var1, long var3, cr var5, boolean var6) {
      if (this.a) {
         if (this.h) {
            this.h = false;
            at.a.drawImage(this.d, at.f >> 1, at.g, 33);
         }

         this.d.setTransform(0);
         this.d.setPosition(0, 0);
         this.d.paint(at.a);
         this.d.setTransform(2);
         this.d.setPosition(at.f - this.d.getWidth(), 0);
         this.d.paint(at.a);
         this.e.setTransform(0);
         this.e.setPosition(0, at.g - this.e.getHeight());
         this.e.paint(at.a);
         this.e.setTransform(2);
         this.e.setPosition(at.f - this.e.getWidth(), at.g - this.e.getHeight());
         this.e.paint(at.a);
         int var7 = this.f.getWidth();
         boolean var8 = false;
         int var12;
         if (this.d) {
            at.a.drawImage(this.c, 4, at.g - this.e.getHeight() - 3, 36);
            at.a.drawImage(this.e, this.e.getWidth(), at.g - 13, 40);
            var12 = (int)((float)var5.a.j() / 100.0F * (float)var7);
            at.a.drawRegion(this.f, var7 - var12, 0, var12, this.f.getHeight(), 0, this.e.getWidth(), at.g - 13, 40);
         }

         if (this.c) {
            at.a.drawImage(this.b, at.f - 4, at.g - this.e.getHeight() - 3, 40);
            at.a.drawRegion(this.e, 0, 0, var7, this.f.getHeight(), 2, at.f - this.e.getWidth(), at.g - 13, 36);
            var12 = (int)((float)var5.a.i() / 100.0F * (float)var7);
            at.a.drawRegion(this.f, var7 - var12, 0, var12, this.f.getHeight(), 2, at.f - this.e.getWidth(), at.g - 13, 36);
         }

         if (!this.k && b > 0 && (var7 = var5.d()) >= 0 && this.a[b - 1] != null) {
            e.a(var7, this.a, 0, at.g - q.a(), 36);
            q.a((String)("x" + this.a[b - 1].l()), 4, at.g - 2, 1, 33);
         }

         var7 = this.a.getHeight();
         if (this.b) {
            if (var5.e()) {
               this.a.setFrame(4);
            } else {
               this.a.setFrame(5);
            }

            this.a.setPosition(2, 2);
            this.a.paint(at.a);
            at.a.setClip(2, var7 + 2 - (int)(var5.b() * (float)var7), var7, var7);
            this.a.setFrame(4);
            this.a.setPosition(2, 2);
            this.a.paint(at.a);
            at.a.setClip(0, 0, at.f, at.g);
         }

         if (var5.i()) {
            this.a.setFrame(1);
         } else {
            this.a.setFrame(2);
         }

         this.a.setPosition(4 + this.k, 2);
         if (this.a[1] == null || !this.a[1].a.equals(at.a.a(276)) || a.b()) {
            this.a.paint(at.a);
         }

         if (this.e) {
            if (var6) {
               this.a.setFrame(14);
            } else {
               this.a.setFrame(15);
            }

            this.a.setPosition(2, 4 + this.k);
            this.a.paint(at.a);
         }

         if (var5.b()) {
            this.a.setFrame(12);
            this.a.setPosition(at.f - 2 - this.k, 2);
            this.a.paint(at.a);
            if (var5.g()) {
               at.a.setClip(at.f - 2 - this.k, var7 + 2 - (int)((1.0F - var5.c()) * (float)var7), var7, var7);
            } else {
               at.a.setClip(at.f - 2 - this.k, var7 + 2 - (int)(var5.c() * (float)var7), var7, var7);
            }

            this.a.setFrame(11);
            this.a.setPosition(at.f - 2 - this.k, 2);
            this.a.paint(at.a);
            at.a.setClip(0, 0, at.f, at.g);
         }

         this.a.setFrame(17);
         this.a.setPosition(at.f - 4 - 2 * this.k, 2);
         this.a.paint(at.a);
         if (bl.a().r() > 0) {
            this.a.setFrame(7);
         } else {
            this.a.setFrame(9);
         }

         this.a.setPosition(at.f - 2 - this.k, 4 + this.k);
         this.a.paint(at.a);
         int var10;
         if (this.k) {
            var10 = this.j;
            this.n = (int)((long)this.n - var1 / 10L);
            boolean var11 = false;
            if (this.n <= 0) {
               this.n = 0;
               var11 = true;
            }

            var12 = (at.f >> 1) + (var10 == 2 ? this.n : (var10 == 4 ? -this.n : 0));
            var10 = (at.g >> 1) + (var10 == 1 ? -this.n : (var10 == 3 ? this.n : 0));
            this.c.setRefPixelPosition(var12, var10);
            this.c.setFrame(2);
            if (!var11 || var11 && a.b()) {
               this.c.paint(at.a);
               if (this.i == 1) {
                  if ((var7 = var5.d()) >= 0) {
                     e.a(var7, this.a, var12, var10, 3);
                  }
               } else if (this.i == 3) {
                  this.c.setRefPixelPosition(var12, var10);
                  this.c.setFrame(6 + this.j);
                  this.c.paint(at.a);
               }
            }

            this.l = (int)((long)this.l + var1);
            if (this.l > 1500) {
               this.k = false;
            }
         }

         if (var3 > 0L) {
            q.a((String)bc.a(var3), at.f >> 1, 2, var3 < 10000L ? 2 : 1, 24);
         } else if (this.a[1] != null && this.a[1].a != null && !this.a[1].a) {
            q.a((String)(bl.a().q() + " / " + bl.a().p() + "t"), at.f >> 1, 2, 1, 24);
         } else if (var5.p()) {
            var10 = bl.a().q() + var5.a();
            q.a((String)(var10 + " / " + bl.a().p() + "t"), at.f >> 1, 2, var10 > bl.a().p() ? 2 : 1, 24);
         } else if (bl.a().d() == 12) {
            q.a((String)(var5.a.c + " : " + var5.a.b), at.f >> 1, 2, 1, 24);
         }

         if (this.l) {
            this.b((int)var1);
            this.f();
         }

         var10 = var5.c();
         if (this.h > var10) {
            this.g = 0;
         }

         if (var10 < 100 && this.g < 3000) {
            if (a.b()) {
               this.g = (int)((long)this.g + var1);
               at.a.drawImage(this.g, this.c, 41, 17);
               this.f.setFrame(var10 / 10);
               this.f.setPosition(this.d, 55);
               this.f.paint(at.a);
               this.f.setFrame(var10 % 10);
               this.f.setPosition(this.e, 55);
               this.f.paint(at.a);
               this.f.setFrame(10);
               this.f.setPosition(this.f, 55);
               this.f.paint(at.a);
            }
         } else if (var10 < 100) {
            if (this.h == null) {
               String var9 = "/data/interface/hud_hull_alarm_shipicon.png";
               this.h = ai.a("/data/interface/hud_hull_alarm_shipicon.png", true);
            }

            at.a.drawImage(this.h, (at.f >> 1) - 4, at.g - this.e.getHeight() + 15, 40);
            q.a((String)(var10 + "%"), at.f >> 1, at.g - this.e.getHeight() + 15, 0, 33);
         }

         this.h = var10;
      }
   }

   public final void a(int var1, int var2, int var3, boolean var4) {
      if (var1 > 9) {
         this.f.setFrame(var1 / 10);
         this.f.setPosition(var2, var3);
         this.f.paint(at.a);
      }

      this.f.setFrame(var1 % 10);
      this.f.setPosition(var2 + 14, var3);
      this.f.paint(at.a);
   }

   public final void c() {
      if (!bl.c()) {
         if (this.i == null) {
            this.i = ai.a("/data/interface/logo_" + bl.a().c() + ".png", true);
         }

         int var1 = this.i.getWidth() + 6;
         at.a.drawImage(this.i, 3, 3, 20);
         q.b(bl.a().a(), var1, 3, 0);
         q.b(bl.a().a() + " " + at.a.a(41), var1, 3 + q.a(), 1);
         q.b(at.a.a(220) + ": " + at.a.a(225 + bl.a().b()), var1, 3 + 2 * q.a(), 1);
      }

   }

   public final void a(int var1) {
      int var2 = at.g >> 1;
      int var3 = at.f >> 1;
      if (this.i) {
         if (this.l > 25) {
            this.l -= 25;
            this.b.nextFrame();
         }

         this.l += var1;
         this.b.setRefPixelPosition(var3, var2);
         this.b.paint(at.a);
      } else {
         if (this.j) {
            int var4 = (this.b.getHeight() >> 1) + 5 + (this.c.getHeight() >> 1);
            if (this.i == 0) {
               this.b.setRefPixelPosition(var3, var2);
               this.b.paint(at.a);
               var4 = (this.b.getHeight() >> 1) + 5 + (this.c.getHeight() >> 1);
            } else {
               if (this.n > 0) {
                  this.n -= var1 / 3;
                  if (this.n < 0) {
                     this.n = 0;
                  }
               }

               this.b.setRefPixelPosition(var3, var2);
               this.b.paint(at.a);
            }

            if (this.m > var4) {
               this.m -= var1;
               if (this.m < var4) {
                  this.m = var4;
               }
            }

            v[] var7 = null;
            if (this.i == 1) {
               var7 = bl.a().a(1);
            } else {
               var7 = this.b;
            }

            for(var4 = 0; var4 < 4; ++var4) {
               this.c.setFrame(this.a[this.i][var4]);
               if (var4 == this.j - 1) {
                  this.c.setFrame(2);
               }

               int var5 = var3 + (var4 == 1 ? this.m : (var4 == 3 ? -this.m : 0));
               int var6 = var2 + (var4 == 0 ? -this.m : (var4 == 2 ? this.m : 0));
               this.c.setRefPixelPosition(var5, var6);
               this.c.paint(at.a);
               if (this.i == 0) {
                  if (this.a[this.i][var4] > 0) {
                     this.c.setFrame(var4 + 3);
                     this.c.paint(at.a);
                  }
               } else if (this.i == 1) {
                  if (var4 < var7.length && var7[var4] != null && var7[var4].l() > 0) {
                     e.a(var7[var4].a(), this.a, var5, var6, 3);
                     q.a((String)("x" + var7[var4].l()), var5, var6 + (e.b >> 1), 1, 24);
                  }
               } else if (this.i == 3) {
                  this.c.setFrame(var4 + 7);
                  this.c.paint(at.a);
               }
            }

            if (this.j > 0) {
               q.a((String)this.a[this.i][this.j - 1], var3, 10, 0, 24);
            }

            if (bl.b > 0) {
               q.a((String)(at.a.a(152) + ": " + bc.a((long)bl.b)), var3, at.g - 30, 0, 24);
            }
         }

      }
   }

   public final boolean a(int var1, db var2, bw var3) {
      if (var1 == 8192) {
         if (this.g && this.j) {
            this.g = false;
            this.i = false;
            return this.g;
         }

         if (!this.i) {
            this.k = false;
            this.l = 0;
            this.j = 0;
            this.m = g.b(at.f, at.g) + this.c.getHeight();
            this.b.setFrame(0);
            this.j = false;
            this.i = true;
            this.l = 0;
            this.g = true;
            at.a.d(4);
            return this.g;
         }
      }

      if (this.i && this.b.getFrame() >= this.b.getRawFrameCount() - 1) {
         this.i = false;
         this.j = true;
         this.i = 0;
         return this.g;
      } else {
         int var4 = this.i;
         if (this.g && this.j) {
            int var5 = this.j;
            if (this.j > 0 && var1 == 256) {
               var1 = this.j == 1 ? 2 : (this.j == 2 ? 32 : (this.j == 3 ? 64 : 4));
            }

            if (this.j == 0 || this.j == 1 && var1 != 2 || this.j == 2 && var1 != 32 || this.j == 3 && var1 != 64 || this.j == 4 && var1 != 4) {
               switch(var1) {
               case 2:
                  this.j = 1;
                  at.a.d(4);
                  break;
               case 4:
                  this.j = 4;
                  at.a.d(4);
                  break;
               case 32:
                  this.j = 2;
                  at.a.d(4);
                  break;
               case 64:
                  this.j = 3;
                  at.a.d(4);
                  break;
               case 256:
                  if (this.j == 0) {
                     this.a(8192, var2, var3);
                  }
               }

               if (this.j == 0 && this.j == 3 && !var2.a().g() && !var2.a().f() || this.j > 0 && this.a[this.i][this.j - 1].equals("")) {
                  this.j = var5;
               }

               return this.g;
            }

            switch(this.i) {
            case 1:
               if (var1 != 2 && var1 != 32 && var1 != 64 && var1 != 4 && var1 != 256) {
                  this.g = true;
                  break;
               }

               var5 = var1 == 2 ? 0 : (var1 == 32 ? 1 : (var1 == 64 ? 2 : (var1 == 4 ? 3 : this.j)));
               if (!this.a[1][var5].equals("")) {
                  var1 = bl.a().a(1)[var5].a();
                  var2.a().a(bl.a().a(1)[var5].a());
                  at.d = var1;
                  b = this.j;
               }

               this.g = false;
               break;
            case 3:
               p[] var6;
               if ((var6 = var2.a()) == null) {
                  break;
               }

               a = var1 == 2 ? 2 : (var1 == 32 ? 4 : (var1 == 64 ? 3 : (var1 == 4 ? 1 : 0)));
               this.a(a == 2 ? 16 : (a == 4 ? 17 : (a == 1 ? 19 : 18)), var2.a());
               this.a[3][3] = this.a[3][3].equals(at.a.a(151)) ? at.a.a(150) : at.a.a(151);

               for(var1 = 0; var1 < var6.length; ++var1) {
                  if (var6[var1].d() && !var6[var1].e()) {
                     if (a == 0) {
                        this.g = true;
                     } else {
                        var6[var1].a(a, a == 4 ? var3.b() : null);
                     }
                  }
               }

               this.g = false;
               break;
            default:
               switch(var1) {
               case 2:
                  if (!this.a[0][0].equals("")) {
                     this.e();
                     this.i = 1;
                     this.g = true;
                     at.a.d(4);
                  }
                  break;
               case 4:
                  if (!bl.a().a() && bl.a().d() != 11 && bl.a().d() != 0 && bl.a().d() != 23) {
                     this.a(21, var2.a());
                     at.a.d(4);
                  } else if (!this.a[0][3].equals("")) {
                     this.m = true;
                     at.a.d(4);
                  }

                  this.g = false;
                  break;
               case 32:
                  if (!this.a[0][1].equals("")) {
                     var2.a().a();
                     at.a.d(4);
                  }

                  this.g = false;
                  break;
               case 64:
                  if (!this.a[0][2].equals("")) {
                     this.i = 3;
                     this.g = true;
                     at.a.d(4);
                  }
                  break;
               case 256:
                  this.g = false;
               }
            }

            if (!this.g) {
               this.k = this.i != 0 || this.j != 2 && this.j != 4;
               this.n = (this.b.getHeight() >> 1) + 5 + (this.c.getHeight() >> 1);
               this.l = 0;
            }
         }

         if (this.i != var4) {
            this.j = 0;
            this.m = g.b(at.f, at.g) + this.c.getHeight();
            this.n = (this.b.getHeight() >> 1) + 5 + (this.c.getHeight() >> 1);
         }

         return this.g;
      }
   }

   public final boolean b() {
      return this.m;
   }

   public final void a(boolean var1) {
      this.m = false;
   }
}
