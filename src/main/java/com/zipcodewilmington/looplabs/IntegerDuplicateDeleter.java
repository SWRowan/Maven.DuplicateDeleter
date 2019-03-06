package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 *
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

    protected Integer[] intArray;

    IntegerDuplicateDeleter(Integer[] intArray) {
        this.intArray = intArray;
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        RowList rowList = new RowList(intArray);
        rowList.removeDupesMaxNum(maxNumberOfDuplications);
        return getIntegersArr(rowList);
    }


    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        RowList rowList = new RowList(intArray);
        rowList.removeDupesExactNum(exactNumberOfDuplications);
        return getIntegersArr(rowList);
    }

    public Integer[] getIntegersArr(RowList rowList) {
        return Arrays.copyOf(rowList.toArray(), rowList.toArray().length, Integer[].class);
    }


}
