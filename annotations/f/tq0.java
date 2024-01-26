/* 1 */ package f;public final class tq0 extends IK0 { public static tq0 NM(ByteBuffer paramByteBuffer) { int i = paramByteBuffer.position(); this(); tq0 tq01; w00 w001; this(paramByteBuffer, 809585986); (new tq0()).bk0 = new w00(); if (!w001.ib) return null;  w00 w002; for (byte b = 0; b < (w002 = tq01.bk0).gi; ) { paramByteBuffer.position(i + w002.fD[b]); int j = 810828109; boolean bool = false; if (paramByteBuffer.getInt() == j) { paramByteBuffer.getInt(); bool = true; }  if (!bool) return null; 
/* 2 */       Supplier supplier = VH0::new;
/*   */       
/* 4 */       tq01.D2 = (new Yy0(paramByteBuffer, supplier, i + tq01.bk0.fD[b])).ai0; b++; }  return tq01; }
/*   */ 
/*   */   
/*   */   public w00 bk0;
/*   */   public fQ D2; }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/tq0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */