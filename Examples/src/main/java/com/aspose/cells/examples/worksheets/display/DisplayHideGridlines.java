package com.aspose.cells.examples.worksheets.display;

import com.aspose.cells.*;
import com.aspose.cells.examples.Utils;

public class DisplayHideGridlines {

    public static void main(String[] args) throws Exception {
        //ExStart:1
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(DisplayHideGridlines.class);

        //Instantiating a Workbook object by excel file path
        Workbook workbook = new Workbook(dataDir + "book1.xls");

        //Accessing the first worksheet in the Excel file
        WorksheetCollection worksheets = workbook.getWorksheets();

        Worksheet worksheet = worksheets.get(0);

        //Hiding the grid lines of the first worksheet of the Excel file
        worksheet.setGridlinesVisible(false);

        //Saving the modified Excel file in default (that is Excel 2000) format
        workbook.save(dataDir + "output.xls");

        // Print message
        System.out.println("Grid lines are now hidden on sheet 1, please check the output document.");
        //ExEnd:1
    }
}
