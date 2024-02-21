package Main;

import javax.microedition.lcdui.Image;

public final class l {
   private static int a;
   private static int b;
   private static int c;
   private static int[] a = new int[]{6, 4, 3, 4, 3, 3, 11, 0, 0, 2, 12, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
   private Image a;
   private int d;
   private int e;
   private int f;
   private int g;
   private String a;
   private .ay a;
   private boolean a;
   private boolean b;
   private .z[] a;
   private String b;
   private Main.q a;
   private .bu a;
   private .bu b;
   private .bu c;
   private .bu d;
   private .ci a;
   private int h;
   private int i;
   private int j;
   private int k;
   private boolean c = false;
   private String c = null;
   private String d = null;
   private String e = null;
   private int l = -1;
   private boolean d = false;
   private Image b = null;
   private int m;

   public l() {
      this.f();
      if (this.c) {
         a[0] = 7;
      }

      this.a = .ao.a();
      b = this.a.getHeight() + 25;
      this.m = b + 16;
      c = 117;
      a = .at.f - c >> 1;
      this.d = .q.a();
      this.f = 0;
      this.g = 0;
      this.a = new .ay(20, .at.g / 2, .at.f - 40);
      this.a = false;
      this.b = false;
      this.a = new .bu(a / 2 + 8, this.m, c + a - 16, .at.g - b - 48, .at.a.a(23) + "\n\n" + .at.a.a(25));
      this.b = new .bu(a / 2 + 8, this.m, c + a - 16, .at.g - b - 48, "");
      this.c = new .bu(a / 2 + 8, this.m, c + a - 16, .at.g - b - 48, .at.a.a(22));
      this.d = new .bu(a + 8, this.m, c - 16, .at.g - b - 48, "");
      String[] var1 = new String[.co.c.length];

      for(int var2 = 0; var2 < var1.length; ++var2) {
         var1[var2] = .at.a.a(.co.b[var2]);
      }

      this.a = new Main.q(a, b + 2, c, .at.g - b - 16 - 10, (String[])null);
      this.a.a(12);
      this.a.a(0, var1);
      this.a.c(true);
      this.a.b(false);
      this.a.o();
      this.a = new .ci(10);
      this.i = .at.a;
      this.j = .at.b;
      a[12] = 2;
   }

   private static String a(String var0) {
      int var1 = 0;
      int var2 = var0.length();
      StringBuffer var3 = new StringBuffer();

      while(true) {
         while(var1 < var2) {
            char var4;
            if ((var4 = var0.charAt(var1)) == '\\' && var1 + 6 <= var2 && var0.charAt(var1 + 1) == 'u') {
               var4 = (char)Integer.parseInt(var0.substring(var1 + 2, var1 + 6), 16);
               var3.append(var4);
               var1 += 6;
            } else {
               var3.append(var4);
               ++var1;
            }
         }

         return var3.toString();
      }
   }

   private void f() {
      try {
         try {
            this.c = .at.a.getAppProperty("Operator-URL-ru");
            this.e = .at.a.getAppProperty("Operator-Menu-ru");
         } catch (Exception var10) {
            this.c = false;
            this.c = null;
            this.d = null;
            this.e = null;

            try {
               this.c = .at.a.getAppProperty("Operator-URL-gn");
               this.e = .at.a.getAppProperty("Operator-Menu-gn");
            } catch (Exception var9) {
               this.c = false;
               return;
            }

            if (this.c == null || this.e == null) {
               this.c = false;
               return;
            }
         }

         if (this.c == null || this.e == null) {
            try {
               this.c = .at.a.getAppProperty("Operator-URL-gn");
               this.e = .at.a.getAppProperty("Operator-Menu-gn");
            } catch (Exception var8) {
               this.c = false;
               return;
            }
         }

         try {
            this.d = .at.a.getAppProperty("Operator-Prompt-ru");
         } catch (Exception var7) {
            this.d = null;

            try {
               this.d = .at.a.getAppProperty("Operator-Prompt-gn");
            } catch (Exception var6) {
            }
         }

         if (this.d == null) {
            try {
               this.d = .at.a.getAppProperty("Operator-Prompt-gn");
            } catch (Exception var5) {
            }
         }

         if (this.d != null) {
            this.d = a(this.d);
         }

         if (this.e != null) {
            this.e = a(this.e);
         }

         System.out.println("wap_url: " + this.c);
         System.out.println("wap_menu: " + this.e);
         System.out.println("wap_prompt: " + this.d);
         String var1 = .at.a.getAppProperty("Operator-Mode");
         if (this.c != null && var1 != null) {
            char[] var2 = new char[]{'1', '2'};

            for(int var3 = 0; var3 < var2.length; ++var3) {
               int var4;
               if ((var4 = var1.indexOf(String.valueOf(var2[var3]))) >= 0) {
                  this.l = Integer.valueOf(String.valueOf(var1.charAt(var4)));
               }
            }

            System.out.println("wap_mode: " + this.l);
            if (this.l < 1 || this.l > 2) {
               this.l = 2;
            }

            this.c = true;
         } else {
            throw new Exception();
         }
      } catch (Exception var11) {
         this.c = false;
      }
   }

   private void a(.z[] var1) {
      this.k = 0;
      if (var1 != null) {
         for(int var2 = 0; var2 < var1.length; ++var2) {
            this.a = var2 + 1 + ".  " + (var1[var2] == null ? .at.a.a(26) : .bc.b(var1[var2].a) + (var2 == 3 ? " AUTOSAVE" : " " + var1[var2].a));
            int var3;
            if ((var3 = .q.a(this.a, 1)) > this.k) {
               this.k = var3;
            }
         }

         this.k += 24;
      } else {
         this.k = c + (c >> 1);
      }
   }

   public final void a() {
      this.a = null;
      this.a = null;
      this.a = null;
   }

   public final void a(int var1, int var2) {
      this.h = var2;
      .a.a(var2);
      if ((var1 & 64) != 0) {
         if (this.g >= 15) {
            this.b.b(var2);
            return;
         }

         if (this.g == 8) {
            this.a.b(var2);
            return;
         }

         if (this.g == 7) {
            this.c.b(var2);
            return;
         }
      } else if ((var1 & 2) != 0) {
         if (this.g >= 15) {
            this.b.c(var2);
            return;
         }

         if (this.g == 8) {
            this.a.c(var2);
            return;
         }

         if (this.g == 7) {
            this.c.c(var2);
         }
      }

   }

   public final boolean a() {
      .ab var1;
      switch(this.g) {
      case 0:
         if (this.a && this.f == 5) {
            if (this.a.a()) {
               .at.a.a();
               return true;
            }

            this.a = false;
            return false;
         }

         switch(this.f) {
         case 0:
            if (.bl.a() <= 0L) {
               .bl.i();
               .at.a.a(.at.a[2]);
               .bs.d();
               return true;
            }

            if (!this.a) {
               this.a.a(.at.a.a(30), true);
               this.a = true;
               return false;
            }

            if (this.a.a()) {
               .bl.i();
               .at.a.a(.at.a[2]);
               .bs.d();
               return true;
            }

            this.a = false;
            return false;
         case 1:
            this.g = 1;
            if (this.a == null) {
               var1 = new .ab();
               this.a = var1.a();
            }

            this.a(this.a);
            this.f = 0;
            return false;
         case 2:
            this.g = 2;
            if (this.a == null) {
               var1 = new .ab();
               this.a = var1.a();
            }

            this.a(this.a);
            this.f = 0;
            return false;
         case 3:
            this.g = 3;
            this.f = 0;
            return false;
         case 4:
            this.g = 4;
            this.f = 0;
            return false;
         case 5:
            if (!this.a) {
               this.a.a(.at.a.a(31), true);
               this.a = true;
            }

            return false;
         case 6:
            if (this.c) {
               switch(this.l) {
               case 1:
                  try {
                     if (!this.a && this.d != null) {
                        this.a.a(this.d, true);
                     } else if (this.d == null || this.a.a()) {
                        .at.a.platformRequest(this.c);
                        .at.a.a();
                        return true;
                     }

                     if (this.d != null) {
                        this.a = !this.a;
                     }
                  } catch (Exception var3) {
                  }

                  return false;
               default:
                  try {
                     if (!this.a && this.d != null) {
                        this.a.a(this.d, true);
                     } else if (this.d == null || this.a.a()) {
                        .at.a.platformRequest(this.c);
                     }

                     if (this.d != null) {
                        this.a = !this.a;
                     }
                  } catch (Exception var2) {
                  }

                  return false;
               }
            }

            return false;
         default:
            return false;
         }
      case 1:
         if (this.f == this.a.length || this.a[this.f] != null) {
            if (.bl.a() <= 0L) {
               this.a = false;
               this.g();
               return true;
            }

            if (!this.a) {
               this.a.a(.at.a.a(29), true);
               this.a = true;
            } else {
               if (this.a.a()) {
                  this.g();
               }

               this.a = false;
            }
         }
         break;
      case 2:
         if (this.a) {
            if (!this.a.a()) {
               this.a = false;
               return true;
            }

            .at.a.a(false);
            (var1 = new .ab()).a(this.f);
            this.a[this.f] = var1.b(this.f);
            this.a(this.a);
            .at.a.b();
            this.a.a(.at.a.a(28), false);
         } else if (this.f < this.a.length && this.a[this.f] == null) {
            .at.a.a(false);
            (var1 = new .ab()).a(this.f);
            this.a = var1.a();
            .at.a.b();
            this.a.a(.at.a.a(28), false);
            this.a = true;
         } else {
            this.a.a(.at.a.a(27), true);
            this.a = true;
         }
         break;
      case 3:
         this.c();
         break;
      case 4:
         switch(this.f) {
         case 0:
            this.g = 6;
            this.f = 0;
            this.a.h = 0;
            return false;
         case 1:
            this.g = 7;
            return false;
         case 2:
            this.g = 8;
            return false;
         default:
            return false;
         }
      case 5:
         if (this.a) {
            if (this.a.a()) {
               .at.a.a(.at.a[0]);
               .at.a.c(0);
               return true;
            }

            this.a = false;
         } else {
            switch(this.f) {
            case 0:
               this.g = 3;
               this.f = 0;
               return false;
            case 1:
               this.g = 4;
               this.f = 0;
               return false;
            case 2:
               if (!this.a) {
                  this.a.a(.at.a.a(31), true);
                  this.a = true;
               }
            }
         }
         break;
      case 6:
         this.b.a();
         this.b.a(.at.a.a(.co.c[this.f]));
         this.g = 15 + this.f;
         System.out.println(this.f + "  " + this.g);
      case 7:
      case 8:
      case 10:
      default:
         break;
      case 9:
         switch(this.f) {
         case 0:
            if (.bl.a() > 0L) {
               if (!this.a) {
                  this.a.a(.at.a.a(30), true);
                  this.a = true;
                  return false;
               }

               if (this.a.a()) {
                  this.g = 11;
                  this.f = 0;
               }

               this.a = false;
            } else {
               this.g = 11;
               this.f = 0;
            }
            break;
         case 1:
            this.g = 10;
            this.f = 0;
         }
      }

      return false;
   }

   private void g() {
      .ab var10000 = new .ab();
      int var2 = this.f;
      .ab var1 = var10000;
      new .z();
      Object var3 = null;
      .z var4 = var1.a(var2);
      .bl.i();
      .bv.a(var4.a);
      .bl.k(var4.f);
      .bl.p(var4.a);
      .bl.g(var4.b);
      .bl.a(var4.a);
      .bl.h(var4.c);
      .bl.i(var4.d);
      .bl.j(var4.e);
      .bl.k(var4.f);
      .bl.l(var4.g);
      .bl.q(var4.h);
      .bl.c(var4.i);
      .bl.e(var4.j);
      .bl.f(var4.k);
      .bl.n(var4.l);
      .bl.h = var4.n;
      .bl.g = var4.o;
      .bl.i = var4.p;
      .bl.j = var4.q;
      .bl.b(var4.m);
      .bl.b(var4.a);
      .bl.c(var4.b);
      .bl.a(var4.a);
      .bl.b = var4.b;
      .bl.c = var4.c;
      .bl.k = var4.r;
      .bl.l = var4.s;
      .bl.m = var4.t;
      .bl.n = var4.u;
      .bl.d = var4.d;
      .bl.o = var4.v;
      .bl.e = var4.e;
      .bl.p = var4.w;
      .bl.d = var4.b;
      .bl.q = var4.x;
      .bl.r = var4.y;
      .bl.s = var4.z;
      .bl.t = var4.A;
      .bl.u = var4.B;
      .bl.v = var4.C;
      .bl.w = var4.D;
      .bl.x = var4.E;
      .bl.y = var4.F;
      .bl.z = var4.G;
      .ba.c();
      if (var4.a != null) {
         .ba.a(var4.a);
      }

      .bl.a(var4.a);
      .bl.b(var4.a);
      .bl.a(.cl.a);
      .bl.a = var4.a;
      .bl.a = var4.a;
      .bl.a = var4.a;
      .bl.a = var4.a;
      .bl.a = var4.a;
      .bl.a = var4.H;
      .bl.b = var4.I;
      .bl.a = var4.a;
      .bl.c = var4.J;
      .bl.a = var4.f;
      .bl.a = var4.b;
      .bl.b = var4.c;
      .bl.b = var4.b;
      .bl.c = var4.c;
      .at.e = var4.a;
      .at.f = var4.b;
      .at.g = var4.c;
      .at.h = var4.d;
      .at.i = var4.e;
      .at.j = var4.f;
      .at.k = var4.g;
      .at.l = var4.h;
      .at.m = var4.i;
      .at.n = var4.j;
      .at.o = var4.k;
      .at.p = var4.l;
      .at.q = var4.m;
      .at.r = var4.n;
      .at.s = var4.o;
      .at.t = var4.p;
      .at.u = var4.q;
      .at.v = var4.r;
      .at.w = var4.s;
      .at.x = var4.t;
      .at.y = var4.u;
      .at.z = var4.v;
      .at.A = var4.w;
      .at.B = var4.x;
      .at.C = var4.y;
      .at.D = var4.z;
      .at.E = var4.A;
      .bl.c = var4.c;
      .bl.b = var4.d;
      var4.a = null;
      ((Main.p)((Main.p).at.a[1])).c();
      .at.a.a(.at.a[1]);
   }

   public final void a(int var1) {
      if (!this.a) {
         if (this.g != 7 && this.g != 8 && this.g != 13 && this.g != 14 && this.g < 15) {
            if (this.f > 0) {
               --this.f;
            } else {
               this.f = a[this.g] - 1;
            }

            if (this.f == 2 && this.g == 0 && .bl.a() == 0L) {
               --this.f;
            }

            if (this.g == 6) {
               this.a.h();
               return;
            }
         } else if (this.g == 13) {
            this.d.c(var1);
         }

      }
   }

   public final void b(int var1) {
      if (!this.a) {
         if (this.g != 7 && this.g != 8 && this.g != 13 && this.g != 14 && this.g < 15) {
            if (this.f < a[this.g] - 1) {
               ++this.f;
            } else {
               this.f = 0;
            }

            if (this.f == 2 && this.g == 0 && .bl.a() == 0L) {
               ++this.f;
            }

            if (this.g == 6) {
               this.a.i();
               return;
            }
         } else if (this.g == 13) {
            this.d.b(var1);
         }

      }
   }

   public final void b() {
      if (this.a) {
         this.a.a();
      } else {
         if (this.g == 3) {
            switch(this.f) {
            case 0:
               --this.i;
               this.i();
               return;
            case 1:
               --this.j;
               this.h();
               return;
            case 2:
               this.c();
               return;
            case 3:
               this.c();
            }
         }

      }
   }

   private void h() {
      if (this.j < 0) {
         this.j = 3;
      }

      if (this.j > 3) {
         this.j = 0;
      }

      switch(this.j) {
      case 0:
         .at.b = true;
         .at.a.b(60);
         break;
      case 1:
         .at.b = true;
         .at.a.b(80);
         break;
      case 2:
         .at.b = true;
         .at.a.b(100);
         break;
      case 3:
         .at.b = false;
      }

      .at.b = this.j;
   }

   private void i() {
      if (this.i < 0) {
         this.i = 3;
      }

      if (this.i > 3) {
         this.i = 0;
      }

      switch(this.i) {
      case 0:
         .at.a = true;
         .at.a.a(60);
         if (.at.a.a() != .at.a[2] && !.bs.a()) {
            .at.a.c(0);
         }
         break;
      case 1:
         .at.a = true;
         .at.a.a(80);
         break;
      case 2:
         .at.a = true;
         .at.a.a(100);
         if (.at.a.a() != .at.a[2] && !.bs.a()) {
            .at.a.c(0);
         }
         break;
      case 3:
         .bs.d();
         .at.a = false;
      }

      .at.a = this.i;
   }

   public final void c() {
      if (this.a) {
         this.a.b();
      } else {
         if (this.g == 3) {
            switch(this.f) {
            case 0:
               ++this.i;
               this.i();
               return;
            case 1:
               ++this.j;
               this.h();
               return;
            case 2:
               if (.at.c = !.at.c) {
                  .at.a(150);
                  return;
               }
               break;
            case 3:
               .at.d = !.at.d;
            }
         }

      }
   }

   public final boolean b() {
      if (this.a) {
         return false;
      } else if (this.g != 0 && this.g != 5) {
         if (this.g == 3) {
            (new .ab()).b();
         }

         if (this.g == 7) {
            this.f = 1;
            this.g = 4;
            return false;
         } else if (this.g == 6) {
            this.f = 0;
            this.g = 4;
            return false;
         } else if (this.g >= 15) {
            this.g = 6;
            return false;
         } else if (this.g == 10) {
            this.f = 1;
            this.g = 9;
            return false;
         } else if (this.g == 8) {
            this.f = 2;
            this.g = 4;
            return false;
         } else if (this.g == 12) {
            this.g = 11;
            return false;
         } else if (this.g == 11) {
            return false;
         } else {
            if (this.g > 0 || this.g == 9) {
               if (this.g == 9) {
                  this.f = 0;
               } else {
                  this.f = this.g;
               }

               this.g = 0;
               if (this.b) {
                  this.d();
               }
            }

            return false;
         }
      } else {
         return true;
      }
   }

   public final boolean c() {
      this.a();
      return false;
   }

   public final void c(int var1) {
      this.f = var1;
      this.g = 0;
   }

   public final void d() {
      this.g = 5;
      this.f = 0;
      this.a = false;
      this.b = true;
   }

   public final void e() {
      .at.a.drawImage(this.a, .at.f / 2, 10, 17);
      label197:
      switch(this.g) {
      case 0:
         this.e = .bl.a() > 0L ? this.d : 0;
         .a.a(.at.a.a(67), a, b, c, ((.bl.a() > 0L ? a[this.g] : a[this.g] - 1) + 2) * this.d);
         .a.a(.at.a.a(0), a, this.m, c, this.f == 0);
         .a.a(.at.a.a(1), a, this.m + this.d, c, this.f == 1);
         if (.bl.a() > 0L) {
            .a.a(.at.a.a(2), a, this.m + 2 * this.d, c, this.f == 2);
         }

         .a.a(.at.a.a(3), a, this.m + 2 * this.d + this.e, c, this.f == 3);
         .a.a(.at.a.a(4), a, this.m + 3 * this.d + this.e, c, this.f == 4);
         .a.a(.at.a.a(5), a, this.m + 4 * this.d + this.e, c, this.f == 5);
         if (this.c) {
            .a.a(this.e, a, this.m + 5 * this.d + this.e, c, this.f == 6);
         }
         break;
      case 1:
      case 2:
         int var1 = 6 * this.d;
         if (this.g == 2) {
            .a.a(.at.a.a(2), .at.f - this.k >> 1, b, this.k, var1);
         } else {
            .a.a(.at.a.a(1), .at.f - this.k >> 1, b, this.k, var1);
         }

         var1 = 0;

         while(true) {
            if (var1 >= this.a.length) {
               break label197;
            }

            this.a = var1 + 1 + ".  ";
            if (this.a[var1] == null) {
               this.a = this.a + .at.a.a(26);
            } else {
               this.a = this.a + .bc.b(this.a[var1].a);
               this.b = this.a[var1].a;
               if (var1 == 3) {
                  this.a = this.a + " AUTOSAVE";
               } else {
                  this.a = this.a + " " + this.b;
               }
            }

            .a.a(this.a, .at.f - this.k >> 1, this.m + var1 * this.d, this.k, this.f == var1);
            ++var1;
         }
      case 3:
         .a.a(.at.a.a(3), a, b, c, (a[this.g] + 2) * this.d);
         .a.a(.at.a.a(6) + "  " + .at.a.a(.co.d[this.i]), a, this.m, c, this.f == 0);
         .a.a(.at.a.a(7) + "  " + .at.a.a(.co.d[this.j]), a, this.m + this.d, c, this.f == 1);
         .a.a(.at.a.a(11) + "  " + .at.a.a(.at.c ? 15 : 16), a, this.m + 2 * this.d, c, this.f == 2);
         .a.a(.at.a.a(14) + "  " + .at.a.a(.at.d ? 15 : 16), a, this.m + 3 * this.d, c, this.f == 3);
         break;
      case 4:
         .a.a(.at.a.a(4), a, b, c, (a[this.g] + 2) * this.d);
         .a.a(.at.a.a(19), a, this.m, c, this.f == 0);
         .a.a(.at.a.a(20), a, this.m + this.d, c, this.f == 1);
         .a.a(.at.a.a(21), a, this.m + 2 * this.d, c, this.f == 2);
         break;
      case 5:
         .a.a(.at.a.a(17), a, b, c, (a[this.g] + 2) * this.d);
         .a.a(.at.a.a(3), a, this.m, c, this.f == 0);
         .a.a(.at.a.a(4), a, this.m + this.d, c, this.f == 1);
         .a.a(.at.a.a(5), a, this.m + 2 * this.d, c, this.f == 2);
         break;
      case 6:
         .a.a(.at.a.a(19), a, b, c, .g.c(this.a.a() * .q.a() + 30, .at.g - b - 16 - 10));
         this.a.l();
         this.a.m();
         break;
      case 7:
         .a.a(.at.a.a(20), a / 2, b, c + a, .g.c(.at.g - b - 16 - 10, this.c.a()));
         this.c.b();
         break;
      case 8:
         .a.a(.at.a.a(21), a / 2, b, c + a, .at.g - b - 16 - 10);
         .q.b(.at.a, (.at.f >> 1) - (.q.a(.at.a) >> 1), 10 + this.a.getHeight() + 2, 1);
         this.a.b();
      case 9:
      case 10:
      case 12:
      case 13:
      case 14:
      default:
         break;
      case 11:
         .a.a(.at.a.a(34), a, b, c, 4 * this.d, true);
         this.a.a(this.h);
         .q.b(this.a.a() + this.a.a(), a + 10, this.m + this.d, 0);
         if (.a.b()) {
            .q.b("_", a + 10 + .q.a(this.a.a()), this.m + 2 + this.d, 0);
         }
         break;
      case 15:
      case 16:
      case 17:
      case 18:
      case 19:
      case 20:
      case 21:
      case 22:
      case 23:
      case 24:
      case 25:
         .a.a(.at.a.a(.co.b[this.f]), a / 2, b, c + a, .at.g - b - 16 - 10);
         this.b.b();
      }

      if (this.a) {
         this.a.c();
         .a.a("", "", false);
      } else if (this.g == 0) {
         .a.a(.at.a.a(253), .bl.a() == 0L ? "" : .at.a.a(65), false);
      } else if (this.g == 5) {
         .a.a(.at.a.a(253), .at.a.a(18), false);
      } else {
         if (this.g != 11) {
            if (this.g != 7 && this.g != 8 && this.g != 14 && this.g != 13 && (this.g < 15 || this.g > 24)) {
               .a.a(.at.a.a(35), .at.a.a(65), false);
               return;
            }

            .a.a("", .at.a.a(65), false);
         }

      }
   }

   public final boolean a(int var1) {
      if (this.g == 11) {
         if (var1 == 8192 && this.a.a().length() == 0) {
            this.f = 0;
            this.g = 9;
         }

         if (var1 != 0 && var1 != -1) {
            this.a.a(var1);
         }
      }

      return true;
   }
}
