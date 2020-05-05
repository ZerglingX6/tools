package cn.gjing.tools.excel.write.listener;

import cn.gjing.tools.excel.write.valid.ExcelDropdownBox;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.lang.reflect.Field;

/**
 * Cascading dropdown box listener
 *
 * @author Gjing
 **/
public interface ExcelCascadingDropdownBoxListener extends ExcelWriteListener {
    /**
     * Initializes the excel name manager
     * @param workbook Current workbook
     * @param sheet Current sheet
     */
    ExcelCascadingDropdownBoxListener initName(Workbook workbook, Sheet sheet);

    /**
     * Add cascading dropdown box
     *
     * @param excelDropdownBox ExplicitValid
     * @param workbook         workbook
     * @param sheet            The current sheet
     * @param firstRow         First row
     * @param lastRow          Last row
     * @param colIndex         Col index
     * @param field            Current field
     */
    void addCascadingDropdownBox(ExcelDropdownBox excelDropdownBox, Workbook workbook, Sheet sheet, int firstRow, int lastRow, int colIndex,
                                 Field field);
}