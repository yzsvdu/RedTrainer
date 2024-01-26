/* 1 */ package f;public final class uv extends IK0 { public static uv vb0(ByteBuffer paramByteBuffer) { int i = paramByteBuffer.position(); this(); uv uv1; w00 w001; Supplier supplier; this(paramByteBuffer, 809587778); (new uv()).JU = new w00(); if (!w001.ib) return null;  w00 w002; for (byte b = 0; b < (w002 = uv1.JU).gi; ) { paramByteBuffer.position(i + w002.fD[b]); int j = 810832467; boolean bool = false; if (paramByteBuffer.getInt() == j) { paramByteBuffer.getInt(); bool = true; }  if (!bool) return null; 
/* 2 */       supplier = xe::new;
/*   */       
/* 4 */       uv1.v9 = (new Yy0(paramByteBuffer, supplier, i + uv1.JU.fD[b])).ai0; b++; }  paramByteBuffer.position(i + ((w00)supplier).r3); return uv1; }
/*   */ 
/*   */   
/*   */   public w00 JU;
/*   */   public fQ v9; }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/uv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */