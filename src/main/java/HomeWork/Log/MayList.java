package HomeWork.Log;

import java.util.ArrayList;
import java.util.Arrays;

public class MayList implements StringList{
    String[]strings=new String[10];
    int count=0;

    @Override
    public String add(String item) {

        for (int i = 0; i < strings.length; i++) {

            if (strings[i]==null) {
                strings[i] = item;
                break;
            }
        }
            return item;



        //return null;
    }

    @Override
    public String add(int count, String item) {
        if(count>=strings.length){
            throw new NotFoundIndex();
        }else {
            strings[count] = item;
        }

        return item;
    }

    @Override
    public String set(int index, String item) {
        if(count>=strings.length){
            throw new NotFoundIndex();
        }else {
            strings[count] = item;
        }
        return item;
    }

    @Override
    public String remove(String item) {
        for (int i = 0; i < strings.length; i++) {
            if(strings[i].equals(item)){
                strings[i]=null;
                break;
            }else{
                throw  new NotFoundElementOfList();
            }


        }
        return item;
    }

    @Override
    public String remove(int index) {
        String item=strings[index];

            if(strings[index]!=null){

                strings[index]=null;

            }else{
                throw  new NotFoundElementOfList();
            }



        return item;


    }

    @Override
    public boolean contains(String item) {

        for (int i = 0; i < strings.length; i++) {
            if(strings[i]==null){
                i++;
            }
            else if(strings[i].equals(item)){
                return true;
            }

        }
        return false;
    }

    @Override
    public int indexOf(String item) {
        for (int i = 0; i < strings.length; i++) {
            if(strings[i]==null){
                    i++;
            }
            else if(strings[i].equals(item)){
                return i;
            }

        }
        return -1;
    }

    @Override
    public int lastIndexOf(String item) {
        for (int i = strings.length-1; i>=0; i--) {
            if(strings[i]==null){
                i--;
            }
            else if(strings[i].equals(item)){
                return i;
            }

        }
        return -1;
    }

    @Override
    public String get(int index) {
        if(index>strings.length){
            throw new NotFoundIndex();
        }
        return strings[index];
    }

    @Override
    public boolean equals(StringList otherList) {
        return false;
    }

    @Override
    public int size() {
        int count=0;
        for (int i = 0; i < strings.length; i++) {
            if(strings[i]!=null){
                count++;
            }

        }
        return count;
    }

    @Override
    public boolean isEmpty() {
        for (int i = 0; i < strings.length; i++) {
            if(strings[i]!=null){
                return false;
            }

        }

        return true;
    }

    @Override
    public void clear() {
        for (int i = 0; i < strings.length; i++) {
            if(strings[i]!=null){
                strings[i]=null;
            }

        }


    }

    @Override
    public String[] toArray() {
        return new String[]{"fff","dd","tt"};
    }
}
