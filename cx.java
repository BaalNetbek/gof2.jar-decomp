public final class cx {
   private float[] a;
   private float[] b;
   private float[] c;
   private int b = 0;
   private float a;
   private float[] d;
   private float[] e;
   private float[] f;
   private int[] a = new int[3];
   private int[] b = new int[3];
   public cc a = new cc();
   public cc b = new cc();
   public int a = 0;
   private int[][] a;
   private long a;

   public cx(int[][] var1, int var2, long var3) {
      this.a = var3;
      if (var1 != null && var1[var2] != null) {
         this.a = new int[var1[var2].length / 8][];

         for(int var5 = 0; var5 < var1[var2].length / 8; ++var5) {
            this.a[var5] = new int[8];
            System.arraycopy(var1[var2], var5 << 3, this.a[var5], 0, 8);
         }

         if (this.a != null) {
            this.b = this.a.length;
            this.a = new float[(this.b + 1) * 3];
            this.b = new float[(this.b + 1) * 3];
            this.c = new float[this.b + 1];
            this.d = new float[(this.b + 1) * 3];
            this.e = new float[(this.b + 1) * 3];
            this.f = new float[3];
            this.b();
            this.a();
         }
      }

   }

   public final void a(long var1) {
      if (this.b >= 2) {
         if (var1 > this.a) {
            var1 %= this.a;
         }

         if (this.b == 2) {
            this.a((float)var1 / (float)this.a[1][0], 0);
         } else {
            for(int var3 = this.b - 1; var3 >= 0; --var3) {
               if ((long)this.a[var3][0] < var1) {
                  float var4;
                  if (var3 != 0 && var3 == this.b - 1) {
                     var4 = (float)(var1 - (long)this.a[var3][0]) / (float)(this.a - (long)this.a[var3][0]);
                  } else {
                     var4 = (float)(var1 - (long)this.a[var3][0]) / (float)(this.a[var3 + 1][0] - this.a[var3][0]);
                  }

                  this.a(var4, var3);
                  return;
               }
            }

         }
      }
   }

   private void a(float var1, int var2) {
      float var3;
      float var4 = (var3 = var1 * var1) * var1;
      float var5 = var4 * 2.0F - 3.0F * var3 + 1.0F;
      var1 += var4 - var3 * 2.0F;
      float var6 = -2.0F * var4 + 3.0F * var3;
      var3 = var4 - var3;
      this.a[0] = this.a[var2][1];
      this.a[1] = this.a[var2][2];
      this.a[2] = this.a[var2][3];
      if (var2 == this.a.length - 1) {
         this.b[0] = this.a[0][1];
         this.b[1] = this.a[0][2];
         this.b[2] = this.a[0][3];
      } else {
         this.b[0] = this.a[var2 + 1][1];
         this.b[1] = this.a[var2 + 1][2];
         this.b[2] = this.a[var2 + 1][3];
      }

      this.a.a = (int)(var5 * (float)this.a[0] + var1 * this.a[var2 * 3] + var6 * (float)this.b[0] + var3 * this.a[(var2 + 1) * 3]);
      this.a.b = (int)(var5 * (float)this.a[1] + var1 * this.a[var2 * 3 + 1] + var6 * (float)this.b[1] + var3 * this.a[(var2 + 1) * 3 + 1]);
      this.a.c = (int)(var5 * (float)this.a[2] + var1 * this.a[var2 * 3 + 2] + var6 * (float)this.b[2] + var3 * this.a[(var2 + 1) * 3 + 2]);
      this.a[0] = this.a[var2][4];
      this.a[1] = this.a[var2][5];
      this.a[2] = this.a[var2][6];
      if (var2 == this.a.length - 1) {
         this.b[0] = this.a[0][4];
         this.b[1] = this.a[0][5];
         this.b[2] = this.a[0][6];
      } else {
         this.b[0] = this.a[var2 + 1][4];
         this.b[1] = this.a[var2 + 1][5];
         this.b[2] = this.a[var2 + 1][6];
      }

      this.b.a = (int)(var5 * (float)this.a[0] + var1 * this.b[var2 * 3] + var6 * (float)this.b[0] + var3 * this.b[(var2 + 1) * 3]);
      this.b.b = (int)(var5 * (float)this.a[1] + var1 * this.b[var2 * 3 + 1] + var6 * (float)this.b[1] + var3 * this.b[(var2 + 1) * 3 + 1]);
      this.b.c = (int)(var5 * (float)this.a[2] + var1 * this.b[var2 * 3 + 2] + var6 * (float)this.b[2] + var3 * this.b[(var2 + 1) * 3 + 2]);
      this.a[0] = this.a[var2][7];
      if (var2 == this.a.length - 1) {
         this.b[0] = this.a[0][7];
      } else {
         this.b[0] = this.a[var2 + 1][7];
      }

      this.a = (int)(var5 * (float)this.a[0] + var1 * this.c[var2] + var6 * (float)this.b[0] + var3 * this.c[var2 + 1]);
   }

   private void a() {
      if (this.b <= 1) {
         this.a = 0.0F;
      } else {
         this.a = 0.0F;

         int var1;
         for(var1 = 0; var1 < this.b; ++var1) {
            int var2 = 1;
            float var3 = 1.0F;

            for(float var4 = 0.0F; (double)var3 > 0.005D; var2 <<= 1) {
               var3 = 1.0F / (float)var2;
               this.f[0] = (float)this.a[var1][1];
               this.f[1] = (float)this.a[var1][2];
               this.f[2] = (float)this.a[var1][3];
               this.d[var1] = 0.0F;

               for(int var5 = 1; var5 <= var2; ++var5) {
                  float var6 = (float)var5 * var3;
                  this.a(var6, var1);
                  float[] var10000 = this.d;
                  var10000[var1] = (float)((double)var10000[var1] + Math.sqrt((double)(((float)this.a.a - this.f[0]) * ((float)this.a.a - this.f[0]) + ((float)this.a.b - this.f[1]) * ((float)this.a.b - this.f[1]) + ((float)this.a.c - this.f[2]) * ((float)this.a.c - this.f[2]))));
                  this.f[0] = (float)this.a.a;
                  this.f[1] = (float)this.a.b;
                  this.f[2] = (float)this.a.c;
               }

               var3 = (this.d[var1] - var4) / this.d[var1];
               var4 = this.d[var1];
            }

            this.a += this.d[var1];
         }

         for(var1 = 0; var1 < this.b; ++var1) {
            if (var1 == 0) {
               this.e[var1] = this.d[var1] / this.a;
            } else {
               this.e[var1] = this.e[var1 - 1] + this.d[var1] / this.a;
            }
         }

      }
   }

   private void b() {
      if (this.b > 1) {
         this.a[0] = 0.0F;
         this.a[1] = 0.0F;
         this.a[2] = 0.0F;
         this.a[(this.b - 1) * 3] = 0.0F;
         this.a[(this.b - 1) * 3 + 1] = 0.0F;
         this.a[(this.b - 1) * 3 + 2] = 0.0F;

         int var1;
         for(var1 = 0; var1 < this.b; ++var1) {
            if (var1 == this.b - 1) {
               this.a[0] = this.a[0][1];
               this.a[1] = this.a[0][2];
               this.a[2] = this.a[0][3];
            } else {
               this.a[0] = this.a[var1 + 1][1];
               this.a[1] = this.a[var1 + 1][2];
               this.a[2] = this.a[var1 + 1][3];
            }

            if (var1 == 0) {
               this.b[0] = this.a[this.a.length - 1][1];
               this.b[1] = this.a[this.a.length - 1][2];
               this.b[2] = this.a[this.a.length - 1][3];
            } else {
               this.b[0] = this.a[var1 - 1][1];
               this.b[1] = this.a[var1 - 1][2];
               this.b[2] = this.a[var1 - 1][3];
            }

            this.a[var1 * 3] = 0.5F * (float)(this.a[0] - this.b[0]);
            this.a[var1 * 3 + 1] = 0.5F * (float)(this.a[1] - this.b[1]);
            this.a[var1 * 3 + 2] = 0.5F * (float)(this.a[2] - this.b[2]);
         }

         this.a[this.b * 3] = this.a[0];
         this.a[this.b * 3 + 1] = this.a[1];
         this.a[this.b * 3 + 2] = this.a[2];
         this.b[0] = 0.0F;
         this.b[1] = 0.0F;
         this.b[2] = 0.0F;
         this.b[(this.b - 1) * 3] = 0.0F;
         this.b[(this.b - 1) * 3 + 1] = 0.0F;
         this.b[(this.b - 1) * 3 + 2] = 0.0F;

         for(var1 = 0; var1 < this.b; ++var1) {
            if (var1 == this.b - 1) {
               this.a[0] = this.a[0][4];
               this.a[1] = this.a[0][5];
               this.a[2] = this.a[0][6];
            } else {
               this.a[0] = this.a[var1 + 1][4];
               this.a[1] = this.a[var1 + 1][5];
               this.a[2] = this.a[var1 + 1][6];
            }

            if (var1 == 0) {
               this.b[0] = this.a[this.a.length - 1][4];
               this.b[1] = this.a[this.a.length - 1][5];
               this.b[2] = this.a[this.a.length - 1][6];
            } else {
               this.b[0] = this.a[var1 - 1][4];
               this.b[1] = this.a[var1 - 1][5];
               this.b[2] = this.a[var1 - 1][6];
            }

            this.b[var1 * 3] = 0.5F * (float)(this.a[0] - this.b[0]);
            this.b[var1 * 3 + 1] = 0.5F * (float)(this.a[1] - this.b[1]);
            this.b[var1 * 3 + 2] = 0.5F * (float)(this.a[2] - this.b[2]);
         }

         this.b[this.b * 3] = this.b[0];
         this.b[this.b * 3 + 1] = this.b[1];
         this.b[this.b * 3 + 2] = this.b[2];
         this.c[0] = 0.0F;
         this.c[this.b - 1] = 0.0F;

         for(var1 = 0; var1 < this.b; ++var1) {
            if (var1 == this.b - 1) {
               this.a[0] = this.a[0][7];
            } else {
               this.a[0] = this.a[var1 + 1][7];
            }

            if (var1 == 0) {
               this.b[0] = this.a[this.a.length - 1][7];
            } else {
               this.b[0] = this.a[var1 - 1][7];
            }

            this.c[var1] = 0.5F * (float)(this.a[0] - this.b[0]);
         }

         this.c[this.b] = this.c[0];
      }

   }
}
