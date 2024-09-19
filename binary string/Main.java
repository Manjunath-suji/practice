//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
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



    public static void main(String[] args) {

converter("11011");

    }
}
