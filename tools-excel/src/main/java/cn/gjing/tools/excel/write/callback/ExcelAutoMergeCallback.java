package cn.gjing.tools.excel.write.callback;

import java.lang.reflect.Field;

/**
 * Auto merge callback
 *
 * @author Gjing
 **/
@FunctionalInterface
public interface ExcelAutoMergeCallback<T> {
    /**
     * Vertical merge
     *
     * @param t        The excel mapping entity for the current row, Null in the header case
     * @param field    Current field
     * @param colIndex colIndex
     * @param index    Line index, index type according to isHead
     * @return true is need merge
     */
    boolean mergeY(T t, Field field, int colIndex, int index);
}
