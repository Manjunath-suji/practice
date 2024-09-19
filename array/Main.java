import java.util.ArrayList;
import java.util.Comparator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void eve(int[] arr){
        //input {4,1,5,7,8,9,7}
        /*output [1, 7, 9]
               [4, 5, 7, 8]
               14  */
        ArrayList<Integer> l=new ArrayList<>();
        ArrayList<Integer> h=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(i%2!=0){
                l.add(arr[i]);

            }
            else{
                h.add(arr[i]);
            }

        }
        l.sort(Comparator.naturalOrder());
        h.sort(Comparator.naturalOrder());
        System.out.println(l);
        System.out.println(h);
        System.out.println(l.get(l.size()-2)+h.get(h.size()-2));

    }

    public static void main(String[] args) {
        int[] arr={4,1,5,7,8,9,7};
    eve(arr);

    }
}
