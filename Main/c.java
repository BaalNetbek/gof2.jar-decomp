package Main;

import javax.microedition.lcdui.Image;

public final class c {
   private Main.r a;
   private .ay a;
   private boolean a;
   private int a;
   private int b;
   private int c;
   private int d;
   private int e;
   private int f;
   private int g;
   private boolean b;
   private boolean c;
   private int h;
   private int[] a;
   private int i;
   private int j;
   private String[] a;
   private String[] b;
   private boolean d;
   private Image[] a;
   private Image a;
   private Image b;
   private int k;
   private boolean e;

   public c() {
      this.a();
   }

   public final void a() {
      this.a = 9;
      this.b = 20;
      this.e = false;
      String var1;
      if (this.a == null) {
         var1 = "/data/interface/menu_map_mainmission.png";
         this.a = .ai.a("/data/interface/menu_map_mainmission.png", true);
         var1 = "/data/interface/menu_map_sidemission.png";
         this.b = .ai.a("/data/interface/menu_map_sidemission.png", true);
      }

      if (!.bl.a()) {
         var1 = .bl.a(.at.a.a(.co.f[.bl.a()]), .bl.c().b(), "#");
         this.a = .q.a(var1, .at.f - 2 * this.a - 4);
      } else if (.ba.b() && .bl.a().b() != 8) {
         this.e = true;
         var1 = .at.a.a(326);
         this.a = .q.a(var1, .at.f - 2 * this.a - 4);
      }

      if (.bl.b().a()) {
         this.b = .q.a(.at.a.a(69), .at.f - 2 * this.a - 4);
      } else {
         this.a = .e.a(.bl.b().a().a());
         this.b = .q.a(.bl.b().a().b(), .at.f - 2 * this.a - 4);
      }

      this.c = this.b;
      this.e = .at.g - this.c - 16 - 5;
      this.f = .at.f - 2 * this.a;
      this.d = (.bl.a() && !this.e ? 0 : .q.a(this.a)) + .q.a(this.b) + 8 + 36 + 4 + .e.d;
      if (.bl.b().a()) {
         this.d -= .e.d + 4;
      }

      this.g = 0;
      if (this.d > this.e) {
         this.g = (int)((float)this.e / (float)this.d * (float)this.e);
         this.f -= 5;
      }

      this.b = false;
      this.k = !.bl.a() && .bl.c().b() ? 1 : 0;
      int var2;
      if ((var2 = .bl.b().a() ? this.k : this.k + 2) > 0) {
         this.a = new int[var2];

         for(var2 = 0; var2 < this.a.length; ++var2) {
            this.a[var2] = 0;
         }

         this.a[0] = 1;
         this.i = 0;
         if (this.k > 0) {
            this.j = 18 + .q.a(.at.a.a(245) + " (" + .at.a.a(278) + ")", 0);
         } else {
            this.j = 0;
         }

         if (!.bl.b().a() && (var2 = .g.b(18 + .q.a(.at.a.a(244), 0), 18 + .q.a(.at.a.a(245) + " (" + .at.a.a(279) + ")", 0))) > this.j) {
            this.j = var2;
         }

         this.a = new .ay();
         this.h = .at.g - 40 - this.a.length * 10;
      }

      boolean var3 = false;
      this.d = false;
   }

   public final boolean a(int var1) {
      if (this.c) {
         if (!this.a.a(var1)) {
            this.c = false;
         }

         return true;
      } else {
         .v[] var2;
         if (!this.a) {
            if (this.b) {
               if (var1 == 64) {
                  this.a[this.i] = 0;
                  if (this.i < this.a.length - 1) {
                     ++this.i;
                  } else {
                     this.i = 0;
                  }

                  this.a[this.i] = 1;
               }

               if (var1 == 2) {
                  this.a[this.i] = 0;
                  if (this.i > 0) {
                     --this.i;
                  } else {
                     this.i = this.a.length - 1;
                  }

                  this.a[this.i] = 1;
               }

               if (var1 == 256) {
                  switch(this.i) {
                  case 0:
                  case 1:
                     var2 = null;
                     .cl var3;
                     if (this.k > 0) {
                        if (this.i == 0) {
                           var3 = .bl.c();
                        } else {
                           var3 = .bl.b();
                        }
                     } else {
                        if (this.i != 0) {
                           this.a.a(.at.a.a(240), true);
                           this.a = true;
                           this.b = false;
                           return true;
                        }

                        var3 = .bl.b();
                     }

                     this.a = ((Main.p).at.a[1]).a;
                     if (this.a == null) {
                        ((Main.p).at.a[1]).a = new Main.r(true, var3, false, -1);
                        this.a = ((Main.p).at.a[1]).a;
                     } else {
                        this.a.a(true, var3, false, -1);
                     }

                     this.c = true;
                     break;
                  case 2:
                     this.a.a(.at.a.a(240), true);
                     this.a = true;
                  }

                  this.b = false;
               }
            }

            if (var1 == 8192) {
               return false;
            } else {
               if (var1 == 16384 && this.a != null) {
                  this.b = !this.b;
               }

               return true;
            }
         } else {
            if (var1 == 4) {
               this.a.a();
            }

            if (var1 == 32) {
               this.a.b();
            }

            if (var1 == 256) {
               if (this.a.a()) {
                  if (.bl.b().d() != 0 && .bl.b().d() != 3 && .bl.b().d() != 5) {
                     if (.bl.b().d() == 11) {
                        .bl.a(0);
                     }
                  } else if ((var2 = .bl.a().b()) != null) {
                     for(var1 = 0; var1 < var2.length; ++var1) {
                        if (var2[var1].c() && var2[var1].a() == 116) {
                           .bl.a().a(var2[var1]);
                           this.d = true;
                           break;
                        }
                     }
                  }

                  if (!.bl.b().a().c()) {
                     .bl.b().a().a(false);
                  }

                  .bl.b(.cl.a);
                  this.a();
               }

               this.a = false;
            }

            return true;
         }
      }
   }

   public final void a(int var1, int var2) {
      if (this.c) {
         this.a.a(var1, var2);
      } else {
         .a.d();
         .a.a(.at.a.a(33), false);
         if (this.g > 0 && !this.b) {
            if ((var1 & 2) != 0) {
               this.c += var2 / 8;
               if (this.c > this.b) {
                  this.c = this.b;
               }
            }

            if ((var1 & 64) != 0) {
               this.c -= var2 / 8;
               if (this.c + this.d < this.b + this.e) {
                  this.c = this.b + this.e - this.d;
               }
            }
         }

         .a.a(this.a == null ? "" : .at.a.a(136), .at.a.a(65));
         .at.a.setColor(0);
         .at.a.setClip(this.a, this.b, this.f, this.e);
         var2 = this.c;
         if (!.bl.a() || this.e) {
            this.a(var2, .at.a.a(278), this.a);
            var2 += 20;
            .q.a((String[])this.a, this.a + 4, var2, 1);
            var2 += .q.a(this.a) + 4;
         }

         this.a(var2, .at.a.a(279), this.b);
         .cl var3;
         if ((var3 = .bl.b()).a()) {
            var2 += 20;
         } else {
            var2 += 22;
            .e.a(this.a, this.a, var2, 20);
            .q.a((String)var3.a().a, this.a + this.f, var2, var3.a().f() > 0 ? 0 : 1, 18);
            .q.a((String)var3.a().c(), this.a + this.f, var2 + (.q.a() << 1), 1, 18);
            var2 += .e.d + 2;
         }

         .q.a((String[])this.b, this.a + 4, var2, 1);
         .at.a.setClip(0, 0, .at.f, .at.g);
         Main.c var5;
         if ((var5 = this).g > 0) {
            var2 = (int)((float)(var5.b - var5.c) / (float)(var5.d - var5.e) * (float)(var5.e - var5.g));
            .at.a.setColor(.a.a);
            .at.a.drawLine(var5.a + var5.f + 3, var5.b, var5.a + var5.f + 3, var5.b + var5.e - 1);
            .at.a.setColor(-35072);
            .at.a.fillRect(var5.a + var5.f + 2, var5.b + var2, 3, var5.g);
            .at.a.setColor(-4827904);
            .at.a.drawLine(var5.a + var5.f + 2, var5.b + 1 + var2, var5.a + var5.f + 2, var5.b + var5.g - 2 + var2);
            .at.a.drawLine(var5.a + var5.f + 2, var5.b + var5.g - 1 + var2, var5.a + var5.f + 3, var5.b + var5.g - 1 + var2);
            .at.a.setColor(-11520);
            .at.a.drawLine(var5.a + var5.f + 3, var5.b + 1 + var2, var5.a + var5.f + 3, var5.b + var5.g - 2 + var2);
            .at.a.setColor(.a.a);
         }

         if (this.b) {
            .a.c();
            .a.a(this.a == null ? "" : .at.a.a(136), .at.a.a(65));
            .a.a("", 1, this.h, this.j, 12 + (this.a.length + 1) * 10);
            if (this.k > 0) {
               .a.a(.at.a.a(245) + " (" + .at.a.a(278) + ")", 1, this.h + 15, this.j, this.a[0] == 1, false, true);
            }

            if (!.bl.b().a()) {
               var1 = this.k * 10;
               .a.a(.at.a.a(245) + " (" + .at.a.a(279) + ")", 1, this.h + 15 + var1, this.j, this.a[this.k] == 1, false, true);
               .a.a(.at.a.a(244), 1, this.h + 15 + 10 + var1, this.j, this.a[this.k + 1] == 1, false, true);
            }
         }

         if (this.a) {
            this.a.c();
         }

      }
   }

   private void a(int var1, String var2, Image var3) {
      .at.a.setColor(.a.c);
      .at.a.fillRect(this.a, var1, this.f, 17);
      .at.a.setColor(0);
      .at.a.drawRect(this.a + 1, var1 + 1, this.f - 3, 16);
      .at.a.setColor(.a.a);
      .at.a.drawRect(this.a, var1, this.f - 1, 18);
      .a.a(this.a, var1, false);
      .at.a.drawImage(var3, this.a + 6, var1 + 4, 20);
      .q.b(var2, this.a + 6 + var3.getWidth() + 4, var1 + 4, 0);
   }

   public final boolean a() {
      return this.d;
   }

   public final void a(boolean var1) {
      this.d = false;
   }
}
