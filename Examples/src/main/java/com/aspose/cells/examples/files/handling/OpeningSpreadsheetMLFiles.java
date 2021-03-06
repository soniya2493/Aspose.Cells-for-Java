package com.aspose.cells.examples.files.handling;

import com.aspose.cells.FileFormatType;
import com.aspose.cells.LoadOptions;
import com.aspose.cells.Workbook;
import com.aspose.cells.examples.Utils;

public class OpeningSpreadsheetMLFiles {

    public static void main(String[] args) throws Exception {
        //ExStart:1
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(OpeningSpreadsheetMLFiles.class);
        String filePath = dataDir + "Book1.html";

        // Opening SpreadsheetML Files
        //Creating and EXCEL_2003_XML LoadOptions object
        LoadOptions loadOptions3 = new LoadOptions(FileFormatType.EXCEL_2003_XML);

        //Creating an Workbook object with SpreadsheetML file path and the loadOptions object
        Workbook workbook5 = new Workbook(dataDir + "Book3.xml", loadOptions3);

        // Print message
        System.out.println("SpreadSheetML format workbook has been opened successfully.");
        //ExEnd:1

    }
}
