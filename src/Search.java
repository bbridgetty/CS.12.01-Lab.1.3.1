import java.util.ArrayList;

public class Search {

    public static int linearSearch(int[] array, int value) {
        for(int i=0; i<array.length; i++){
            if(value==array[i]){
                return i;
            }
        }
        return -1;
    }

    public static int linearSearch(ArrayList<String> list, String string) {
        for(int i=0; i<list.size(); i++){
            if(string.equals(list.get(i))){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] array, int value) {
        int first = 0;
        int last = array.length - 1;

        while (first <= last){
            int mid = (first+last)/2;
            if(value < array[mid]){ //this means that it's too high
                last = mid - 1;
            }
            else if(value > array[mid]){
                first = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static int binarySearch(String[] array, String string) {
        for(int i = 0; i <array.length; i++){
            if(string.equals(array[i])){
                return i;
            }
        }
        return -1;
    }
}
