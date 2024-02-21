import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.game.Sprite;

public final class bw {
   private int[] a;
   private Image a;
   private Image b;
   private Image c;
   private Image d;
   private Image e;
   private Image f;
   private Image g;
   private Image h;
   private Image i;
   private Image j;
   private Image k;
   private Image l;
   private Image m;
   private Image n;
   private Image o;
   private Image p;
   private Image q;
   private Image r;
   private Image s;
   private Image t;
   private Image u;
   private Image v;
   private Image w;
   private Image x;
   private Sprite a;
   private Sprite b;
   private Sprite c;
   private Sprite d;
   private int a;
   private int b;
   private int c;
   private int d;
   private int e;
   private int f;
   private boolean b;
   private p[] a;
   private p[] b;
   private p[] c;
   private ag[] a;
   private bf a;
   private db a;
   private cm a = new cm();
   private cc a = new cc();
   private cc b = new cc();
   private cc c = new cc();
   private cc d = new cc();
   private bj a = new bj();
   private int g;
   private String[] a = new String[4];
   private String a;
   private int h;
   private int i;
   private int j;
   private int k;
   public p a;
   private p e;
   private p f;
   private p g;
   private ag b;
   public ag a;
   public p b;
   public p c;
   public p d;
   public boolean a;
   private boolean c;
   private int l;
   private boolean d;
   private boolean e;
   private boolean f;
   private boolean g;
   private boolean h;
   private boolean i;
   private boolean j;
   private int m;
   private int n;
   private int o;

   public bw(db var1) {
      this.a = var1;
      this.c = at.f / 2;
      this.d = at.g / 2;
      this.e = (this.c - 5) * (this.c - 5);
      this.f = (this.d - 20) * (this.d - 20);
      this.a[0] = (bl.c() ? at.a.a(238) : bl.a().a()) + " " + at.a.a(40);
      this.a[1] = at.a.a(271);
      this.a[2] = "";
      this.a[3] = at.a.a(269);
      ag[] var5;
      if ((var5 = var1.a()) != null) {
         for(int var2 = 0; var2 < var5.length; ++var2) {
            if (var5[var2] instanceof l) {
               ((l)var5[var2]).a(this);
            }
         }
      }

      try {
         String var6 = "/data/interface/hud_lockon_neutral.png";
         this.f = ai.a("/data/interface/hud_lockon_neutral.png", true);
         var6 = "/data/interface/hud_radaricon_neutral.png";
         this.g = ai.a("/data/interface/hud_radaricon_neutral.png", true);
         var6 = "/data/interface/hud_radaricon_neutral_lock.png";
         this.n = ai.a("/data/interface/hud_radaricon_neutral_lock.png", true);
         var6 = "/data/interface/hud_lockon_enemy.png";
         this.a = ai.a("/data/interface/hud_lockon_enemy.png", true);
         var6 = "/data/interface/hud_radaricon_enemy.png";
         this.b = ai.a("/data/interface/hud_radaricon_enemy.png", true);
         var6 = "/data/interface/hud_radaricon_enemy_lock.png";
         this.l = ai.a("/data/interface/hud_radaricon_enemy_lock.png", true);
         var6 = "/data/interface/hud_lockon_friend.png";
         this.c = ai.a("/data/interface/hud_lockon_friend.png", true);
         var6 = "/data/interface/hud_radaricon_friend.png";
         this.d = ai.a("/data/interface/hud_radaricon_friend.png", true);
         var6 = "/data/interface/hud_radaricon_friend_lock.png";
         this.m = ai.a("/data/interface/hud_radaricon_friend_lock.png", true);
         var6 = "/data/interface/hud_lockon_waypoint.png";
         this.e = ai.a("/data/interface/hud_lockon_waypoint.png", true);
         var6 = "/data/interface/hud_lockon_waypoint.png";
         this.j = ai.a("/data/interface/hud_lockon_waypoint.png", true);
         var6 = "/data/interface/hud_radaricon_neutral.png";
         this.k = ai.a("/data/interface/hud_radaricon_neutral.png", true);
         var6 = "/data/interface/hud_bars.png";
         Image var7 = ai.a("/data/interface/hud_bars.png", true);
         this.d = new Sprite(var7, 2, var7.getHeight());
         var6 = "/data/interface/logos_small.png";
         Image var9 = ai.a("/data/interface/logos_small.png", true);
         this.a = new Sprite(var9, var9.getHeight(), var9.getHeight());
         this.a.defineReferencePixel(var9.getHeight(), var9.getHeight());
         var6 = "/data/interface/bracket_enemy_far.png";
         this.h = ai.a("/data/interface/bracket_enemy_far.png", true);
         var6 = "/data/interface/bracket_friend_far.png";
         this.i = ai.a("/data/interface/bracket_friend_far.png", true);
         var6 = "/data/interface/bracket_box.png";
         this.o = ai.a("/data/interface/bracket_box.png", true);
         var6 = "/data/interface/hud_crate.png";
         this.p = ai.a("/data/interface/hud_crate.png", true);
         var6 = "/data/interface/hud_spacejunk.png";
         this.r = ai.a("/data/interface/hud_spacejunk.png", true);
         var6 = "/data/interface/hud_asteroid.png";
         this.q = ai.a("/data/interface/hud_asteroid.png", true);
         var6 = "/data/interface/hud_crate_void.png";
         this.s = ai.a("/data/interface/hud_crate_void.png", true);
         var6 = "/data/interface/hud_vortex.png";
         this.t = ai.a("/data/interface/hud_vortex.png", true);
         var6 = "/data/interface/hud_waypoint.png";
         this.u = ai.a("/data/interface/hud_waypoint.png", true);
         var6 = "/data/interface/menu_map_jumpgate.png";
         this.v = ai.a("/data/interface/menu_map_jumpgate.png", true);
         var6 = "/data/interface/hud_scanprocess_anim_png24.png";
         var9 = ai.a("/data/interface/hud_scanprocess_anim_png24.png", true);
         this.b = new Sprite(var9, var9.getHeight(), var9.getHeight());
         this.b.defineReferencePixel(var9.getHeight() / 2, var9.getHeight() / 2);
         var6 = "/data/interface/hud_meteor_class.png";
         var9 = ai.a("/data/interface/hud_meteor_class.png", true);
         this.c = new Sprite(var9, 11, 11);
         this.c.defineReferencePixel(11, 11);
         v var10 = bl.a().a(19);
         v var8 = bl.a().a(17);
         v var3 = bl.a().a(13);
         this.g = var10 != null;
         if (var8 != null) {
            this.f = true;
            this.d = var8.a(29) == 1;
            this.e = var8.a(28) == 1;
            this.n = var8.a(27);
         } else {
            this.f = false;
            this.d = false;
            this.e = false;
            this.n = 8000;
         }

         if (var3 != null) {
            this.h = true;
            this.i = var3.a(21) == 1;
            this.m = var3.a(22);
         } else {
            this.h = false;
            this.m = 0;
            this.i = false;
         }

         this.j = bl.a() > 0;
         this.o = 0;
         this.a = true;
         this.a = new int[5];

         for(int var11 = 0; var11 < this.a.length; ++var11) {
            this.a[var11] = -1;
         }

      } catch (Exception var4) {
         var4.printStackTrace();
      }
   }

   public final void a() {
      this.a = null;
      this.b = null;
      this.a = null;
      this.a = null;
      this.c = null;
      this.d = null;
      this.a = null;
   }

   private void a(ap var1, cc var2) {
      this.b.a(var2);
      this.a = var1.a((cm)this.a).b(this.b, this.a);
      this.a.b = -this.a.b;
      this.a.c = -this.a.c;
      var1.a(this.b);
      this.a = this.b.a;
      this.b = this.b.b;
      this.b = this.a <= at.f && this.a >= 0 && this.b <= at.g && this.b >= 0;
      if (this.a.c < 0 || !this.b) {
         cc var4 = this.a;
         int var3 = this.b;
         int var9 = this.a;
         float var5 = (float)(this.c - var9);
         float var6 = (float)(this.d + -10 - var3);
         float var8;
         if ((var8 = var5 * var5 / (float)this.e + var6 * var6 / (float)this.f) >= 0.0F) {
            float var7 = (float)g.a((long)(var8 * 4096.0F)) / 4096.0F;
            var8 = (var8 - var7) / var8;
            if (0.0F <= var8 && var8 <= 1.0F) {
               var4.a = (int)((float)var9 + var5 * var8);
               var4.b = (int)((float)var3 + var6 * var8);
            }
         }

         this.a = var4;
         this.a = this.a.a;
         this.b = this.a.b;
      }

   }

   private void a(ap var1, p var2) {
      this.a(var1, var2.a(this.b));
   }

   public final void a(aa var1, ap var2, b var3, x var4, int var5) {
      if (this.a) {
         cl var6;
         boolean var22 = !(var6 = bl.a()).a() && var6.d() != 11 && var6.d() != 0;
         boolean var7 = this.a.a().c();
         boolean var8 = bl.c();
         this.a = this.a.a();
         this.b = this.a.b();
         this.a = this.a.a();
         this.c = this.a.c();
         this.a = this.a.a().a();
         if (!var8) {
            this.c = this.a.a().h() && !this.a.a().t() && this.a.a().a() == this.a.a().a()[bl.a().a(bl.a().a()[this.l])];
         } else {
            this.c = this.a.a().h() && !this.a.a().t();
         }

         if (this.a != null && this.a.a() != null) {
            this.a(var2, (p)this.a.a());
            this.a = this.a(this.a.a().l, this.a.a().m, this.a.a().n, var1);
            if (this.b) {
               at.a.drawImage(this.e, this.a, this.b, 3);
               q.b(this.a, this.a - 8, this.b + 8, 1);
            } else if (this.f) {
               at.a.drawImage(this.u, this.a, this.b, 3);
            }
         }

         boolean var9 = this.g != null || this.b != null || this.a != null;
         boolean var10 = false;
         int var12;
         int var13;
         if (this.b != null) {
            for(int var11 = 0; var11 < this.b.length; ++var11) {
               if (var11 != 2 && this.b[var11] != null && this.b[var11].b()) {
                  this.a(var2, this.b[var11]);
                  if (this.b) {
                     if (!var9 && !var10 && !var7 && var11 != 3) {
                        var12 = da.b.a - 30;
                        var13 = da.b.b - 30;
                        if (this.a > var12 && this.a < var12 + 60 && this.b > var13 && this.b < var13 + 60) {
                           if (this.c != this.b[var11]) {
                              this.k = 0;
                           }

                           this.c = this.b[var11];
                           var10 = true;
                        }
                     }

                     this.c = var1.a(this.c);
                     this.d = this.b[var11].a.a(this.d);
                     if (var11 != 3) {
                        at.a.drawImage(this.j, this.a, this.b, 3);
                     }

                     q.b(this.a[var11], var11 == 0 ? this.a + 25 : this.a + 5, this.b, 0);
                     if (var11 < 2) {
                        if (var11 == 0 && !var8) {
                           q.b(at.a.a(37) + ": " + bl.a().d(), var11 == 0 ? this.a + 25 : this.a + 5, this.b + 10, 1);
                           this.a = this.a(this.b[var11].e, this.b[var11].f, this.b[var11].g, var1);
                           q.b(this.a, var11 == 0 ? this.a + 25 : this.a + 5, this.b + 20, 1);
                        } else {
                           this.a = this.a(this.b[var11].e, this.b[var11].f, this.b[var11].g, var1);
                           q.b(this.a, var11 == 0 ? this.a + 25 : this.a + 5, this.b + 10, 1);
                        }
                     }
                  } else if (var11 == 3) {
                     at.a.drawImage(this.t, this.a, this.b, 3);
                  }
               }
            }

            if (!var7) {
               if (this.d != null) {
                  if (this.d.e()) {
                     this.d = null;
                  }

                  this.d = null;
               }

               if (var10 && !this.a.a().q() && !this.a.a().i()) {
                  this.k += var5;
                  if (this.k > this.n) {
                     this.d = this.c;
                  }

                  if (this.k > 0) {
                     if (this.c != null && !this.c.equals(this.d)) {
                        this.b.setFrame((int)((float)(this.b.getRawFrameCount() - 2) * ((float)this.k / (float)this.n)));
                        this.b.setRefPixelPosition(da.b.a, da.b.b);
                        this.b.paint(at.a);
                     } else if (a.b()) {
                        this.b.setFrame(this.b.getRawFrameCount() - 2);
                        this.b.setRefPixelPosition(da.b.a, da.b.b);
                        this.b.paint(at.a);
                     }
                  }
               } else {
                  if (this.d == null) {
                     this.c = null;
                  }

                  this.k = 0;
               }
            }
         }

         var9 = this.g != null || this.b != null || this.d != null;
         boolean var26 = false;
         boolean var14;
         boolean var15;
         int var18;
         int var19;
         if (this.a != null) {
            for(var12 = 1; var12 < this.a.length; ++var12) {
               this.a(var2, this.a[var12].b(this.b));
               if (this.b) {
                  int[] var28;
                  var8 = (var28 = bl.a().a())[var12 - 1] == bl.a().b();
                  var14 = false;
                  if (bl.a().i() == var12 - 1 && !var8) {
                     at.a.drawImage(this.v, this.a + 10, this.b - 10, 0);
                     var14 = true;
                  }

                  var15 = false;
                  cl var16 = bl.c();
                  cl var17 = bl.b();
                  if (var16 != null && !var16.a() && var28[var12 - 1] == var16.h() && !var8) {
                     if (this.x == null) {
                        this.x = ai.a("/data/interface/menu_map_mainmission.png");
                     }

                     at.a.drawImage(this.x, this.a + 10 + (var14 ? 14 : 0), this.b - 10, 0);
                     var15 = true;
                  }

                  if (var17 != null && !var17.a() && var28[var12 - 1] == var17.h() && !var8) {
                     if (this.w == null) {
                        this.w = ai.a("/data/interface/menu_map_sidemission.png");
                     }

                     at.a.drawImage(this.w, this.a + 10 + (var14 ? 14 : 0), this.b - 10, 0);
                     var15 = true;
                  }

                  if (!var9 && !var26 && !var7) {
                     var18 = f.a == var12 ? 100 : 30;
                     var19 = da.b.a - (var18 >> 1);
                     int var20 = da.b.b - (var18 >> 1);
                     if (this.a > var19 && this.a < var19 + var18 && this.b > var20 && this.b < var20 + var18) {
                        if (var12 != f.a) {
                           if (this.b != this.a[var12]) {
                              this.j = 0;
                           }

                           this.l = var12 - 1;
                           this.b = this.a[var12];
                           var26 = true;
                        }

                        q.b(bl.a()[var12 - 1], this.a + 10 + (var14 ? 14 : 0) + (var15 ? 14 : 0), this.b - 10, 0);
                     }
                  }
               }
            }

            if (!var10 && !var7) {
               if (this.a != null) {
                  this.a = null;
               }

               if (var26 && !this.a.a().q()) {
                  this.j += var5;
                  if (this.j > this.n) {
                     if (var22) {
                        var4.a(21, this.a.a());
                     } else {
                        this.a = this.b;
                        if (this.c) {
                           this.a.a().a(var3);
                        }
                     }
                  }

                  if (this.j > 0 && !var22) {
                     if (this.b != null && !this.b.equals(this.a)) {
                        this.b.setFrame((int)((float)(this.b.getRawFrameCount() - 2) * ((float)this.j / (float)this.n)));
                        this.b.setRefPixelPosition(da.b.a, da.b.b);
                        this.b.paint(at.a);
                     } else if (!this.a.a().t() && a.b()) {
                        this.b.setFrame(this.b.getRawFrameCount() - 2);
                        this.b.setRefPixelPosition(da.b.a, da.b.b);
                        this.b.paint(at.a);
                     }
                  }
               } else {
                  if (this.a == null) {
                     this.b = null;
                  }

                  this.j = 0;
               }
            }
         }

         if (this.e != null && (this.e.f() || this.e.e())) {
            this.e = null;
            var9 = false;
            this.a = null;
         }

         boolean var27 = false;
         int var34;
         int var35;
         if (this.f && this.a != null) {
            for(var13 = 0; var13 < this.a.length; ++var13) {
               p var23;
               if ((var23 = this.a[var13]).a.d() && (!var23.f() || var23.d)) {
                  this.a(var2, var23);
                  var14 = var23.d && (var23.e() || var23.f());
                  if (!var23.e() && !var23.f() || var23.d) {
                     var15 = var23.equals(this.e);
                     az[] var31;
                     if (!var23.e() && this.a.a().a.a(1) && (var31 = this.a.a().a.a[1]) != null) {
                        at.a.setStrokeStyle(1);

                        for(var35 = 0; var35 < var31.length; ++var35) {
                           az var38;
                           if ((var38 = var31[var35]) != null && (var38.f == 7 || var38.f == 6) && var38.b) {
                              this.c.a(var38.a[0]);
                              this.d = var23.a(this.d);
                              this.d.c(this.c);
                              if ((var19 = this.d.a()) < var38.a()) {
                                 float var39;
                                 if ((var39 = (float)var19 / (float)var38.a()) > 1.0F) {
                                    var39 = 1.0F;
                                 }

                                 int var21 = -16777216 | (int)(var39 * 255.0F) << 16 | (int)((1.0F - var39) * 255.0F) << 8;
                                 at.a.setColor(var21);
                                 at.a.a().a(this.c);
                                 this.d.a = this.a;
                                 this.d.b = this.b;
                                 this.d.c = 0;
                                 this.d.c(this.c);
                                 this.d.c = 0;
                                 cc var10000 = this.d;
                                 var10000.a <<= 12;
                                 var10000 = this.d;
                                 var10000.b <<= 12;
                                 this.d.a();
                                 this.d.a(16);
                                 this.c.b(this.d);
                                 at.a.drawLine(this.a, this.b, this.c.a, this.c.b);
                              }
                           }
                        }

                        at.a.setStrokeStyle(0);
                     }

                     if (!var23.b && !var23.c && !var14 && var23.a.a) {
                        ++this.o;
                     }

                     Image var33;
                     if (!this.b) {
                        if (var14) {
                           at.a.drawImage(this.k, this.a, this.b, 3);
                           at.a.drawImage(this.a[var13].c ? this.r : (this.a[var13].d == 9 ? this.s : this.p), this.a, this.b, 3);
                        } else {
                           var33 = var23.a.a ? (var15 ? this.l : this.b) : (var23.a.b ? (var15 ? this.m : this.d) : (var15 ? this.n : this.g));
                           at.a.drawImage(var33, this.a, this.b, 3);
                        }
                     } else {
                        label1159: {
                           this.c = var1.a(this.c);
                           this.d = var23.a.a(this.d);
                           Image var10001;
                           Graphics var40;
                           if (this.c.a - this.d.a <= 24000 && this.c.a - this.d.a >= -24000 && this.c.b - this.d.b <= 24000 && this.c.b - this.d.b >= -24000 && this.c.c - this.d.c <= 24000 && this.c.c - this.d.c >= -24000 && var23.a() != 9996) {
                              if (var14) {
                                 var40 = at.a;
                                 var10001 = this.o;
                              } else {
                                 var34 = var23.a.a ? 0 : (var23.a.b ? 6 : 4);
                                 this.g = (int)((float)var23.a.g() / 100.0F * 16.0F);
                                 this.d.setFrame(var34 + 1);
                                 this.d.setPosition(this.a + 8 + 2, this.b - 8);
                                 this.d.paint(at.a);
                                 this.d.setFrame(var34);
                                 at.a.setClip(0, this.b - 8 + 16 - this.g, at.f, this.g);
                                 this.d.paint(at.a);
                                 at.a.setClip(0, 0, at.f, at.g);
                                 this.g = (int)((float)var23.a.h() / 100.0F * 16.0F);
                                 this.d.setFrame(3);
                                 this.d.setPosition(this.a + 8 + 7, this.b - 8);
                                 this.d.paint(at.a);
                                 this.d.setFrame(2);
                                 at.a.setClip(0, this.b - 8 + 16 - this.g, at.f, this.g);
                                 this.d.paint(at.a);
                                 at.a.setClip(0, 0, at.f, at.g);
                                 if (!var15) {
                                    break label1159;
                                 }

                                 var40 = at.a;
                                 var10001 = var23.a.a ? this.a : (var23.a.b ? this.c : this.f);
                              }
                           } else {
                              var33 = var14 ? this.o : (var15 ? (var23.a.a ? this.h : (var23.a.b ? this.i : this.f)) : (var23.a.a ? this.b : (var23.a.b ? this.d : this.g)));
                              var40 = at.a;
                              var10001 = var33;
                           }

                           var40.drawImage(var10001, this.a, this.b, 3);
                        }

                        if (!this.a.a().i() && (!var23.c || var14) && (!var27 || var23.j) && (var14 && var23.e() || !var14)) {
                           if (var14 && this.b == null && this.i) {
                              this.b = var23;
                              var27 = true;
                              this.a = var23;
                           } else {
                              var34 = da.b.a - 30;
                              var35 = da.b.b - 30;
                              if (this.a > var34 && this.a < var34 + 60 && this.b > var35 && this.b < var35 + 60 && (var14 && this.h || this.j && !this.c)) {
                                 if (this.a != var23) {
                                    this.h = 0;
                                 }

                                 this.a = var23;
                                 var27 = true;
                              }
                           }
                        }
                     }
                  }
               }
            }

            if (!this.a.a().q() && !var7 && !var9) {
               boolean var29 = this.a != null && this.a.d && (this.a.e() || this.a.f());
               if (this.e != null && (this.e.f() || this.e.e())) {
                  this.e = null;
               }

               if (var27) {
                  this.h += var5;
                  if (this.h > (!var29 && !this.a.j ? this.n : this.m)) {
                     if (!var29 && !this.a.j) {
                        if (this.e != this.a) {
                           this.e = this.a;
                           if (this.d) {
                              this.c = var1.a(this.c);
                              this.d = this.e.a.a(this.d);
                              if (this.c.a - this.d.a < 24000 || this.c.a - this.d.a > -24000 || this.c.b - this.d.b < 24000 || this.c.b - this.d.b > -24000 || this.c.c - this.d.c < 24000 || this.c.c - this.d.c > -24000) {
                                 int[] var24;
                                 if ((var24 = this.e.a) != null) {
                                    for(int var30 = 0; var30 < var24.length; var30 += 2) {
                                       if (var24[var30 + 1] > 0) {
                                          var4.a(var24[0], 1, false, false, false, true);
                                          break;
                                       }
                                    }
                                 } else {
                                    var4.a(22, this.a.a());
                                 }
                              }
                           }
                        }
                     } else {
                        this.b = this.a;
                        if (!this.h) {
                           var4.a(9, this.a.a());
                           this.b = null;
                        }
                     }

                     this.h = 0;
                  }

                  if (this.h > (!var29 && !this.a.j ? 0 : 500) && this.a != null && !this.a.equals(!var29 && !this.a.j ? this.e : this.b)) {
                     this.b.setFrame((int)((float)(this.b.getRawFrameCount() - 2) * ((float)(this.h - (!var29 && !this.a.j ? 0 : 500)) / (float)(!var29 && !this.a.j ? this.n : this.m - 500))));
                     this.b.setRefPixelPosition(da.b.a, da.b.b);
                     this.b.paint(at.a);
                  }
               } else {
                  if (var29 && this.b == null || !var29 && this.e == null) {
                     this.a = null;
                  }

                  this.h = 0;
               }
            }
         }

         var13 = 0;

         for(int var25 = 0; var25 < this.a.length; ++var25) {
            this.a[var25] = -1;
         }

         var9 = this.a != null && this.e == null || this.b != null || this.d != null || this.a != null;
         var8 = false;
         if (!this.a.a().v() && this.c != null) {
            var14 = false;
            if (this.e) {
               var14 = this.a.a(this.a.a().a());
            }

            int var32;
            boolean var37;
            for(var32 = 0; var32 < this.c.length; ++var32) {
               p var36;
               if ((var36 = this.c[var32]).d && (var36.e() || var36.f()) || !var36.e() && !var36.f()) {
                  this.a(var2, var36);
                  var37 = var36.d && (var36.e() || var36.f());
                  if (!this.b) {
                     if (var37) {
                        at.a.drawImage(this.k, this.a, this.b, 3);
                        at.a.drawImage(this.q, this.a, this.b, 3);
                     }
                  } else {
                     if (!var9 && !var27 && !var8 && !var7 && ((cn)var36).b() > 15 && !this.c) {
                        if (var37 && this.b == null && this.i) {
                           this.b = var36;
                           var8 = true;
                           this.a = var36;
                        } else {
                           var18 = da.b.a - 20;
                           var19 = da.b.b - 20;
                           if (this.a > var18 && this.a < var18 + 40 && this.b > var19 && this.b < var19 + 40 && !((cn)var36).m && this.j && var13 < 4) {
                              this.a[var13] = var32;
                              ++var13;
                           }
                        }
                     }

                     if (var14 && (var18 = ((cn)var36).d()) == 0) {
                        this.c.setFrame(var18);
                        this.c.setRefPixelPosition(this.a, this.b);
                        this.c.paint(at.a);
                     }

                     if (var37) {
                        at.a.drawImage(this.o, this.a, this.b, 3);
                     }
                  }
               }
            }

            var32 = 999999;
            var34 = -1;

            for(var35 = 0; var35 < 5; ++var35) {
               if ((var18 = this.a[var35]) >= 0) {
                  this.a = this.c[var18].a(this.a);
                  this.b = var1.a(this.b);
                  this.a.c(this.b);
                  if ((var19 = this.a.a()) < var32) {
                     var32 = var19;
                     var34 = var18;
                  }
               }
            }

            if (var34 >= 0) {
               if (this.f != this.c[var34]) {
                  this.i = 0;
               }

               this.f = this.c[var34];
               var8 = true;
            }

            if (!var27 && !var7) {
               if (this.g != null) {
                  if (this.g.e()) {
                     this.g = null;
                  }

                  this.g = null;
               }

               var37 = this.f != null && this.f.d && (this.f.e() || this.f.f());
               if (var8 && !this.a.a().q()) {
                  this.i += var5;
                  if (this.i > this.n - 200) {
                     if (var37) {
                        if (!this.h) {
                           var4.a(9, this.a.a());
                        } else {
                           this.b = this.f;
                        }
                     } else if (!this.g) {
                        var4.a(20, this.a.a());
                     } else {
                        this.g = this.f;
                     }
                  }

                  if (this.i > 500) {
                     if (this.f != null && !this.f.equals(var37 ? this.b : this.g)) {
                        if ((var18 = (int)((float)(this.b.getRawFrameCount() - 1) * ((float)(this.i - 500) / (float)(this.n - 500)))) < this.b.getRawFrameCount() - 1) {
                           this.b.setFrame(var18);
                           this.b.setRefPixelPosition(da.b.a, da.b.b);
                           this.b.paint(at.a);
                        }
                     } else if (a.b()) {
                        this.b.setFrame(this.b.getRawFrameCount() - 2);
                        this.b.setRefPixelPosition(da.b.a, da.b.b);
                        this.b.paint(at.a);
                     }
                  }
               } else {
                  if (var37 && this.b == null || !var37 && this.g == null) {
                     this.f = null;
                  }

                  this.i = 0;
               }
            }
         }

         if (this.o > 0) {
            if (at.e != 3) {
               at.a.c(3);
            }
         } else if (at.e != 4 && at.e != 0) {
            at.a.c(4);
         }

         this.o = 0;
      }
   }

   public final int a() {
      return bl.a().a()[this.l];
   }

   public final void a(x var1) {
      if (this.a) {
         if (this.a != null) {
            q.a((String)bl.a()[this.l], at.f - 2, at.g - q.a() - 2, 1, 18);
         } else {
            p var2;
            if ((var2 = this.g != null ? this.g : (this.e != null ? this.e : (this.d != null ? this.d : null))) != null) {
               boolean var3 = var2.equals(this.g);
               boolean var4 = var2.equals(this.d);
               String var5 = this.d == this.b[0] ? this.a[0] : (this.d == this.b[3] ? this.a[3] : this.a[1]);
               if (var3) {
                  e.a(((cn)var2).l, var1.a, at.f - 2, at.g - q.a() - 2, 40);
                  this.c.setFrame(((cn)var2).d());
                  this.c.setRefPixelPosition(at.f - 2, at.g - 2);
                  this.c.paint(at.a);
                  q.a((String)at.a.a(569 + ((cn)var2).l), at.f - 4 - this.c.getHeight(), at.g - q.a() - 2, 1, 18);
                  return;
               }

               if (!var4) {
                  this.a.setFrame(var2.d);
                  this.a.setRefPixelPosition(at.f - 2, at.g - q.a() - 2);
                  this.a.paint(at.a);
               }

               if (var2.a != null && var2.a.equals(at.a.a(833))) {
                  if (a.b()) {
                     q.a((String)var2.a, at.f - 2, at.g - q.a() - 2, 2, 18);
                     return;
                  }
               } else {
                  String var6 = var4 ? var5 : (var2.a != null ? var2.a : at.a.a(229 + var2.d));
                  if (!var4) {
                     var6 = var6 + " " + var2.a.g() + "%";
                  } else {
                     if (bl.c()) {
                        this.a.setFrame(9);
                     } else {
                        this.a.setFrame(bl.a().c());
                     }

                     this.a.setRefPixelPosition(at.f - 2, at.g - q.a() - 2);
                     this.a.paint(at.a);
                  }

                  q.a((String)var6, at.f - 2, at.g - q.a() - 2, 1, 18);
               }
            }

         }
      }
   }

   private String a(int var1, int var2, int var3, aa var4) {
      this.c = var4.a(this.c);
      this.a.a = (float)(this.c.a >> 1);
      this.a.b = (float)(this.c.b >> 1);
      this.a.c = (float)(this.c.c >> 1);
      var1 >>= 1;
      var2 >>= 1;
      var3 >>= 1;
      float var6 = ((this.a.a - (float)var1) * (this.a.a - (float)var1) + (this.a.b - (float)var2) * (this.a.b - (float)var2) + (this.a.c - (float)var3) * (this.a.c - (float)var3)) / 4096.0F;
      float var7 = 65536.0F;
      float var9 = 65536.0F;

      for(int var5 = 0; var5 < 20; ++var5) {
         var7 *= 0.5F;
         float var10;
         if ((var10 = var6 - var9 * var9) > 0.0F) {
            var9 += var7;
         } else if (var10 < 0.0F) {
            var9 -= var7;
         }
      }

      var1 = (var1 = (int)var9) * 12;
      String var8 = var1 + "m";
      if (var1 >= 1000) {
         if ((var2 = var1 % 1000) >= 100) {
            var8 = "" + var2;
         } else {
            var8 = "0";
         }

         var8 = var8.substring(0, 1);
         var8 = var1 / 1000 + "." + var8 + "km";
      }

      return var8;
   }

   public final p a() {
      return this.g;
   }

   public final void b() {
      this.g = null;
   }

   public final p b() {
      return this.e;
   }
}
