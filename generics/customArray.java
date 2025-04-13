package generics;

import java.beans.Customizer;
import java.util.Arrays;

public class customArray {
    private int[] data;
    private int default_size=10;
    private int size=0;;


    public customArray()
    {
        this.data=new int[default_size];

    }

    public void add(int num){
        if(isSize()){
            resize();
        }
        data[size++]= num;
    }

    private void resize() {
        int[] temp =new int[size*2];
//        Copying the size of an array

        for (int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }

    private boolean isSize() {
        return size==data.length;
    }

    public int removed(){
        int remove=data[size];
        return remove;

    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    @Override
    public String toString() {
        return "customArray{" +
                "data=" + Arrays.toString(data) +
                ", default_size=" + default_size +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {

        customArray abc = new customArray();

        abc.add(2);
        abc.add(9);
        abc.size();
        abc.add(3);
        abc.get(2);
        abc.removed();
        abc.size();
        System.out.println(abc);



    }

}
