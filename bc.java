public final class bc {
   private static String a;
   private static String b;
   private static String c;

   private bc() {
   }

   public static String a(long var0) {
      int var2 = (int)(var0 / 1000L % 60L);
      int var3 = (int)(var0 / 60000L % 60L);
      int var4 = (int)(var0 / 3600000L % 24L);
      a = (var2 < 10 ? "0" : "") + var2;
      b = (var3 < 10 ? "0" : "") + var3;
      if (var4 == 0) {
         return new String(b + ":" + a);
      } else {
         int var5 = (int)(var0 / 3600000L / 24L);
         var4 += var5 * 24;
         c = (var4 < 10 ? "0" : "") + var4;
         return new String(c + ":" + b + ":" + a);
      }
   }

   public static String b(long var0) {
      int var2 = (int)(var0 / 60000L % 60L);
      int var3 = (int)(var0 / 3600000L % 24L);
      b = (var2 < 10 ? "0" : "") + var2;
      int var4 = (int)(var0 / 3600000L / 24L);
      var3 += var4 * 24;
      c = (var3 < 10 ? "0" : "") + var3;
      return new String(c + ":" + b);
   }
}
