package com.aspose.cells.examples.files.utility;

import com.aspose.cells.*;
import com.aspose.cells.examples.Utils;

public class ConvertingToXPS {

    public static void main(String[] args) throws Exception {
        //ExStart:1
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ConvertingToXPS.class);

        Workbook workbook = new Workbook(dataDir + "Book1.xls");

        //Get the first worksheet.
        Worksheet sheet = workbook.getWorksheets().get(0);

        //Apply different Image and Print options
        com.aspose.cells.ImageOrPrintOptions options = new ImageOrPrintOptions();

        //Set the Format
        options.setSaveFormat(SaveFormat.XPS);

        // Render the sheet with respect to specified printing options
        com.aspose.cells.SheetRender sr = new SheetRender(sheet, options);
        sr.toImage(0, dataDir + "output.xps");

        //Save the complete Workbook in XPS format
        workbook.save(dataDir + "output.xps", SaveFormat.XPS);

        // Print message
        System.out.println("Excel to XPS conversion performed successfully.");
        //ExEnd:1
    }
}
