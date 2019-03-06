package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/28/18.
 *
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {

    protected String[] strArray;

    StringDuplicateDeleter(String[] strArray) {
        this.strArray = strArray;
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        RowList rowList = new RowList(strArray);
        rowList.removeDupesMaxNum(maxNumberOfDuplications, rowList, strArray);
        return getStringArr(rowList);
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        RowList rowList = new RowList(strArray);
        rowList.removeDupesExactNum(exactNumberOfDuplications, rowList, strArray);
        return getStringArr(rowList);
    }


    public String[] getStringArr(RowList rowList) {
        return Arrays.copyOf(rowList.toArray(), rowList.toArray().length, String[].class);
    }
}
