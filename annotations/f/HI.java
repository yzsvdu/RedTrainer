/* 1 */ package f;public abstract class HI { public static final ik kU = C00.gd(HI.class); public final RD0 Zo; public final MappedByteBuffer mK0; public ml qa0; public RD TI; public YK0 OB; public YK0 Is; public HI(RD0 paramRD0, boolean paramBoolean, String... paramVarArgs) { ml ml1; this.LQ = null; this.WE0 = null; this.Zo = paramRD0; this.vf0 = paramBoolean; this(paramRD0); boolean bool; int i; byte b; for (this.qa0 = ml1, bool = false, i = paramVarArgs.length, b = 0; b < i; ) { String str = paramVarArgs[b]; if (this.qa0.UI.equals(str)) bool = true;  b++; }  if (bool) { this.mK0 = paramRD0.fg0(FileChannel.MapMode.READ_ONLY); this.qa0.vj(this); this.TI = new RD(this); kU
/* 2 */         .info(B40.df("Loaded DS ROM ").append(this.qa0.jh0.trim()).append(" (").append(this.qa0.e60).append(" v").append(this.qa0.H50).append(")").toString()); mE0(); return; }  throw new Np(ez0.Pa(this.qa0.e60.getBytes()) + " is not currently a supported rom type."); } public E4 JN; public A50 kO; public V60 aB0; public lF0[] uF; public Bs[] Vr; public ByteBuffer LQ; public boolean vf0; public String WE0; public final ByteBuffer GA0() { return this.mK0.duplicate().order(ByteOrder.LITTLE_ENDIAN); } public String SO() { char c; if ((c = this.qa0.e60.charAt(this.qa0.e60.length() - 1)) != 'C') { if (c != 'D') { if (c != 'F') { if (c != 'S') { switch (c) { default: return "en";case 'K': return "ko";case 'J': return "ja";case 'I': break; }  return "it"; }  return "es"; }  return "fr"; }  return "de"; }  return "zh"; }
/*   */ 
/*   */   
/*   */   public final ByteBuffer HB0() {
/*   */     if (this.LQ == null) {
/*   */       GA0().position(this.qa0.UR);
/*   */       ml ml1;
/*   */       GA0().limit((ml1 = this.qa0).HV + ml1.UR);
/*   */       ByteOrder byteOrder;
/*   */       ByteBuffer byteBuffer = GA0().slice().order(byteOrder = ByteOrder.LITTLE_ENDIAN);
/*   */       if (this.vf0) {
/*   */         byte[] arrayOfByte;
/*   */         byteBuffer.get(arrayOfByte = new byte[byteBuffer.remaining()]);
/*   */         byteBuffer = ByteBuffer.wrap(bO.R(arrayOfByte)).order(byteOrder);
/*   */       } 
/*   */       byteBuffer.position(0);
/*   */       this.LQ = byteBuffer;
/*   */     } 
/*   */     return this.LQ.duplicate().order(ByteOrder.LITTLE_ENDIAN);
/*   */   }
/*   */   
/*   */   public final Do0 Gc0(int paramInt) {
/*   */     return this.qa0.Og0[paramInt];
/*   */   }
/*   */   
/*   */   public final boolean gw() {
/*   */     return this.qa0.e60.endsWith("J");
/*   */   }
/*   */   
/*   */   public final boolean RX() {
/*   */     return this.qa0.e60.endsWith("K");
/*   */   }
/*   */   
/*   */   public final RD Vz() {
/*   */     return this.TI;
/*   */   }
/*   */   
/*   */   public final ml l3() {
/*   */     return this.qa0;
/*   */   }
/*   */   
/*   */   public final RD0 T50() {
/*   */     return this.Zo;
/*   */   }
/*   */   
/*   */   public abstract byte bO();
/*   */   
/*   */   public abstract void BL();
/*   */   
/*   */   public abstract void mE0();
/*   */   
/*   */   public final YK0 Ft0(F40 paramF40) {
/*   */     return (paramF40 == F40.wI) ? this.Is : this.OB;
/*   */   }
/*   */   
/*   */   public final E4 gL0() {
/*   */     if (this.JN == null)
/*   */       n4(); 
/*   */     return this.JN;
/*   */   }
/*   */   
/*   */   public abstract void n4();
/*   */   
/*   */   public abstract Wd oB(VV paramVV, int paramInt);
/*   */   
/*   */   public abstract HV Hb(short paramShort);
/*   */   
/*   */   public final V60 P() {
/*   */     return this.aB0;
/*   */   }
/*   */   
/*   */   public abstract Ws0 gH0(int paramInt);
/*   */   
/*   */   public final lF0 Sk(int paramInt) {
/*   */     lF0[] arrayOfLF0;
/*   */     return (paramInt >= (arrayOfLF0 = this.uF).length) ? null : this[paramInt];
/*   */   }
/*   */   
/*   */   public final Bs Ea0(int paramInt) {
/*   */     Bs[] arrayOfBs;
/*   */     if (paramInt >= (arrayOfBs = this.Vr).length)
/*   */       return null; 
/*   */     this[paramInt].s();
/*   */     return this[paramInt];
/*   */   }
/*   */   
/*   */   public abstract By0 I80(); }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/HI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */