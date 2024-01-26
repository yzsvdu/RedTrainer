/* 1 */ package f;public final class eB extends IK0 { public static eB ki0(ByteBuffer paramByteBuffer) { int i = paramByteBuffer.position(); this(); eB eB1; w00 w001; Supplier supplier; this(paramByteBuffer, 810570818); (new eB()).G = new w00(); if (!w001.ib) return null;  w00 w002; for (byte b = 0; b < (w002 = eB1.G).gi; ) { paramByteBuffer.position(i + w002.fD[b]); int j = 810828112; boolean bool = false; if (paramByteBuffer.getInt() == j) { paramByteBuffer.getInt(); bool = true; }  if (!bool) return null; 
/* 2 */       supplier = iG::new;
/*   */       
/* 4 */       eB1.tW = (new Yy0(paramByteBuffer, supplier, i + eB1.G.fD[b])).ai0; b++; }  paramByteBuffer.position(i + ((w00)supplier).r3); return eB1; }
/*   */ 
/*   */   
/*   */   public w00 G;
/*   */   public fQ tW;
/*   */   
/*   */   public eB() {
/*   */     fQ fQ1;
/*   */     this();
/*   */     this.tW = this;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/eB.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */