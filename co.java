import java.io.DataInputStream;
import java.io.InputStream;

public final class co {
   public static final short[] a = new short[]{157, 157, 157, 37, 36, 36, 36, 36, 36, 50, 42, 53, 54, 57, 43, 59, 52, 53, 60, 44, 58, 56, 45, 58, 53, 55, 58, 45, 46, 47, 59, 48, 49, 58, 53, 69};
   public static final short[] b = new short[]{112, 296, 275, 79, 130, 218, 72, 146, 297, 63, 298};
   public static final short[] c = new short[]{306, 307, 308, 309, 312, 314, 315, 320, 321, 323, 324};
   public static final short[] d = new short[]{8, 9, 10, 16};
   public static final short[] e = new short[]{165, 166, 167, 168, 169, 169, 170, 171, 172, 173, 174, 175, 176, 177};
   public static final short[] f = new short[]{389, 389, 389, 389, 389, 389, 389, 389, 389, 389, 389, 389, 389, 373, 374, 389, 375, 389, 376, 389, 377, 377, 389, 378, 379, 389, 389, 389, 380, 389, 389, 389, 381, 382, 383, 384, 385, 389, 386, 389, 387, 389, 389, 388, 389};
   public static final short[] g = new short[]{201, 202, 203, 204, 205};
   public static final short[] h = new short[]{195, 196, 197, 198, 199};
   public static final short[] i = new short[]{206, 207, 208, 209, 210};
   private static final int[] a = new int[]{12, 5, 1, 2, 8, 5, 5, 5, 5, 6, 8, 17, 19, 9, 9, 4, 9, 12, 8, 12, 14, 9, 3, 14, 19, 9, 27, 5, 4, 13, 6, 17, 2, 9, 4, 7, 2, 10, 2, 4, 8, 6, 12, 12, 7, 9, 32};
   private static String[] a = new String[1198];
   private static String[] b = new String[422];
   private static String[] c = new String[22];
   private static String[] d = new String[162];
   private static String[] e = new String[48];
   private static String[][] a = new String[47][];
   private static int a;
   private static String a;
   private static int b;
   private static int c;
   private static int d;

   public final void a(int var1) {
      a = "/data/lang/";
      a = var1;
      switch(var1) {
      case 0:
         a = a + "de/";
         break;
      case 1:
         a = a + "en/";
         break;
      case 2:
         a = a + "es/";
         break;
      case 3:
         a = a + "fr/";
         break;
      case 4:
         a = a + "it/";
         break;
      case 5:
         a = a + "cz/";
         break;
      case 6:
         a = a + "ru/";
         break;
      case 7:
         a = a + "pl/";
         break;
      case 8:
         a = a + "pt/";
      }

      if (a == 0) {
         this.a(a, "de");
      } else if (a == 6) {
         this.a(a, "ru");
      } else {
         this.a(a, "en");
      }

      a();
   }

   private void a(String[] var1, String var2) {
      InputStream var3 = null;

      int var6;
      try {
         var3 = this.getClass().getResourceAsStream(a + var2 + ".lang");
         DataInputStream var5 = new DataInputStream(var3);

         for(var6 = 0; var6 < var1.length; ++var6) {
            var1[var6] = var5.readUTF();
         }

         var5.close();
      } catch (Exception var4) {
         for(var6 = 0; var6 < var1.length; ++var6) {
            var1[var6] = "<ERROR|LANG>";
         }

      }
   }

   public final String a(int var1) {
      if (var1 < 1198) {
         return a[var1];
      } else if (var1 < 422) {
         return b[var1];
      } else if (var1 < 444) {
         b = var1 - 422;
         if (c[b] == null) {
            this.a(c, "ships");
         }

         return c[b];
      } else if (var1 < 606) {
         b = var1 - 444;
         if (d[b] == null) {
            this.a(d, "items");
         }

         return d[b];
      } else if (var1 < 654) {
         b = var1 - 606;
         if (e[b] == null) {
            this.a(e, "medals");
         }

         return e[b];
      } else {
         b = var1 - 654;
         c = 0;

         for(var1 = 0; var1 < a.length; ++var1) {
            c += a[var1];
            if (b < c) {
               d = b - (c - a[var1]);
               c = var1;
               break;
            }
         }

         if (a[c][d] == null) {
            this.a(a[c], "" + c);
         }

         return a[c][d];
      }
   }

   public static void a() {
      for(int var0 = 0; var0 < a.length; ++var0) {
         a[var0] = new String[a[var0]];
      }

      c = new String[22];
      d = new String[162];
      e = new String[48];
   }

   static {
      a = at.c;
   }
}
