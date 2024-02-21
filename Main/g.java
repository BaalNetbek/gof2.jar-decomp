package Main;

import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.game.Sprite;

public final class g {
   private boolean a;
   private .ay a;
   private Main.e a;
   private String[] a;
   private String[] b;
   private Sprite a;
   private Sprite b;
   private Sprite c;
   private Sprite d;
   private Image a;
   private Image b;
   private int a;
   private int b;
   private int c;
   private int d;
   private int e;
   private int f;
   private int g;
   private Image[] a;

   public g() {
      this.a = new Main.e(new String[]{.at.a.a(64), .at.a.a(63)}, .at.a.a(64));
      this.a = false;
      this.a = new .ay(20, .at.g / 3, .at.f - 40);
      this.b();
      this.a = 35;
      this.c = 9;
      this.g = this.a;
      this.b = .at.g - this.a - 16 - 5;
      this.d = .at.f - 2 * this.c;
      this.e = 66 + .e.d + 4 + 6 * (.q.a() + 2) + this.a.length * (.q.a() + 2);
      this.f = 0;
      if (this.e > this.b) {
         this.f = (int)((float)this.b / (float)this.e * (float)this.b);
         this.d -= 5;
      }

      String var1 = "/data/interface/logos_small.png";
      Image var2 = .ai.a("/data/interface/logos_small.png", true);
      this.d = new Sprite(var2, var2.getHeight(), var2.getHeight());
      var1 = null;
      if (.at.f < 240) {
         var1 = "/data/interface/standing_small_0.png";
         var2 = .ai.a("/data/interface/standing_small_0.png", true);
      } else {
         var1 = "/data/interface/standing_0.png";
         var2 = .ai.a("/data/interface/standing_0.png", true);
      }

      this.a = new Sprite(var2, var2.getWidth() / 3, var2.getHeight());
      this.a.defineReferencePixel(0, this.a.getHeight());
      if (.at.f < 240) {
         var1 = "/data/interface/standing_small_1.png";
         var2 = .ai.a("/data/interface/standing_small_1.png", true);
      } else {
         var1 = "/data/interface/standing_1.png";
         var2 = .ai.a("/data/interface/standing_1.png", true);
      }

      this.b = new Sprite(var2);
      this.b.defineReferencePixel(0, this.b.getHeight());
      if (.at.f < 240) {
         var1 = "/data/interface/standing_small_2.png";
         var2 = .ai.a("/data/interface/standing_small_2.png", true);
      } else {
         var1 = "/data/interface/standing_2.png";
         var2 = .ai.a("/data/interface/standing_2.png", true);
      }

      this.c = new Sprite(var2);
      this.c.defineReferencePixel(this.c.getWidth() >> 1, 0);
   }

   public final void a() {
      if (this.a != null) {
         this.a.c();
      }

      this.a = null;
      this.a = null;
      this.a = null;
      this.b = null;
      this.a = null;
      this.b = null;
      this.c = null;
      this.d = null;
   }

   public final void b() {
      this.a = new String[11];
      this.b = new String[11];
      this.a[0] = .at.a.a(77);
      this.b[0] = .at.a.a(532 + .bl.a().b());
      this.a[1] = .at.a.a(290);
      this.b[1] = "" + .bl.a().n();
      this.a[2] = .at.a.a(291);
      this.b[2] = "" + .bl.a().e();
      this.a[3] = .at.a.a(33);
      this.b[3] = "" + .bl.l();
      this.a[4] = .at.a.a(71);
      this.b[4] = "" + .bl.j();
      this.a[5] = .at.a.a(282);
      this.b[5] = "" + .bl.c();
      this.a[6] = .at.a.a(280);
      this.b[6] = "" + .bl.e();
      this.a[7] = .at.a.a(287);
      this.b[7] = "" + .bl.b();
      this.a[8] = .at.a.a(281);
      this.b[8] = "" + .bl.g();
      this.a[9] = .at.a.a(283);
      this.b[9] = "" + .bl.l;
      this.a[10] = .at.a.a(284);
      this.b[10] = "" + .bl.m;
   }

   public final boolean a(int var1) {
      if ((var1 == 256 || var1 == 16384) && this.a.d() == 1 && !this.a) {
         .ce var3 = (.ce)((.ce)this.a.a());
         if (.ba.a()[var3.b] != 0) {
            String var2 = .bl.a(.at.a.a(782 + var3.b), .ba.a[var3.b][var3.a - 1] + "");
            if (var3.b == 2 && var3.a == 2) {
               var2 = var2 + "\n\n" + .at.a.a(134);

               for(var1 = 0; var1 < .bl.b.length; ++var1) {
                  if (!.bl.b[var1]) {
                     var2 = var2 + "\n- " + .at.a.a(var1 + 723);
                  }
               }
            } else if (var3.b == 3 && var3.a == 2) {
               var2 = var2 + "\n\n" + .at.a.a(134);

               for(var1 = 0; var1 < .bl.c.length; ++var1) {
                  if (!.bl.c[var1]) {
                     var2 = var2 + "\n- " + .at.a.a(var1 + 734);
                  }
               }
            } else if (var3.b == 9 && var3.a == 2) {
               var2 = var2 + "\n\n" + .at.a.a(134);

               for(var1 = 0; var1 < .bl.d.length; ++var1) {
                  if (!.bl.d[var1]) {
                     var2 = var2 + "\n- " + .at.a.a(var1 + 701);
                  }
               }
            } else if (var3.b == 13 && var3.a == 2) {
               var2 = var2 + "\n\n" + .at.a.a(134);

               for(var1 = 0; var1 < .bl.a.length; ++var1) {
                  if (!.bl.a[var1].a) {
                     var2 = var2 + "\n- " + .at.a.a(569 + .bl.a[var1].a());
                  }
               }
            } else if (var3.b == 14 && var3.a == 2) {
               var2 = var2 + "\n\n" + .at.a.a(134);

               for(var1 = 0; var1 < .bl.a.length; ++var1) {
                  if (.bl.a[var1].c == 0) {
                     var2 = var2 + "\n- " + .at.a.a(569 + .bl.a[var1].a());
                  }
               }
            }

            this.a.a(var2, false);
            this.a = true;
         }

         return true;
      } else if (!this.a) {
         if (var1 == 4) {
            this.a.d();
         }

         if (var1 == 32) {
            this.a.e();
         }

         if (this.a.g == 1) {
            if (var1 == 2) {
               this.a.h();
            }

            if (var1 == 64) {
               this.a.i();
            }
         }

         return var1 != 8192;
      } else {
         if ((this.a.g == 1 || this.a.g == 2) && var1 == 256) {
            this.a = false;
         }

         return true;
      }
   }

   private void a(int var1, String var2) {
      int var3 = this.d;
      .at.a.setColor(.a.c);
      .at.a.fillRect(this.c, var1, var3, 17);
      .at.a.setColor(0);
      .at.a.drawRect(this.c + 1, var1 + 1, var3 - 3, 16);
      .at.a.setColor(.a.a);
      .at.a.drawRect(this.c, var1, var3 - 1, 18);
      .a.a(this.c, var1, false);
      .q.b(var2, this.c + 6, var1 + 4, 0);
   }

   public final void a(int var1, int var2) {
      .a.d();
      this.a.a();
      if (this.a.g == 0) {
         if (this.f > 0) {
            if ((var1 & 2) != 0) {
               this.g += var2 / 8;
               if (this.g > this.a) {
                  this.g = this.a;
               }
            }

            if ((var1 & 64) != 0) {
               this.g -= var2 / 8;
               if (this.g + this.e < this.a + this.b) {
                  this.g = this.a + this.b - this.e;
               }
            }
         }

         Main.g var7 = this;
         var2 = .q.a();
         .at.a.setColor(0);
         .at.a.setClip(0, this.a, .at.f, this.b);
         int var3 = this.g;
         this.a(var3, .at.a.a(819));
         var3 += 22;
         if (this.a == null) {
            this.a = .e.a(.ad.a);
         }

         .e.a(this.a, this.c, var3, 20);
         String var4;
         if (.ba.b()) {
            if (this.b == null) {
               var4 = "/data/interface/faces/Brille_golden.png";
               this.b = .ai.a("/data/interface/faces/Brille_golden.png", true);
            }

            .at.a.drawImage(this.b, this.c + 1, var3 + 1, 20);
         } else if (.ba.a()) {
            if (this.a == null) {
               var4 = "/data/interface/faces/Brille_schwarz.png";
               this.a = .ai.a("/data/interface/faces/Brille_schwarz.png", true);
            }

            .at.a.drawImage(this.a, this.c + 1, var3 + 1, 20);
         }

         .q.a((String).at.a.a(80), this.c + .e.c + 4, var3, 1, 17);
         .q.a((String).a.a(.bl.f()), this.c + this.d, var3, 1, 18);
         var3 += var2 + 2;
         .q.a((String).at.a.a(158), this.c + .e.c + 4, var3, 1, 17);
         .q.a((String)(.bl.m() + ""), this.c + this.d, var3, 1, 18);
         var3 += var2 + 2;
         .q.a((String).at.a.a(70), this.c + .e.c + 4, var3, 1, 17);
         .q.a((String).bc.a(.bl.a()), this.c + this.d, var3, 1, 18);
         var3 = this.g + 18 + 4 + .e.d + 4;
         this.a(var3, .at.a.a(298));
         var3 += 26;
         .cs var8 = .bl.a();

         int var5;
         for(var5 = 0; var5 < 2; ++var5) {
            int var6 = var7.c + 6;
            var7.d.setFrame(var5 == 0 ? 0 : 2);
            var7.d.setPosition(var6, var3);
            var7.d.paint(.at.a);
            var6 += var7.d.getHeight() + 4;
            .q.b(.at.a.a(var5 == 0 ? 229 : 231), var6, var3 + .q.a() + var7.c.getHeight(), 1);
            var7.a.setTransform(0);
            var7.a.setFrame(var8.a(var5 == 0 ? 0 : 2) ? 0 : (var8.b(var5 == 0 ? 0 : 2) ? 1 : 2));
            var7.a.setRefPixelPosition(var6, var3 + var7.a.getHeight());
            var7.a.paint(.at.a);
            var6 += var7.a.getWidth() + 1;
            var7.b.setTransform(0);
            var7.b.setRefPixelPosition(var6, var3 + var7.a.getHeight());
            var7.b.paint(.at.a);
            var6 = var7.c + var7.d - 2;
            var7.d.setFrame(var5 == 0 ? 1 : 3);
            var7.d.setPosition(var6 - var7.d.getHeight(), var3);
            var7.d.paint(.at.a);
            var6 -= 4 + var7.d.getHeight();
            .q.a((String).at.a.a(var5 == 0 ? 230 : 232), var6, var3 + .q.a() + var7.c.getHeight(), 1, 18);
            var7.a.setTransform(2);
            var7.a.setFrame(var8.a(var5 == 0 ? 1 : 3) ? 0 : (var8.b(var5 == 0 ? 1 : 3) ? 1 : 2));
            var7.a.setRefPixelPosition(var6, var3 + var7.a.getHeight());
            var7.a.paint(.at.a);
            var6 -= var7.a.getWidth() + 1;
            var7.b.setTransform(2);
            var7.b.setRefPixelPosition(var6, var3 + var7.a.getHeight());
            var7.b.paint(.at.a);
            var6 = (.at.f >> 1) - (int)((float)var8.a(var5 == 0 ? 0 : 1) / 100.0F * (float)(var7.a.getWidth() + 1 + var7.b.getWidth()));
            var7.c.setRefPixelPosition(var6, var3 + var7.a.getHeight());
            var7.c.paint(.at.a);
            var3 += 3 * .q.a() + 4;
         }

         var7.a(var3, .at.a.a(299));
         var3 += 22;

         for(var5 = 0; var5 < var7.a.length; ++var5) {
            .q.a((String)var7.a[var5], var7.c + 2, var3, 1, 17);
            .q.a((String)var7.b[var5], var7.c + var7.d, var3, 0, 18);
            var3 += var2 + 2;
         }

         .at.a.setClip(0, 0, .at.f, .at.g);
         var2 = var7.d;
         var3 = var7.e;
         int var9 = var7.g;
         if ((var5 = var7.f) > 0) {
            var3 = (int)((float)(var7.a - var9) / (float)(var3 - var7.b) * (float)(var7.b - var5));
            .at.a.setColor(.a.a);
            .at.a.drawLine(var7.c + var2 + 3, var7.a, var7.c + var2 + 3, var7.a + var7.b - 1);
            .at.a.setColor(-35072);
            .at.a.fillRect(var7.c + var2 + 2, var7.a + var3, 3, var5);
            .at.a.setColor(-4827904);
            .at.a.drawLine(var7.c + var2 + 2, var7.a + 1 + var3, var7.c + var2 + 2, var7.a + var5 - 2 + var3);
            .at.a.drawLine(var7.c + var2 + 2, var7.a + var5 - 1 + var3, var7.c + var2 + 3, var7.a + var5 - 1 + var3);
            .at.a.setColor(-11520);
            .at.a.drawLine(var7.c + var2 + 3, var7.a + 1 + var3, var7.c + var2 + 3, var7.a + var5 - 2 + var3);
            .at.a.setColor(.a.a);
         }
      }

      if (this.a.d() == 1) {
         .a.a(((.ce)this.a.a()).a > 0 ? .at.a.a(212) : "", .at.a.a(65));
      } else {
         .a.a("", .at.a.a(65));
      }

      if (this.a) {
         this.a.c();
      }

   }
}
