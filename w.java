public final class w {
   public int a;
   public int b;
   public int c;
   public int d;

   private w(int var1, int var2, int var3, int var4) {
      this.a = 0;
      this.b = 0;
      this.c = 0;
      this.d = 4096;
   }

   public w() {
      this(0, 0, 0, 4096);
   }

   public final String toString() {
      return "AEQuaternion | " + this.a + ",\t" + this.b + ",\t" + this.c + ",\t" + this.d;
   }
}
