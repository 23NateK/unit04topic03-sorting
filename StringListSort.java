import java.util.ArrayList;
import java.util.Arrays;

public class StringListSort {
    public static void selectionSort(ArrayList<String> items) {
        if (items.size()>1){
            for(int i=0;i<items.size()-1;i++){
                String minValue=items.get(0);
                int minindex=0;
                for(int n=0;n<items.size()-1;n++){
                    if(items.get(n).compareTo(items.get(minindex))>0){
                        minValue=items.get(n);
                        minindex=n;
                    }
                }
                String temp=items.get(i);
                items.set(i, minValue);
                items.set(minindex, temp);
                System.out.println(items);
            }
        }
    }
    
    
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>(Arrays.asList("there", "is", "the", "mountain"));
        selectionSort(a);
    }
}