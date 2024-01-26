/*  1 */ package f;public final class interface implements iq0 { public static interface Fw; public pe0[] S5; public pe0[] tl0; public pe0[] Hz0; public pe0 VS; public pe0 GI0; public pe0 Bf; public pe0 jF0; public pe0 Er0; public pe0 RA; public pe0[] fh; public pe0 ej; public pe0 LK0; public pe0 tL0; public pe0 Jh0; public pe0 Lm0; public pe0 cR; public pe0 ja; public pe0 qm0; public pe0 iI0; public pe0 N8; public pe0 dR; public pe0 te0; public pe0 lb0; public pe0 pj; public pe0[] ar0; public pe0[] iy0; public pe0[] KM; public pe0[] ga; public static Texture[] A5() { this(); ArrayList<Texture> arrayList; for (byte b = 0; b < 100; )
/*  2 */     { Texture texture; Object[] arrayOfObject; (arrayOfObject = new Object[1])[0] = Integer.valueOf(b); hZ hZ = UB0.vj0.aP(B40.df("data/sprites/textures/bg_").append(String.format("%02d", arrayOfObject)).append(".png").toString());
/*  3 */       if (q00.Dz) { try { hZ.Yc().close(); } catch (Exception exception) {} } else {  }  if (!hZ.L0())
/*  4 */         break;  this(hZ); arrayList.add(texture); b++; }  return arrayList.<Texture>toArray(new Texture[0]); } public pe0[] LPt3; public pe0[] oc; public pe0 HN; public pe0 oX; public pe0 NG; public pe0 Pp0; public pe0 TD; public pe0 gd0; public pe0 fF0; public Texture[] d5; public pe0 DE0; public pe0 nZ; public pe0 Lt; public pe0 n30; public pe0 Ro0; public pe0 i00; public pe0 lPt3; public pe0 Com6; public pe0 LV; public pe0[] gQ; public Ui0 ax0; public Texture kO; public Texture xs; public Texture xo; public Texture Nz; public pe0 Jc0; public COm1 qG0; public bY b10; public String nj0 = ""; public static interface ZZ() { if (Fw == null) Fw = new interface();  return Fw; } public final pe0 Zi0(String paramString) { pe0 pe01, pe02; Texture texture = null; bY bY1; if ((bY1 = this.b10) != null) { RD0 rD0; if (!(rD0 = bY1.u00.f0(paramString + ".png")).L0()) { texture = null; } else { this(rD0); bY1.gE0.add(texture); this(texture); pe02 = pe01; }  } else { COm1 cOm1; if ((cOm1 = this.qG0) != null) { byte b = 0; int i = cOm1.ui0.Z8; while (true) { if (b < i) { pe0 pe03; if (((P70)cOm1.ui0.get(b)).Pk.equals(pe01)) { pe03 = pe01 = (P70)cOm1.ui0.get(b); break; }  pe03++; continue; }  pe02 = pe01 = null; break; }  }  }  if (pe02 != null) return pe02; 
/*  5 */     return this.Jc0; } public final void xq() { byte b4; String[] arrayOfString; (arrayOfString = new String[b4 = 1])[0] = "error"; byte b5 = 0; while (true) { if (b5 < b4) { String str = De0.AT("data/sprites/textures/", arrayOfString[b5], ".png"); hZ hZ1 = UB0.vj0.aP(str); if (q00.Dz) { try { hZ1.Yc().close(); } catch (Exception exception) {} } else {  }  if (hZ1.L0()) try { Texture texture1; this(UB0.vj0.aP(str)); break; } catch (Exception exception) {}  b5++; continue; }  texture = this.xo; break; }  this
/*  6 */       .Nz = texture; this.Jc0 = new pe0(texture); Uc uc = Uc.xi0; this(1, 1, uc); Texture texture; Color color; zH.Np(color = Color.BLACK); zH.d40(0, 0); this.kO = new Texture(zH); ZH zH; (zH = new ZH()).dispose(); this(1, 1, uc); zH.Np(color.cpy().mul(1.0F, 1.0F, 1.0F, 0.1F)); zH.d40(0, 0); this.xs = new Texture(zH); (zH = new ZH()).dispose(); this(1, 1, uc); this.xo = new Texture(zH); (zH = new ZH()).dispose(); hZ hZ = UB0.vj0.aP("data/sprites/atlas/main.atlas");
/*  7 */     if (q00.Dz) { try { hZ.Yc().close(); } catch (Exception exception) {} } else {  }  if (hZ.L0())
/*  8 */     { COm1 cOm1; this(hZ); this.qG0 = cOm1; } else { this.b10 = new bY(UB0.vj0.aP("../client/assets/main.atlas/")); }  Nc0(h1.pB0); byte b3; pe0[] arrayOfPe03; for (this.KM = new pe0[7], this.ga = new pe0[7], b3 = 0; b3 < (arrayOfPe03 = this.KM).length; ) { arrayOfPe03[b3] = NC0(b3, "status_ailment"); this.ga[b3] = NC0(b3, "status_ailment_large"); b3++; }  this.GI0 = Zi0("icon_cross"); this.RA = Zi0("icon_colorswatch"); this.jF0 = Zi0("icon_gear"); this.VS = Zi0("icon_textedit"); this.Bf = Zi0("icon_check"); this.fh = arrayOfPe02; pe0[] arrayOfPe02; (arrayOfPe02 = new pe0[2])[0] = Zi0("icon_lock_unlocked"); this.fh[1] = Zi0("icon_lock_locked"); this.Er0 = Zi0("icon_sound"); this.ej = Zi0("arrow_down"); this.LK0 = Zi0("arrow_up"); this.tL0 = Zi0("arrow_white_up"); this.Jh0 = Zi0("arrow_white_down"); this.Lm0 = Zi0("arrow_left"); this.cR = Zi0("arrow_right"); this.ja = Zi0("arrow_keypress"); this.iI0 = Zi0("disconnected"); this.qm0 = Zi0("black-bg"); this.te0 = Zi0("clock-sun"); this.pj = Zi0("clock-moon"); this.lb0 = Zi0("clock-morning"); this.NG = Zi0("shiny"); this.gd0 = Zi0("shiny-small"); this.Pp0 = Zi0("secret_shiny"); this.fF0 = Zi0("secret_shiny-small"); this.TD = Zi0("secret_shiny_particle"); this.HN = Zi0("particle"); this.oX = Zi0("particle_small"); if (km.ER()) { this.N8 = Zi0("star-light-2x"); this.dR = Zi0("star-bold-2x"); } else { this.N8 = Zi0("star-light"); this.dR = Zi0("star-bold"); }  byte b2; for (this.LPt3 = new pe0[Xv0.Kf0.length], b2 = 0; b2 < (arrayOfPe03 = this.LPt3).length; ) { arrayOfPe03[b2] = 
/*    */ 
/*    */ 
/*    */         
/* 12 */         Zi0(B40.df("flag_").append((Xv0.Kf0[b2]).uz0).toString()); b2++; }  this.ar0 = arrayOfPe01; pe0[] arrayOfPe01; (arrayOfPe01 = new pe0[2])[0] = Zi0("icon_gender_male"); this.ar0[1] = Zi0("icon_gender_female"); this.iy0 = arrayOfPe01; (arrayOfPe01 = new pe0[2])[0] = Zi0("icon_gender_large_male"); this.iy0[1] = Zi0("icon_gender_large_female"); this.nZ = Zi0("BPSprite"); this.DE0 = Zi0("ClockSprite"); this.Lt = Zi0("CoinSprite"); this.i00 = Zi0("alphaLight"); this.Ro0 = Zi0("HiddenAbility"); this.n30 = Zi0("HiddenAbilitySmall"); byte b1; for (this
/*    */       
/* 14 */       .gQ = new pe0[(Zk0.s6(9)).length], b1 = 0; b1 < (arrayOfPe03 = this.gQ).length; ) { arrayOfPe03[b1] = NC0(b1, "addon_flags"); b1++; }  for (this.oc = new pe0[mA.Uk.length], b1 = 0; b1 < (arrayOfPe03 = this.oc).length; ) { arrayOfPe03[b1] = 
/*    */         
/* 16 */         NC0((mA.Uk[b1]).WF, "particle_id"); b1++; }  this.lPt3 = Zi0("icon_dice"); this.Com6 = Zi0("pencil_memo"); this.LV = Zi0("icon_rotate"); try { byte[] arrayOfByte; ByteBuffer byteBuffer; (byteBuffer = ByteBuffer.wrap(arrayOfByte = nk0.HI0(UB0.vj0.aP("data/sprites/game.pak").iy0())).order(ByteOrder.LITTLE_ENDIAN)).position(8); byte b; byte b6; for (this.d5 = new Texture[b = ByteBuffer.wrap(arrayOfByte = nk0.HI0(UB0.vj0.aP("data/sprites/game.pak").iy0())).order(ByteOrder.LITTLE_ENDIAN).get()], b6 = 0; b6 < b; ) { int i = byteBuffer.getInt(); this(arrayOfByte, byteBuffer.position(), i); this.d5[b6] = new Texture(zH1); ZH zH1; (zH1 = new ZH()).dispose(); byteBuffer.position(byteBuffer.position() + i); b6++; }  } catch (Exception exception) { null.printStackTrace(); }  this.ax0 = new Ui0(this.d5[2]); }
/*    */ 
/*    */   
/*    */   public final void Nc0(String paramString) {
/*    */     String str;
/*    */     if ((str = this.nj0) != null && str.equals(paramString))
/*    */       return; 
/*    */     this.nj0 = paramString;
/*    */     this();
/*    */     StringBuilder stringBuilder;
/*    */     for (byte b2 = 0; b2 < paramString.length(); ) {
/*    */       char c;
/*    */       if (Character.isLetter(c = paramString.charAt(b2)))
/*    */         stringBuilder.append(c); 
/*    */       b2++;
/*    */     } 
/*    */     paramString = stringBuilder.toString();
/*    */     byte b1;
/*    */     pe0[] arrayOfPe0;
/*    */     byte b3;
/*    */     for (arrayOfPe0 = new pe0[b1 = 18], b3 = 0; b3 < b1; ) {
/*    */       arrayOfPe0[b3] = pe01;
/*    */       pe0 pe01;
/*    */       if ((pe01 = Zi0("monster_type_" + b3 + "_" + paramString)) == this.Jc0)
/*    */         arrayOfPe0[b3] = Zi0("monster_type_" + b3 + "_en"); 
/*    */       b3++;
/*    */     } 
/*    */     for (this.S5 = arrayOfPe0, arrayOfPe0 = new pe0[b1 = 18], b3 = 0; b3 < b1; ) {
/*    */       arrayOfPe0[b3] = pe01;
/*    */       pe0 pe01;
/*    */       if ((pe01 = Zi0("skill_type_" + b3 + "_" + paramString)) == this.Jc0)
/*    */         arrayOfPe0[b3] = Zi0("skill_type_" + b3 + "_en"); 
/*    */       b3++;
/*    */     } 
/*    */     for (this.tl0 = arrayOfPe0, arrayOfPe0 = new pe0[b1 = 3], b3 = 0; b3 < b1; ) {
/*    */       arrayOfPe0[b3] = pe01;
/*    */       pe0 pe01;
/*    */       if ((pe01 = Zi0("skill_damage_" + b3 + "_" + paramString)) == this.Jc0)
/*    */         arrayOfPe0[b3] = Zi0("skill_damage_" + b3 + "_en"); 
/*    */       b3++;
/*    */     } 
/*    */     this.Hz0 = arrayOfPe0;
/*    */   }
/*    */   
/*    */   public final pe0 Ev0(Ht0 paramHt0) {
/*    */     return xk0(paramHt0.zm0);
/*    */   }
/*    */   
/*    */   public final pe0 xk0(int paramInt) {
/*    */     pe0[] arrayOfPe0;
/*    */     if (paramInt >= (arrayOfPe0 = this.S5).length)
/*    */       paramInt = Ht0.CW.zm0; 
/*    */     return this[paramInt];
/*    */   }
/*    */   
/*    */   public final pe0 Pk0(int paramInt) {
/*    */     pe0[] arrayOfPe0;
/*    */     if (paramInt >= (arrayOfPe0 = this.tl0).length)
/*    */       paramInt = Ht0.CW.zm0; 
/*    */     return this[paramInt];
/*    */   }
/*    */   
/*    */   public final pe0 vn0(byte paramByte) {
/*    */     pe0[] arrayOfPe0 = this.KM;
/*    */     if (paramByte != Byte.MIN_VALUE) {
/*    */       if (paramByte != 16) {
/*    */         if (paramByte != 32) {
/*    */           if (paramByte != 64) {
/*    */             if (paramByte != 7) {
/*    */               if (paramByte != 8) {
/*    */                 paramByte = 5;
/*    */               } else {
/*    */                 paramByte = 3;
/*    */               } 
/*    */             } else {
/*    */               paramByte = 4;
/*    */             } 
/*    */           } else {
/*    */             paramByte = 1;
/*    */           } 
/*    */         } else {
/*    */           paramByte = 0;
/*    */         } 
/*    */       } else {
/*    */         paramByte = 2;
/*    */       } 
/*    */     } else {
/*    */       paramByte = 6;
/*    */     } 
/*    */     return this[paramByte];
/*    */   }
/*    */   
/*    */   public final pe0 zk0(byte paramByte) {
/*    */     pe0[] arrayOfPe0 = this.ga;
/*    */     if (paramByte != Byte.MIN_VALUE) {
/*    */       if (paramByte != 16) {
/*    */         if (paramByte != 32) {
/*    */           if (paramByte != 64) {
/*    */             if (paramByte != 7) {
/*    */               if (paramByte != 8) {
/*    */                 paramByte = 5;
/*    */               } else {
/*    */                 paramByte = 3;
/*    */               } 
/*    */             } else {
/*    */               paramByte = 4;
/*    */             } 
/*    */           } else {
/*    */             paramByte = 1;
/*    */           } 
/*    */         } else {
/*    */           paramByte = 0;
/*    */         } 
/*    */       } else {
/*    */         paramByte = 2;
/*    */       } 
/*    */     } else {
/*    */       paramByte = 6;
/*    */     } 
/*    */     return this[paramByte];
/*    */   }
/*    */   
/*    */   public final pe0 Lf() {
/*    */     return this.VS;
/*    */   }
/*    */   
/*    */   public final pe0 Wz() {
/*    */     return this.Bf;
/*    */   }
/*    */   
/*    */   public final pe0 Lk() {
/*    */     return this.te0;
/*    */   }
/*    */   
/*    */   public final pe0 Q0() {
/*    */     return this.pj;
/*    */   }
/*    */   
/*    */   public final pe0 qs() {
/*    */     return this.Lm0;
/*    */   }
/*    */   
/*    */   public final pe0 VH0() {
/*    */     return this.cR;
/*    */   }
/*    */   
/*    */   public final pe0 hJ0() {
/*    */     return this.RA;
/*    */   }
/*    */   
/*    */   public final pe0[] ee() {
/*    */     return this.fh;
/*    */   }
/*    */   
/*    */   public final pe0 Fw(byte paramByte) {
/*    */     return this.LPt3[paramByte];
/*    */   }
/*    */   
/*    */   public final pe0 X(byte paramByte) {
/*    */     return this.ar0[paramByte];
/*    */   }
/*    */   
/*    */   public final pe0 P4() {
/*    */     return this.tL0;
/*    */   }
/*    */   
/*    */   public final pe0 TC0() {
/*    */     return this.Jh0;
/*    */   }
/*    */   
/*    */   public final pe0 gj0(boolean paramBoolean) {
/*    */     return paramBoolean ? this.Pp0 : this.NG;
/*    */   }
/*    */   
/*    */   public final pe0 yI0(boolean paramBoolean) {
/*    */     return paramBoolean ? this.fF0 : this.gd0;
/*    */   }
/*    */   
/*    */   public final pe0 fb() {
/*    */     return this.DE0;
/*    */   }
/*    */   
/*    */   public final pe0 cOM3() {
/*    */     return this.nZ;
/*    */   }
/*    */   
/*    */   public final pe0 he() {
/*    */     return this.Lt;
/*    */   }
/*    */   
/*    */   public final pe0 kK(int paramInt, boolean paramBoolean) {
/*    */     if (paramInt < 0 || paramInt >= this.oc.length)
/*    */       paramInt = 0; 
/*    */     return (paramInt == 0 && paramBoolean) ? this.TD : this.oc[paramInt];
/*    */   }
/*    */   
/*    */   public final pe0 mb() {
/*    */     return this.N8;
/*    */   }
/*    */   
/*    */   public final pe0 K7() {
/*    */     return this.dR;
/*    */   }
/*    */   
/*    */   public final pe0 Sa() {
/*    */     return this.i00;
/*    */   }
/*    */   
/*    */   public final pe0 iF() {
/*    */     return this.n30;
/*    */   }
/*    */   
/*    */   public final pe0 x30() {
/*    */     return this.Ro0;
/*    */   }
/*    */   
/*    */   public final pe0 fu0() {
/*    */     return this.lPt3;
/*    */   }
/*    */   
/*    */   public final pe0 Au() {
/*    */     return this.LV;
/*    */   }
/*    */   
/*    */   public final void dispose() {
/*    */     COm1 cOm1;
/*    */     if ((cOm1 = this.qG0) != null)
/*    */       cOm1.dispose(); 
/*    */     bY bY1;
/*    */     if ((bY1 = this.b10) != null)
/*    */       bY1.dispose(); 
/*    */     this.kO.dispose();
/*    */     this.xs.dispose();
/*    */     this.xo.dispose();
/*    */     this.Nz.dispose();
/*    */   }
/*    */   
/*    */   public final pe0 NC0(int paramInt, String paramString) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: aconst_null
/*    */     //   2: astore_3
/*    */     //   3: getfield b10 : Lf/bY;
/*    */     //   6: dup
/*    */     //   7: astore #4
/*    */     //   9: ifnull -> 92
/*    */     //   12: aload #4
/*    */     //   14: getfield u00 : Lf/RD0;
/*    */     //   17: new java/lang/StringBuilder
/*    */     //   20: dup
/*    */     //   21: aload_2
/*    */     //   22: swap
/*    */     //   23: invokespecial <init> : ()V
/*    */     //   26: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   29: ldc_w '_'
/*    */     //   32: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   35: iload_1
/*    */     //   36: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   39: ldc '.png'
/*    */     //   41: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   44: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   47: invokevirtual f0 : (Ljava/lang/String;)Lf/RD0;
/*    */     //   50: dup
/*    */     //   51: astore_1
/*    */     //   52: invokevirtual L0 : ()Z
/*    */     //   55: ifne -> 61
/*    */     //   58: goto -> 169
/*    */     //   61: aload #4
/*    */     //   63: new com/badlogic/gdx/graphics/Texture
/*    */     //   66: dup
/*    */     //   67: astore_2
/*    */     //   68: aload_1
/*    */     //   69: invokespecial <init> : (Lf/RD0;)V
/*    */     //   72: getfield gE0 : Ljava/util/ArrayList;
/*    */     //   75: aload_2
/*    */     //   76: invokevirtual add : (Ljava/lang/Object;)Z
/*    */     //   79: pop
/*    */     //   80: new f/pe0
/*    */     //   83: dup
/*    */     //   84: astore_3
/*    */     //   85: aload_2
/*    */     //   86: invokespecial <init> : (Lcom/badlogic/gdx/graphics/Texture;)V
/*    */     //   89: goto -> 171
/*    */     //   92: aload_0
/*    */     //   93: getfield qG0 : Lf/COm1;
/*    */     //   96: dup
/*    */     //   97: astore #4
/*    */     //   99: ifnull -> 171
/*    */     //   102: aload #4
/*    */     //   104: iconst_0
/*    */     //   105: istore_3
/*    */     //   106: getfield ui0 : Lf/fQ;
/*    */     //   109: getfield Z8 : I
/*    */     //   112: istore #5
/*    */     //   114: iload_3
/*    */     //   115: iload #5
/*    */     //   117: if_icmpge -> 169
/*    */     //   120: aload #4
/*    */     //   122: getfield ui0 : Lf/fQ;
/*    */     //   125: iload_3
/*    */     //   126: invokevirtual get : (I)Ljava/lang/Object;
/*    */     //   129: checkcast f/P70
/*    */     //   132: dup
/*    */     //   133: astore #6
/*    */     //   135: getfield Pk : Ljava/lang/String;
/*    */     //   138: aload_2
/*    */     //   139: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   142: ifne -> 148
/*    */     //   145: goto -> 157
/*    */     //   148: aload #6
/*    */     //   150: getfield IC : I
/*    */     //   153: iload_1
/*    */     //   154: if_icmpeq -> 163
/*    */     //   157: iinc #3, 1
/*    */     //   160: goto -> 114
/*    */     //   163: aload #6
/*    */     //   165: astore_3
/*    */     //   166: goto -> 171
/*    */     //   169: aconst_null
/*    */     //   170: astore_3
/*    */     //   171: aload_3
/*    */     //   172: ifnull -> 177
/*    */     //   175: aload_3
/*    */     //   176: areturn
/*    */     //   177: aload_0
/*    */     //   178: getfield Jc0 : Lf/pe0;
/*    */     //   181: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 14
/*    */     //   #2	-> 17
/*    */     //   #3	-> 93
/*    */     //   #4	-> 106
/*    */     //   #5	-> 109
/*    */     //   #6	-> 178
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/interface.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */