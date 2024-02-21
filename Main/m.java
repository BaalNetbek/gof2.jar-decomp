package Main;

public final class m {
   private static int a = 1;
   private long a;
   private int b;
   private boolean a;
   private Main.h a;
   private .ce a;
   private Main.b a;
   private .ay a;
   private .ay b;
   private boolean b;
   private int c;
   private int[] a;
   private int d;
   private int e;
   private int f;
   private int g;

   public final void a() {
      this.a = null;
      if (this.a != null) {
         this.a.c();
      }

      this.a = null;
      this.a = null;
      this.a = null;
      this.a = null;
      this.b = null;
      this.a = false;
      System.gc();
   }

   public final void b() {
      this.a = new Main.h(new String[]{.at.a.a(77), .at.a.a(79), .at.a.a(130), "", ""}, .at.a.a(62));
      this.a.a(.bl.a());
      .bl.h();
      .v[] var1 = .v.a(.bl.a().b(), .bl.a().a());
      this.a.a(var1);
      this.a.a(.bl.a());
      if (var1 != null) {
         for(int var2 = 0; var2 < var1.length; ++var2) {
            .v var3;
            int var4 = (var3 = var1[var2]).e();
            int var5 = var3.a();
            if (var4 > .bl.b[var5] || .bl.b[var5] == 0) {
               .bl.b[var5] = var4;
               .bl.c[var5] = (byte).bl.a().a();
            }

            if (var4 < .bl.a[var5] || .bl.a[var5] == 0) {
               .bl.a[var5] = var4;
               .bl.b[var5] = (byte).bl.a().a();
            }
         }
      }

      .bl.a().c();
      this.a = new Main.b();
      this.a = new .ay(20, .at.g / 3, .at.f - 40);
      this.d = 0;
      this.b = new .ay(10, .at.g / 3, .at.f - 20);
      this.c = .at.f - 10;
      this.a = new int[3];
      this.a[0] = this.c / 3 - 2;
      this.a[1] = this.a[0];
      this.a[2] = this.c - this.a[0] - this.a[1] - 4;
      this.a.b(a);
      System.gc();
      this.a = true;
   }

   public final int a() {
      return this.a.d();
   }

   public final boolean a() {
      return this.d == 0 && !this.a.a();
   }

   public final .ce a() {
      return this.a;
   }

   public final boolean a(int var1) {
      this.a = (.ce)((.ce)this.a.a());
      if (var1 == 256) {
         if (this.b && this.a > 200L) {
            this.b = false;
            return true;
         }

         if (this.d == 4) {
            this.d = 0;
         } else if (this.d == 0) {
            if (this.a.d() == 2) {
               this.g = this.a.e();
            }

            this.a.a();
         } else if (this.d != 1) {
            if (this.d == 2) {
               this.d = 0;
            } else if (this.d == 3) {
               this.d = 0;
               this.a.a(.bl.a());
            }
         }
      }

      if (this.b) {
         return true;
      } else {
         if (var1 == 2 && this.d == 0) {
            this.a.h();
         }

         if (var1 == 64 && this.d == 0) {
            this.a.i();
         }

         if (var1 == 4 && (this.d == 4 || this.d == 0)) {
            this.a.d();
         }

         if (var1 == 32 && (this.d == 4 || this.d == 0)) {
            this.a.e();
         }

         if (var1 == 8192) {
            if (this.d == 4) {
               a = this.a.d();
               return false;
            }

            if (this.d == 0 && !this.a.a) {
               if (this.a.b()) {
                  this.a.a(false);
                  return true;
               }

               if (this.a.d() == 3) {
                  this.a.b(0);
                  return true;
               }

               if (this.a.d() != 4) {
                  if (this.a.a()) {
                     return true;
                  }

                  this.a.a(false);
                  return false;
               }

               if (!this.a.a()) {
                  this.a.b(2);

                  for(var1 = 0; var1 < this.g - 1; ++var1) {
                     this.a.i();
                  }

                  this.a.a();
               }

               return true;
            }

            if (this.d == 1) {
               this.d = 0;
            } else if (this.d == 5) {
               this.d = 4;
            }
         }

         if (var1 == 16384) {
            if (this.d == 4) {
               this.d = 5;
            } else if (this.d == 0 && this.a != null) {
               if (this.a.b() || this.a.a() || this.a.h() || this.a.i()) {
                  this.a.a((.ce)((.ce)this.a.a()), this.a.b, this.a.a, this.a.c, this.a.d, true);
                  this.d = 1;
               }

               if (this.a != null) {
                  if (this.a.d()) {
                     .ay var10000 = this.b;
                     String var2 = .at.a.a(82);
                     var10000.a(var2, false);
                     this.b = true;
                  } else {
                     this.a.a(this.a.a());
                  }
               }
            }
         }

         return true;
      }
   }

   public final boolean a(int var1, int var2) {
      if (!this.a) {
         return true;
      } else {
         this.b = var2;
         this.a += (long)var2;
         if (this.d == 1 && this.a.a()) {
            this.a.a(var1, var2);
         }

         if (this.d == 0) {
            this.a.a();
            this.a.b();
         }

         if (this.d == 1) {
            if (this.a.a()) {
               this.a.b();
            }

            this.a.a();
         } else if (this.d == 2) {
            this.a.a();
            this.a.b();
            this.a.c();
         }

         label154: {
            String var10000;
            String var10001;
            if (!this.b && this.d != 2) {
               label155: {
                  if (this.d == 1 && this.a.d() == 0 && !this.a.a()) {
                     var10000 = "";
                  } else {
                     if (this.d == 0 && (this.a.a() == null || !((.ce)this.a.a()).a)) {
                        .a.a("", this.d == 0 && this.a.b() && !this.a.a ? .at.a.a(246) : .at.a.a(65));
                        break label154;
                     }

                     var10000 = this.d == 1 ? "" : (this.a.d() == 3 && !((.ce)this.a.a()).b() && !((.ce)this.a.a()).a() ? "" : .at.a.a(212));
                     if (this.d == 0 && this.a.b() && !this.a.a) {
                        var10001 = .at.a.a(246);
                        break label155;
                     }
                  }

                  var10001 = .at.a.a(65);
               }
            } else {
               var10000 = "";
               var10001 = "";
            }

            .a.a(var10000, var10001);
         }

         if (this.b) {
            this.b.c();
         }

         this.a = (.ce)((.ce)this.a.a());
         if (this.b) {
            return true;
         } else {
            if (this.d == 0 && this.a.a()) {
               if ((var1 & 4) == 0) {
                  this.e = 0;
               } else {
                  this.e += var2;
               }

               if ((var1 & 32) == 0) {
                  this.f = 0;
               } else {
                  this.f += var2;
               }

               if (this.e > 500) {
                  this.a.f();
                  this.e = 0;
               }

               if (this.f > 500) {
                  this.a.g();
                  this.f = 0;
               }
            }

            if ((var1 & 2) != 0 && this.d == 1) {
               this.a.a(var2);
            }

            if ((var1 & 64) != 0 && this.d == 1) {
               this.a.b(var2);
            }

            return true;
         }
      }
   }
}
