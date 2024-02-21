import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class av {
   private static Class a;

   public final bd a(int var1) {
      return a(new short[]{(short)var1})[0];
   }

   private static bd[] a(short[] var0) {
      bd[] var1 = null;

      try {
         InputStream var2 = (a == null ? (a = a("java.lang.Class")) : a).getResourceAsStream("/data/txt/stations.bin");
         DataInputStream var12 = new DataInputStream(var2);
         var1 = new bd[var0.length];
         int var8 = 0;

         for(int var9 = 0; var9 < 100; ++var9) {
            String var3 = var12.readUTF();
            int var4 = var12.readInt();
            int var5 = var12.readInt();
            int var6 = var12.readInt();
            int var7 = var12.readInt();

            for(int var10 = 0; var10 < var0.length; ++var10) {
               if (var0[var10] == var9) {
                  var1[var8++] = new bd(var3, var4, var5, var6, var7);
               }
            }
         }

         var12.close();
      } catch (IOException var11) {
         var11.printStackTrace();
      }

      return var1;
   }

   public static int[] a(int var0) {
      int[] var1 = null;

      try {
         InputStream var2 = (a == null ? (a = a("java.lang.Class")) : a).getResourceAsStream("/data/txt/shipparts.bin");
         DataInputStream var7 = new DataInputStream(var2);

         for(int var3 = 0; var3 < 37; ++var3) {
            if (var7.available() == 0) {
               return null;
            }

            byte var4 = var7.readByte();
            var1 = new int[var7.readByte() * 10];

            for(int var5 = 0; var5 < var1.length; var5 += 10) {
               var1[var5] = var7.readShort();
               var1[var5 + 1] = var7.readInt();
               var1[var5 + 2] = var7.readInt();
               var1[var5 + 3] = var7.readInt();
               var1[var5 + 4] = var7.readShort();
               var1[var5 + 5] = var7.readShort();
               var1[var5 + 6] = var7.readShort();
               var1[var5 + 7] = var7.readShort();
               var1[var5 + 8] = var7.readShort();
               var1[var5 + 9] = var7.readShort();
            }

            if (var4 == var0 + 1) {
               return var1;
            }
         }

         var7.close();
      } catch (IOException var6) {
         var6.printStackTrace();
      }

      return var1;
   }

   public static int[] a(int var0, int var1) {
      int[] var2 = null;
      var0 = var1 == 1 ? 100 : var0;

      try {
         InputStream var8 = (a == null ? (a = a("java.lang.Class")) : a).getResourceAsStream("/data/txt/stationparts.bin");
         DataInputStream var9 = new DataInputStream(var8);

         for(int var3 = 0; var3 < 101; ++var3) {
            if (var9.available() == 0) {
               return null;
            }

            byte var4 = var9.readByte();
            short var5 = var9.readShort();
            (var2 = new int[(var9.readByte() + 1) * 7])[0] = var5;
            var2[1] = 0;
            var2[2] = 0;
            var2[3] = 0;
            var2[4] = 0;
            var2[5] = 2048;
            var2[6] = 0;

            for(int var10 = 7; var10 < var2.length; var10 += 7) {
               var2[var10] = var9.readShort();
               var2[var10 + 1] = var9.readInt();
               var2[var10 + 2] = var9.readInt();
               var2[var10 + 3] = var9.readInt();
               var2[var10 + 4] = var9.readShort();
               var2[var10 + 5] = var9.readShort();
               var2[var10 + 6] = var9.readShort();
            }

            if (var4 == var0 + 1) {
               return var2;
            }
         }

         var9.close();
      } catch (IOException var7) {
         var7.printStackTrace();
      }

      return var2;
   }

   public static bd[] a(cw var0) {
      bd[] var1 = null;

      try {
         int[] var12 = var0.a();
         InputStream var2 = (a == null ? (a = a("java.lang.Class")) : a).getResourceAsStream("/data/txt/stations.bin");
         DataInputStream var13 = new DataInputStream(var2);
         var1 = new bd[var12.length];
         int var8 = 0;

         for(int var9 = 0; var9 < 100; ++var9) {
            String var3 = var13.readUTF();
            int var4 = var13.readInt();
            int var5 = var13.readInt();
            int var6 = var13.readInt();
            int var7 = var13.readInt();

            for(int var10 = 0; var10 < var12.length; ++var10) {
               if (var12[var10] == var9) {
                  var1[var8++] = new bd(var3, var4, var5, var6, var7);
               }

               if (var8 == var12.length) {
                  return var1;
               }
            }
         }

         var13.close();
      } catch (IOException var11) {
         var11.printStackTrace();
      }

      return var1;
   }

   public static ca[] a() {
      ca[] var0 = null;

      try {
         InputStream var1 = (a == null ? (a = a("java.lang.Class")) : a).getResourceAsStream("/data/txt/agents.bin");
         DataInputStream var14 = new DataInputStream(var1);
         var0 = new ca[16];
         int var11 = 0;

         for(int var12 = 0; var12 < var0.length; ++var12) {
            String var2 = var14.readUTF();
            int var3 = var14.readInt();
            int var4 = var14.readInt();
            int var5 = var14.readInt();
            int var6 = var14.readInt();
            boolean var7 = var14.readInt() == 1;
            int var8 = var14.readInt();
            int var9 = var14.readInt();
            int var10 = var14.readInt();
            var0[var11++] = new ca(var3, var2, var4, var5, var6, var7, var8, var9, var10);
            int var15;
            if ((var15 = var14.readInt()) > 0) {
               byte[] var16 = new byte[var15];

               for(var3 = 0; var3 < var16.length; ++var3) {
                  var16[var3] = var14.readByte();
               }

               var0[var11 - 1].a(var16);
            }
         }

         var14.close();
      } catch (IOException var13) {
         var13.printStackTrace();
      }

      return var0;
   }

   public static cw[] a() {
      cw[] var0 = null;

      try {
         InputStream var1 = (a == null ? (a = a("java.lang.Class")) : a).getResourceAsStream("/data/txt/systems.bin");
         DataInputStream var18 = new DataInputStream(var1);
         var0 = new cw[22];

         for(int var2 = 0; var2 < 22; ++var2) {
            String var3 = var18.readUTF();
            int var4 = var18.readInt();
            boolean var5 = var18.readInt() == 1;
            int var6 = var18.readInt();
            int var7 = var18.readInt();
            int var8 = var18.readInt();
            int var9 = var18.readInt();
            int var10 = var18.readInt();
            int var11 = var18.readInt();
            int[] var12 = new int[var18.readInt()];

            for(int var13 = 0; var13 < var12.length; ++var13) {
               var12[var13] = var18.readInt();
            }

            int[] var19 = new int[var18.readInt()];

            int var14;
            for(var14 = 0; var14 < var19.length; ++var14) {
               var19[var14] = var18.readInt();
            }

            var14 = var18.readInt();
            int[] var15 = null;
            if (var14 > 0) {
               var15 = new int[var14];

               for(var14 = 0; var14 < var15.length; ++var14) {
                  var15[var14] = var18.readInt();
               }
            }

            var14 = var18.readInt();
            int[] var16 = null;
            if (var14 > 0) {
               var16 = new int[var14];

               for(var14 = 0; var14 < var16.length; ++var14) {
                  var16[var14] = var18.readInt();
               }
            }

            var0[var2] = new cw(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var19, var15, var16);
         }

         var18.close();
      } catch (IOException var17) {
         var17.printStackTrace();
      }

      return var0;
   }

   public static v[] a() {
      v[] var0 = null;

      try {
         InputStream var1 = (a == null ? (a = a("java.lang.Class")) : a).getResourceAsStream("/data/txt/items.bin");
         DataInputStream var9 = new DataInputStream(var1);
         var0 = new v[176];
         boolean var2 = false;
         var2 = false;
         var2 = false;
         int[] var3 = null;
         int[] var4 = null;
         int[] var5 = null;

         for(int var6 = 0; var6 < 176; ++var6) {
            int var7;
            int var10;
            if ((var10 = var9.readInt()) > 0) {
               var3 = new int[var10];

               for(var7 = 0; var7 < var10; ++var7) {
                  var3[var7] = var9.readInt();
               }
            }

            if ((var10 = var9.readInt()) > 0) {
               var4 = new int[var10];

               for(var7 = 0; var7 < var10; ++var7) {
                  var4[var7] = var9.readInt();
               }
            }

            if ((var10 = var9.readInt()) > 0) {
               var5 = new int[var10];

               for(var7 = 0; var7 < var10; ++var7) {
                  var5[var7] = var9.readInt();
               }
            }

            var0[var6] = new v(var3, var4, var5);
            var3 = null;
            var4 = null;
            var5 = null;
         }

         var9.close();
      } catch (IOException var8) {
         var8.printStackTrace();
      }

      return var0;
   }

   public static ch[] a() {
      ch[] var0 = null;

      try {
         InputStream var1 = (a == null ? (a = a("java.lang.Class")) : a).getResourceAsStream("/data/txt/ships.bin");
         DataInputStream var4 = new DataInputStream(var1);
         var0 = new ch[37];

         for(int var2 = 0; var2 < 37; ++var2) {
            var0[var2] = new ch(var4.readInt(), var4.readInt(), var4.readInt(), var4.readInt(), var4.readInt(), var4.readInt(), var4.readInt(), var4.readInt(), (float)var4.readInt());
         }

         var4.close();
      } catch (IOException var3) {
         var3.printStackTrace();
      }

      return var0;
   }

   public static String[] a(int var0, boolean var1, boolean var2) {
      String[] var3 = null;
      String var4 = null;
      switch(var0) {
      case 0:
         var4 = var2 ? (var1 ? "names_terran_0_m.bin" : "names_terran_0_w.bin") : "names_terran_1.bin";
         break;
      case 1:
         var4 = var2 ? "names_vossk_0.bin" : "names_vossk_1.bin";
         break;
      case 2:
         var4 = var2 ? "names_nivelian_0.bin" : "names_nivelian_1.bin";
         break;
      case 3:
         if (var2) {
            var4 = at.a.nextInt(2) == 0 ? "names_terran_0_m.bin" : "names_nivelian_0.bin";
         } else {
            var4 = at.a.nextInt(2) == 0 ? "names_terran_1.bin" : "names_nivelian_1.bin";
         }
         break;
      case 4:
         var4 = var2 ? "names_multipod_0.bin" : "names_multipod_1.bin";
         break;
      case 5:
         if (!var2) {
            return null;
         }

         var4 = "names_cyborg_0.bin";
         break;
      case 6:
         var4 = var2 ? "names_bobolan_0.bin" : "names_bobolan_1.bin";
         break;
      case 7:
         if (!var2) {
            return null;
         }

         var4 = "names_grey_0.bin";
         break;
      case 8:
         if (var2) {
            var4 = at.a.nextInt(2) == 0 ? "names_terran_0_m.bin" : "names_nivelian_0.bin";
         } else {
            var4 = at.a.nextInt(2) == 0 ? "names_terran_1.bin" : "names_nivelian_1.bin";
         }
         break;
      default:
         return null;
      }

      try {
         var4 = "/data/txt/" + var4;
         InputStream var6 = (a == null ? (a = a("java.lang.Class")) : a).getResourceAsStream(var4);
         DataInputStream var7;
         int var8;
         var3 = new String[var8 = (var7 = new DataInputStream(var6)).readInt()];

         for(int var9 = 0; var9 < var8; ++var9) {
            var3[var9] = var7.readUTF();
         }

         var7.close();
      } catch (IOException var5) {
         var5.printStackTrace();
      }

      return var3;
   }

   private static Class a(String var0) {
      try {
         return Class.forName(var0);
      } catch (ClassNotFoundException var1) {
         throw new NoClassDefFoundError(var1.getMessage());
      }
   }
}
