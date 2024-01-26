/* 1 */ package f;public abstract class il extends xr0 implements Cloneable { public static boolean ms0(xr0 paramxr0, tc paramtc, NI0 paramNI0, byte paramByte) { nl nl; if (paramNI0.V10 == -1) return false;  if (paramByte != 1) { if (paramByte != 2) { if (paramByte != 3)
/* 2 */         { nl = nl.jC0; } else { nl = nl.Dz0; }  } else { nl = nl.Bn; }  } else { nl = nl.Cl; }
/* 3 */      byte b; if ((b = paramNI0.Xj0) == 3 || b > 6)
/*   */     
/*   */     { 
/*   */       
/* 7 */       (arrayOfNl = new nl[2])[0] = nl; (new nl[2])[1] = nl; paramtc.pm.Ci0(paramxr0, true, arrayOfNl); return true; }  nl[] arrayOfNl; (arrayOfNl = new nl[1])[0] = nl; paramtc.pm.Ci0((xr0)arrayOfNl, true, arrayOfNl); return true; }
/*   */ 
/*   */   
/*   */   public Cy ys0;
/*   */   public QJ UG0;
/*   */   public byte pu;
/*   */   public float xJ = 0.0F;
/*   */   public short EC0;
/*   */   public ZK0 gl = null;
/*   */   
/*   */   public il(Cy paramCy, QJ paramQJ, short paramShort1, short paramShort2, byte paramByte) {
/*   */     super(paramShort1, paramShort2);
/*   */     this.ys0 = paramCy;
/*   */     this.UG0 = paramQJ;
/*   */     this.pu = paramByte;
/*   */   }
/*   */   
/*   */   public final short Ka() {
/*   */     QJ qJ;
/*   */     if ((qJ = this.UG0) == null)
/*   */       return this.si0; 
/*   */     short s = this.si0;
/*   */     return (short)(qJ.Dh0() + s);
/*   */   }
/*   */   
/*   */   public final short hA0() {
/*   */     QJ qJ;
/*   */     if ((qJ = this.UG0) == null)
/*   */       return this.k80; 
/*   */     short s = this.k80;
/*   */     return (short)(qJ.static() + s);
/*   */   }
/*   */   
/*   */   public final byte bl0() {
/*   */     return this.pu;
/*   */   }
/*   */   
/*   */   public float i00() {
/*   */     return this.xJ;
/*   */   }
/*   */   
/*   */   public final void lk0(float paramFloat) {
/*   */     this.xJ = paramFloat;
/*   */   }
/*   */   
/*   */   public final byte F80() {
/*   */     return (byte)this.EC0;
/*   */   }
/*   */   
/*   */   public final void z0(byte paramByte, short paramShort) {
/*   */     this.EC0 = (short)paramByte;
/*   */   }
/*   */   
/*   */   public final boolean a5(byte paramByte) {
/*   */     return (this.pu == 0);
/*   */   }
/*   */   
/*   */   public final boolean WS() {
/*   */     return Gc((byte)0);
/*   */   }
/*   */   
/*   */   public final ZK0 hz() {
/*   */     ZK0 zK02;
/*   */     if ((zK02 = this.gl) != null)
/*   */       return zK02; 
/*   */     Qm qm = Qm.i9;
/*   */     byte b = this.ys0.E10;
/*   */     ZK0 zK01;
/*   */     if ((zK01 = this.c50[b][OB0() & 0xFF]) == null)
/*   */       zK01 = Qm.A3; 
/*   */     return this;
/*   */   }
/*   */   
/*   */   public final void wu0(ZK0 paramZK0) {
/*   */     this.gl = paramZK0;
/*   */   }
/*   */   
/*   */   public final KI Q4() {
/*   */     return this.ys0;
/*   */   }
/*   */   
/*   */   public final Object clone() {
/*   */     try {
/*   */       this = (il)super.clone();
/*   */     } catch (CloneNotSupportedException cloneNotSupportedException) {
/*   */       null.printStackTrace();
/*   */       this = null;
/*   */     } 
/*   */     return this;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/il.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */