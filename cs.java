public final class cs {
   private int[] a = new int[2];

   public cs() {
      this.a[0] = 30;
      this.a[1] = 0;
   }

   public final void a(int[] var1) {
      this.a = var1;
   }

   public final int[] a() {
      return this.a;
   }

   public final int a(int var1) {
      return this.a[var1];
   }

   public final void a(int var1) {
      if (var1 == 1) {
         this.a[0] = 35;
      } else if (var1 == 0) {
         this.a[0] = -35;
      } else if (var1 == 3) {
         this.a[1] = 35;
      } else {
         if (var1 == 2) {
            this.a[1] = -35;
         }

      }
   }

   public final boolean a() {
      int var1 = this.a[0];
      int var2 = this.a[1];
      return var1 > 60 || var1 < -60 || var2 > 60 || var2 < -60;
   }

   public final boolean a(int var1) {
      if (var1 == 1) {
         return this.a[0] > 60;
      } else if (var1 == 0) {
         return this.a[0] < -60;
      } else if (var1 == 3) {
         return this.a[1] > 60;
      } else if (var1 == 2) {
         return this.a[1] < -60;
      } else {
         return false;
      }
   }

   public final boolean b(int var1) {
      if (var1 == 1) {
         return this.a[0] < -60;
      } else if (var1 == 0) {
         return this.a[0] > 60;
      } else if (var1 == 3) {
         return this.a[1] < -60;
      } else if (var1 == 2) {
         return this.a[1] > 60;
      } else {
         return false;
      }
   }

   public static int b(int var0) {
      switch(var0) {
      case 0:
         return 1;
      case 1:
         return 0;
      case 2:
         return 3;
      case 3:
         return 2;
      default:
         return 8;
      }
   }

   private void a(int var1, int var2) {
      int[] var10000 = this.a;
      var10000[var1] += var2;
      if (this.a[var1] > 100) {
         this.a[var1] = 100;
      } else {
         if (this.a[var1] < -100) {
            this.a[var1] = -100;
         }

      }
   }

   public final void b(int var1) {
      int var2 = bl.c() ? 9 : bl.a().c();
      int var3 = var1;
      byte var4 = 5;
      if (var1 == 8) {
         switch(var2) {
         case 0:
            var3 = 1;
            break;
         case 1:
            var3 = 0;
            break;
         case 2:
            var3 = 3;
            break;
         case 3:
            var3 = 2;
         }

         var4 = 1;
      }

      this.b(var3, var4);
   }

   public final void c(int var1) {
      this.b(var1, 2);
   }

   public final void d(int var1) {
      this.b(var1, -7);
   }

   public final void e(int var1) {
      this.b(var1, 2);
   }

   private void b(int var1, int var2) {
      if (var1 == 1) {
         this.a(0, var2);
      } else if (var1 == 0) {
         this.a(0, -var2);
      } else if (var1 == 3) {
         this.a(1, var2);
      } else {
         if (var1 == 2) {
            this.a(1, -var2);
         }

      }
   }
}
