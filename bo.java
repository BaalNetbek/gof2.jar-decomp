public final class bo {
   private static int[] a;
   private static aq[] a;
   private static String[] a;
   private static boolean[] a;
   private static int[] b;
   private static ag[] a;
   private static int[] c;
   private static String[] b;
   private static boolean[] b;
   private static int[] d;

   public static void a(int var0, String var1) {
      if (a == null) {
         (a = new String[1])[0] = var1;
         a = new aq[1];
         (a = new int[1])[0] = 0;
         (a = new boolean[1])[0] = false;
      } else {
         String[] var2 = new String[a.length + 1];
         System.arraycopy(a, 0, var2, 0, a.length);
         var2[a.length] = var1;
         a = var2;
         aq[] var3 = new aq[a.length + 1];
         System.arraycopy(a, 0, var3, 0, a.length);
         a = var3;
         int[] var4 = new int[a.length + 1];
         System.arraycopy(a, 0, var4, 0, a.length);
         var4[a.length] = 0;
         a = var4;
         boolean[] var5 = new boolean[a.length + 1];
         System.arraycopy(a, 0, var5, 0, a.length);
         var5[a.length] = false;
         a = var5;
      }
   }

   public static void a(int var0, String var1, int var2, int var3) {
      if (b == null) {
         (b = new String[1])[0] = var1;
         (c = new int[1])[0] = var2;
         a = new ag[1];
         (b = new int[1])[0] = var0;
         (b = new boolean[1])[0] = false;
         (d = new int[1])[0] = var3;
      } else {
         String[] var4 = new String[b.length + 1];
         System.arraycopy(b, 0, var4, 0, b.length);
         var4[b.length] = var1;
         b = var4;
         int[] var7 = new int[c.length + 1];
         System.arraycopy(c, 0, var7, 0, c.length);
         var7[c.length] = var2;
         c = var7;
         ag[] var8 = new ag[a.length + 1];
         System.arraycopy(a, 0, var8, 0, a.length);
         a = var8;
         var7 = new int[b.length + 1];
         System.arraycopy(b, 0, var7, 0, b.length);
         var7[b.length] = var0;
         b = var7;
         boolean[] var5 = new boolean[b.length + 1];
         System.arraycopy(b, 0, var5, 0, b.length);
         var5[b.length] = false;
         b = var5;
         int[] var6 = new int[d.length + 1];
         System.arraycopy(d, 0, var6, 0, d.length);
         var6[d.length] = var3;
         d = var6;
      }
   }

   public static void a(int var0, String var1, int var2) {
      a(9991, var1, -1, 0);
   }

   public static aq a(int var0) {
      for(int var1 = 0; var1 < a.length; ++var1) {
         if (var0 == a[var1]) {
            a[var1] = true;
            if (a[var1] == null) {
               String[] var2 = new String[]{a[var1]};
               return a[var1] = new cj(var2);
            }

            return a[var1];
         }
      }

      return null;
   }

   public static ag a(int var0) {
      for(int var1 = 0; var1 < b.length; ++var1) {
         if (var0 == b[var1]) {
            b[var1] = true;
            if (a[var1] == null) {
               int var10002;
               String var2;
               if (c[var1] == -1) {
                  var10002 = b[var1];
                  var2 = b[var1];
                  var0 = var10002;
                  a[var1] = new r(var0, var2);
               } else {
                  var10002 = b[var1];
                  String var10003 = b[var1];
                  int var3 = c[var1];
                  var2 = var10003;
                  var0 = var10002;
                  a[var1] = new bg(var0, var2, var3);
               }

               if (a[var1] != null && d[var1] != Integer.MIN_VALUE) {
                  a[var1].a(a(d[var1]));
               }

               return a[var1];
            }

            return (ag)a[var1].a();
         }
      }

      System.out.println("ERROR | AEResourceManager.getGeometryResource(" + var0 + ") not found !");
      return null;
   }

   public static void a() {
      b();

      for(int var0 = 0; var0 < a.length; ++var0) {
         if (a[var0] != null) {
            a[var0].a();
            a[var0] = null;
         }
      }

   }

   public static void b() {
      for(int var0 = 0; var0 < a.length; ++var0) {
         if (a[var0] != null) {
            a[var0].a();
            a[var0] = null;
         }
      }

   }

   public static void c() {
      for(int var0 = 0; var0 < a.length; ++var0) {
         if (a[var0] != null) {
            a[var0].a(new cm());
         }
      }

   }
}
