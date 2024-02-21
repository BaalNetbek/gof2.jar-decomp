public final class be {
   private final int[] a = new int[]{10, 22, 27, 29, 30, 48, 55, 56, 76, 79, 91, 98};
   private final int[] b = new int[]{5, 20, 2, 5, 100};

   public static ch[] a(bd var0) {
      if (var0.a() == 15 && bl.a() < 16) {
         return null;
      } else {
         ch[] var1 = null;
         int var2 = bl.a().c();
         boolean var7 = var0.b() == 10 && ba.b();
         int var10000 = var2 != 1 && !var7 ? at.a.nextInt(6) : 1;
         int var8 = var10000;
         if (var10000 == 0) {
            return null;
         } else {
            var1 = new ch[var8];

            for(int var3 = 0; var3 < var1.length; ++var3) {
               int var4 = 0;
               boolean var5 = false;

               while(true) {
                  while(!var5) {
                     var4 = var7 ? 8 : ad.a(var2);
                     var5 = true;

                     for(int var6 = 0; var6 < var1.length; ++var6) {
                        if (var1[var6] != null && var1[var6].b() == var4) {
                           var5 = false;
                           break;
                        }
                     }
                  }

                  var1[var3] = ad.a()[var4].a();
                  var1[var3].a(bl.a().c());
                  var1[var3].c();
                  break;
               }
            }

            return var1;
         }
      }
   }

   public final int[] a() {
      v[] var1 = ad.a();
      int var2;
      if ((var2 = at.a.nextInt(3)) == 0) {
         return null;
      } else {
         int[] var9 = new int[var2 << 1];
         v[] var3 = ad.a();
         int var4 = 0;

         for(int var5 = 0; var5 < var9.length; var5 += 2) {
            boolean var6 = false;
            int var7 = 0;

            for(int var8 = 0; var8 < 100 && !var6; ++var8) {
               var7 = at.a.nextInt(var1.length);
               var4 = var3[var7].b();
               if (var3[var7].a() == null && at.a.nextInt(100) < this.b[var4] && at.a.nextInt(100) < var1[var7].k() && var3[var7].e() > 0 && var7 != 175 && var7 != 164 && (var4 == 4 || var3[var7].c() <= 7)) {
                  var6 = true;
               }
            }

            if (!var6) {
               var7 = 154 + at.a.nextInt(10);
               var4 = 4;
            }

            var9[var5] = var7;
            if (var4 == 4) {
               var9[var5 + 1] = 1 + at.a.nextInt(9);
            } else {
               var9[var5 + 1] = 1;
            }
         }

         return var9;
      }
   }

   private int a(cw[] var1, int var2) {
      int var3 = 0;
      boolean var4 = false;

      while(!var4) {
         if (at.a.nextInt(100) < 20) {
            var3 = var2;
         } else if (at.a.nextInt(100) < 40) {
            int[] var5;
            var3 = (var5 = var1[bl.a().a()].a())[at.a.nextInt(var5.length)];
         } else {
            var3 = at.a.nextInt(100);
         }

         if (bl.a().a() == 15) {
            var3 = bl.a().a()[at.a.nextInt(bl.a().a().length)];
         }

         var4 = true;

         int var7;
         for(var7 = 0; var7 < this.a.length; ++var7) {
            if (var3 == this.a[var7]) {
               var4 = false;
               break;
            }
         }

         var7 = 0;

         for(int var6 = 0; var6 < var1.length; ++var6) {
            if (var1[var6].a(var3)) {
               var7 = var6;
               break;
            }
         }

         if (!bl.a()[var7]) {
            var4 = false;
         }

         if (var1[var7].b() == null && var7 != bl.a().a()) {
            var4 = false;
         }
      }

      return var3;
   }

   public final ca[] a(bd var1) {
      ca[] var2 = bl.a();
      int var3 = 0;
      boolean var4 = bl.a() > 16;

      int var5;
      for(var5 = 0; var5 < var2.length; ++var5) {
         if (var2[var5].e() == var1.b() && var4) {
            ++var3;
         }
      }

      ca[] var11 = new ca[g.c(5, var3 + 3 + at.a.nextInt(2))];
      var5 = 0;

      int var6;
      for(var6 = 0; var6 < var2.length; ++var6) {
         if (var2[var6].e() == var1.b() && var4) {
            var11[var5++] = var2[var6];
         }
      }

      boolean var15 = false;

      int var17;
      label176:
      for(int var9 = var5; var9 < var11.length; ++var9) {
         boolean var14 = false;
         var5 = bl.a().c();
         if (at.a.nextInt(100) < 20) {
            var5 = at.a.nextInt(8);
         }

         boolean var7 = false;
         int var8 = -1;

         while(true) {
            do {
               if (var7) {
                  if (at.a.nextInt(100) < 33 || (var8 == 5 || var8 == 6) && bl.a() < 16) {
                     var8 = 0;
                  }

                  var7 = var8 != 6 && var5 == 0 ? at.a.nextInt(100) < 60 : true;
                  ca var12;
                  (var12 = new ca(-1, ad.a(var5, var7), var1.b(), bl.a().a(), var5, var7, -1, -1, -1)).b(var8);
                  var12.a(e.a(var7, var5));
                  if (var12.b() == 6) {
                     String[] var18 = new String[var5 = at.a.nextInt(3)];

                     for(var8 = 0; var8 < var5; ++var8) {
                        var18[var8] = ad.a(var12.c(), true);
                     }

                     var12.b = null;
                     var12.c = null;
                     var12.a = 0;
                     if (var18.length > 0 && var18[0] != null) {
                        var12.b = var18[0];
                        ++var12.a;
                     }

                     if (var18.length > 1 && var18[1] != null) {
                        var12.c = var18[1];
                        ++var12.a;
                     }

                     var12.c((var5 + 1) * (700 + at.a.nextInt(1300)));
                  } else if (var12.b() == 2) {
                     v[] var16 = ad.a();
                     var7 = false;

                     while(true) {
                        while((var17 = at.a.nextInt(var16.length)) == 175) {
                        }

                        if (var17 != 164 && var17 != 131 && var16[var17].a() == null && var16[var17].e() != 0) {
                           v var19 = var16[var17];
                           var5 = 5 + at.a.nextInt(15);
                           if (var19.b() == 3 || var19.b() == 0 || var19.b() == 2) {
                              var5 = 1;
                           }

                           var8 = var5 * (int)((float)(40 + at.a.nextInt(120)) / 100.0F * (float)ad.a()[var17].e());
                           var12.a(var17, var5, var8);
                           break;
                        }
                     }
                  }

                  var11[var9] = var12;
                  if (var11[var9].b() == 6) {
                     if (var15) {
                        var11[var9].b(1);
                     }

                     var15 = true;
                  } else if (var11[var9].b() == 0) {
                     var11[var9].a(this.a(var11[var9]));
                  }
                  continue label176;
               }

               var8 = at.a.nextInt(7);
            } while(var5 == 1 && var8 == 6);

            if (var8 != 4 && var8 != 3) {
               var7 = true;
            }
         }
      }

      cs var10 = bl.a();
      int[] var13 = new int[]{2, 3, 0, 1};

      for(var5 = 0; var5 < var13.length; ++var5) {
         var6 = var13[var5];
         if (var10.a(var6)) {
            for(var17 = 0; var17 < var11.length; ++var17) {
               if (var11[var17].c() && var11[var17].b() != 7) {
                  var11[var17] = null;
                  var11[var17] = new ca(-1, ad.a(var6, true), var1.b(), bl.a().a(), var6, true, -1, -1, -1);
                  var11[var17].b(7);
                  var11[var17].a(e.a(true, var6));
                  break;
               }
            }
         }
      }

      return var11;
   }

   public final cl a(ca var1) {
      new av();
      cw[] var2 = av.a();
      int var3 = this.a(var2, var1.e());
      if (bl.a().a() == 15) {
         var3 = bl.a().a()[0] + at.a.nextInt(4);
      }

      boolean var4 = false;
      int var5 = 0;

      while(!var4) {
         if ((var5 = at.a.nextInt(13)) != 8) {
            var4 = true;
         }
      }

      if (bl.a() < 16) {
         switch(at.a.nextInt(5)) {
         case 0:
            var5 = 11;
            break;
         case 1:
            var5 = 0;
            break;
         case 2:
            var5 = 7;
            break;
         case 3:
            var5 = 4;
            break;
         case 4:
            var5 = 12;
         }
      }

      if (var5 == 12) {
         var3 = var1.e();
      }

      if (var1.b() == 5) {
         var5 = 8;
         var3 = var1.e();
      }

      if (var5 == 11 || var5 == 0) {
         while(var3 == bl.a().b()) {
            var3 = this.a(var2, var1.e());
         }
      }

      int var14 = var1.c();
      String var6 = var1.a;
      boolean var7 = false;
      int var8 = 0;
      int var9 = 0;
      int var15;
      if (bl.a() < 16) {
         var15 = 1 + at.a.nextInt(2);
      } else {
         var15 = 1 + at.a.nextInt(9);
      }

      if (var5 == 8) {
         v[] var10 = ad.a();
         boolean var11 = false;

         int var17;
         do {
            do {
               do {
                  do {
                     var17 = 97 + at.a.nextInt(var10.length - 97);
                  } while(var10[var17].e() == 0);
               } while(var17 == 175);
            } while(var17 == 164);
         } while(var17 == 131);

         var9 = var17;
         var8 = 5 + at.a.nextInt(15);
         var15 = var10[var17].c();
      } else if (var5 != 3 && var5 != 5) {
         if (var5 == 0) {
            var8 = 5 + (int)(95.0F * ((float)var15 / 10.0F));
            var9 = at.a.nextInt(7);
         } else if (var5 == 11) {
            var8 = 2 + (int)(18.0F * ((float)var15 / 10.0F));
         } else if (var5 == 2) {
            var8 = 2 + (int)((float)at.a.nextInt(4));
         }
      } else {
         var8 = 2 + (int)(8.0F * ((float)var15 / 10.0F));
         var9 = var5 == 3 ? 116 : 117;
      }

      var15 = g.c(10, var15);
      float var16 = 1.0F + bv.a(var2[bl.a().a()], var2[bv.a(var3).a()]) / 1200.0F;
      float var18 = (var18 = (float)(1500 + (int)((float)var15 / 10.0F * 5500.0F))) * var16 + (float)(bl.m() * 200);
      if (var5 == 7) {
         var18 *= 0.7F;
      } else if (var5 == 9) {
         var18 *= 1.2F;
      } else if (var5 == 8) {
         var18 = var18 / 2.0F + (float)(var8 * ad.a()[var9].g() * 3);
      } else if (var5 == 11) {
         var18 = (var18 *= 0.6F) + (float)var8 * (var18 / 5.0F);
      } else if (var5 == 5 || var5 == 3) {
         var18 *= 2.0F;
      }

      int var13 = (int)var18 % 50;
      var18 = (var18 + (float)var13) % 50.0F == 0.0F ? var18 + (float)var13 : var18 - (float)var13;
      cl var12 = new cl(var5, var6, var1.a(), var14, (int)var18, var3, var15);
      var3 = (int)(var18 / 10.0F + (float)at.a.nextInt((int)var18 / 10));
      if (var5 == 8) {
         var3 = (int)((float)var3 * 0.5F);
      } else if (var5 == 6) {
         var12.a(ad.a(0, true));
      }

      var13 = var3 % 50;
      var3 = (var3 + var13) % 50 == 0 ? var3 + var13 : var3 - var13;
      var12.b(var3);
      var12.a(var9, var8);
      return var12;
   }
}
