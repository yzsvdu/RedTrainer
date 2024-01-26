/* 1 */ package f;public final class BF { public final short eb(byte paramByte, short paramShort) { if (Bh0.py(paramByte, paramShort)) synchronized ((this.ng[paramByte]).fG) {
/* 2 */         /* monitor exit ThisExpression{ObjectType{f/h30}} */ return (this.ng[paramByte]).fG.Z90(paramShort);
/* 3 */       }   throw new RuntimeException("Attempt to check non-client aware flag."); }
/*   */ 
/*   */   
/*   */   public static final short[][] wd0;
/*   */   public jM[] ng;
/*   */   public byte[] iA0;
/*   */   public byte[] Zj;
/*   */   public wx0 Ok;
/*   */   
/*   */   public BF() {
/*   */     jM jM1;
/*   */     this.iA0 = new byte[5];
/*   */     this.Zj = new byte[] { 10, 10, 10, 10, 10 };
/*   */     this.Ok = new wx0();
/*   */     this();
/*   */     (new jM[11])[0] = this;
/*   */     this();
/*   */     (new jM[11])[1] = this;
/*   */     this();
/*   */     (new jM[11])[2] = this;
/*   */     this();
/*   */     (new jM[11])[3] = this;
/*   */     this();
/*   */     (new jM[11])[4] = this;
/*   */     (new jM[11])[5] = null;
/*   */     (new jM[11])[6] = null;
/*   */     (new jM[11])[7] = null;
/*   */     (new jM[11])[8] = null;
/*   */     (new jM[11])[9] = null;
/*   */     this();
/*   */     this.ng = new jM[] { 
/*   */         null, null, null, null, null, null, null, null, null, null, 
/*   */         this };
/*   */   }
/*   */   
/*   */   static {
/*   */     short[] arrayOfShort;
/*   */     (arrayOfShort = new short[9])[0] = 2080;
/*   */     (new short[9])[1] = 2081;
/*   */     (new short[9])[2] = 2082;
/*   */     (new short[9])[3] = 2083;
/*   */     (new short[9])[4] = 2084;
/*   */     (new short[9])[5] = 2085;
/*   */     (new short[9])[6] = 2086;
/*   */     (new short[9])[7] = 2087;
/*   */     (new short[9])[8] = 2092;
/*   */     (new short[5][])[0] = arrayOfShort;
/*   */     (arrayOfShort = new short[9])[0] = 2151;
/*   */     (new short[9])[1] = 2152;
/*   */     (new short[9])[2] = 2153;
/*   */     (new short[9])[3] = 2154;
/*   */     (new short[9])[4] = 2155;
/*   */     (new short[9])[5] = 2156;
/*   */     (new short[9])[6] = 2157;
/*   */     (new short[9])[7] = 2158;
/*   */     (new short[9])[8] = 2175;
/*   */     (new short[5][])[1] = arrayOfShort;
/*   */     (arrayOfShort = new short[9])[0] = 1521;
/*   */     (new short[9])[1] = 1522;
/*   */     (new short[9])[2] = 1523;
/*   */     (new short[9])[3] = 1524;
/*   */     (new short[9])[4] = 1525;
/*   */     (new short[9])[5] = 1526;
/*   */     (new short[9])[6] = 1527;
/*   */     (new short[9])[7] = 1528;
/*   */     (new short[9])[8] = 2400;
/*   */     (new short[5][])[2] = arrayOfShort;
/*   */     (arrayOfShort = new short[9])[0] = 1361;
/*   */     (new short[9])[1] = 1362;
/*   */     (new short[9])[2] = 1365;
/*   */     (new short[9])[3] = 1363;
/*   */     (new short[9])[4] = 1364;
/*   */     (new short[9])[5] = 1366;
/*   */     (new short[9])[6] = 1367;
/*   */     (new short[9])[7] = 1368;
/*   */     (new short[9])[8] = 2404;
/*   */     (new short[5][])[3] = arrayOfShort;
/*   */     (arrayOfShort = new short[9])[0] = 1361;
/*   */     (new short[9])[1] = 1362;
/*   */     (new short[9])[2] = 1363;
/*   */     (new short[9])[3] = 1364;
/*   */     (new short[9])[4] = 1365;
/*   */     (new short[9])[5] = 1366;
/*   */     (new short[9])[6] = 1367;
/*   */     (new short[9])[7] = 1368;
/*   */     (new short[9])[8] = 2404;
/*   */     wd0 = new short[][] { null, null, null, null, arrayOfShort };
/*   */   }
/*   */   
/*   */   public final boolean y5(byte paramByte, short paramShort) {
/*   */     if (Bh0.py(paramByte, paramShort))
/*   */       return (paramByte == 4 && paramShort == 1490) ? true : this.ng[paramByte].At0(paramShort); 
/*   */     throw new RuntimeException(RH0.KK("Attempt to check non-client aware flag. ", paramByte, " ", paramShort));
/*   */   }
/*   */   
/*   */   public final byte K70() {
/*   */     byte b = 0;
/*   */     byte[] arrayOfByte;
/*   */     for (byte b1 = 0; b1 < (arrayOfByte = this.iA0).length; b1++) {
/*   */       byte b2;
/*   */       if ((b2 = arrayOfByte[b1]) > b)
/*   */         b = b2; 
/*   */     } 
/*   */     return b;
/*   */   }
/*   */   
/*   */   public final byte ry0(byte paramByte) {
/*   */     return (paramByte < 0 || paramByte >= 5) ? 100 : this.Zj[paramByte];
/*   */   }
/*   */   
/*   */   public final boolean Hj0(short paramShort) {
/*   */     return this.Ok.COM1(paramShort);
/*   */   }
/*   */   
/*   */   public final boolean J80(short paramShort) {
/*   */     switch (paramShort) {
/*   */       default:
/*   */         switch (paramShort) {
/*   */           default:
/*   */             return false;
/*   */           case 243:
/*   */           case 244:
/*   */           case 245:
/*   */             break;
/*   */         } 
/*   */         return y5((byte)4, (short)1496);
/*   */       case 144:
/*   */       case 145:
/*   */       case 146:
/*   */         break;
/*   */     } 
/*   */     return (this.iA0[0] >= 8);
/*   */   }
/*   */   
/*   */   public final void Fk(byte paramByte) {
/*   */     byte b;
/*   */     if (paramByte == 10)
/*   */       return; 
/*   */     byte[] arrayOfByte = this.iA0;
/*   */     jM jM1 = this.ng[paramByte];
/*   */     jM1.getClass();
/*   */     /* monitor enter BinaryOperatorExpression{ClassFileLocalVariableReferenceExpression{type=ObjectType{f/h30}, name=null} = FieldReferenceExpression{lastType=ObjectType{f/h30}, expression=ClassFileLocalVariableReferenceExpression{type=ObjectType{f/jM}, name=null}, name=fG, descriptor=Lf/h30;}} */
/*   */     short[] arrayOfShort;
/*   */     if ((arrayOfShort = wd0[paramByte]) == null || arrayOfShort.length == 0) {
/*   */       b = 0;
/*   */     } else {
/*   */       h30 h30;
/*   */       b = 0;
/*   */       try {
/*   */       
/*   */       } finally {
/*   */         this = null;
/*   */         /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{f/h30}, name=null} */
/*   */       } 
/*   */     } 
/*   */     arrayOfByte[paramByte] = (byte)b;
/*   */     this.Zj[paramByte] = Bh0.tp(paramByte, this.iA0[paramByte], this.ng[paramByte]);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/BF.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */