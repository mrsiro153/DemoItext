package pk1;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;
import emailService.EmailService;
import emailService.IEmailService;
import pk1.template.CreateQuickRegisterEmail;

import java.io.*;

/**
 * Created by huydoan on 13/06/2017.
 */
public class MainClass {

    public static final String DEST = "C:\\Users\\DoanNH\\IdeaProjects\\DemoItext\\DemoItext\\src\\main\\resources\\htmlFile\\result.pdf";
    public static final String SRCHTML ="C:\\Users\\DoanNH\\IdeaProjects\\DemoItext\\DemoItext\\src\\main\\resources\\htmlFile\\myFile.html";

    public static void main(String[] args) {
        try {
            /*String body = new CreateQuickRegisterEmail("gfdgdfgdfgd","Nguyen hoang nam").render();
            System.out.println(body);*/
            //
            File file = new File(DEST);
            file.getParentFile().mkdirs();
            new MainClass().createPdf2(DEST);
            IEmailService emailService = new EmailService();
            emailService.sendEmail();
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    public void createPdf(String file) throws IOException, DocumentException {
        // step 1
        Document document = new Document();
        // step 2
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(file));
        writer.setInitialLeading(12);
        // step 3
        document.open();
        // step 4
        XMLWorkerHelper.getInstance().parseXHtml(writer, document,
                new FileInputStream(SRCHTML));
        // step 5
        document.close();
    }
    //
    public void createPdf2(String file) throws IOException, DocumentException {
        String k = "<!DOCTYPE html><html><head><style>body{background-color: aqua} .body{background-color: aqua}</style></head><body> This is my Project    \n<h1> myname he</h1> </body></html>";
        String body = new CreateQuickRegisterEmail("gfdgdfgdfgd","Nguyen hoang nam").render();
        System.out.println(body);
        // step 1
        Document document = new Document();
        // step 2
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(file));
        writer.setInitialLeading(12);
        // step 3
        document.open();
        // step 4
        InputStream is = new ByteArrayInputStream(body.getBytes());
        // step 5
        XMLWorkerHelper.getInstance().parseXHtml(writer, document,
                is);
        document.close();
    }
}
