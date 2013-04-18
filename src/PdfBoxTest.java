import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.util.PDFTextStripper;

public class PdfBoxTest {
	public void getPdfText() {
		// Reads in pdf document
		PDDocument pdDoc;
		try {
			pdDoc = PDDocument.load(new File(
					"../res/wow_core_ocr_130410.pdf"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// Creates a new pdf document
		PDDocument document = null;

		// Adds specific page "i" where "i" is the page number and then saves
		// the new pdf document
		try {
			document = new PDDocument();
			document.addPage((PDPage) pdDoc.getDocumentCatalog().getAllPages()
					.get(1));
			document.save("file path" + "new document title" + ".pdf");
			document.close();
		} catch (Exception e) {
		}
	}

	public static void main(String[] args) {

		System.out.println("cucu");
	}
}
