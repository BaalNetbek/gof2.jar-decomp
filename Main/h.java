package Main;

import javax.microedition.lcdui.Image;

public class h extends Main.i {
   public Image a;
   public Image b;
   public Image c;
   public Image d;
   protected String a;
   private Image e;
   private Image f;
   private boolean d;
   public boolean a;
   private .ay a;
   private int[] b;
   private int p;
   private .v[] a;
   private .h a;
   private int q;
   private int r;
   private boolean e;
   private boolean f;
   private int s;
   private int t;
   private int u;
   private int v;
   private int w;
   private int x;

   public h(String[] var1, String var2) {
      this(0, 0, .at.f, .at.g, var1, var2);
   }

   private h(int var1, int var2, int var3, int var4, String[] var5, String var6) {
      super(0, 0, var3, var4, var5, var6);
      this.d = false;
      this.a = new .ay();
      if (this.e == null) {
         this.e = .ai.a("/data/interface/logo_" + .bl.a().c() + "_relief.png", true);
      }

   }

   public final void c() {
      this.b = null;
      this.a = null;
      this.c = null;
      this.a = null;
   }

   public final void a(.ch var1) {
      String var2 = null;
      if (this.b == null) {
         try {
            var2 = "/data/interface/items.png";
            this.b = .ai.a("/data/interface/items.png", true);
            var2 = "/data/interface/item_types.png";
            this.a = .ai.a("/data/interface/item_types.png", true);
            var2 = "/data/interface/item_types_sel.png";
            this.f = .ai.a("/data/interface/item_types_sel.png", true);
            var2 = "/data/interface/ships.png";
            this.c = .ai.a("/data/interface/ships.png", true);
            var2 = "/data/interface/ships_color.png";
            this.d = .ai.a("/data/interface/ships_color.png", true);
         } catch (Exception var7) {
            var7.printStackTrace();
         }
      }

      .ce[] var9 = new .ce[var1.a().length + 2 + var1.t()];
      byte var3 = 0;
      int var8 = var3 + 1;
      var9[0] = new .ce(.at.a.a(77));
      ++var8;
      var9[1] = new .ce(var1);

      for(int var4 = 0; var4 < 4; ++var4) {
         if (var1.a(var4) > 0) {
            var9[var8++] = new .ce(.at.a.a(var4 == 0 ? 123 : (var4 == 1 ? 124 : (var4 == 2 ? 125 : 127))), var4);
            .v[] var5 = var1.a(var4);

            for(int var6 = 0; var6 < var5.length; var9[var8 - 1].d = var6++) {
               if (var5[var6] != null) {
                  var9[var8++] = new .ce(var5[var6]);
               } else {
                  var9[var8++] = new .ce(var4);
               }
            }
         }
      }

      this.a[0] = var9;
      if (this.a[0] == null) {
         this.a[0] = 0;
      } else if (this.a[0].length == 0) {
         this.a[0] = null;
         this.a[0] = 0;
      } else {
         this.a[0] = this.a[0].length;
      }

      this.j = this.a[0].length;
      this.a[0] = this.j;
      this.j();
   }

   public final void a(.h[] var1) {
      if (var1 != null) {
         int var2 = 1;

         int var3;
         for(var3 = 0; var3 < var1.length; ++var3) {
            if (var1[var3].a) {
               ++var2;
            }
         }

         var3 = var2;
         boolean var4 = true;
         .bp[] var5;
         if ((var5 = .bl.a()) != null) {
            for(int var6 = 0; var6 < var5.length; ++var6) {
               if (var5[var6] != null) {
                  ++var2;
               }
            }

            if (var2 > var3) {
               ++var2;
               var4 = false;
            }
         }

         .ce[] var8;
         (var8 = new .ce[var2])[0] = new .ce(.at.a.a(131));
         var2 = 1;

         for(var3 = 0; var3 < var1.length; ++var3) {
            if (var1[var3].a) {
               var8[var2++] = new .ce(var1[var3]);
            }
         }

         if (!var4) {
            var8[var2++] = new .ce(.at.a.a(132));

            for(var3 = 0; var3 < var5.length; ++var3) {
               if (var5[var3] != null) {
                  var8[var2++] = new .ce(var5[var3]);
               }
            }
         }

         super.a(2, var8);
         this.j = this.a[2].length;
         this.a[2] = this.j;
         this.j();
      }
   }

   public final void a(.v[] var1) {
      this.a = var1;
      if (var1 != null) {
         this.b = new int[5];

         int var2;
         for(var2 = 0; var2 < var1.length; ++var2) {
            int var10002 = this.b[var1[var2].b()]++;
         }

         var2 = 0;

         int var3;
         for(var3 = 0; var3 < this.b.length; ++var3) {
            if (this.b[var3] > 0) {
               ++var2;
            }
         }

         .ch[] var6;
         if ((var6 = .bl.a().a()) != null) {
            var2 += 1 + var6.length;
         }

         .ce[] var7 = new .ce[var1.length + var2];
         int var4 = 0;
         int var5;
         if (var6 != null) {
            ++var4;
            var7[0] = new .ce(.at.a.a(68), -1);

            for(var5 = 0; var5 < var6.length; ++var5) {
               var7[var4++] = new .ce(var6[var5]);
            }
         }

         for(var5 = 0; var5 < 5; ++var5) {
            if (this.b[var5] > 0) {
               var7[var4++] = new .ce(.at.a.a(var5 == 0 ? 123 : (var5 == 1 ? 124 : (var5 == 2 ? 125 : (var5 == 3 ? 127 : 128)))), var5);

               for(var3 = 0; var3 < var1.length; ++var3) {
                  if (var1[var3].b() == var5) {
                     var7[var4++] = new .ce(var1[var3]);
                  }
               }
            }
         }

         super.a(1, var7);
         this.p = .bl.a().q();
         this.j = this.a[1].length;
         this.a[1] = this.j;
         this.j();
      }
   }

   private void a(.ce var1) {
      this.a[3] = null;
      this.a[3] = 0;
      boolean var2 = var1.a();
      int var3 = var1.a;
      if (!var2 && !var1.d()) {
         var3 = var1.a.b();
      }

      int var4 = 0;
      int var6;
      if (var2) {
         .ch[] var5;
         if ((var5 = .bl.a().a()) != null) {
            var4 = var5.length;
         }
      } else {
         .v[] var10;
         if ((var10 = .bl.a().b()) != null) {
            for(var6 = 0; var6 < var10.length; ++var6) {
               if (var10[var6].b() == var3) {
                  ++var4;
               }
            }
         }
      }

      int var11 = !var2 && !var1.d() ? 2 : 0;
      var6 = 2 + (var4 == 0 ? 2 : 1) + (var11 == 0 ? 0 : 1);
      .ce[] var12;
      (var12 = new .ce[var4 + var6 + var11])[0] = new .ce(.at.a.a(135));
      var12[1] = new .ce(var1);
      var6 = 2;
      if (!var2 && !var1.d()) {
         ++var6;
         var12[2] = new .ce(.at.a.a(136));
         ++var6;
         var12[3] = new .ce(.at.a.a(137), true, 0);
         ++var6;
         var12[4] = new .ce(.at.a.a(138), true, 1);
      }

      var12[var6++] = new .ce(var2 ? .at.a.a(140) : .at.a.a(139));
      if (var4 > 0) {
         int var9;
         if (var2) {
            .ch[] var7 = .bl.a().a();

            for(var9 = 0; var9 < var7.length; ++var9) {
               var12[var6++] = new .ce(var7[var9]);
            }
         } else {
            .v[] var8 = .bl.a().b();

            for(var9 = 0; var9 < var8.length; ++var9) {
               if (var8[var9].b() == var3) {
                  var12[var6++] = new .ce(var8[var9]);
               }
            }
         }
      } else {
         var12[var6] = new .ce(.at.a.a(141), false, -1);
      }

      super.a(3, var12);
      this.j = this.a[3].length;
      this.a[3] = this.j;
      this.j();
   }

   private void a(.h var1) {
      this.a = var1;
      this.a[4] = null;
      this.a[4] = 0;
      boolean var2 = false;
      .v[] var3 = .bl.a().b();
      .v[] var4 = .ad.a();
      int[] var9;
      .ce[] var10 = new .ce[(var9 = var1.a()).length + 1];
      int var5 = 0;

      for(int var6 = 0; var6 < var9.length; ++var6) {
         boolean var7 = false;
         if (var3 != null) {
            for(int var8 = 0; var8 < var3.length; ++var8) {
               if (var3[var8].a() == var9[var6]) {
                  var10[var5++] = new .ce(var3[var8]);
                  var3[var8].e(0);
                  var7 = true;
                  break;
               }
            }
         }

         if (!var7) {
            var10[var5++] = new .ce(var4[var9[var6]]);
            var4[var9[var6]].e(0);
         }
      }

      super.a(4, var10);
      this.j = this.a[4].length;
      this.a[4] = this.j;
      this.j();
   }

   public final boolean a() {
      return this.d || this.a;
   }

   public final boolean b() {
      return this.d;
   }

   public final void a(boolean var1) {
      if (this.d) {
         .v var2;
         (var2 = ((.ce)this.a[this.g][this.h]).a).d(this.t);
         var2.b(this.u);
         var2.e(this.v);
         .bl.p(this.w);
         this.p = this.x;
      }

      this.t = 0;
      this.u = 0;
      this.v = 0;
      this.d = false;
   }

   public final void d() {
      if (this.d && !this.a) {
         if (this.g == 1) {
            int var1;
            if ((var1 = ((.ce)this.a[this.g][this.h]).a.a(false)) > 0) {
               --this.p;
            }

            .bl.o(var1);
         } else if (this.g == 4) {
            int var2;
            .v var4;
            if ((var2 = (var4 = ((.ce)this.a[this.g][this.h]).a).b(true)) > 0) {
               --this.p;
            } else if (var2 != 0) {
               --this.s;
            }

            .v[] var5;
            if ((var5 = .bl.a().b()) != null) {
               for(int var3 = 0; var3 < var5.length; ++var3) {
                  if (var5[var3].a() == var4.a()) {
                     var5[var3].b(var4.l());
                     var5[var3].e(var4.n());
                  }
               }
            }
         }

         this.j();
      } else if (!this.a && this.g < 3) {
         super.d();
      } else {
         if (this.a) {
            this.a.a();
         }

      }
   }

   public final void e() {
      if (this.d && !this.a) {
         if (this.g == 1) {
            int var1;
            if ((var1 = ((.ce)this.a[this.g][this.h]).a.a(true)) < 0) {
               ++this.p;
            }

            .bl.o(var1);
         } else if (this.g == 4) {
            .v var4;
            if ((var4 = ((.ce)this.a[this.g][this.h]).a).n() < this.a.c(var4.a())) {
               int var2;
               if ((var2 = var4.b(false)) < 0) {
                  ++this.p;
               } else if (var2 != 0) {
                  ++this.s;
               }
            }

            .v[] var5;
            if ((var5 = .bl.a().b()) != null) {
               for(int var3 = 0; var3 < var5.length; ++var3) {
                  if (var5[var3].a() == var4.a()) {
                     var5[var3].b(var4.l());
                     var5[var3].e(var4.n());
                  }
               }
            }
         }

         this.j();
      } else {
         if (!this.a) {
            if (this.g < 2) {
               super.e();
               return;
            }
         } else {
            this.a.b();
         }

      }
   }

   public final void f() {
      if (this.d) {
         for(int var1 = 0; var1 < 10; ++var1) {
            this.d();
         }
      }

   }

   public final void g() {
      if (this.d) {
         for(int var1 = 0; var1 < 10; ++var1) {
            this.e();
         }
      }

   }

   public final void h() {
      if (!this.d && !this.a) {
         boolean var1 = false;
         int var2 = this.h;

         for(int var3 = this.h; var3 > 0; --var3) {
            if (((.ce)((.ce)this.a[this.g][var3 - 1])).a) {
               var1 = true;
               break;
            }

            --var2;
         }

         if (this.h == 0 || this.h == 1 && !((.ce)((.ce)this.a[this.g][0])).a) {
            var2 = this.a[this.g] - 1;
            this.h = this.a[this.g] - 1;
            this.i = this.a[this.g] - this.j - 1;
         }

         if (var1) {
            super.h();
         }

         if (var2 > 0 && !((.ce)((.ce)this.a[this.g][this.h])).a) {
            this.h();
         }

         this.j();
      }

   }

   public final void i() {
      if (!this.d && !this.a) {
         boolean var1 = false;
         int var2 = this.h;

         for(int var3 = this.h; var3 < this.a[this.g] - 1; ++var3) {
            if (((.ce)((.ce)this.a[this.g][var3 + 1])).a) {
               var1 = true;
               break;
            }

            ++var2;
         }

         if (this.h == this.a[this.g] - 1 || this.h == this.a[this.g] - 3 && !((.ce)((.ce)this.a[this.g][this.h + 1])).a && !((.ce)((.ce)this.a[this.g][this.h + 2])).a) {
            var2 = 0;
            this.h = 0;
            this.i = 0;
         }

         if (var1) {
            super.i();
         }

         if (var2 < this.a[this.g] - 1 && !((.ce)((.ce)this.a[this.g][this.h])).a) {
            this.i();
         }

         this.j();
      }

   }

   public final int a() {
      .ce var1;
      int var3;
      int var18;
      String var22;
      if (this.a) {
         this.a = false;
         if (this.g == 1 && !this.f) {
            return 0;
         }

         if (this.d) {
            this.d = this.a.a();
         }

         if (!this.e) {
            if (!this.f) {
               return 0;
            }

            this.f = false;
            this.a = false;
            if (this.a.a()) {
               var1 = (.ce)this.a[this.g][this.h];
               .bl.o(.bl.a().c() - var1.a.c());
               .ch var13;
               .v[] var16 = (var13 = .bl.a()).a();
               .v[] var21 = var13.b();
               .bl.a(.ad.a()[var1.a.b()].a());
               .bl.a().a(var1.a.a());
               .bl.a().c();
               .bl.a().b(var21);
               if (var16 != null) {
                  for(int var19 = 0; var19 < var16.length; ++var19) {
                     if (var16[var19] != null) {
                        .bl.a().b(var16[var19]);
                     }
                  }
               }

               .ch[] var23 = .bl.a().a();

               for(var18 = 0; var18 < var23.length; ++var18) {
                  if (var23[var18].b() == var1.a.b()) {
                     var23[var18] = .ad.a()[var13.b()].a();
                     var23[var18].a(var13.a());
                     break;
                  }
               }

               this.a(.bl.a());
               this.a(.v.a(.bl.a().b(), .bl.a().a()));
               this.b(0);
               var22 = .bl.a(new String(.at.a.a(143)), .at.a.a(532 + var1.a.b()), "#N");
               this.a.a(var22);
               this.a = true;
               ((Main.p).at.a[1]).a().a(.bl.a().b(), .bl.a().a());
            }

            return 0;
         }

         this.e = false;
         if (this.a.a()) {
            if (!this.d) {
               .bl.o(-((.ce)this.a[this.g][this.h]).a.n() * 10);
               this.d = true;
               int var2 = this.s;

               for(var3 = 0; var3 < var2; ++var3) {
                  this.d();
               }

               this.d = false;
               return 0;
            }
         } else {
            this.d = true;
            this.a(false);
         }

         this.s = 0;
         this.d = true;
      }

      if (this.a[this.g] != null && this.a[this.g][this.h] != null) {
         var1 = (.ce)this.a[this.g][this.h];
         if (this.g == 4 && this.d && this.s > 0 && !this.a && !this.a.b() && this.a.b() != .bl.a().b()) {
            String var11 = .bl.a(.bl.a(new String(.at.a.a(142)), this.a.a(), "#S"), .a.a(var1.a.n() * 10), "#C");
            this.a.a(var11, true);
            this.a = true;
            this.e = true;
            return 0;
         } else {
            if (this.g == 0) {
               this.q = this.h;
               this.r = this.i;
               this.a(var1);
               this.b(3);
               if (!.at.B && var1.d()) {
                  this.a.a(.at.a.a(301));
                  .at.B = true;
                  this.a = true;
               }
            } else {
               .v var5;
               if (this.g == 1) {
                  if (var1.a()) {
                     if (var1.a.c() > .bl.f() + .bl.a().c()) {
                        this.a.a(.bl.a(.at.a.a(83), .a.a(var1.a() - .bl.f() - .bl.a().c()), "#C"));
                        this.a = true;
                        return 0;
                     }

                     if (.bl.c > 0) {
                        this.a.a(.at.a.a(161));
                        this.a = true;
                        return 0;
                     }

                     this.f = true;
                     this.a.a(.at.a.a(144), true);
                     this.a = true;
                     return 0;
                  }

                  if (var1.a.c()) {
                     this.a.a(.at.a.a(160));
                     this.a = true;
                  } else if (var1.a.l() == 0 && .bl.f() < var1.a.e()) {
                     this.a.a(.bl.a(.at.a.a(83), .a.a(var1.a.e() - .bl.f()), "#C"));
                     this.a = true;
                  } else {
                     this.d = !this.d;
                     if (!this.d) {
                        if (var1.b() && var1.a.b() != 4 && !.at.A) {
                           this.a.a(.at.a.a(303));
                           .at.A = true;
                           this.a = true;
                        }

                        if (var1.b() >= 132 && var1.b() < 154) {
                           .bl.d[var1.b() - 132] = true;
                        }

                        .v[] var9;
                        if (var1.b() && var1.a.b() == 1 && var1.a.l() > 0 && (var9 = .bl.a().a(1)) != null) {
                           for(var3 = 0; var3 < var9.length; ++var3) {
                              .v var20;
                              if ((var20 = var9[var3]) != null && var20.a() == var1.a.a()) {
                                 var5 = var1.a.a(var1.a.l() + var20.l());
                                 if (this.a != null) {
                                    for(var18 = 0; var18 < this.a.length; ++var18) {
                                       if (this.a[var18].a() == var5.a()) {
                                          this.a[var18].b(0);
                                       }
                                    }
                                 }

                                 .bl.a().a(var5, var3);
                                 .bl.a().a(var5.a(), var5.l());
                                 this.a(.bl.a());
                                 var22 = .bl.a(new String(.at.a.a(87)), .at.a.a(569 + var5.a()), "#N");
                                 this.a.a(var22);
                                 this.a = true;
                                 break;
                              }
                           }
                        }

                        .bl.a().b(.v.a(this.a, true));
                        .bl.a().a(.v.a(this.a, false));
                        this.a(.v.a(.bl.a().b(), .bl.a().a()));
                        this.j();
                     } else {
                        if (!.at.z) {
                           this.a.a(.at.a.a(302));
                           .at.z = true;
                           this.a = true;
                        }

                        this.t = var1.a.m();
                        this.u = var1.a.l();
                        this.w = .bl.f();
                        this.x = this.p;
                     }
                  }
               } else if (this.g == 2 && !var1.i()) {
                  this.a(var1.a);
                  this.b(4);
               } else {
                  String var4;
                  boolean var10;
                  if (this.g == 3) {
                     if (this.h > 2) {
                        .v var7;
                        if ((var7 = ((.ce)this.a[this.g][1]).a) != null && var7.c()) {
                           this.a.a(.at.a.a(160));
                           this.a = true;
                           return 0;
                        }

                        if (var7 != null && var7.d() == 20 && .bl.c > 0) {
                           this.a.a(.at.a.a(160));
                           this.a = true;
                           return 0;
                        }

                        if (var1.a()) {
                           if (var1.a.c() > .bl.f() + .bl.a().c()) {
                              this.a.a(.bl.a(.at.a.a(83), .a.a(var1.a() - .bl.f() - .bl.a().c()), "#C"));
                              this.a = true;
                              return 0;
                           }

                           if (.bl.c > 0) {
                              this.a.a(.at.a.a(161));
                              this.a = true;
                              return 0;
                           }

                           this.f = true;
                           this.a.a(.at.a.a(144), true);
                           this.a = true;
                           return 0;
                        }

                        if (var1.e()) {
                           var10 = var7.b() == 1;
                           if (var1.g()) {
                              var4 = .bl.a(new String(.at.a.a(88)), .at.a.a(569 + var7.a()), "#N");
                              this.a.a(var4);
                              var5 = var7.a(var10 ? var7.l() : 1);
                              .bl.a().b(var5);
                              .bl.a().d(var7);
                              this.a(.bl.a());
                              this.a(.v.a(.bl.a().b(), .bl.a().a()));
                              this.b(0);
                           } else if (var1.f()) {
                              var4 = .bl.a(new String(.at.a.a(86)), .at.a.a(569 + var7.a()), "#N");
                              this.a.a(var4);
                              var5 = var7.a(var10 ? var7.l() : 1);
                              .bl.a().a(var5);
                              .bl.o(var7.f());
                              .bl.a().d(var7);
                              this.a(.bl.a());
                              this.a(.v.a(.bl.a().b(), .bl.a().a()));
                              this.b(0);
                           }

                           this.a = true;
                        } else {
                           .ce var12 = (.ce)this.a[this.g][1];
                           if (.bl.a().a(var1.a.d()) != null && !var1.a.a() && (!var12.b() || var12.a.d() != var1.a.d())) {
                              var4 = new String(.at.a.a(164));
                              this.a.a(var4);
                              this.a = true;
                              return 0;
                           }

                           .v var6;
                           boolean var14;
                           String var15;
                           if (var12.d()) {
                              var14 = var1.a.b() == 1;
                              var15 = .bl.a(new String(.at.a.a(87)), .at.a.a(569 + var1.a.a()), "#N");
                              this.a.a(var15);
                              var6 = var1.a.a(var14 ? var1.a.l() : 1);
                              .bl.a().a(var6, var12.d);
                              .bl.a().a(var6.a(), var14 ? var6.l() : 1);
                              this.a(.bl.a());
                              this.a(.v.a(.bl.a().b(), .bl.a().a()));
                              this.b(0);
                           } else {
                              var14 = var12.a.b() == 1;
                              var15 = .bl.a(new String(.at.a.a(87)), .at.a.a(569 + var1.a.a()), "#N");
                              this.a.a(var15);
                              var6 = var12.a.a(var14 ? var12.a.l() : 1);
                              .bl.a().b(var6);
                              .bl.a().b(var12.a, var12.d);
                              .bl.a().a(var1.a.a(var14 ? var1.a.l() : 1), var12.d);
                              .bl.a().a(var1.a.a(), var14 ? var1.a.l() : 1);
                              this.a(.bl.a());
                              this.a(.v.a(.bl.a().b(), .bl.a().a()));
                              this.b(0);
                           }
                        }

                        this.h = this.q;
                        this.i = this.r;
                     }
                  } else if (this.g == 4) {
                     if (this.d) {
                        boolean var8 = false;
                        var10 = false;
                        this.a.a(var1.a, var1.a.n(), .bl.a().b());
                        if (this.a.a()) {
                           if (this.a.b() != .bl.a().b()) {
                              var4 = .bl.a(.bl.a(new String(.at.a.a(89)), .at.a.a(569 + this.a.a()), "#N"), this.a.a(), "#S");
                              this.a.a(var4);
                              .bl.a(this.a);
                              this.b(2);
                           } else {
                              var4 = .bl.a(new String(.at.a.a(90)), .at.a.a(569 + this.a.a()), "#N");
                              this.a.a(var4);
                              var5 = .ad.a()[this.a.a()].a(this.a.d());
                              .bl.a().b(var5);
                              this.b(1);
                           }

                           var10 = true;
                           this.a.b();
                           var8 = true;
                        }

                        this.d = false;
                        .bl.a().b(.v.a(.bl.a().b(), true));
                        this.a(.v.a(.bl.a().b(), .bl.a().a()));
                        this.a(.bl.a());
                        this.j();
                        if (var8) {
                           for(int var17 = 0; var17 < this.a[this.g].length; ++var17) {
                              this.i();
                              if (!((.ce)this.a[this.g][this.h]).h() && ((.ce)this.a[this.g][this.h]).b() == this.a.a()) {
                                 break;
                              }
                           }
                        }

                        if (var10) {
                           this.a = true;
                        }

                        return 0;
                     }

                     this.s = 0;
                     if (this.a.b() && ((.ce)this.a[this.g][this.h]).a.l() > 0) {
                        this.a.a(.at.a.a(91), true);
                        this.a = true;
                     }

                     this.v = var1.a.n();
                     this.u = var1.a.l();
                     this.w = .bl.f();
                     this.x = this.p;
                     this.d = !this.d;
                  }
               }
            }

            return 0;
         }
      } else {
         return 0;
      }
   }

   public final void j() {
      if (this.a.length >= 3) {
         if (this.g == 1) {
            this.l = this.b + 14 + this.n + this.m + 2;
         } else {
            this.l = this.b + 14 + this.n;
         }
      }

      super.j();
      if (this.a[this.g] > 0 && this.h == 0 && !(this.a[this.g] == 0 ? false : ((.ce)((.ce)this.a[this.g][this.h])).a)) {
         ++this.h;
         super.j();
      }

   }

   public void a() {
      this.n();
      .a.a(this.b, this.a, this.b, this.c, this.d);
      .at.a.drawImage(this.e, .at.f - 20, .at.g - 30 - 16, 40);
      if (this.g > 2) {
         this.n = 1;
      } else {
         this.n = .q.a() + 4;
      }

      this.k();
      this.l();
      this.m();
      if (this.a) {
         this.a.c();
      }

   }

   public void b() {
      .at.a.setColor(.a.c);
      .at.a.fillRect(this.a + 2, this.b + this.d - 14, this.c - 4, 12);
      .at.a.setColor(0);
      .at.a.drawLine(this.a + 3, this.b + this.d - 15, this.c - 3, this.b + this.d - 15);
      .at.a.drawLine(this.a + 3, this.b + this.d - 1, this.c - 3, this.b + this.d - 1);
      .at.a.drawRect(this.a + 3, this.b + this.d - 13, this.c - 6, 10);
      .at.a.setColor(.a.a);
      .at.a.drawRect(this.a + 2, this.b + this.d - 14, this.c - 4, 12);
      boolean var1;
      if ((var1 = this.p > .bl.a().p()) && .a.b() || !var1) {
         .q.a((String)(this.p + "/" + .bl.a().p() + "t"), this.k, this.b + this.d - 14, var1 ? 2 : 1, 17);
      }

      .q.a((String).a.a(.bl.f()), this.a + this.c - 3, this.b + this.d - 13, 1, 18);
   }

   protected final void k() {
      if (this.a.length < 3) {
         super.k();
      } else {
         if (this.b) {
            if (this.g > 2) {
               return;
            }

            .at.a.setColor(0);
            .at.a.drawLine(this.a + this.c / 3, this.b + 14, this.a + this.c / 3, this.b + 14 + 14);
            .at.a.drawLine(this.a + this.c - this.c / 3 - 1, this.b + 14, this.a + this.c - this.c / 3 - 1, this.b + 14 + 14);
            .at.a.setColor(.a.a);
            .at.a.drawLine(this.a + this.c / 3 - 1, this.b + 14, this.a + this.c / 3 - 1, this.b + 14 + 14);
            .at.a.drawLine(this.a + this.c / 3 + 1, this.b + 14, this.a + this.c / 3 + 1, this.b + 14 + 14);
            .at.a.drawLine(this.a + this.c - this.c / 3 - 2, this.b + 14, this.a + this.c - this.c / 3 - 2, this.b + 14 + 14);
            .at.a.drawLine(this.a + this.c - this.c / 3, this.b + 14, this.a + this.c - this.c / 3, this.b + 14 + 14);
            switch(this.g) {
            case 0:
               .at.a.drawLine(this.a + this.c / 3 - 1, this.b + 14 + 14, this.a + this.c - 3, this.b + 14 + 14);
               break;
            case 1:
               .at.a.drawLine(this.a + 3, this.b + 14 + 14, this.a + this.c / 3 + 1, this.b + 14 + 14);
               .at.a.drawLine(this.a + this.c - this.c / 3 - 2, this.b + 14 + 14, this.a + this.c - 3, this.b + 14 + 14);
               break;
            case 2:
               .at.a.drawLine(this.a + 3, this.b + 14 + 14, this.a + this.c - this.c / 3, this.b + 14 + 14);
            }

            if (this.g != 0) {
               .at.a.setColor(0);
               .at.a.fillRect(this.a + 3, this.b + 14 + 1, this.c / 3 - 4, this.b + 14 - 2);
               .at.a.setColor(.a.d);
               .at.a.fillRect(this.a + 4, this.b + 14 + 2, this.c / 3 - 6, this.b + 14 - 3);
            }

            if (this.g != 1) {
               .at.a.setColor(0);
               .at.a.fillRect(this.a + this.c / 3 + 2, this.b + 14 + 1, this.c / 3 - 2, this.b + 14 - 2);
               .at.a.setColor(.a.d);
               .at.a.fillRect(this.a + this.c / 3 + 3, this.b + 14 + 2, this.c / 3 - 4, this.b + 14 - 3);
            }

            if (this.g != 2) {
               .at.a.setColor(0);
               .at.a.fillRect(this.a + this.c - this.c / 3 + 1, this.b + 14 + 1, this.c / 3 - 3, this.b + 14 - 2);
               .at.a.setColor(.a.d);
               .at.a.fillRect(this.a + this.c - this.c / 3 + 2, this.b + 14 + 2, this.c / 3 - 5, this.b + 14 - 3);
            }

            .a.a(this.a + 2, this.b + 14, this.g == 0);
            .a.a(this.a + this.c / 3 + 1, this.b + 14, this.g == 1);
            .a.a(this.a + this.c - this.c / 3, this.b + 14, this.g == 2);
            .q.a((String)this.a[0], this.a + this.c / 6, this.b + 14 + 1, this.g == 0 ? 2 : 1, 24);
            .q.a((String)this.a[1], this.a + this.c / 2, this.b + 14 + 1, this.g == 1 ? 2 : 1, 24);
            .q.a((String)this.a[2], this.a + this.c - this.c / 6, this.b + 14 + 1, this.g == 2 ? 2 : 1, 24);
         }

      }
   }

   public final void l() {
      if (this.a[this.g] != null) {
         if (this.a.length < 3 || this.g != 1 && this.g != 4) {
            this.l = this.b + 14 + this.n;
         } else {
            String var1 = .at.a.a(this.g == 1 ? 40 : 78);
            String var2 = this.g == 1 ? .at.a.a(78) : .at.a.a(129);
            this.l = this.b + 14 + this.n + this.m - 1;
            .at.a.setColor(.a.a);
            .at.a.drawLine(this.a + 3, this.l - 2, this.a + this.c - 3, this.l - 2);
            .q.b(var1, this.k + 3, this.l - this.m + 3, 0);
            .q.a((String)var2, this.a + this.c - 4 - 2, this.l - this.m + 3, 0, 18);
         }

         int var4 = -1;
         if (this.i == -1) {
            this.i = 0;
         }

         for(int var5 = this.i; var5 < this.a[this.g].length && this.a[this.g][var5] != null && var5 < this.i + this.j + 1; ++var5) {
            if (((.ce)((.ce)this.a[this.g][var5])).c()) {
               if (this.h > var5) {
                  var4 = var5;
               }

               .at.a.setColor(.a.c);
               .at.a.fillRect(this.a + 7, this.l + (var5 - this.i) * this.m + 3, this.c - 7 - this.f - 7, this.m - 4);
               .at.a.setColor(0);
               .at.a.drawRect(this.a + 7, this.l + (var5 - this.i) * this.m + 3, this.c - 7 - this.f - 7, this.m - 4);
               .at.a.setColor(.a.a);
               .at.a.drawRect(this.a + 6, this.l + (var5 - this.i) * this.m + 2, this.c - 7 - this.f - 5, this.m - 2);
               .a.a(this.a + 6, this.l + (var5 - this.i) * this.m + 2, false);
            }

            this.a(this.a[this.g][var5], var5);
         }

         if (var4 >= 0) {
            .a.a(this.a + 6, this.l + (var4 - this.i) * this.m + 2, true);
         }

      }
   }

   protected void a(Object var1, int var2) {
      .ce var9 = (.ce)((.ce)var1);
      String var3;
      String var10000;
      int var10001;
      int var10002;
      int var10003;
      if (this.g != 0 && this.g != 3) {
         if (this.g != 1 && this.g != 4) {
            if (this.g != 2) {
               return;
            }

            if (var9.c()) {
               var10000 = var9.a;
               var10001 = this.k + 3;
               var10002 = this.l + (var2 - this.i) * this.m + 5;
               var10003 = 0;
            } else {
               if (!var9.h() && !var9.i()) {
                  return;
               }

               .e.a(var9.b(), .ad.a()[var9.b()].b(), this.b, this.a, this.k + 1, this.l + (var2 - this.i) * this.m + this.b() / 2 + 1, 6);
               if (var2 == this.h) {
                  .at.a.drawImage(this.f, this.k + 1, this.l + (var2 - this.i) * this.m + this.b() / 2 + 1, 6);
               }

               if (var9.h()) {
                  boolean var10 = false;
                  .v[] var11 = .bl.a().b();
                  int[] var5 = var9.a.a();
                  int[] var6 = var9.a.a;
                  if (var11 != null) {
                     for(int var7 = 0; var7 < var5.length && !var10; ++var7) {
                        if (var6[var7] > 0) {
                           for(int var8 = 0; var8 < var11.length; ++var8) {
                              if (var11[var8].a() == var5[var7]) {
                                 var10 = true;
                                 break;
                              }
                           }
                        }
                     }
                  }

                  .a.b((var9.a.d() > 1 ? var9.a.c() + "x " : "") + .ad.a(var9.b()), this.k + .e.a + 6, this.l + (var2 - this.i) * this.m + 1, this.c - this.k - .e.a - 20 - 9 - this.f + 2, this.h == var2 ? 2 : 0);
                  if (!var10 || var10 && .a.b()) {
                     .q.a((String)((int)(var9.a.a() * 100.0F) + "%"), this.a + this.c - 6 - this.f, this.l + (var2 - this.i) * this.m + 1, this.h == var2 ? 2 : 1, 18);
                  }

                  if (!var9.a.b()) {
                     .q.b(.at.a.a(133) + " " + var9.a.a(), this.k + .e.a + 6, this.l + (var2 - this.i) * this.m + 1 + 9, this.h == var2 ? 2 : 1);
                  }

                  return;
               }

               .q.b((var9.a.b > 1 ? var9.a.b + "x " : "") + .ad.a(var9.b()), this.k + .e.a + 6, this.l + (var2 - this.i) * this.m + 1, this.h == var2 ? 2 : 0);
               var10000 = .at.a.a(133) + " " + var9.a.a;
               var10001 = this.k + .e.a + 6;
               var10002 = this.l + (var2 - this.i) * this.m + 1 + 9;
               var10003 = this.h == var2 ? 2 : 1;
            }
         } else {
            if (!var9.c()) {
               if (var9.e()) {
                  .q.b(var9.a, this.k + 3, this.l + (var2 - this.i) * this.m + 5, this.h == var2 ? 2 : 1);
                  return;
               }

               if (var9.a()) {
                  .e.b(var9.a.b(), var9.a.a(), this.c, this.d, this.k + 3 + 20, this.l + (var2 - this.i) * this.m + this.b() / 2 + 1, 6);
                  .q.b(.at.a.a(532 + var9.a.b()), this.k + 20 + .e.a + 6, this.l + (var2 - this.i) * this.m + 1, this.h == var2 ? 2 : 0);
                  .q.a((String)(.a.a(var9.a.c()) + " (" + .a.a(var9.a.c() - .bl.a().c()) + ")"), this.k + 20 + .e.a + 6, this.l + (var2 - this.i) * this.m + 1 + 8, this.h == var2 ? 2 : 1, 0);
                  return;
               }

               var3 = this.g == 1 ? var9.a.m() + "" : var9.a.l() + "";
               String var4 = this.g == 1 ? var9.a.l() + "" : this.a.b(var9.a.a()) + var9.a.n() + "/" + this.a.a(var9.a.a());
               .e.a(var9.a.a(), var9.a.b(), this.b, this.a, this.k + 3 + 20, this.l + (var2 - this.i) * this.m + this.b() / 2 + 1, 6);
               if (var2 == this.h) {
                  .at.a.drawImage(this.f, this.k + 3 + 20, this.l + (var2 - this.i) * this.m + this.b() / 2 + 1, 6);
               }

               .q.a((String)var3, this.k + 20, this.l + (var2 - this.i) * this.m + 1, this.h == var2 ? 2 : 1, 18);
               .a.b(.ad.a(var9.b()), this.k + 20 + .e.a + 6, this.l + (var2 - this.i) * this.m + 1, this.c - this.k - .e.a - 40 - 9 - this.f + 2 - (this.g == 4 ? 10 : 0), this.h == var2 ? 2 : 0);
               .q.a((String).a.a(var9.a.e()), this.k + 20 + .e.a + 6, this.l + (var2 - this.i) * this.m + 1 + 8, this.h == var2 ? 2 : 1, 0);
               .q.a((String)var4, this.a + this.c - 6 - this.f, this.l + (var2 - this.i) * this.m + 1, this.h == var2 ? 2 : 1, 18);
               if (this.d && !this.a && var2 == this.h && .a.b()) {
                  .q.a((String)"<", this.k + 20, this.l + (var2 - this.i) * this.m + 1 + 8, 2, 18);
                  .q.a((String)">", this.a + this.c - 6 - this.f, this.l + (var2 - this.i) * this.m + 1 + 8, 2, 18);
               }

               return;
            }

            var10000 = var9.a + (var9.c >= 0 ? " (" + this.b[var9.c] + ")" : "");
            var10001 = this.k + 3;
            var10002 = this.l + (var2 - this.i) * this.m + 5;
            var10003 = 0;
         }
      } else {
         if (var9.e()) {
            .q.b(var9.a, this.k + 3, this.l + (var2 - this.i) * this.m + 5, this.h == var2 ? 2 : 1);
            return;
         }

         if (!var9.c()) {
            if (var9.a()) {
               .e.b(var9.a.b(), var9.a.a(), this.c, this.d, this.k + 1, this.l + (var2 - this.i) * this.m + this.b() / 2 + 1, 6);
               .q.b(.at.a.a(532 + var9.a.b()), this.k + .e.a + 5, this.l + (var2 - this.i) * this.m + 1, this.h == var2 ? 2 : 0);
               .q.a((String).a.a(var9.a.c()), this.k + .e.a + 5, this.l + (var2 - this.i) * this.m + 1 + 8, this.h == var2 ? 2 : 1, 0);
               return;
            }

            if (var9.b()) {
               .e.a(var9.a.a(), var9.a.b(), this.b, this.a, this.k + 1, this.l + (var2 - this.i) * this.m + this.b() / 2 + 1, 6);
               if (var2 == this.h) {
                  .at.a.drawImage(this.f, this.k + 1, this.l + (var2 - this.i) * this.m + this.b() / 2 + 1, 6);
               }

               var3 = .ad.a(var9.a.a());
               if (var9.a.b() == 1) {
                  var3 = var3 + " (" + var9.a.l() + ")";
               }

               .a.b(var3, this.k + .e.a + 5, this.l + (var2 - this.i) * this.m + 1, this.c - this.k - .e.a - 9 - this.f + 2, this.h == var2 ? 2 : 0);
               .q.a((String).a.a(var9.a.e()), this.k + .e.a + 5, this.l + (var2 - this.i) * this.m + 1 + 8, this.h == var2 ? 2 : 1, 0);
               return;
            }

            if (var9.d()) {
               .q.b(.at.a.a(69), this.k + .e.a + 5, this.l + (var2 - this.i) * this.m + 3, this.h == var2 ? 2 : 1);
               return;
            }

            return;
         }

         var10000 = var9.a + (var9.c >= 0 ? " (" + .bl.a().b(var9.c) + "/" + .bl.a().a(var9.c) + ")" : "");
         var10001 = this.k + 5;
         var10002 = this.l + (var2 - this.i) * this.m + 5;
         var10003 = 0;
      }

      .q.b(var10000, var10001, var10002, var10003);
   }

   public final int b() {
      return 20;
   }

   public final int c() {
      return .q.a() + 4;
   }
}
