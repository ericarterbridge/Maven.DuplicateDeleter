package com.zipcodewilmington.looplabs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {

    String[] intArray;
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
        this.intArray = intArray;
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        List<String> newList = new ArrayList<>();
        List<String> removedList = new ArrayList<>();
        newList.addAll(Arrays.asList(intArray));
        Integer count = 0;
        for (String element : intArray){
            count = 0;
            for (String element2 : intArray){
                if (Objects.equals(element, element2)){
                    count++;
                }
            }
            if (count >= maxNumberOfDuplications){
                removedList.add(element);
            }
        }
        for (String element : intArray){
            for (String element2 : removedList){
                if (Objects.equals(element, element2)){
                    newList.remove(element);
                }
            }
        }
        String[] newArr = new String[newList.size()];
        newArr = newList.toArray(newArr);
        return newArr;
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        List<String> newList = new ArrayList<>();
        List<String> removedList = new ArrayList<>();
        newList.addAll(Arrays.asList(intArray));
        Integer count = 0;
        for (String element : intArray){
            count = 0;
            for (String element2 : intArray){
                if (Objects.equals(element, element2)){
                    count++;
                }

            }
            if (count == exactNumberOfDuplications){
                removedList.add(element);
            }
        }
        for (String element : intArray){
            for (String element2 : removedList){
                if (Objects.equals(element, element2)){
                    newList.remove(element);
                }
            }
        }
        String[] newArr = new String[newList.size()];
        newArr = newList.toArray(newArr);
        return newArr;
    }
}
