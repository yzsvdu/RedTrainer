/*  1 */ package f;public final class A30 { public static final Jc I80 = new Jc(); public byte fI0; public byte COm5; public short fd; public boolean ci0; public boolean x40; public byte OJ0; public boolean jJ0; public boolean O00; public byte Yk0; public byte Rt; public byte CF; public int I; public int Bd0; public int NF0; public short CO; public A30(byte paramByte1, byte paramByte2, int paramInt1, int paramInt2, int paramInt3, short paramShort1, short paramShort2, byte paramByte3) { this.fd = 0; this.ci0 = false; this.x40 = false; this.OJ0 = 0; this.jJ0 = false; this.O00 = false; this.Yk0 = 0; this.Rt = 0; this.CF = 0; this.CO = 0; this.e2 = 0; this.B6 = 0; this.fI0 = paramByte1; this.COm5 = paramByte2; this.I = paramInt1; this.Bd0 = paramInt2; this.NF0 = paramInt3; if (paramShort1 <= 0 || paramShort2 >= 1)
/*  2 */     { this.CO = paramShort1; this.e2 = paramShort2; this.B6 = paramByte3; rZ(); return; }  throw new RuntimeException(B40.df("Invalid ").append(A30.class.getName()).toString()); }
/*    */   public short e2;
/*    */   public byte B6;
/*    */   public final void rZ() { short s; if ((s = this.fd) == 132 || s == 201 || s == 235) this.Yk0 = 0;  if (this.Bd0 > 29999) this.Bd0 = 29999;  }
/*  6 */   public final short pQ() { return this.e2; } public final short tU() { return this.CO; } public final int Kw0() { return this.NF0; } public final int gk() { return this.Bd0; } public final int yE0() { return this.I; } public final byte Sn0() { return this.Rt; } public final byte Hq() { return this.Yk0; } public final boolean TC() { return this.O00; } public final boolean KL0() { return this.jJ0; } public final byte Wf() { return this.OJ0; } public final boolean Dd0() { return this.x40; } public final boolean on0() { return this.ci0; } public final short d1() { return this.fd; } public A30(byte paramByte1, byte paramByte2, short paramShort, boolean paramBoolean1, boolean paramBoolean2, byte paramByte3, boolean paramBoolean3, boolean paramBoolean4, byte paramByte4, byte paramByte5, byte paramByte6) { this.fI0 = -1; this.COm5 = -1; this.fd = 0; this.ci0 = false; this.x40 = false; this.OJ0 = 0; this.jJ0 = false; this.O00 = false; this.Yk0 = 0; this.Rt = 0; this.CF = 0; this.I = 0; this.Bd0 = 0; this.NF0 = 0; this.CO = 0; this.e2 = 0; this.B6 = 0; if (paramShort >= 1 && paramShort <= 649) { if (paramByte5 >= 0 && paramByte5 <= 6) { if (paramByte6 >= 0 && paramByte6 <= 31) { this.fI0 = paramByte1; this.COm5 = paramByte2; this.fd = paramShort; this.ci0 = paramBoolean1; this.x40 = paramBoolean2; this.OJ0 = paramByte3; this.jJ0 = paramBoolean3; this.O00 = paramBoolean4; this.Yk0 = paramByte4; this.Rt = paramByte5; this.CF = paramByte6; rZ(); return; }  throw new RuntimeException(B40.df("Invalid ")
/*  7 */             .append(A30.class.getName()).toString()); }  throw new RuntimeException(
/*  8 */           B40.df("Invalid ")
/*  9 */           .append(A30.class.getName()).toString()); }  throw new RuntimeException(
/* 10 */         B40.df("Invalid ")
/* 11 */         .append(A30.class.getName()).toString()); }
/*    */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/A30.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */