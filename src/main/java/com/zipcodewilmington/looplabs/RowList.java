package com.zipcodewilmington.looplabs;

import java.util.ArrayList;

public class RowList<T> {

    public Object[] rowList;

    public RowList(Object[] arr) {
        this.rowList = arr;
    }

    public Integer countDups(Object o) {
        Integer count = 0;
        for (Object obj : rowList) {
            if (obj.equals(o)) {
                count++;
            }
        }
        return count;
    }

    public void removeAtIndex(Integer index) {
        Object[] newRowList = new Object[rowList.length - 1];
        Integer x = 0;

        for (int i = 0; i < rowList.length; i++) {

            if (i != index) {
                newRowList[x] = rowList[i];
                x++;
            }

        }
        this.rowList = newRowList;
    }

    public void removeAll(Object o) {
        for (int i = 0; i < rowList.length; i++) {
            if (rowList[i].equals(o)) {
                removeAtIndex(i);
                i--;
            }
        }

    }

    public Object[] toArray() {
        return rowList;
    }


    public void removeDupesMaxNum(int maxNumberOfDuplications) {
        for (Object o : rowList) {
            if (countDups(o) >= maxNumberOfDuplications) {
                removeAll(o);
            }
        }
    }

    public void removeDupesExactNum(int exactNumberOfDuplications) {
        for (Object o : rowList) {
            if (countDups(o) == exactNumberOfDuplications) {
                removeAll(o);
            }
        }
    }

}
