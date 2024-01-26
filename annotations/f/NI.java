package f;

public abstract class NI {
  public static final eo zc0 = new eo();
  
  public static final byte[] h = new byte[] { 1, 3, 0, 2 };
  
  public static int lPT4 = 80;
  
  public static int XH = 135;
  
  public static int Ov0 = 275;
  
  public static int uF = 390;
  
  public static int yP = 525;
  
  public static int IC0 = 550;
  
  public static int OJ = 200;
  
  public static byte yx(byte paramByte) {
    return (paramByte != 0) ? ((paramByte != 1) ? paramByte : 0) : 1;
  }
  
  public static byte rD(byte paramByte) {
    switch (paramByte) {
      default:
        return paramByte;
      case 3:
        return 2;
      case 2:
        return 3;
      case 1:
        return 0;
      case 0:
        break;
    } 
    return 1;
  }
  
  public static eo h0(byte paramByte) {
    switch (paramByte) {
      default:
        return zc0.TG0(0.0F, 0.0F, 0.0F);
      case 3:
        return zc0.TG0(1.0F, 0.0F, 0.0F);
      case 2:
        return zc0.TG0(-1.0F, 0.0F, 0.0F);
      case 1:
        return zc0.TG0(0.0F, 0.0F, -1.0F);
      case 0:
        break;
    } 
    return zc0.TG0(0.0F, 0.0F, 1.0F);
  }
  
  public static String V90(byte paramByte) {
    return (paramByte != 1) ? ((paramByte != 2) ? ((paramByte != 3) ? "SOUTH" : "EAST") : "WEST") : "NORTH";
  }
  
  public static byte IS(byte paramByte, float paramFloat) {
    if (nx0.JC0(paramFloat, 270.0F)) {
      switch (paramByte) {
        default:
          return paramByte;
        case 3:
          return 1;
        case 2:
          return 0;
        case 1:
          return 2;
        case 0:
          break;
      } 
      return 3;
    } 
    if (nx0.JC0(paramFloat, 90.0F)) {
      switch (paramByte) {
        default:
        
        case 3:
          return 0;
        case 2:
          return 1;
        case 1:
          return 3;
        case 0:
          break;
      } 
      return 2;
    } 
    if (nx0.JC0(paramFloat, 180.0F)) {
      switch (paramByte) {
        default:
        
        case 3:
          return 2;
        case 2:
          return 3;
        case 1:
          return 0;
        case 0:
          break;
      } 
      return 1;
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/NI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */