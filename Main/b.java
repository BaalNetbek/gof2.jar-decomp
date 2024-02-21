package Main;

import javax.microedition.lcdui.Image;

public final class b {
   private final short[] a = new short[]{327, 327, 327, 327, 327, 327, 327, 327, 328, 329, 329, 330, 331, 331, 331, 331, 331, 331, 331, 331, 331, 331, 332, 332, 333, 334, 335, 336, 337, 337, 337, 338, 338, 339, 340, 340, 341, 342, 341, 343, 343, 344, 344, 344, 345, 346, 347, 348, 348, 348, 349, 349, 349, 349, 350, 351, 351, 351, 352, 353, 0, 0, 0, 354, 354, 354, 354, 355, 356, 356, 356, 357, 357, 357, 358, 359, 360, 360, 360, 360, 361, 362, 362, 362, 362, 363, 364, 364, 364, 364, 365, 366, 366, 366, 367, 367, 368, 369, 369, 369, 369, 369, 369, 369, 369, 369, 369, 369, 369, 369, 369, 369, 369, 369, 369, 369, 369, 369, 369, 369, 369, 369, 369, 369, 369, 369, 369, 369, 369, 369, 369, 369, 370, 370, 370, 370, 370, 370, 370, 370, 370, 370, 370, 370, 370, 370, 370, 370, 370, 370, 370, 370, 370, 370, 371, 371, 371, 371, 371, 371, 371, 371, 371, 371, 371, 372, 372, 372, 372, 372, 372, 372, 372, 372, 372, 372};
   private final short[] b = new short[]{0, 1, 4, 5, 6, 7, 8, 35, 36};
   private final String[] a = new String[]{null, null, null, null, null, null, null, null, null, null, null, "ms", "m", "km/h", "m", null, null, "ms", null, "%", "%", null, "ms", "%", "ms", "ms", "%", "ms", null, null, "%", "%", null, "ms", "ms", null, null};
   private .ce a;
   private Image a;
   private Image b;
   private Image c;
   private Image d;
   private .bu a;
   private .bu b;
   private boolean a;
   private .ap a;
   private .ap b;
   private .ar a;
   private float a;
   private float b;
   private float c;
   private float d;
   private float e;
   private float f;
   private String a;
   private String b;

   public b() {
      this.a = new .bu(10, 40, .at.f - 20, .at.g - 40 - 16 - 20, "");
      this.a.a(1);
      this.b = new .bu(10, 40, .at.f - 20, .at.g - 40 - 16 - 20, "");
      this.b.a(true);
      this.b.a(0);
   }

   public final void a(.ce var1, Image var2, Image var3, Image var4, Image var5, boolean var6) {
      this.a = var1;
      this.a = var2;
      this.b = var3;
      this.c = var4;
      this.d = var5;
      String var9 = "";
      String var10 = "";
      if (!var1.b() && !var1.h() && !var1.i()) {
         if (var1.a()) {
            var9 = var9 + .at.a.a(60);
            var10 = var10 + var1.a.d();
            var9 = var9 + "\n" + .at.a.a(61);
            var10 = var10 + "\n" + var1.a.o();
            var9 = var9 + "\n" + .at.a.a(123);
            var10 = var10 + "\n" + var1.a.a(0);
            var9 = var9 + "\n" + .at.a.a(124);
            var10 = var10 + "\n" + var1.a.a(1);
            var9 = var9 + "\n" + .at.a.a(125);
            var10 = var10 + "\n" + var1.a.a(2);
            var9 = var9 + "\n" + .at.a.a(127);
            var10 = var10 + "\n" + var1.a.a(3);
            var9 = var9 + "\n" + .at.a.a(59);
            var10 = var10 + "\n" + (int)(var1.a.a() * 100.0F);
            var9 = var9 + "\n" + .at.a.a(36);
            var10 = var10 + "\n" + .a.a(var1.a());
            this.a.a(var9);
            this.b.a(var10);
            this.a = 1900.0F;
            this.b = 0.0F;
            this.c = 0.0F;
            this.d = 0.0F;
            this.e = 0.0F;
            this.f = 0.0F;
         }

      } else {
         .v var11 = var1.b() ? var1.a : (var1.h() ? .ad.a()[var1.a.a()] : .ad.a()[var1.a.c]);

         int var12;
         int var14;
         for(var12 = 0; var12 < 37; ++var12) {
            boolean var7 = false;

            int var8;
            for(var8 = 0; var8 < this.b.length; ++var8) {
               if (this.b[var8] == var12) {
                  var7 = true;
                  break;
               }
            }

            if (!var7 && (var8 = var11.a(var12)) != -979797979) {
               if (!var9.equals("")) {
                  var9 = var9 + "\n";
                  var10 = var10 + "\n";
               }

               var9 = var9 + .at.a.a(.co.a[var12]);
               if (var12 != 29 && var12 != 28) {
                  if (var12 == 21) {
                     var10 = var10 + .at.a.a(var8 == 0 ? 39 : 38);
                  } else if (var12 == 2) {
                     var10 = var10 + .at.a.a(var8 + 98);
                  } else {
                     label141: {
                        int var10000;
                        if (var12 == 13) {
                           var10000 = var8 * 250;
                        } else {
                           if (var12 != 12) {
                              break label141;
                           }

                           var14 = (var8 = (int)((float)var8 / 3600.0F * (float)(var11.a(13) * 250))) % 100;
                           var10000 = (var8 + var14) % 100 == 0 ? var8 + var14 : var8 - var14;
                        }

                        var8 = var10000;
                     }

                     var10 = var10 + var8;
                     if (this.a[var12] != null) {
                        var10 = var10 + this.a[var12];
                     }
                  }
               } else {
                  var10 = var10 + .at.a.a(var8 == 0 ? 39 : 38);
               }
            }
         }

         if (!var1.h() && !var1.i() && var6) {
            var9 = var9 + "\n" + .at.a.a(36);
            var10 = var10 + "\n" + .a.a(var11.e());
         }

         if (var1.b()) {
            new .av();
            var5 = null;
            .cw[] var15 = .av.a();
            if (.bl.a[var1.b()] > 0) {
               if (.bl.b[var1.b()] == .bl.a().a()) {
                  this.a = .at.a.a(95);
               } else {
                  this.a = .at.a.a(93);
               }

               this.a = .bl.a(this.a, .bl.a[var1.b()] + "", "#C");
               this.a = .bl.a(this.a, var15[.bl.b[var1.b()]].a(), "#S");
            } else {
               this.a = null;
            }

            if (.bl.b[var1.b()] > 0) {
               if (.bl.c[var1.b()] == .bl.a().a()) {
                  this.b = .at.a.a(96);
               } else {
                  this.b = .at.a.a(94);
               }

               this.b = .bl.a(this.b, .bl.b[var1.b()] + "", "#C");
               this.b = .bl.a(this.b, var15[.bl.c[var1.b()]].a(), "#S");
            } else {
               this.b = null;
            }

            String var16 = .at.a.a(this.a[var1.b()]);
            var9 = var9 + "\n\n" + var16;
            if (this.a != null) {
               var9 = var9 + "\n\n" + this.a;
            }

            if (this.b != null) {
               var9 = var9 + "\n\n" + this.b;
            }
         } else if (var1.h() || var1.i()) {
            String var13 = .at.a.a(this.a[var1.b()]);
            var9 = var9 + "\n\n" + var13;
         }

         this.a.a(var9);
         this.b.a(var10);
         var12 = this.a.b() - this.b.b();

         for(var14 = 0; var14 < var12; ++var14) {
            var10 = var10 + "\n";
         }

         this.b.a(var10);
      }
   }

   public final void a(int var1) {
      this.a.c(var1);
      this.b.c(var1);
   }

   public final void b(int var1) {
      this.a.b(var1);
      this.b.b(var1);
   }

   public final boolean a() {
      return this.a;
   }

   public final void a() {
      if (!this.a) {
         .a.d();
         .a.a(.at.a.a(212));
      }

      if (!this.a.b() && !this.a.h() && !this.a.i()) {
         if (this.a.a()) {
            .e.b(this.a.a.b(), this.a.a.a(), this.c, this.d, 5, 27, 6);
            .q.b(.at.a.a(532 + this.a.a.b()), 5 + .e.c + 5, 21, 1);
         }
      } else {
         .v var1;
         .e.a((var1 = this.a.b() ? this.a.a : (this.a.h() ? .ad.a()[this.a.a.a()] : .ad.a()[this.a.a.c])).a(), var1.b(), this.a, this.b, 5, 27, 6);
         .q.b(.at.a.a(569 + var1.a()), 5 + .e.a + 5, 18, 1);
      }

      this.a.b();
      this.b.b();
   }

   public final void a(int var1, int var2) {
      if (this.a) {
         if ((var1 & 4) != 0) {
            this.e = (float)var2;
         } else {
            this.e *= 0.9F;
         }

         if ((var1 & 32) != 0) {
            this.f = (float)var2;
         } else {
            this.f *= 0.9F;
         }

         if ((var1 & 64) != 0) {
            this.c = (float)var2;
         } else {
            this.c *= 0.9F;
         }

         if ((var1 & 2) != 0) {
            this.d = (float)var2;
         } else {
            this.d *= 0.9F;
         }

         this.b += this.c - this.d;
         if (this.b > 768.0F) {
            this.b = 768.0F;
         } else if (this.b < -256.0F) {
            this.b = -256.0F;
         }

         this.a += this.e - this.f;
      }

   }

   public final void a(boolean var1) {
      this.a = var1;
      if (var1) {
         this.b = .at.a.a();
         this.a = .ap.a(.at.f, .at.g, 1000, 10, 31768);
         this.a.b(0, 400, -.ch.a[this.a.b()]);
         this.a.d(256, 2048, 0);
         new .ar();
         .ar var2 = null;
         (var2 = .ad.a(this.a.b(), this.a.a.a())).b(0, 0, .ch.b[this.a.b()]);
         this.a = new .ar();
         this.a.a(var2);
      } else {
         if (this.b != null) {
            .at.a.a(this.b);
         }

      }
   }

   public final void b() {
      this.a.e((int)this.b, (int)this.a, 0);
      .a.d();

      try {
         .at.a.a(this.a);
         .at.a.a(.at.a);
         .at.a.a((.ah)this.a);
         .at.a.a(System.currentTimeMillis());
         .at.a.a();
         .at.a.b(.at.a);
      } catch (Exception var2) {
         .at.a.b(.at.a);
         var2.printStackTrace();
      }

      .a.a(.at.a.a(212), false);
   }
}
