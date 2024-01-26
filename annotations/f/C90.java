package f;

public abstract class C90 {
  public static short NH(int paramInt, short paramShort) {
    switch (paramShort) {
      default:
      
      case 648:
        return 123;
      case 647:
        return 122;
      case 640:
        return 117;
      case 639:
        return 116;
      case 638:
        return 115;
      case 585:
        switch (paramInt) {
          default:
            return 0;
          case 3:
            return 220;
          case 2:
            return 219;
          case 1:
            return 218;
          case 0:
            break;
        } 
        return 217;
      case 572:
        return 130;
      case 570:
        return 195;
      case 552:
        return 131;
      case 548:
        return 129;
      case 546:
        return 209;
      case 518:
        return 127;
      case 517:
        return 126;
      case 504:
        return 128;
      case 494:
        break;
    } 
    return 125;
  }
  
  public static short Uw0(short paramShort, boolean paramBoolean, int paramInt) {
    if (paramShort < 3)
      return paramShort; 
    if (paramShort == 3) {
      if (paramBoolean)
        paramShort = (short)(paramShort + 1); 
      return paramShort;
    } 
    short s = (short)(paramShort + 1);
    if (paramShort < 25)
      return s; 
    if (paramShort == 25) {
      if (paramBoolean)
        s = (short)(s + 1); 
      return s;
    } 
    s = (short)(s + 1);
    if (paramShort < 154)
      return s; 
    if (paramShort == 154) {
      if (paramBoolean)
        s = (short)(s + 1); 
      return s;
    } 
    s = (short)(s + 1);
    s = (short)(s + 1);
    if (paramShort > 172 && paramShort > 201) {
      s = (short)(s + 27);
      if (paramShort == 202) {
        if (paramBoolean)
          s = (short)(s + 1); 
        return s;
      } 
      s = (short)(s + 1);
      if (paramShort < 208)
        return s; 
      if (paramShort == 208) {
        if (paramBoolean)
          s = (short)(s + 1); 
        return s;
      } 
      s = (short)(s + 1);
      if (paramShort < 214)
        return s; 
      if (paramShort == 214) {
        if (paramBoolean)
          s = (short)(s + 1); 
        return s;
      } 
      s = (short)(s + 1);
      s = (short)(s + 3);
      s = (short)(s + 2);
      if (paramShort > 386 && paramShort > 412 && paramShort > 413) {
        s = (short)(s + 2);
        if (paramShort < 415)
          return s; 
        if (paramShort == 415) {
          if (paramBoolean)
            s = (short)(s + 1); 
          return s;
        } 
        s = (short)(s + 1);
        s = (short)(s + 1);
        if (paramShort > 422 && paramShort > 423) {
          s = (short)(s + 1);
          if (paramShort < 443)
            return s; 
          if (paramShort == 443) {
            if (paramBoolean)
              s = (short)(s + 1); 
            return s;
          } 
          s = (short)(s + 1);
          if (paramShort == 444) {
            if (paramBoolean)
              s = (short)(s + 1); 
            return s;
          } 
          s = (short)(s + 1);
          if (paramShort == 445) {
            if (paramBoolean)
              s = (short)(s + 1); 
            return s;
          } 
          s = (short)(s + 1);
          if (paramShort < 449)
            return s; 
          if (paramShort == 449) {
            if (paramBoolean)
              s = (short)(s + 1); 
            return s;
          } 
          s = (short)(s + 1);
          if (paramShort == 450) {
            if (paramBoolean)
              s = (short)(s + 1); 
            return s;
          } 
          short s1 = (short)(s + 1);
          s1 = (short)(s1 + 5);
          s1 = (short)(s1 + 1);
          s1 = (short)(s1 + 1);
          if (paramShort <= 479 || paramShort <= 487 || paramShort <= 492 || paramShort <= 493) {
            s = s1;
            return (short)(s + paramInt);
          } 
          paramShort = (short)(s1 + 18);
          return (NH(paramInt, paramShort) > 0) ? paramShort : 0;
        } 
      } 
    } 
    return (short)(s + paramInt);
  }
  
  public static short eA(short paramShort) {
    while (paramShort > 5094)
      paramShort = (short)(paramShort - 1000); 
    return (paramShort < 4095) ? 1 : (((paramShort = (short)(paramShort - 4095)) <= 0) ? 1 : ((paramShort < 3) ? paramShort : ((paramShort == 3 || paramShort == 4) ? 3 : (((paramShort = (short)(paramShort - 1)) < 25) ? paramShort : ((paramShort == 25 || paramShort == 26) ? 25 : (((paramShort = (short)(paramShort - 1)) < 154) ? paramShort : ((paramShort == 154 || paramShort == 155) ? 154 : (((paramShort = (short)(paramShort - 1)) < 172) ? paramShort : ((paramShort == 172 || paramShort == 173) ? 172 : (((paramShort = (short)(paramShort - 1)) < 201) ? paramShort : ((paramShort <= 228) ? 201 : (((paramShort = (short)(paramShort - 27)) == 202 || paramShort == 203) ? 202 : (((paramShort = (short)(paramShort - 1)) < 208) ? paramShort : ((paramShort == 208 || paramShort == 209) ? 208 : (((paramShort = (short)(paramShort - 1)) < 214) ? paramShort : ((paramShort == 214 || paramShort == 215) ? 214 : (((paramShort = (short)(paramShort - 1)) < 386) ? paramShort : ((paramShort < 389) ? 386 : (((paramShort = (short)(paramShort - 3)) < 412) ? paramShort : ((paramShort <= 414) ? 412 : (((paramShort = (short)(paramShort - 2)) <= 415) ? 413 : (((paramShort = (short)(paramShort - 2)) < 415) ? paramShort : ((paramShort == 415 || paramShort == 416) ? 415 : (((paramShort = (short)(paramShort - 1)) < 422) ? paramShort : ((paramShort == 422 || paramShort == 423) ? 422 : (((paramShort = (short)(paramShort - 1)) == 423 || paramShort == 424) ? 423 : (((paramShort = (short)(paramShort - 1)) < 443) ? paramShort : ((paramShort == 443 || paramShort == 444) ? 443 : (((paramShort = (short)(paramShort - 1)) == 444 || paramShort == 445) ? 444 : (((paramShort = (short)(paramShort - 1)) == 445 || paramShort == 446) ? 445 : (((paramShort = (short)(paramShort - 1)) < 449) ? paramShort : ((paramShort == 449 || paramShort == 450) ? 449 : (((paramShort = (short)(paramShort - 1)) == 450 || paramShort == 451) ? 450 : (((paramShort = (short)(paramShort - 1)) < 479) ? paramShort : ((paramShort <= 484) ? 479 : (((paramShort = (short)(paramShort - 5)) < 487) ? paramShort : ((paramShort == 487 || paramShort == 488) ? 487 : (((paramShort = (short)(paramShort - 1)) < 492) ? paramShort : ((paramShort == 492 || paramShort == 493) ? 492 : (((paramShort = (short)(paramShort - 1)) <= 511) ? 493 : (((paramShort = (short)(paramShort - 18)) > 649 && NH(0, paramShort) < 1) ? 1 : paramShort)))))))))))))))))))))))))))))))))))))))));
  }
  
  public static short Ym0(short paramShort) {
    switch (paramShort) {
      default:
        switch (paramShort) {
          default:
            return 0;
          case 1046:
            return 276;
          case 1045:
            return 275;
          case 1044:
            return 274;
          case 1043:
            return 273;
          case 1042:
            return 272;
          case 1041:
            return 271;
          case 1040:
            return 270;
          case 1039:
            return 269;
          case 1038:
            return 268;
          case 1037:
            return 267;
          case 1036:
            return 266;
          case 1035:
            return 265;
          case 1034:
            return 264;
          case 1033:
            return 263;
          case 1032:
            return 262;
          case 1031:
            return 261;
          case 1030:
            return 260;
          case 1029:
            break;
        } 
        return 259;
      case 1018:
        return 231;
      case 1017:
        return 230;
      case 1016:
        return 229;
      case 1015:
        return 228;
      case 1014:
        return 227;
      case 1013:
        return 226;
      case 1012:
        return 225;
      case 1011:
        return 224;
      case 1010:
        return 223;
      case 1009:
        return 222;
      case 1008:
        return 221;
      case 1007:
        return 220;
      case 1006:
        return 219;
      case 1005:
        return 218;
      case 1004:
        return 217;
      case 1003:
        break;
    } 
    return 216;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/C90.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */