public class POS2{

     public static void main(String []args){
        StringBuffer inStr = new StringBuffer("Hello, 4502 World");
        StringBuffer outStr  = new StringBuffer();
        String[] strArr = inStr.toString().split(" ");
        
        for(String s : strArr){
            
            inStr = new StringBuffer(s);
            if(s.matches("\\d+")){
                outStr.append(inStr);
                outStr.append(" ");
            } else {
                int idx;
                if( (idx = s.indexOf(","))!=-1){
                    //System.out.println("Punctvation String : "+s+" idx : "+idx);
                    String punStr = s.substring(idx);
                    inStr.deleteCharAt(idx);
                    outStr.append(inStr.reverse());
                    outStr.append("ib");
                    outStr.append(punStr);
                    outStr.append(" ");
                } else {
                    outStr.append(inStr.reverse());
                    outStr.append("ib ");
                }
            }
        }
        
        System.out.println(outStr);
     }
}