/* 1 */ package f;public class Ip extends JG0 { public static final boolean kk0; public static final TI0 yI0; public db cp0; public db uR; public db qA0; public db lu0; public nW a60; public boolean K50; public boolean N00; static { try { bool = Boolean.getBoolean("debugLayoutGroups"); } catch (SecurityException securityException) { bool = false; }
/* 2 */      kk0 = bool; yI0 = new TI0(0, 0, 32767); } public boolean xc0; public boolean k1; public boolean wh; public boolean yd; public U90 Xz0; public U90 o30; public Throwable Wk0; public final HashMap cK0; public boolean Ff0; public Ip() { HashMap<Object, Object> hashMap; this.K50 = true; this.N00 = true; this.Ff0 = false; this(); this.cK0 = this; L5(); } public final void L5() { this.yd = true; if (kk0) this.Wk0 = (new Throwable("DialogLayout created/used here")).fillInStackTrace();  } public String TI() { return "dialoglayout"; } public final Ip MB() { this(this); g0 g0; rK0(g0);
/* 3 */     this(this);
/* 4 */     WN(g0); return this; } public final U90 iJ0() { return this.Xz0; } public final void rK0(U90 paramU90) { if (paramU90 != null) if (paramU90.nL0 == this) { if (paramU90.r20) throw new IllegalArgumentException("Group already added to another group");  } else { throw new IllegalArgumentException("Can't add group from different layout"); }   this.Xz0 = paramU90; L5(); aH(); } public final void Xw(nY paramnY) { super.Xw(paramnY); try { this.wh = true; String str = "smallGap"; boolean bool = true; Class<db> clazz = db.class; db db1 = db.oI; this.cp0 = (db)((q80)paramnY).Yz0(str, bool, clazz, db1); h20(); str = "mediumGap"; bool = true; clazz = db.class; this.uR = (db)q80.Yz0(str, bool, clazz, db1); h20();
/*   */       
/* 6 */       this.qA0 = (db)q80.Yz0("largeGap", true, db.class, db1); h20();
/*   */       
/* 8 */       this.lu0 = (db)q80.Yz0("defaultGap", true, db.class, db1); h20(); q80 q80;
/* 9 */       this.a60 = (q80 = (q80)paramnY).Uz("namedGaps"); this.wh = false; return; } finally { this.wh = false; }
/*   */      }
/*   */ 
/*   */   
/*   */   public final U90 xh() {
/*   */     return this.o30;
/*   */   }
/*   */   
/*   */   public final void WN(U90 paramU90) {
/*   */     if (paramU90 != null)
/*   */       if (paramU90.nL0 == this) {
/*   */         if (paramU90.r20)
/*   */           throw new IllegalArgumentException("Group already added to another group"); 
/*   */       } else {
/*   */         throw new IllegalArgumentException("Can't add group from different layout");
/*   */       }  
/*   */     this.o30 = paramU90;
/*   */     L5();
/*   */     aH();
/*   */   }
/*   */   
/*   */   public int AW() {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: getfield Xz0 : Lf/U90;
/*   */     //   4: ifnull -> 27
/*   */     //   7: aload_0
/*   */     //   8: dup
/*   */     //   9: dup
/*   */     //   10: invokevirtual ib : ()V
/*   */     //   13: getfield Xz0 : Lf/U90;
/*   */     //   16: iconst_0
/*   */     //   17: invokevirtual iD : (I)I
/*   */     //   20: istore_0
/*   */     //   21: invokevirtual Ho : ()I
/*   */     //   24: iload_0
/*   */     //   25: iadd
/*   */     //   26: ireturn
/*   */     //   27: aload_0
/*   */     //   28: invokespecial AW : ()I
/*   */     //   31: ireturn
/*   */   }
/*   */   
/*   */   public int HY() {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: getfield o30 : Lf/U90;
/*   */     //   4: ifnull -> 27
/*   */     //   7: aload_0
/*   */     //   8: dup
/*   */     //   9: dup
/*   */     //   10: invokevirtual ib : ()V
/*   */     //   13: getfield o30 : Lf/U90;
/*   */     //   16: iconst_1
/*   */     //   17: invokevirtual iD : (I)I
/*   */     //   20: istore_0
/*   */     //   21: invokevirtual Et : ()I
/*   */     //   24: iload_0
/*   */     //   25: iadd
/*   */     //   26: ireturn
/*   */     //   27: aload_0
/*   */     //   28: invokespecial HY : ()I
/*   */     //   31: ireturn
/*   */   }
/*   */   
/*   */   public int R80() {
/*   */     if (this.Xz0 != null) {
/*   */       ib();
/*   */       return this.Xz0.fV(0);
/*   */     } 
/*   */     return super.R80();
/*   */   }
/*   */   
/*   */   public int tJ0() {
/*   */     if (this.o30 != null) {
/*   */       ib();
/*   */       return this.o30.fV(1);
/*   */     } 
/*   */     return super.tJ0();
/*   */   }
/*   */   
/*   */   public final void mM() {
/*   */     if (this.Xz0 != null && this.o30 != null) {
/*   */       ib();
/*   */       int j = this.Xz0.iD(0), i = this.Xz0.fV(0);
/*   */       j = this.o30.fV(1);
/*   */       short s1 = this.fu;
/*   */       short s2 = this.Rr;
/*   */       i = JG0.Fr(j, i, s1);
/*   */       yN(i, JG0.Fr(this.o30.iD(1), j, s2));
/*   */       V20();
/*   */     } 
/*   */   }
/*   */   
/*   */   public void d40() {
/*   */     if (this.Xz0 != null && this.o30 != null) {
/*   */       ib();
/*   */       V20();
/*   */     } else {
/*   */       this.yd = false;
/*   */       if (this.yd && !this.Ff0) {
/*   */         Level level = Level.WARNING;
/*   */         Throwable throwable = this.Wk0;
/*   */         Logger.getLogger(Ip.class.getName()).log(this, "Dialog layout has incomplete state", throwable);
/*   */       } 
/*   */     } 
/*   */   }
/*   */   
/*   */   public final void ib() {
/*   */     if (this.xc0) {
/*   */       if (this.K50)
/*   */         try {
/*   */           this.wh = true;
/*   */           U90 u90;
/*   */           if ((u90 = this.Xz0) != null && this.o30 != null) {
/*   */             u90.t90();
/*   */             this.o30.t90();
/*   */             h20();
/*   */           } 
/*   */           if ((u90 = this.Xz0) != null && this.o30 != null) {
/*   */             u90.fA0();
/*   */             this.o30.fA0();
/*   */             h20();
/*   */           } 
/*   */         } finally {
/*   */           this.wh = false;
/*   */         }  
/*   */       this.xc0 = false;
/*   */       this.k1 = false;
/*   */     } 
/*   */     if (!this.k1) {
/*   */       for (Ft ft : this.cK0.values()) {
/*   */         if (this.N00 || ft.DG0.dP)
/*   */           ft.hf(); 
/*   */       } 
/*   */       this.k1 = true;
/*   */     } 
/*   */   }
/*   */   
/*   */   public final void V20() {
/*   */     int i = RS(), j = qF();
/*   */     this.Xz0.bO(0, i, j);
/*   */     i = e3();
/*   */     j = Hy();
/*   */     this.o30.bO(1, i, j);
/*   */     try {
/*   */       for (Ft ft : this.cK0.values()) {
/*   */         if (this.N00 || ft.DG0.dP)
/*   */           ft.xs(); 
/*   */       } 
/*   */       return;
/*   */     } catch (IllegalStateException illegalStateException) {
/*   */       if (this.Wk0 != null && illegalStateException.getCause() == null)
/*   */         illegalStateException.initCause(this.Wk0); 
/*   */       throw illegalStateException;
/*   */     } 
/*   */   }
/*   */   
/*   */   public final void MJ0() {
/*   */     this.k1 = false;
/*   */     super.MJ0();
/*   */   }
/*   */   
/*   */   public final void J00(throws paramthrows) {
/*   */     this.k1 = false;
/*   */   }
/*   */   
/*   */   public final void Gu() {
/*   */     this.k1 = false;
/*   */     rq0();
/*   */   }
/*   */   
/*   */   public void LM(throws paramthrows) {
/*   */     this.k1 = false;
/*   */   }
/*   */   
/*   */   public final U90 AUX(JG0... paramVarArgs) {
/*   */     return (new g0(this)).Mg(paramVarArgs);
/*   */   }
/*   */   
/*   */   public final U90 Yw0(U90... paramVarArgs) {
/*   */     return (new g0(this)).cOM8(paramVarArgs);
/*   */   }
/*   */   
/*   */   public final U90 vo0(JG0... paramVarArgs) {
/*   */     return (new cr0(this)).Mg(paramVarArgs);
/*   */   }
/*   */   
/*   */   public final U90 Gs(U90... paramVarArgs) {
/*   */     return (new cr0(this)).cOM8(paramVarArgs);
/*   */   }
/*   */   
/*   */   public final void si(JG0 paramJG0, int paramInt) {
/*   */     super.si(paramJG0, paramInt);
/*   */     this(paramJG0);
/*   */     Ft ft;
/*   */     this.cK0.put(paramJG0, this);
/*   */   }
/*   */   
/*   */   public void gx() {
/*   */     super.gx();
/*   */     this.cK0.clear();
/*   */     U90 u90;
/*   */     if ((u90 = this.Xz0) != null)
/*   */       u90.UI(); 
/*   */     if ((u90 = this.o30) != null)
/*   */       u90.UI(); 
/*   */     aH();
/*   */   }
/*   */   
/*   */   public final JG0 fG0(int paramInt) {
/*   */     JG0 jG0 = super.fG0(paramInt);
/*   */     this.cK0.remove(jG0);
/*   */     U90 u90;
/*   */     if ((u90 = this.Xz0) != null)
/*   */       u90.UI(); 
/*   */     if ((u90 = this.o30) != null)
/*   */       u90.UI(); 
/*   */     aH();
/*   */     return jG0;
/*   */   }
/*   */   
/*   */   public final void aH() {
/*   */     this.xc0 = true;
/*   */     h20();
/*   */   }
/*   */   
/*   */   public final void h20() {
/*   */     if (this.Xz0 != null && this.o30 != null && !this.wh)
/*   */       MJ0(); 
/*   */   }
/*   */   
/*   */   public final void jB(Ft paramFt) {
/*   */     JG0 jG0;
/*   */     int i = ID(jG0 = paramFt.DG0);
/*   */     if (Tr || i >= 0) {
/*   */       super.fG0(i);
/*   */       this.cK0.remove(jG0);
/*   */       return;
/*   */     } 
/*   */     throw new AssertionError();
/*   */   }
/*   */   
/*   */   public final void GH0() {
/*   */     boolean bool = false;
/*   */     if (this.N00) {
/*   */       this.N00 = bool;
/*   */       aH();
/*   */     } 
/*   */   }
/*   */   
/*   */   public final g0 mE0() {
/*   */     return new g0(this);
/*   */   }
/*   */   
/*   */   public final cr0 d7() {
/*   */     return new cr0(this);
/*   */   }
/*   */   
/*   */   public final void Q2() {
/*   */     if (!this.N00)
/*   */       aH(); 
/*   */   }
/*   */   
/*   */   public final void hJ0(et paramet, JG0 paramJG0) {
/*   */     if (paramJG0 != null) {
/*   */       if (paramet != null) {
/*   */         Ft ft;
/*   */         if ((ft = (Ft)this.cK0.get(paramJG0)) != null) {
/*   */           if (Tr || paramJG0.fr0 == this) {
/*   */             ft.sk0 = paramet;
/*   */             return;
/*   */           } 
/*   */           throw new AssertionError();
/*   */         } 
/*   */         return;
/*   */       } 
/*   */       throw new NullPointerException("alignment");
/*   */     } 
/*   */     throw new NullPointerException("widget");
/*   */   }
/*   */   
/*   */   static {
/*   */     boolean bool;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ip.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */