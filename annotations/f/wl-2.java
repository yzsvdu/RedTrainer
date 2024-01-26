/* 1 */ package f;public final class wl { public byte Mz0; public byte Ei; public final Xk Gu0() { T30 t30 = T30.Qh;
/* 2 */     byte b = this.TR; char c;
/* 3 */     if ((c = this.Mz0) != 4) { if (c != '\005') { switch (c) { default: c = '￿';
/* 4 */             return Xr(b, c);case 20: c1 = 'ŏ'; return Xr(b, c1);case 19: c1 = 'Ĉ'; return Xr(b, c1);case 18: c1 = 'ć'; return Xr(b, c1);case 17: c1 = 'Ć'; return Xr(b, c1);case 16: c1 = 'ą'; return Xr(b, c1);case 15: c1 = 'Đ'; return Xr(b, c1);case 14: c1 = 'ď'; return Xr(b, c1);case 13: c1 = 'Ď'; return Xr(b, c1);case 12: c1 = 'Č'; return Xr(b, c1);case 11: c1 = 'ċ'; return Xr(b, c1);case 10: c1 = 'Ċ'; return Xr(b, c1);case 9: break; }  char c1 = 'ĉ'; } else { char c1 = 'č'; }  } else { c = 'ȇ'; }  return Xr(b, c); }
/*   */ 
/*   */   
/*   */   public byte TR;
/*   */   public byte Nt0 = -1;
/*   */   public short Bv = -1;
/*   */   public int og0 = 0;
/*   */   public int Uw = 0;
/*   */   public int finally = 0;
/*   */   public String F3;
/*   */   public String Yk0;
/*   */   public ArrayList OU = new ArrayList();
/*   */   
/*   */   public wl(s40 params40, byte paramByte, int paramInt) {
/*   */     byteBuffer2.position(paramInt);
/*   */     this.Mz0 = paramByte;
/*   */     this.TR = params40.in();
/*   */     ByteBuffer byteBuffer2;
/*   */     if ((this.Ei = (byteBuffer2 = params40.pr()).get()) != 4) {
/*   */       byteBuffer2.get();
/*   */     } else {
/*   */       this.Nt0 = byteBuffer2.get();
/*   */     } 
/*   */     this.Bv = byteBuffer2.getShort();
/*   */     if ((paramByte = this.Ei) == 2 || paramByte == 5)
/*   */       byteBuffer2.getInt(); 
/*   */     this.og0 = pN.tx0(byteBuffer2.getInt());
/*   */     if (this.Ei != 2)
/*   */       this.Uw = pN.tx0(byteBuffer2.getInt()); 
/*   */     if (this.Ei != 3)
/*   */       this.finally = pN.tx0(byteBuffer2.getInt()); 
/*   */     ByteBuffer byteBuffer1 = params40.pr();
/*   */     this.F3 = ed.ik(bA(), byteBuffer1);
/*   */     if (this.Ei == 2) {
/*   */       this.Yk0 = T30.b00().Xr((byte)1, (short)519).m20();
/*   */     } else {
/*   */       byteBuffer1 = params40.pr();
/*   */       this.Yk0 = ed.ik(Gy(), byteBuffer1);
/*   */     } 
/*   */     int i;
/*   */     if ((i = this.finally) > 0) {
/*   */       byteBuffer2.position(i);
/*   */       while (true) {
/*   */         i = byteBuffer2.getInt();
/*   */         byteBuffer2.getShort();
/*   */         byteBuffer2.getShort();
/*   */         if (!pN.pk0(i))
/*   */           break; 
/*   */         i = pN.tx0(i);
/*   */         this.OU.add(new J2(i, params40));
/*   */       } 
/*   */     } 
/*   */   }
/*   */   
/*   */   public final byte f90() {
/*   */     return this.Mz0;
/*   */   }
/*   */   
/*   */   public final byte eT() {
/*   */     return this.TR;
/*   */   }
/*   */   
/*   */   public final byte lo0() {
/*   */     return this.Nt0;
/*   */   }
/*   */   
/*   */   public final short bx() {
/*   */     return this.Bv;
/*   */   }
/*   */   
/*   */   public final int bA() {
/*   */     return this.og0;
/*   */   }
/*   */   
/*   */   public final int Gy() {
/*   */     return this.Uw;
/*   */   }
/*   */   
/*   */   public final String qM() {
/*   */     return this.F3;
/*   */   }
/*   */   
/*   */   public final String Wu0() {
/*   */     return (this.Yk0.isEmpty() && Gu0() != null) ? Gu0().m20() : this.Yk0;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/wl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */