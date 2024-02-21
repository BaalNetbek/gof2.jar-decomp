package Main;

import javax.microedition.lcdui.Image;

public final class p extends .as {
   private long a;
   private long b;
   private long c;
   private long d;
   private long e;
   private int a;
   private int[] a;
   private Image a;
   private Main.k a;
   private Main.l a;
   private boolean a;
   private boolean b;
   private boolean c;
   private boolean d;
   private boolean e;
   private boolean f;
   private boolean g;
   private boolean h;
   private boolean i;
   private boolean j;
   private boolean k;
   private boolean l;
   private .ay a;
   private Main.d a;
   private Main.m a;
   private Main.g a;
   private Main.c a;
   private .i a;
   private .i b;
   private Main.j a;
   public Main.r a;
   private .cl a;
   private int b;
   private int c;
   private int d;
   private boolean m = false;
   private boolean n = false;
   private boolean o;
   private int[][] a;
   private int e;
   private int f;
   private int g;
   private int h;
   private boolean p;
   private boolean q;
   private boolean r;
   private boolean s;

   public final Main.k a() {
      return this.a;
   }

   public final void a() {
      if (this.a != null) {
         this.a.a();
      }

      this.a = null;
      this.a = null;
      if (this.a != null) {
         this.a.a();
      }

      this.a = null;
      if (this.a != null) {
         this.a.b();
      }

      this.a = null;
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
      this.s = false;
      this.a = null;
      System.gc();
   }

   public final void c() {
      this.m = true;
   }

   public final void b() {
      if (this.a == null) {
         this.a = new Main.k(23);
      }

      if (!this.a.a()) {
         this.a.b();
      } else {
         this.f = 50;
         long var1 = .bl.a;
         .bl.a(.bl.a());
         .v[] var2;
         int var3;
         String[] var5;
         int var6;
         if (.bl.a() - var1 > 30000L) {
            new .be();
            var5 = null;
            if ((var2 = .bl.a().a()) != null) {
               for(var3 = 0; var3 < var2.length; ++var3) {
                  var6 = var2[var3].l();
                  int var4;
                  if ((var4 = .at.a.nextInt(3)) < var6) {
                     var2[var3].c(-var4);
                  }
               }
            }
         }

         .bl.a().a();
         .ba.d();
         this.c = false;
         this.b = false;
         this.d = false;
         this.e = false;
         this.f = false;
         this.g = false;
         this.a = true;
         this.h = false;
         this.l = false;
         this.k = false;
         this.a = new int[6];

         for(var6 = 0; var6 < this.a.length; ++var6) {
            this.a[var6] = 0;
            if (var6 == this.a) {
               this.a[var6] = 1;
            }
         }

         this.b = 1;
         this.c = .at.g - 37 - this.a.length * 10;
         (var5 = new String[6])[0] = .at.a.a(62);
         var5[1] = .at.a.a(218);
         var5[2] = .at.a.a(72);
         var5[3] = .at.a.a(33);
         var5[4] = .at.a.a(64);
         var5[5] = .at.a.a(66);

         for(int var7 = 0; var7 < var5.length; ++var7) {
            if ((var3 = .q.a(var5[var7], 1)) > this.d) {
               this.d = var3 + 20;
            }
         }

         this.g = 0;
         this.h = 0;
         this.p = false;
         this.q = false;
         this.r = false;
         this.n = false;
         this.o = false;
         this.e = 0L;
         this.a = new .ay();
         this.a = .ai.a("/data/interface/logo_" + .bl.a().c() + ".png", true);
         if (!this.m) {
            if (!this.j && this.b == null && !this.p && .bl.a().a(.bl.a().c())) {
               .cs var8 = .bl.a();
               var6 = (var3 = .bl.a().c()) != 1 && var3 != 0 ? 1 : 0;
               this.h = (int)((float).g.e(var8.a(var6)) / 100.0F * 2800.0F);
               this.h += -100 + .at.a.nextInt(200);
               String var9 = .bl.a(.at.a.a(85), "" + this.h, "#C");
               this.a.a(var9, true);
               this.l = true;
               this.c = true;
            }

            if (.bl.a() == 20 && .bl.c().h() == .bl.a().b()) {
               var2 = .bl.a().a();

               for(var3 = 0; var3 < var2.length; ++var3) {
                  if (var2[var3].a() == 41) {
                     var2[var3].a(0);
                  }
               }

               .bl.a().a(.ad.a()[41].a(10, 0));
            }

            if (.bl.a() == 27 && .bl.c().h() == .bl.a().b()) {
               .bl.a().b(131);
            }
         }

         if (!this.n && !this.m) {
            (new .ab()).a(3);
            this.n = true;
         }

         .db.a = null;
         if (.bl.a() == 1) {
            .bl.a(.ad.a()[0]);
            .bl.a().a(8);
            .v var10;
            (var10 = .ad.a()[90].a()).a(true);
            .bl.a().a(var10, 0);
            .v var11 = .ad.a()[81].a();
            .bl.a().a(var11, 1);
            var11.a(true);
            this.a.a(.bl.a().b(), 8);
         }

         .at.a.c(1);
         this.d = 0L;
         System.gc();
         this.a = System.currentTimeMillis();
         this.b = System.currentTimeMillis();
         this.s = true;
      }
   }

   private void d() {
      if (!this.j && !this.k) {
         this.a = null;
         int[] var1 = .ba.b();
         int var2 = 0;

         int var3;
         for(var3 = 0; var3 < var1.length; ++var3) {
            if (var1[var3] > 0) {
               ++var2;
            }
         }

         if (var2 > 0) {
            this.a = new int[var2][2];
            var2 = 0;

            for(var3 = 0; var3 < var1.length; ++var3) {
               if (var1[var3] > 0) {
                  this.a[var2++] = new int[]{var3, var1[var3]};
               }
            }

            this.j = true;
            this.e = 0;
            this.a = new Main.j();
            this.a.a(this.a[0][0], this.a[0][1]);
         }

      } else {
         ++this.e;
         if (this.e >= this.a.length) {
            this.j = false;
         } else {
            this.a.a(this.a[this.e][0], this.a[this.e][1]);
         }
      }
   }

   public final boolean a() {
      return this.s;
   }

   public final void a(int var1) {
      if (this.s) {
         .a.b(false);
         this.a = System.currentTimeMillis();
         this.c = this.a - this.b;
         this.b = this.a;
         this.d += this.c;
         this.e += this.c;
         .bl.b(this.c);
         .ba.a(.bl.f());
         if (!this.d && !this.e && !this.f && !this.g && !this.h && this.a != null) {
            this.a.a(!this.b && !this.l && !this.k && !this.c ? var1 : 0);
         }

         if (this.e < 6000L) {
            .q.b(.at.a.a(this.m ? 32 : 28), 5, .at.g - 16 - .q.a(), 1);
         } else {
            this.m = false;
         }

         if (this.e >= 6000L) {
            if (!this.c && !this.i) {
               if (!this.r) {
                  Main.p var2 = this;
                  String var3 = .at.a.a(92) + "\n";
                  .bp[] var4;
                  if ((var4 = .bl.a()) != null) {
                     for(int var5 = 0; var5 < var4.length; ++var5) {
                        .bp var6;
                        if ((var6 = var4[var5]) != null && var6.a == .bl.a().b()) {
                           .v var9 = .ad.a()[var6.c].a(var6.b);
                           .bl.a().b(var9);
                           var3 = var3 + "\n" + var9.l() + "x " + .at.a.a(569 + var9.a());
                           var4[var5] = null;
                           var2.c = true;
                        }
                     }
                  }

                  if (var2.c) {
                     var2.a.a(var3, false);
                  }

                  this.r = true;
               }

               if (!this.q) {
                  this.d();
                  this.q = true;
               }

               if (!this.j && this.b == null && !.at.w && .ba.a()) {
                  this.b = new .i(.at.a.a(325));
                  .at.w = true;
                  this.k = true;
               }

               if (!this.j && this.b == null && !.at.x && .ba.b()) {
                  this.b = new .i(.at.a.a(326));
                  .at.x = true;
                  this.k = true;
               }
            }

            if (!this.c && !this.i) {
               .cl var7;
               if ((var7 = .bl.a(true, 0L)) != null) {
                  this.a = var7;
               }

               if (var7 != null) {
                  this.a = new .i(var7, (.db)null, 1);
                  this.i = true;
               }
            }

            int var8 = var1;
            if (this.k) {
               var8 = 0;
            }

            if (this.i) {
               if (this.f || this.e) {
                  .a.d();
               }

               this.a.a(var8, (int)this.c);
               this.a.b();
            } else if (this.b) {
               this.a.a(var8, (int)this.c);
               this.a.e();
            } else if (this.d) {
               .a.a((int)this.c);
               this.a.a(var8, (int)this.c);
            } else if (this.e) {
               .a.a((int)this.c);
               this.a.a(var8, (int)this.c);
            } else if (this.f) {
               .a.a((int)this.c);
               this.a.a(var8, (int)this.c);
            } else if (this.g) {
               this.a.a(var8, (int)this.c);
               if (this.a != null && this.a.a() && this.b == null && !.at.l) {
                  this.b = new .i(.at.a.a(316));
                  .at.l = true;
                  this.k = true;
               }
            } else if (this.h) {
               .a.a((int)this.c);
               this.a.a(var8, (int)this.c);
            } else {
               .a.a((int)this.c);
               .at.a.drawImage(this.a, 3, 3, 0);
               .q.a((String).bl.a().a(), this.a.getWidth() + 6, 3, 0, 17);
               .q.a((String)(.at.a.a(37) + ": " + .bl.a().d()), this.a.getWidth() + 6, 13, 1, 17);
               .q.a((String).a.a(.bl.f()), .at.f - 3, .at.g - 16 - 2, 1, 34);
               if (this.a) {
                  .a.a("", this.b, this.c, this.d, 15 + (this.a.length + 1) * 10 - 5);
                  .a.a(.at.a.a(62), this.b, this.c + 14, this.d, this.a[0] == 1, false, true);
                  .a.a(.at.a.a(218), this.b, this.c + 14 + 10, this.d, this.a[1] == 1, false, true);
                  .a.a(.at.a.a(72), this.b, this.c + 14 + 20, this.d, this.a[2] == 1, false, true);
                  .a.a(.at.a.a(33), this.b, this.c + 14 + 30, this.d, this.a[3] == 1, false, true);
                  .a.a(.at.a.a(64), this.b, this.c + 14 + 40, this.d, this.a[4] == 1, false, true);
                  .a.a(.at.a.a(66), this.b, this.c + 14 + 50, this.d, this.a[5] == 1, false, true);
               } else if (!this.i && !this.f && !this.g && !this.b && !this.d && !this.c && !this.j && !this.h) {
                  .a.a((int)this.c);
                  .a.b(.a.a());
               }

               if (this.j) {
                  .a.a("", "");
                  this.a.a();
               } else if (this.c) {
                  .a.a("", "");
                  this.a.c();
               } else {
                  .a.a(.at.a.a(67), .bl.a() == 2 && .a.b() ? "" : .at.a.a(239));
               }
            }

            if (this.k) {
               if (this.b == null) {
                  this.k = false;
                  return;
               }

               this.b.a(var1, (int)this.c);
               this.b.c();
            }

         }
      }
   }

   public final void b(int var1) {
      if (this.s) {
         .bl.e();
         if (this.e < 6000L) {
            if (var1 == 256) {
               this.e = 6001L;
            }

         } else if (this.k) {
            if (var1 == 256) {
               this.k = false;
               this.b = null;
            }

         } else {
            int var2;
            .v[] var4;
            if (this.i) {
               if (!this.a.c(var1)) {
                  if (this.a.d() == 8) {
                     if (!this.a.g()) {
                        .bl.a().a(this.a.a(), this.a.b());
                        if (this.a != null) {
                           this.a.b();
                        }
                     }
                  } else if (!this.a.g() && this.a.d() == 11) {
                     .bl.a(0);
                     .bl.p += this.a.b();
                     if ((var4 = .bl.a().b()) != null) {
                        for(var2 = 0; var2 < var4.length; ++var2) {
                           if (var4[var2].c() && var4[var2].a() == 116 || var4[var2].a() == 117) {
                              .bl.a().a(var4[var2]);
                              if (this.a != null) {
                                 this.a.b();
                              }
                              break;
                           }
                        }
                     }
                  } else if (this.a.d() != 3 && this.a.d() != 5 && this.a.d() != 11 && this.a.d() == 0) {
                     if ((var4 = .bl.a().b()) != null) {
                        for(var2 = 0; var2 < var4.length; ++var2) {
                           if (var4[var2].c() && var4[var2].a() == 116) {
                              .bl.a().a(var4[var2]);
                              if (this.a != null) {
                                 this.a.b();
                              }
                              break;
                           }
                        }
                     }

                     .bl.k += this.a.b();
                  }

                  if (this.a.g()) {
                     .bl.b();
                     if (.bl.a() == 9 || .bl.a() == 44) {
                        .bl.d(this.a);
                        .bl.a(.cl.a);
                        this.i = false;
                        .at.a.a(this);
                        return;
                     }

                     if (.bl.a() == 18) {
                        this.a.a(.bl.a().b(), 0);
                        .bl.d(this.a);
                        this.i = false;
                        return;
                     }
                  } else {
                     .bl.a();
                  }

                  .bl.o(this.a.f());
                  .bl.d(this.a);
                  this.i = false;
               }
            } else if (this.e) {
               if (!this.a.a(var1)) {
                  this.a.c();
                  this.e = false;
                  .at.a.c(1);
               }

            } else if (this.f) {
               if (!.at.f && var1 == 4 && this.a.a() && this.a.a() == 1) {
                  this.b = new .i(.at.a.a(310));
                  .at.f = true;
                  this.k = true;
               } else if (!.at.h && var1 == 32 && this.a.a() && this.a.a() == 1) {
                  this.b = new .i(.at.a.a(312));
                  .at.h = true;
                  this.k = true;
               } else if (!.at.i && var1 == 256 && this.a.a() && this.a.a() == 2) {
                  this.b = new .i(.at.a.a(313));
                  .at.i = true;
                  this.k = true;
               } else if (!.at.g && var1 == 256 && this.a.a() != null && this.a.a().b() && this.a.a() && this.a.a() == 0) {
                  this.b = new .i(.at.a.a(311));
                  .at.g = true;
                  this.k = true;
               }

               if (!this.a.a(var1)) {
                  var1 = 0;
                  .v[] var6;
                  if ((var6 = .bl.a().b()) != null) {
                     for(int var3 = 0; var3 < var6.length; ++var3) {
                        if (var6[var3].a() >= 132 && var6[var3].a() < 154) {
                           var1 += var6[var3].l();
                        }
                     }
                  }

                  if (var1 > this.g) {
                     .bl.n += var1 - this.g;
                  }

                  this.a.c();
                  this.f = false;
               }

            } else if (this.g) {
               if (!this.a.a(var1)) {
                  this.g = false;
               }

            } else if (this.d) {
               if (!this.a.a(var1)) {
                  this.d = false;
               }

            } else if (this.h) {
               if (!.at.v && var1 == 32) {
                  this.b = new .i(.at.a.a(323));
                  .at.v = true;
                  this.k = true;
               }

               if (!this.a.a(var1)) {
                  this.h = false;
               }

            } else if (this.j) {
               if (var1 == 256) {
                  this.d();
               }

            } else if (this.c) {
               if (var1 == 4) {
                  this.a.a();
               }

               if (var1 == 32) {
                  this.a.b();
               }

               if (var1 == 256) {
                  if (this.a.a() && this.o || !this.a.a() && this.o && this.l) {
                     this.o = false;
                     .bl.a(.bl.a());
                     .bl.f = -1;
                     .bl.d = -1;
                     .bl.e = -1;
                     .ba.e();
                     .at.a.a(.at.a[2]);
                     return;
                  }

                  if (this.l) {
                     if (this.a.a()) {
                        if (.bl.f() < this.h) {
                           String var5 = .bl.a(.at.a.a(83), .a.a(this.h - .bl.f()), "#C");
                           this.a.a(var5, false);
                           this.o = true;
                           this.l = true;
                           this.c = true;
                           return;
                        }

                        .bl.o(-this.h);
                        this.p = true;
                        this.l = false;
                        this.c = false;
                     } else {
                        this.o = false;
                        .bl.a(.bl.a());
                        .bl.f = -1;
                        .bl.d = -1;
                        .bl.e = -1;
                        .ba.e();
                        .at.a.a(.at.a[2]);
                     }
                  }

                  this.c = false;
               }

            } else {
               if (this.a && !this.b) {
                  if (var1 == 256 && !this.i && !this.j) {
                     switch(this.a) {
                     case 0:
                        if (.bl.a() < 5) {
                           this.b = new .i(.at.a.a(257));
                           this.k = true;
                           return;
                        }

                        if (this.a == null) {
                           this.a = new Main.m();
                           this.a.b();
                        }

                        if (this.a != null && this.a.a()) {
                           this.a.b();
                           this.a.a(false);
                        } else if (this.a != null && this.a.a()) {
                           this.a.b();
                           this.a.a(false);
                        }

                        this.g = 0;
                        if ((var4 = .bl.a().b()) != null) {
                           for(var2 = 0; var2 < var4.length; ++var2) {
                              if (var4[var2].a() >= 132 && var4[var2].a() < 154) {
                                 this.g += var4[var2].l();
                              }
                           }
                        }

                        this.f = true;
                        if (this.b == null && !.at.e) {
                           this.b = new .i(.at.a.a(309));
                           .at.e = true;
                           this.k = true;
                        }

                        return;
                     case 1:
                        if (.bl.a() < 13) {
                           this.b = new .i(.at.a.a(257));
                           this.k = true;
                           return;
                        }

                        if (this.a == null) {
                           this.a = new Main.d();
                        } else {
                           this.a.a();
                        }

                        .at.a.c(2);
                        this.e = true;
                        this.d = -150L;
                        if (this.b == null && !.at.j) {
                           this.b = new .i(.at.a.a(314));
                           .at.j = true;
                           this.k = true;
                        }

                        return;
                     case 2:
                        if (.bl.a() < 9) {
                           this.b = new .i(.at.a.a(257));
                           this.k = true;
                           return;
                        }

                        if (.bl.a().q() > .bl.a().p()) {
                           this.a.a(.at.a.a(84));
                           this.c = true;
                           return;
                        }

                        if (this.a == null) {
                           this.a = new Main.r(false, (.cl)null, false, -1);
                        } else {
                           this.a.a(false, (.cl)null, false, -1);
                        }

                        if (.bl.a().a(85)) {
                           this.a.a(false, true);
                        }

                        this.g = true;
                        if (this.b == null && !.at.k && .bl.a() >= 16) {
                           this.b = new .i(.at.a.a(315));
                           .at.k = true;
                           this.k = true;
                           return;
                        }

                        if (this.b == null && !.at.l && .bl.a() < 16) {
                           this.b = new .i(.at.a.a(316));
                           .at.l = true;
                           this.k = true;
                        }

                        return;
                     case 3:
                        if (.bl.a() < 13) {
                           this.b = new .i(.at.a.a(257));
                           this.k = true;
                           return;
                        }

                        if (this.a == null) {
                           this.a = new Main.c();
                        } else {
                           this.a.a();
                        }

                        this.d = true;
                        if (this.b == null && !.at.p) {
                           this.b = new .i(.at.a.a(318));
                           .at.p = true;
                           this.k = true;
                        }

                        return;
                     case 4:
                        if (this.a == null) {
                           this.a = new Main.g();
                        }

                        this.h = true;
                        this.a.b();
                        if (this.b == null && !.at.u) {
                           this.b = new .i(.at.a.a(322));
                           .at.u = true;
                           this.k = true;
                        }

                        return;
                     case 5:
                        if (this.a == null) {
                           this.a = new Main.l();
                        }

                        this.b = true;
                        this.a.c(2);
                        return;
                     }
                  }

                  if (var1 == 64) {
                     this.a[this.a] = 0;
                     if (this.a < this.a.length - 1) {
                        ++this.a;
                     } else {
                        this.a = 0;
                     }

                     this.a[this.a] = 1;
                  }

                  if (var1 == 2) {
                     this.a[this.a] = 0;
                     if (this.a > 0) {
                        --this.a;
                     } else {
                        this.a = this.a.length - 1;
                     }

                     this.a[this.a] = 1;
                  }

                  if (var1 == 16384) {
                     this.a = !this.a;
                     return;
                  }
               }

               if (!this.b && var1 == 8192) {
                  this.e();
               } else if (this.b) {
                  this.a.a(var1);
                  if (this.a != null) {
                     if (var1 == 4) {
                        this.a.b();
                     }

                     if (var1 == 32) {
                        this.a.c();
                     }

                     if (var1 == 2) {
                        this.a.a((int)this.c);
                     }

                     if (var1 == 64) {
                        this.a.b((int)this.c);
                     }

                     if (var1 == 16384) {
                        this.a.c();
                     }

                     if (var1 == 8192 && this.a.b()) {
                        this.b = !this.b;
                        this.a.c(2);
                     }

                     if (var1 == 256 && !this.i && !this.j && this.a.a()) {
                        this.b = false;
                     }

                  }
               } else {
                  if (var1 == 16384) {
                     this.a = !this.a;
                  }

               }
            }
         }
      }
   }

   private void e() {
      if (.bl.a().q() > .bl.a().p()) {
         .ay var10000 = this.a;
         String var2 = .at.a.a(84);
         var10000.a(var2, false);
         this.c = true;
      } else if (.bl.a() == 6 || .bl.a() == 7 && .bl.a().n() == 0 && .bl.a().e() == .bl.a().d()) {
         if (!.bl.a().e() && !.bl.a().e()) {
            this.b = new .i(.at.a.a(258));
         } else {
            this.b = new .i(.at.a.a(259));
         }

         this.k = true;
      } else if (.bl.a() == 20 && .bl.a().b() == .bl.c().h()) {
         this.b = new .i(.at.a.a(260));
         this.k = true;
      } else {
         if (.bl.a() == 21 && .bl.a().b() == .bl.c().h()) {
            .bl.a().a(1);
            if (.bl.a().a(41)) {
               if (!this.c && !this.i && !this.j) {
                  this.a.a(.at.a.a(217), true);
                  this.a.a();
                  this.c = true;
                  this.o = true;
               }

               return;
            }

            this.b = new .i(.at.a.a(260));
            this.k = true;
         } else if (!this.c && !this.i && !this.j) {
            this.a.a(.at.a.a(217), true);
            this.a.a();
            this.c = true;
            this.o = true;
         }

      }
   }
}
