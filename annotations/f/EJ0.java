/* 1 */ package f;public final class EJ0 { public final pr kr(byte paramByte, DK paramDK) { if (!paramDK.Iq) paramByte = 0; 
/* 2 */     byte b = paramDK.tl0; int i = paramByte * 16 + b; pr pr;
/* 3 */     if ((pr = (pr)this.wS.get(Integer.valueOf(i))) == null) { this(paramDK, paramByte); this.wS.put(Integer.valueOf(i), pr); }  return pr; }
/*   */ 
/*   */   
/*   */   public final HashMap wS;
/*   */   
/*   */   public EJ0() {
/*   */     HashMap<Object, Object> hashMap;
/*   */     this();
/*   */     this.wS = this;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/EJ0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */