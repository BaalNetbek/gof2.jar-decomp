import java.util.Vector;

public final class ae {
   public final int[] a(cw[] var1, int var2, int var3) {
      d[] var4 = new d[var1.length];

      int var5;
      for(var5 = 0; var5 < var1.length; ++var5) {
         var4[var5] = new d(this, var5);
      }

      int var6;
      for(var5 = 0; var5 < var1.length; ++var5) {
         int[] var7;
         if ((var7 = var1[var5].b()) != null) {
            for(var6 = 0; var6 < var7.length; ++var6) {
               if (bl.a()[var1[var7[var6]].a()]) {
                  var4[var5].a.addElement(var4[var7[var6]]);
               }
            }
         }
      }

      d var10001 = var4[var2];
      d var10 = var4[var3];
      d var9 = var10001;
      Vector var8 = new Vector();
      Vector var11;
      (var11 = new Vector()).addElement(var9);
      var9.a = null;

      Vector var10000;
      label56:
      while(true) {
         if (!var11.isEmpty()) {
            var9 = (d)var11.firstElement();
            var11.removeElementAt(0);
            if (var9 == var10) {
               var10000 = a(var10);
               break;
            }

            var8.addElement(var9);
            var6 = 0;

            while(true) {
               if (var6 >= var9.a.size()) {
                  continue label56;
               }

               d var13 = (d)var9.a.elementAt(var6);
               if (!var8.contains(var13) && !var11.contains(var13)) {
                  var13.a = var9;
                  var11.addElement(var13);
               }

               ++var6;
            }
         }

         var10000 = null;
         break;
      }

      var11 = var10000;
      int[] var12 = null;
      if (var11 != null && var11.size() > 0) {
         (var12 = new int[var11.size() + 1])[0] = var2;

         for(int var14 = 1; var14 < var12.length; ++var14) {
            var12[var14] = ((d)var11.elementAt(var14 - 1)).a;
         }
      }

      return var12;
   }

   private static Vector a(d var0) {
      Vector var1;
      for(var1 = new Vector(); var0.a != null; var0 = var0.a) {
         var1.insertElementAt(var0, 0);
      }

      return var1;
   }
}
