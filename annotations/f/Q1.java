/* 1 */ package f;public final class Q1 { public FA0 ij; public Wd Qo0; public int Ew; public hC[] Nt; public static hC[] lE0(int paramInt, ByteBuffer paramByteBuffer) { return (hC[])(new Yy0(paramByteBuffer, hC::new, paramInt)).ai0
/* 2 */       .Ib(hC.class); } public static Q1 tB(ByteBuffer paramByteBuffer) { this(); Q1 q1; (q1 = new Q1()).Ew = paramByteBuffer.position(); (q1.ij = new FA0(paramByteBuffer)).sV(809782594); if ((new Q1()).ij.w6 <= paramByteBuffer.limit()) { short s; int[] arrayOfInt; byte b; for (arrayOfInt = new int[s = q1.ij.ua0], b = 0; b < s; ) { int i = q1.Ew; arrayOfInt[b] = paramByteBuffer.getInt() + i; b++; }  for (b = 0; b < s; ) { paramByteBuffer.position(arrayOfInt[b]); int i; if ((i = paramByteBuffer.getInt()) != 810304589) { if (i == 811091284) { paramByteBuffer.position(arrayOfInt[b]); q1.Qo0 = new Wd(false, paramByteBuffer); } else { throw new RuntimeException(XD0.SD0("Unknown block = ", i)); }  } else { paramByteBuffer.position(arrayOfInt[b] + 8); q1.Nt = lE0(arrayOfInt[b], paramByteBuffer); }  b++; }  return q1; }  throw new RuntimeException("filesize greater than buffer limit"); }
/*   */ 
/*   */   
/*   */   static {
/*   */     C00.gd(Q1.class);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Q1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */