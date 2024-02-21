package Main;

import com.mascotcapsule.micro3d.v3.Effect3D;
import com.mascotcapsule.micro3d.v3.Light;
import javax.microedition.lcdui.Image;

public final class d {
   private Main.r a;
   private .ay a;
   private Main.b a;
   private .ap a;
   private Image a;
   private Image b;
   private int a;
   private boolean a;
   private boolean b;
   private boolean c;
   private boolean d;
   private int b;
   private .ca[] a;
   private int c;
   private int d;
   private int e;
   private int f;
   private String[] a;
   private int g;
   private int h;
   private boolean e;
   private boolean f;
   private Image[][] a;
   private Main.k a;
   private .m a;
   private .m b;
   private .cc a = new .cc();
   private Effect3D a;
   private boolean[] a;

   public d() {
      this.a();
      int var1 = -1;

      for(int var2 = 0; var2 < this.a.length; ++var2) {
         .ca var3;
         if (((var3 = this.a[var2]).b() == 6 || var3.b() == 0 && var3.a() != null && var3.a().d() == 12) && var3.e()) {
            var1 = var2;
            break;
         }
      }

      if (var1 >= 0) {
         .ca[] var4 = new .ca[this.a.length - 1];
         if (var1 == 0) {
            System.arraycopy(this.a, 1, var4, 0, var4.length);
         } else {
            System.arraycopy(this.a, 0, var4, 0, var1);
            System.arraycopy(this.a, var1 + 1, var4, var1, var4.length - var1);
         }

         .bl.a().a(var4);
         this.a();
      }

      if (this.a == null) {
         this.a = new Main.k(4);
      }

      while(!this.a.a()) {
         this.a.b();
      }

      this.a = new .m(.at.a.a().b(), this.a.a.a()[0].a.b());
      this.b = new .m(.at.a.a().d(), this.a.a.a()[0].a.d() - 1000);
      Light var5;
      (var5 = new Light()).setAmbIntensity(4096);
      var5.setDirIntensity(4096);
      this.a = new Effect3D(var5, 0, true, .bg.a);
      ((.bg)this.a.a.a()[this.b].a).b = this.a;
   }

   public final void a() {
      boolean var1 = false;
      this.a = .bl.a().a();
      if (this.a != null) {
         this.a = new Image[this.a.length][];
      }

      int var2;
      for(var2 = 0; var2 < this.a.length; ++var2) {
         this.a[var2] = .e.a(this.a[var2].a());
      }

      this.d = 9;
      this.e = 21;
      this.f = .e.c + 10;
      this.a = new .ay();
      var1 = false;
      this.f = false;
      if (this.a != null) {
         this.a.c();
      }

      this.a = false;
      this.a = new boolean[20];

      for(var2 = 0; var2 < this.a.length; ++var2) {
         this.a[var2] = false;
      }

      this.a = .at.a.a();
   }

   public final void b() {
      this.a = null;
      if (this.a != null) {
         this.a.a();
      }

      this.a = null;
   }

   public final boolean a(int var1) {
      if (this.e) {
         if (!this.a.a(var1)) {
            this.e = false;
            this.a.c();
         }

         return true;
      } else if (this.c) {
         if (var1 == 256) {
            this.c = false;
         }

         if (var1 == 4) {
            this.a.a();
         } else if (var1 == 32) {
            this.a.b();
         }

         return true;
      } else {
         int var2;
         boolean var6;
         switch(this.a) {
         case 0:
            var6 = false;
            if (var1 == 2 || var1 == 32) {
               --this.b;
               if (this.b < 0) {
                  this.b = this.a.length - 1;
               }

               var6 = true;
            }

            if (var1 == 64 || var1 == 4) {
               ++this.b;
               if (this.b >= this.a.length) {
                  this.b = 0;
               }

               var6 = true;
            }

            if (var6) {
               .ag var12 = this.a.a.a()[this.b].a;
               this.a.a(.at.a.a().b(), var12.b());
               this.b.a(.at.a.a().d(), var12.d() - 1000);

               for(var2 = 0; var2 < this.a.length; ++var2) {
                  ((.bg)this.a.a.a()[var2].a).b = null;
               }

               ((.bg)this.a.a.a()[this.b].a).b = this.a;
            }

            if (var1 == 8192) {
               .at.a.a(this.a);
               return false;
            }

            if (var1 == 16384 || var1 == 256) {
               this.c();
            }
            break;
         case 1:
         case 3:
            if (var1 == 8192) {
               if (this.g >= 3) {
                  this.g -= 4;
               } else if (this.a == 1) {
                  this.a = 0;
                  this.g = 0;
               }
            }

            if (var1 == 16384 || var1 == 256) {
               var6 = false;
               if (this.g >= this.a.length - 4) {
                  var6 = true;
               } else {
                  this.g += 4;
                  if (this.a[this.b].b() != 1 && this.a == 1 && this.g >= this.a.length - 4 || this.a == 3 && this.g >= this.a.length) {
                     var6 = true;
                  }
               }

               if (var6) {
                  this.h = 0;
                  .ca var10;
                  if ((var10 = this.a[this.b]).b() == 1) {
                     this.a = 0;
                  } else {
                     this.a = this.a == 1 ? 2 : 0;
                     if (this.a == 0 && this.a) {
                        this.a = ((Main.p).at.a[1]).a;
                        if (this.a == null) {
                           ((Main.p).at.a[1]).a = new Main.r(false, (.cl)null, true, var10.g());
                           this.a = ((Main.p).at.a[1]).a;
                        } else {
                           this.a.a(false, (.cl)null, true, var10.g());
                        }

                        this.e = true;
                        this.a = false;
                     }
                  }
               }
            }
            break;
         case 2:
            var2 = this.a[this.b].a() != null && this.a[this.b].a().e() ? 5 : (this.a[this.b].b() != 2 && this.a[this.b].b() != 3 ? 3 : 4);
            if (this.d) {
               if (var1 == 8192) {
                  this.d = false;
               }

               return true;
            }

            int var3;
            .ca var5;
            if (this.b) {
               if (var1 == 4) {
                  this.a.a();
               }

               if (var1 == 32) {
                  this.a.b();
               }

               if (var1 != 256) {
                  return true;
               }

               if (this.a.a()) {
                  String var7 = .at.a.a(484 + .at.a.nextInt(3));
                  switch((var5 = this.a[this.b]).b()) {
                  case 0:
                  case 5:
                     if (.bl.b() != null && !.bl.b().a()) {
                        if (.bl.b().d() != 0 && .bl.b().d() != 3 && .bl.b().d() != 5) {
                           if (.bl.b().d() == 11) {
                              .bl.a(0);
                           }
                        } else {
                           .v[] var9;
                           if ((var9 = .bl.a().b()) != null) {
                              for(int var13 = 0; var13 < var9.length; ++var13) {
                                 if (var9[var13].c() && var9[var13].a() == 116) {
                                    .bl.a().a(var9[var13]);
                                    this.f = true;
                                    break;
                                 }
                              }
                           }
                        }

                        if (!.bl.b().a().c()) {
                           .bl.b().a().a(false);
                        }

                        .bl.b(.cl.a);
                     }

                     if (var5.a().d() == 0) {
                        .v var11;
                        (var11 = .ad.a()[116].a(var5.a().b())).a(true);
                        .bl.a().b(var11);
                     } else if (var5.a().d() == 11) {
                        .bl.a(var5.a().b());
                     }

                     if (var5.a().d() == 12) {
                        var7 = .at.a.a(490);
                     } else {
                        var7 = var7 + " " + .at.a.a(487 + .at.a.nextInt(3));
                     }

                     if (var5.a().e()) {
                        if (!var5.a) {
                           ++.bl.y;
                        }

                        if (!var5.b) {
                           ++.bl.z;
                        }
                     }

                     .bl.b(var5.a());
                     .bl.b().a(var5);
                     this.a();
                     this.f = true;
                  case 1:
                  default:
                     break;
                  case 2:
                     .bl.o(-var5.m());
                     .bl.a().b(.ad.a()[var5.k()].a(var5.l()));
                     if (var5.k() >= 132 && var5.k() < 154) {
                        .bl.d[var5.k() - 132] = true;
                     }

                     this.f = true;
                     break;
                  case 3:
                     .bl.o(-var5.m());

                     for(var3 = 0; var3 < .bl.a().length; ++var3) {
                        if (.bl.a()[var3].a() == var5.h()) {
                           .bl.a()[var3].a();
                           break;
                        }
                     }

                     this.f = true;
                     break;
                  case 4:
                     .bl.o(-var5.m());
                     .bl.a(var5.g(), true);
                     this.f = true;
                     this.a = true;
                     break;
                  case 6:
                     .bl.t += 1 + var5.j();
                     .bl.a(var5.a());
                     .bl.a = var5.c();
                     .bl.b = 600000;
                     .bl.a = var5.a();
                     if (.ba.a()) {
                        .bl.o(var5.i());
                     } else {
                        .bl.o(-var5.i());
                     }
                     break;
                  case 7:
                     .bl.a().a(var5.c());
                     .bl.o(-var5.i());
                  }

                  var5.a(true);
                  this.a = .q.a(var7, .at.f - this.f - this.d);
                  this.a = 3;
                  this.g = 0;
               }

               this.b = false;
               return true;
            }

            if (var1 == 2) {
               --this.h;
               if (this.h < 0) {
                  this.h = var2 - 1;
               }
            }

            if (var1 == 64) {
               ++this.h;
               if (this.h >= var2) {
                  this.h = 0;
               }
            }

            if (var1 == 16384 || var1 == 256) {
               var6 = false;
               switch(this.h) {
               case 0:
                  var3 = (var5 = this.a[this.b]).b();
                  String var4 = "";
                  switch(var3) {
                  case 0:
                  case 5:
                     if (var5.a().d() == 0) {
                        var3 = var5.a().b();
                        if (!.bl.a().c(var3)) {
                           var4 = .bl.a(.at.a.a(162), "" + var3, "#Q");
                           var6 = true;
                        }
                     } else if (var5.a().d() == 11 && (var3 = var5.a().b()) > .bl.a().s()) {
                        var4 = .bl.a(.at.a.a(163), "" + var3, "#Q");
                        var6 = true;
                     }

                     if (!var6) {
                        if (var5.c()) {
                           var4 = .bl.a(.bl.a(.at.a.a(499), .a.a(var5.a().f()), "#C"), .at.a.a(179 + var5.a().d()), "#M");
                        } else {
                           var4 = .at.a.a(498);
                        }
                     }
                  case 1:
                  default:
                     break;
                  case 2:
                  case 3:
                  case 4:
                     if (.bl.f() < var5.m()) {
                        this.a.a(.bl.a(.at.a.a(83), .a.a(var5.m() - .bl.f()), "#C"), false);
                        this.c = true;
                        return true;
                     }

                     if (var3 == 3) {
                        var4 = .bl.a(.bl.a(.at.a.a(503), .at.a.a(569 + .ad.a()[var5.h()].a()), "#P"), .a.a(var5.m()), "#C");
                     } else if (var3 == 4) {
                        var4 = .at.a.a(504);
                        new .av();
                        .cw[] var8 = null;
                        var8 = .av.a();
                        var4 = .bl.a(.bl.a(var4, var8[var5.g()].a(), "#S"), .a.a(var5.m()), "#C");
                     } else if (var3 == 2) {
                        var4 = .bl.a(.bl.a(.bl.a(.at.a.a(502), "" + var5.l(), "#Q"), .at.a.a(569 + var5.k()), "#P"), .a.a(var5.m()), "#C");
                     }
                     break;
                  case 6:
                     if (.bl.f() < var5.i()) {
                        this.a.a(.bl.a(.at.a.a(83), .a.a(var5.i() - .bl.f()), "#C"), false);
                        this.c = true;
                        return true;
                     }

                     if (.bl.b() != null) {
                        this.a.a(.at.a.a(424), false);
                        this.c = true;
                        return true;
                     }

                     var4 = .bl.a(.bl.a(.at.a.a(.ba.a() ? 501 : 500), "" + (1 + var5.j()), "#Q"), .a.a(var5.i()), "#C");
                     break;
                  case 7:
                     if (.bl.f() < var5.i()) {
                        this.a.a(.bl.a(.at.a.a(83), .a.a(var5.i() - .bl.f()), "#C"), false);
                        this.c = true;
                        return true;
                     }

                     var4 = .bl.a(.at.a.a(515), .a.a(var5.i()), "#C");
                  }

                  if (var6) {
                     this.a.a(var4, false);
                     this.c = true;
                  } else {
                     this.a.a(var4, true);
                     this.b = true;
                  }
                  break;
               case 1:
                  this.a = .q.a(.at.a.a(479 + .at.a.nextInt(4)), .at.f - this.f - this.d);
                  this.a = 3;
                  this.g = 0;
                  ++.bl.w;
                  break;
               case 2:
                  this.a = 1;
                  this.a = .q.a(this.a[this.b].b(), .at.f - this.f - this.d);
                  this.g = 0;
                  ++.bl.x;
                  break;
               case 3:
                  if (this.a[this.b].b() != 2 && this.a[this.b].b() != 3) {
                     this.a[this.b].b = true;
                     if (this.a[this.b].a().h() == .bl.a().b()) {
                        this.a = .q.a(.at.a.a(441), .at.f - this.f - this.d);
                        this.a = 1;
                        this.g = 0;
                     } else {
                        this.a = ((Main.p).at.a[1]).a;
                        if (this.a == null) {
                           ((Main.p).at.a[1]).a = new Main.r(true, this.a[this.b].a(), false, -1);
                           this.a = ((Main.p).at.a[1]).a;
                        } else {
                           this.a.a(true, this.a[this.b].a(), false, -1);
                        }

                        this.e = true;
                     }
                  } else {
                     if (this.a == null) {
                        this.a = new Main.b();
                        this.a = .ai.a("/data/interface/items.png");
                        this.b = .ai.a("/data/interface/item_types.png");
                     }

                     if (this.a[this.b].b() == 2) {
                        this.a.a(new .ce(.ad.a()[this.a[this.b].k()]), this.a, this.b, (Image)null, (Image)null, false);
                     } else {
                        for(var3 = 0; var3 < .bl.a().length; ++var3) {
                           if (.bl.a()[var3].a() == this.a[this.b].h()) {
                              this.a.a(new .ce(.ad.a()[.bl.a()[var3].a()]), this.a, this.b, (Image)null, (Image)null, false);
                              break;
                           }
                        }
                     }

                     this.d = true;
                  }
                  break;
               case 4:
                  this.a[this.b].a = true;
                  var3 = (int)((float)this.a[this.b].a().i() / 10.0F * 5.0F);
                  this.a = .q.a(.at.a.a(var3 + 443), .at.f - this.f - this.d);
                  this.a = 1;
                  this.g = 0;
               }

               if (this.a[this.b].c()) {
                  this.a[this.b].a(1);
               }
            }
         }

         return true;
      }
   }

   public final void a(int var1, int var2) {
      if (this.d) {
         this.a.a();
         .a.a("", .at.a.a(65));
      } else if (this.e) {
         this.a.a(var1, var2);
      } else {
         .a.d();
         .at.a.setClip(1, 15, .at.f - 1, .at.g - 16);
         this.a.a(var2);
         this.b.a(var2);
         var2 = this.a.a();
         int var3 = this.b.a();
         .at.a.a().c(var2, 500, var3);
         if (this.a != null) {
            this.a.a(var1);
         }

         .at.a.setClip(0, 0, .at.f, .at.g);
         .a.a(.at.a.a(218), false);
         Main.d var5 = this;
         if (this.a == 0) {
            this.c = .at.g - 16 - (this.a.length + 1) * .q.a() + 2;
         } else if (this.a == 2) {
            if (this.a[this.b].b() != 2 && this.a[this.b].b() != 3) {
               if (this.a[this.b].a() != null && this.a[this.b].a().e()) {
                  this.c = .at.g - 16 - 6 * .q.a() + 2;
               } else {
                  this.c = .at.g - 16 - 4 * .q.a() + 2;
               }
            } else {
               this.c = .at.g - 16 - 5 * .q.a() + 2;
            }
         } else {
            this.c = .at.g;
         }

         if (this.a == 2) {
            .a.a((String)null, 3, this.c, .at.f - 7, .at.g - this.c - 16 - 3);
         }

         if (this.a != 0) {
            .a.a((String)null, 3, 15, .at.f - 7, .e.d + 7);
            .e.a(this.a[this.b], 7, 19, 0);
         }

         if (this.a == 0) {
            .a.a(.at.a.a(494), .at.a.a(65));
            this.a = this.a.a.a()[this.b].a.b(this.a);
            .cc var10000 = this.a;
            var10000.a -= 100;
            var10000 = this.a;
            var10000.b += 500;
            .at.a.a().a(this.a);
            .q.b(!this.a[this.b].d() && !this.a[this.b].b() ? .at.a.a(229 + this.a[this.b].c()) : this.a[this.b].a, this.a.a, this.a.b, 2);
            if (this.a[this.b].d()) {
               .q.b(this.a[this.b].a() != null ? .at.a.a(179 + this.a[this.b].a().d()) : (this.a[this.b].b() == 6 ? .at.a.a(146) : (this.a[this.b].b() == 2 ? .at.a.a(145) : (this.a[this.b].b() == 7 ? .at.a.a(514) : ""))), this.a.a, this.a.b + .q.a(), 1);
            }
         } else {
            var2 = 0;

            for(var3 = this.g; var3 < var5.g + 4 && var3 < var5.a.length; ++var3) {
               String var4 = var3 != var5.a.length - 1 && var3 == var5.g + 4 - 1 ? ".." : "";
               .q.b(var5.a[var3] + (.a.b() ? var4 : ""), var5.f, var5.e + var2++ * .q.a(), 1);
            }

            if (var5.a != 1 && var5.a != 3) {
               .q.b(.at.a.a(495), var5.d, var5.c + 3 + 0 * .q.a(), var5.h == 0 ? 2 : 1);
               .q.b(.at.a.a(496), var5.d, var5.c + 3 + 1 * .q.a(), var5.h == 1 ? 2 : 1);
               .q.b(.at.a.a(497), var5.d, var5.c + 3 + 2 * .q.a(), var5.h == 2 ? 2 : 1);
               if ((var3 = var5.a[var5.b].b()) != 2 && var3 != 3) {
                  if (var3 == 0 && var5.a[var5.b].a().e()) {
                     .q.b(.at.a.a(440), var5.d, var5.c + 3 + 3 * .q.a(), var5.h == 3 ? 2 : 1);
                     .q.b(.at.a.a(442), var5.d, var5.c + 3 + 4 * .q.a(), var5.h == 4 ? 2 : 1);
                  }
               } else {
                  .q.b(.at.a.a(415), var5.d, var5.c + 3 + 3 * .q.a(), var5.h == 3 ? 2 : 1);
               }

               .a.a(.at.a.a(253), "");
            } else {
               .a.a(.at.a.a(73), var5.g > 0 ? .at.a.a(74) : (var5.a == 1 ? .at.a.a(246) : ""));
            }
         }

         if (this.b || this.c) {
            this.a.c();
         }

      }
   }

   private void c() {
      .ca var1;
      String var8;
      if (!(var1 = this.a[this.b]).c()) {
         var8 = null;
         if (var1.f() > 0) {
            var8 = .at.a.a(492);
         } else {
            if (!var1.e()) {
               ++.bl.s;
               if (var1.b() == 4) {
                  var8 = .at.a.a(505 + .at.a.nextInt(2));
                  var8 = var8 + " " + .at.a.a(516 + var1.a());
                  var8 = var8 + " " + .at.a.a(508);
                  new .av();
                  .cw[] var11 = .av.a();
                  var8 = .bl.a(.bl.a(var8, var11[var1.g()].a(), "#S"), .a.a(var1.m()), "#C");
               } else {
                  var8 = .at.a.a(505 + .at.a.nextInt(2));
                  var8 = var8 + " " + .at.a.a(516 + var1.a());
                  var8 = .bl.a(.bl.a(var8 + " " + .at.a.a(507), .at.a.a(569 + .ad.a()[var1.h()].a()), "#N"), .a.a(var1.m()), "#C");
               }

               var8 = var8 + "\n" + .at.a.a(475 + .at.a.nextInt(3));
               this.a = .q.a(var8, .at.f - this.f - this.d);
               this.a[this.b].a(var8);
               this.g = 0;
               this.a = 1;
               return;
            }

            var8 = .at.a.a(492);
         }

         this.a = .q.a(var8, .at.f - this.f - this.d);
         this.g = 0;
         this.a = 3;
      } else {
         if (var1.d() && var1.b() != 7) {
            if (var1.e()) {
               var8 = .at.a.a(var1.b() == 5 ? 491 : (var1.b() != 6 && (var1.a() == null || var1.a().d() != 12) ? 492 : 493));
               this.a = .q.a(var8, .at.f - this.f - this.d);
               this.g = 0;
               this.a = 3;
               return;
            }

            this.a = .q.a(var1.b(), .at.f - this.f - this.d);
         } else {
            ++.bl.s;
            int var2;
            boolean var3 = (var2 = var1.b()) != 1 && var2 != 7;
            boolean var4 = var2 == 0 || var2 == 5;
            var8 = var3 ? .at.a.a(390 + .at.a.nextInt(6)) : "";
            String var9 = var3 ? .at.a.a(396 + .at.a.nextInt(2)) : "";
            String var10 = var4 ? .at.a.a(398 + .at.a.nextInt(6)) : "";
            String var5 = "";
            var9 = .bl.a(var9, var1.a(), "#N");
            .be var6 = new .be();
            int var7;
            switch(var1.b()) {
            case 0:
               var5 = var5 + .at.a.a(425 + var1.a().d());
               if (var1.a().d() == 5 || var1.a().d() == 3) {
                  var5 = var5 + " " + .at.a.a(438);
               }

               var5 = .bl.a(.bl.a(.bl.a(.bl.a(var5, .at.a.a(448 + var1.a().a()), "#P"), "" + var1.a().b(), "#Q"), var1.a().b(), "#S"), var1.a().c(), "#N");
               var5 = .bl.a(var5 + "\n" + .at.a.a(404 + .at.a.nextInt(3)), .a.a(var1.a().f()), "#C");
               break;
            case 1:
               boolean var15 = false;
               boolean var16 = false;

               do {
                  var7 = .at.a.nextInt(20);
                  if (!this.a[var7]) {
                     this.a[var7] = true;
                     var16 = true;
                  }
               } while(!var16);

               if (var1.c() != 0 && var7 == 16) {
                  var7 = 4;
               }

               var5 = .bl.a(.bl.a(.bl.a(.at.a.a(var7 + 455), .ad.a(), "#S"), var1.a(), "#N"), .at.a.a(723 + .at.a.nextInt(10)), "#ORE");
               break;
            case 2:
               var5 = var5 + .at.a.a(407 + .at.a.nextInt(4));
               var5 = .bl.a(.bl.a(.bl.a(var5 + "\n" + .at.a.a(412 + .at.a.nextInt(2)), "" + var1.l(), "#Q"), .at.a.a(569 + var1.k()), "#P"), .a.a(var1.m()), "#C");
               if (var1.l() > 1) {
                  var5 = .bl.a(var5 + " " + .at.a.a(414), .a.a(var1.m() / var1.l()), "#C");
               }
            case 3:
            case 4:
            default:
               break;
            case 5:
               var1.a(var6.a(var1));
               var5 = .bl.a(.bl.a(.bl.a(var5 + .at.a.a(416 + .at.a.nextInt(2)), "" + var1.a().b(), "#Q"), .at.a.a(569 + var1.a().a()), "#P"), .a.a(var1.a().f()), "#C");
               break;
            case 6:
               var5 = .bl.a(var5 + .at.a.a((.ba.a() ? 421 : 418) + var1.j()), .a.a(var1.i()), "#C");
               if (var1.j() > 0) {
                  var5 = .bl.a(var5, "" + var1.a(1), "#W");
               }
               break;
            case 7:
               int var13 = var1.c();
               int var12 = .bl.a().a(var13 != 2 && var13 != 3 ? 0 : 1);
               if (!.bl.a().a(var13)) {
                  var5 = .at.a.a(513);
                  this.a = .q.a(var5, .at.f - this.f - this.d);
                  this.g = 0;
                  this.a = 3;
                  return;
               }

               var7 = (int)((float).g.e(var12) / 100.0F * 16000.0F);
               var12 = var13 == 2 ? 509 : (var13 == 3 ? 510 : (var13 == 0 ? 511 : 512));
               var5 = .bl.a(.at.a.a(var12), .a.a(var7), "#C");
               var1.c(var7);
            }

            var1.a(var5);
            if (var1.b() == 1) {
               this.a = .q.a(var5, .at.f - this.f - this.d);
               var1.a(1);
            } else if (var1.b() == 7) {
               this.a = .q.a(var5, .at.f - this.f - this.d);
            } else {
               String var14;
               if (var1.a() != null && var1.a().d() == 12) {
                  var5 = .bl.a(.at.a.a(437), .a.a(var1.a().f()), "#C");
                  var1.a(var5);
                  var14 = "\n" + .at.a.a(475 + .at.a.nextInt(3));
                  this.a = .q.a(var5 + var14, .at.f - this.f - this.d);
               } else {
                  var5 = "\n" + var5;
                  var14 = "\n" + .at.a.a(475 + .at.a.nextInt(3));
                  this.a = .q.a(var8 + " " + var9 + " " + var10 + var5 + var14, .at.f - this.f - this.d);
               }
            }
         }

         var1.b(.bl.a().a());
         var1.c(.bl.a().a());
         this.a = 1;
         this.g = 0;
      }
   }

   public final boolean a() {
      return this.f;
   }

   public final void a(boolean var1) {
      this.f = false;
   }
}
