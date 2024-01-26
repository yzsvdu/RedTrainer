/* 1 */ package f;public final class Iq0 { public final String Kg(byte paramByte) { if (paramByte < 0) return Ml0.la(2361, "STR_B_BOX");  String str; if ((str = (String)this.MG0.Ha0(paramByte)) != null && !isEmpty()) return this;  if (Ml0.nW
/* 2 */       .return(1119))
/* 3 */       return Ml0.Go(1119, String.valueOf(paramByte + 1)); 
/* 4 */     return XD0.SD0("STR_BOX_", paramByte); }
/*   */ 
/*   */   
/*   */   public static final Matcher rb = Pattern.compile("[ |\\p{L}|\\p{N}|\\p{P}]{1,20}").matcher("");
/*   */   public static final byte[] j = new byte[0];
/*   */   public jt MG0;
/*   */   public byte[] K4;
/*   */   
/*   */   public Iq0() {
/*   */     this();
/*   */     ak ak;
/*   */     this(this, j);
/*   */   }
/*   */   
/*   */   public Iq0(ak paramak, byte[] paramArrayOfbyte) {
/*   */     this.MG0 = paramak;
/*   */     this.K4 = paramArrayOfbyte;
/*   */   }
/*   */   
/*   */   public final void kq(byte paramByte, String paramString) {
/*   */     if (paramString.isEmpty() || !rb.reset(paramString).matches()) {
/*   */       this.MG0.Lt(paramByte);
/*   */       return;
/*   */     } 
/*   */     this.MG0.VF(paramByte, paramString);
/*   */   }
/*   */   
/*   */   public final int cm0(int paramInt) {
/*   */     if (paramInt < 0 || paramInt >= this.K4.length)
/*   */       return paramInt; 
/*   */     byte[] arrayOfByte;
/*   */     for (byte b = 0; b < (arrayOfByte = this.K4).length; b++) {
/*   */       if (arrayOfByte[b] == paramInt)
/*   */         return b; 
/*   */     } 
/*   */     return paramInt;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Iq0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */