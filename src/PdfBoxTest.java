import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.util.PDFTextStripper;

public class PdfBoxTest {
	public List getPdf() {
		// Reads in pdf document
		PDDocument pdDoc = null;
		try {
			pdDoc = PDDocument.load(new File("res/wow_core_ocr_130410.pdf"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
		return pdDoc.getDocumentCatalog().getAllPages();
	}

	public static void main(String[] args) {
		PdfBoxTest pdf = new PdfBoxTest();
		List pages=pdf.getPdf();
		for(int index=0;index<pages.size();index++) {
			System.out.println(pages.get(index).toString());
		}

		System.out.println("cucu");
	}
}
