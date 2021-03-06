package com.aspose.cells.examples.files.handling;

import com.aspose.cells.FileFormatType;
import com.aspose.cells.Workbook;
import com.aspose.cells.examples.Utils;

public class SaveInExcel2007xlsxFormat {

    public static void main(String[] args) throws Exception {
        //ExStart:1
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(SaveInExcel2007xlsxFormat.class);

        //Creating an Workbook object with an Excel file path
        Workbook workbook = new Workbook();

        //Save in Excel2007 xlsx format
        workbook.save(dataDir + "output.xlsx", FileFormatType.XLSX);

        //Print Message
        System.out.println("Worksheets are saved successfully.");
        //ExEnd:1
    }
}
