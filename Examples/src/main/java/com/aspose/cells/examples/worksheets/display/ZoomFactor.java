package com.aspose.cells.examples.worksheets.display;

import com.aspose.cells.*;
import com.aspose.cells.examples.Utils;

public class ZoomFactor {

    public static void main(String[] args) throws Exception {
        //ExStart:1
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ZoomFactor.class);

        //Instantiating a Excel object by excel file path
        Workbook workbook = new Workbook(dataDir + "book1.xls");

        //Accessing the first worksheet in the Excel file
        WorksheetCollection worksheets = workbook.getWorksheets();
        Worksheet worksheet = worksheets.get(0);

        //Setting the zoom factor of the worksheet to 75
        worksheet.setZoom(75);

        //Saving the modified Excel file in default format
        workbook.save(dataDir + "output.xls");

        // Print message
        System.out.println("Zoom factor set to 75% for sheet 1, please check the output document.");
        //ExEnd:1
    }
}
