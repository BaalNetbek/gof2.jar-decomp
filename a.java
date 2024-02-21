import javax.microedition.lcdui.Image;

public final class a {
   public static int a = -14328435;
   public static int b = -14398096;
   public static int c = -15914687;
   public static int d = -14935012;
   private static int e;
   private static Image a;
   private static Image b;
   private static Image c;
   private static Image d;
   private static Image e;
   private static Image f;
   private static Image g;
   private static int[] a;
   private static long a;
   private static long b;
   private static int f;
   private static boolean a;
   private static boolean b;

   private a() {
   }

   public static void a() {
      a = null;
   }

   public static void b() {
      e = 10;
      if (a == null) {
         String var0 = "/data/interface/skip.png";
         a = ai.a("/data/interface/skip.png", true);
         var0 = "/data/interface/menu_background.png";
         c = ai.a("/data/interface/menu_background.png", true);
         var0 = "/data/interface/menu_header_pattern.png";
         d = ai.a("/data/interface/menu_header_pattern.png", true);
         var0 = "/data/interface/menu_main_corner.png";
         e = ai.a("/data/interface/menu_main_corner.png", true);
         var0 = "/data/interface/menu_panel_corner_inactive.png";
         f = ai.a("/data/interface/menu_panel_corner_inactive.png", true);
         var0 = "/data/interface/menu_panel_corner_active.png";
         g = ai.a("/data/interface/menu_panel_corner_active.png", true);
      }

      if (a == null) {
         a = new int[1024];

         for(int var1 = 0; var1 < a.length; ++var1) {
            a[var1] = -2013265920;
         }
      }

   }

   public static void a(int var0) {
      b += (long)var0;
      a += (long)var0;
   }

   public static boolean a() {
      if (b > 1000L) {
         if (b > 2000L) {
            b = 0L;
         }

         return true;
      } else {
         return false;
      }
   }

   public static boolean b() {
      if (a > 300L) {
         if (a > 600L) {
            a = 0L;
         }

         return true;
      } else {
         return false;
      }
   }

   public static void a(int var0, int var1, int var2, int var3) {
      at.a.setClip(10, var1, var2, var3);
      c();
      at.a.setClip(0, 0, at.f, at.g);
   }

   public static void c() {
      for(int var0 = 0; var0 < at.f / 32 + 1; ++var0) {
         for(int var1 = 0; var1 < at.g / 32 + 1; ++var1) {
            at.a.drawRGB(a, 0, 32, var0 << 5, var1 << 5, 32, 32, true);
         }
      }

   }

   public static void a(String var0, int var1, int var2, int var3, boolean var4) {
      a(var0, var1, var2, var3, var4, false);
   }

   public static void a(String var0, int var1, int var2, int var3, boolean var4, boolean var5, boolean var6) {
      q.a(var0, var5 ? var1 + (var3 >> 1) : var1 + 12, var2 + 1, var4 ? 2 : 1, var5 ? 24 : 17);
      if (var6) {
         if (b == null) {
            String var7 = "/data/interface/lock.png";
            b = ai.a("/data/interface/lock.png", true);
         }

         if (bl.a() < 13 && (var0.equals(at.a.a(218)) || var0.equals(at.a.a(33))) || bl.a() < 9 && var0.equals(at.a.a(72)) || bl.a() < 5 && var0.equals(at.a.a(62))) {
            at.a.drawImage(b, var1 + 3, var2 + 2, 0);
         }
      }

   }

   public static void a(String var0, int var1, int var2, int var3, boolean var4, boolean var5) {
      a(var0, var1, var2, var3, var4, var5, false);
   }

   public static void d() {
      a(0, 0, at.f, at.g, c);
   }

   private static void a(int var0, int var1, int var2, int var3, Image var4) {
      int var5 = var4.getWidth();
      int var6 = var4.getHeight();
      at.a.setClip(var0, var1, var2, var3);

      for(int var7 = 0; var7 < var2 / var5 + 1; ++var7) {
         for(int var8 = 0; var8 < var3 / var6 + 1; ++var8) {
            at.a.drawImage(var4, var0 + var7 * var5, var1 + var8 * var6, 20);
         }
      }

      at.a.setClip(0, 0, at.f, at.g);
   }

   public static void a(String var0) {
      a(var0, false);
   }

   public static void a(String var0, boolean var1) {
      at.a.setColor(0);
      at.a.drawRect(0, 0, at.f - 1, at.g - 1);
      at.a.drawLine(0, at.g - 2, at.f, at.g - 2);
      a(var0, 1, 1, at.f - 3, at.g - 8 - e, false);
   }

   public static String a(int var0) {
      String var4 = String.valueOf(var0);
      int var1 = 0;
      String var2 = "";

      for(int var3 = var4.length() - 1; var3 >= 0; --var3) {
         ++var1;
         var2 = var4.charAt(var3) + var2;
         if (var1 == 3 && var3 > 0) {
            var1 = 0;
            var2 = "." + var2;
         }
      }

      if (var2.length() > 2 && var2.charAt(1) == '.' && var2.charAt(0) == '-') {
         var2 = var2.substring(2);
         var2 = "-" + var2;
      }

      return var2 + "$";
   }

   public static void a(String var0, int var1, int var2, int var3, int var4) {
      a(var0, var1, var2, var3, var4, true);
   }

   public static void a(String var0, int var1, int var2, int var3, int var4, boolean var5) {
      if (var5) {
         a(var1, var2, var3, var4, c);
      }

      at.a.setColor(0);
      at.a.drawRect(var1 + 1, var2 + 1, var3 - 2, var4 - 2);
      at.a.setColor(a);
      at.a.drawRect(var1 + 2, var2 + 2, var3 - 4, var4 - 4);
      b(var1, var2, var3, var4);
      if (var0 != null) {
         a(var1 + 2, var2 + 2, var3 - 3, 11, d);
         at.a.setColor(a);
         at.a.drawLine(var1 + 2, var2 + 14, var1 + var3 - 3, var2 + 14);
         at.a.setColor(0);
         at.a.drawLine(var1 + 1, var2 + 13, var1 + var3 - 2, var2 + 13);
         at.a.drawImage(e, var1, var2, 20);
      }

      if (var0 != null && !var0.equals("")) {
         q.b(var0, var1 + 6, var2 + 1, 0);
      }

   }

   public static void a(int var0, int var1, boolean var2) {
      at.a.drawImage(var2 ? g : f, var0, var1, 20);
   }

   public static void a(String var0, String var1) {
      String var10000 = var0;
      boolean var2 = true;
      b(var10000, var1, false);
   }

   public static void a(boolean var0) {
      a = var0;
      f = 5;
   }

   public static boolean c() {
      return f <= 0;
   }

   public static void e() {
      --f;
   }

   public static void b(boolean var0) {
      b = var0;
   }

   public static void b(String var0, int var1, int var2, int var3, int var4) {
      String var10000 = var0;
      boolean var5 = true;
      String var6;
      q.a((String)((var6 = q.a(var0 = var10000.trim(), var3 - 2, 0, true)).equals(var0) ? var0 : var6 + "..."), var1, var2, var4, 17);
   }

   public static void a(String var0, String var1, boolean var2) {
      b(var0, var1, false);
   }

   private static void b(int var0, int var1, int var2, int var3) {
      at.a.setColor(b);
      at.a.drawLine(var0, var1, var0 + var2, var1);
      at.a.drawLine(var0 + var2, var1, var0 + var2, var1 + var3);
      at.a.setColor(c);
      at.a.drawLine(var0, var1, var0, var1 + var3);
      at.a.drawLine(var0, var1 + var3, var0 + var2, var1 + var3);
   }

   public static void b(String var0, String var1, boolean var2) {
      boolean var3 = a && f > 0 && !var0.equals("") || b;
      boolean var4 = !a && f > 0 && !var1.equals("");
      a(3, at.g - 15, at.f - 5, 11, d);
      b(1, at.g - 17, at.f - 3, 14);
      at.a.setColor(0);
      at.a.drawRect(2, at.g - 16, at.f - 5, 12);
      q.a((String)var0, 10, at.g - 4, var3 ? 2 : 1, 33);
      q.a((String)var1, at.f - 10, at.g - 4, var4 ? 2 : 1, 34);
      if (var2) {
         at.a.drawImage(a, at.f >> 1, at.g - 5, 33);
      }

   }
}
