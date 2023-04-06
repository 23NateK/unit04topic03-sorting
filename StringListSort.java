import java.util.ArrayList;
import java.util.Arrays;

public class StringListSort {
    public static void selectionSort(ArrayList<String> items) {
        if (items.size()>1){
            for(int i=0;i<items.size();i++){
                String minValue=items.get(i);
                int minindex=i;
                for(int n=i+1;n<items.size();n++){
                    if(items.get(n).compareTo(items.get(minindex))<0){
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
        
    }
}