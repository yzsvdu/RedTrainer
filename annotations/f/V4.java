/* 1 */ package f;public class V4 { public final void Gd(nl... paramVarArgs) { byte b; for (this.AC0 = paramVarArgs, b = 0; b < paramVarArgs.length; ) { nl nl1; if ((nl1 = paramVarArgs[b]) != null) { if (nl1.sv > 0) {
/* 2 */           byte b2; if ((b2 = nl1.rb) == 1 || b2 == 0)
/* 3 */           { this.Fl0 = true; } else { this.Ih = true; } 
/* 4 */         }  byte b1 = nl1.rb;
/* 5 */         this.RU = (byte)(this.RU | 1 << b1); }  b++; }
/*   */      }
/*   */ 
/*   */   
/*   */   public final byte ne0;
/*   */   public byte Gl;
/*   */   public byte RU;
/*   */   public boolean L7;
/*   */   public boolean iM;
/*   */   public boolean he;
/*   */   public nl[] AC0;
/*   */   public boolean Ih;
/*   */   public boolean Fl0;
/*   */   
/*   */   public V4(byte paramByte) {
/*   */     this.Gl = 0;
/*   */     this.RU = 0;
/*   */     this.L7 = false;
/*   */     this.iM = false;
/*   */     this.he = false;
/*   */     this.Ih = false;
/*   */     this.Fl0 = true;
/*   */     this.ne0 = paramByte;
/*   */     this.AC0 = new nl[0];
/*   */   }
/*   */   
/*   */   public V4(byte paramByte1, byte paramByte2, nl... paramVarArgs) {
/*   */     this.RU = 0;
/*   */     this.L7 = false;
/*   */     this.iM = false;
/*   */     this.he = false;
/*   */     this.Ih = false;
/*   */     this.Fl0 = true;
/*   */     this.ne0 = paramByte1;
/*   */     this.Gl = paramByte2;
/*   */     Gd(paramVarArgs);
/*   */   }
/*   */   
/*   */   public final byte UA0() {
/*   */     return this.ne0;
/*   */   }
/*   */   
/*   */   public final void b0(byte paramByte) {
/*   */     this.Gl = paramByte;
/*   */   }
/*   */   
/*   */   public final byte JA0() {
/*   */     return this.Gl;
/*   */   }
/*   */   
/*   */   public int Y10() {
/*   */     return xi0.A90(1000, 1500);
/*   */   }
/*   */   
/*   */   public nl eD(int paramInt1, int paramInt2, int paramInt3) {
/*   */     return null;
/*   */   }
/*   */   
/*   */   public boolean fG0(short paramShort1, short paramShort2, short paramShort3, short paramShort4, int paramInt1, int paramInt2) {
/*   */     if (paramShort1 == paramShort3 && paramShort2 == paramShort4)
/*   */       return true; 
/*   */     if (!this.Ih) {
/*   */       paramInt1 = 0;
/*   */     } else if (this.he && paramInt1 < 1) {
/*   */       paramInt1 = 1;
/*   */     } 
/*   */     if (!this.Fl0) {
/*   */       paramInt2 = 0;
/*   */     } else if (this.he && paramInt2 < 1) {
/*   */       paramInt2 = 1;
/*   */     } 
/*   */     return (Math.abs(paramShort1 - paramShort3) > paramInt1) ? false : (!(Math.abs(paramShort2 - paramShort4) > paramInt2));
/*   */   }
/*   */   
/*   */   public final void KT() {
/*   */     this.L7 = true;
/*   */   }
/*   */   
/*   */   public final void Fj(boolean paramBoolean) {
/*   */     this.he = paramBoolean;
/*   */   }
/*   */   
/*   */   public boolean hO() {
/*   */     return this instanceof lH;
/*   */   }
/*   */   
/*   */   public V4 cs(byte paramByte) {
/*   */     return this;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/V4.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */