package com.aspose.cells.examples.worksheets.security.unprotecting;

import com.aspose.cells.*;
import com.aspose.cells.examples.Utils;

public class UnprotectProtectSheet {

    public static void main(String[] args) throws Exception {
        //ExStart:1
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(UnprotectProtectSheet.class);

        //Instantiating a Workbook object
        Workbook workbook = new Workbook(dataDir + "book1.xls");

        WorksheetCollection worksheets = workbook.getWorksheets();
        Worksheet worksheet = worksheets.get(0);

        //Unprotecting the worksheet
        worksheet.unprotect("aspose");

        // Save the excel file.
        workbook.save(dataDir + "output.xls", FileFormatType.EXCEL_97_TO_2003);

        //Print Message
        System.out.println("Worksheet unprotected successfully.");
        //ExEnd:1
    }
}
