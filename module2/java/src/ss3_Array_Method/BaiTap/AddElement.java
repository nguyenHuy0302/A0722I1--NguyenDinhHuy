package ss3_Array_Method.BaiTap;

import java.util.Arrays;

public class AddElement {
    public static int[] add(int value,int index, int[] array){
        if(index<=1 || index>=array.length-1){
            System.out.println("Position is not exist");
            return array;
        }
        int[] newArray = new int[array.length+1];
        for(int i=0; i<index; i++){
            newArray[i] = array[i];
        }
        array[index-1] = value;
        for(int i=newArray.length-1; i>=index; i--){
            newArray[i] = array[i-1];
        }
        System.out.println("Added " + value +" at position " + index);
        return newArray;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,5,7,8,23};
        arr = add(20,2,arr);
        System.out.println(Arrays.toString(arr));
    }
}
