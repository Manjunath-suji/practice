//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //to convert binary string to alphabet
    // 111011 ->CB
    public static void converter(String n){
        String ans="";
        int count=0;
        for(int i=0;i<n.length();i++){
            if(n.charAt(i)=='1'){
                count++;
            }
            else{
                if(count>0)
                {
                    ans= ans + (char)(65+(count-1));
                    count=0;
                }
            }
        }
        if(n.charAt(n.length()-1)=='1'){
            ans=ans+(char)(65+count-1);
        }
        System.out.println(ans);
    }
//-------------------------------------------------------------------------------------------------
//to capitalize the string
    public  static String cap(String s){
       //sDFGYhjb -> Sdfgyhjb
        s=s.toLowerCase();
        StringBuilder r=new StringBuilder(s);

        r.setCharAt(0,Character.toUpperCase(s.charAt(0)));
        System.out.println(r);
        String h=r.toString();
        return h;

    }
    //---------------------------------------------------------------------------------------------
    //to see whether string is valid or not
    public static int valid(String s,int g){

        int countn=0,counta=0;
        char[] t=s.toCharArray();
        if(g>4 && !(Character.isDigit(s.charAt(0)))){
            for(int i=0;i<t.length;i++){
                if(Character.isUpperCase(t[i])){
                    counta++;
                }
                if(Character.isDigit(t[i])){
                    countn++;
                }
                if(t[i]=='/' || t[i]==' '){
                    return 0;

                }
            }
        }

        if(counta>0 && countn>0){
            return 1;
        }

        return 0;
    }
    //--------------------------------------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {

converter("11011");
cap("gfbfGJ");
    }
}
