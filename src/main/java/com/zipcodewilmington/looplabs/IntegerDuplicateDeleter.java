package com.zipcodewilmington.looplabs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    Integer[] intArray;
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
        this.intArray = intArray;
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        List<Integer> newList = new ArrayList<>();
        List<Integer> removedList = new ArrayList<>();
        newList.addAll(Arrays.asList(intArray));
        int count = 0;
        int totalCount = 0;
        for (Integer element : intArray){
            count = 0;
            for (Integer element2 : intArray){
                if (Objects.equals(element, element2)){
                    count++;
                }
                }
            if (count >= maxNumberOfDuplications){
                removedList.add(element);
                totalCount += count;
            }
        }
        for (Integer element : intArray){
            for (Integer element2 : removedList){
                if (Objects.equals(element, element2)){
                    newList.remove(element);
                }
            }
        }
        Integer[] newArr = new Integer[newList.size()];
        newArr = newList.toArray(newArr);
        return newArr;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        List<Integer> newList = new ArrayList<>();
        List<Integer> removedList = new ArrayList<>();
        newList.addAll(Arrays.asList(intArray));
        Integer count = 0;
        for (Integer element : intArray){
            count = 0;
            for (Integer element2 : intArray){
                if (Objects.equals(element, element2)){
                    count++;
                }

                }
            if (count == exactNumberOfDuplications){
                removedList.add(element);
            }
        }
        for (Integer element : intArray){
            for (Integer element2 : removedList){
                if (Objects.equals(element, element2)){
                    newList.remove(element);
                }
            }
        }
        Integer[] newArr = new Integer[newList.size()];
        newArr = newList.toArray(newArr);
        return newArr;
    }
}
