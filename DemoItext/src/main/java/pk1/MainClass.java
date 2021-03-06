package pk1;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;
import dto.Money;
import dto.MoneyBag;
import dto.TestDTO;
import dto.UserDTO;
import pk1.template.CreateQuickRegisterEmail;
import pk1.template.CreateRegister;
import pk1.template.depositForm.CreateDeposit;
import pk1.template.detailsMoney.CreateDetailsReport;
import pk1.template.updateInfo.CreateUpdateUserInfo;
import pk1.template.withdrawForm.CreateWithdrawForm;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by huydoan on 13/06/2017.
 */
public class MainClass {

    public static final String DEST = "C:\\Users\\DoanNH\\IdeaProjects\\DemoItext\\DemoItext\\src\\main\\resources\\htmlFile\\result.pdf";
    public static final String SRCHTML ="C:\\Users\\DoanNH\\IdeaProjects\\DemoItext\\DemoItext\\src\\main\\resources\\htmlFile\\myFile.html";
    public static final String DEST_HTML= "C:\\Users\\DoanNH\\IdeaProjects\\DemoItext\\DemoItext\\src\\main\\resources\\htmlFile\\resulthtml.html";

    public static void main(String[] args) {
        try {
            /*String body = new CreateQuickRegisterEmail("gfdgdfgdfgd","Nguyen hoang nam").render();
            System.out.println(body);*/
            //
            File file = new File(DEST);
            file.getParentFile().mkdirs();
            new MainClass().createdetailReport(DEST);
            //IEmailService emailService = new EmailService();
            //emailService.sendEmail();


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
        TestDTO testDTO = new TestDTO();

        String body = new CreateQuickRegisterEmail("gfdgdfgdfgd","Nguyen hoang nam",testDTO).render();
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
    //
    public void createRegisterTemplate(String file) throws IOException,DocumentException{
        UserDTO us = new UserDTO();
        String body = new CreateRegister(us.createDefaultUserDTO(),us.defaultListUser()).render();
        System.out.println(body);
        //
        /*PrintWriter writer1 = new PrintWriter(DEST_HTML, "UTF-8");
        writer1.println(body);
        writer1.close();*/

        // step 1
        Document document = new Document();
        // step 2
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(file));
        writer.setInitialLeading(12);
        // step 3
        document.open();
        // step 4
        InputStream is = new ByteArrayInputStream(body.getBytes(StandardCharsets.UTF_8));
        // step 5

        XMLWorkerHelper.getInstance().parseXHtml(writer, document,
                is, Charset.forName("UTF-8"));
        document.close();
        System.out.println("done create PDF3");
    }
    /*
    if you want to use boder of div, change div -> table
     */
    public void createChangeProfileTemplate(String file) throws IOException,DocumentException{
        UserDTO us = new UserDTO();
        String body = new CreateUpdateUserInfo(us.createDefaultUserDTO()).render();
        System.out.println(body);
        //
        PrintWriter writer1 = new PrintWriter(DEST_HTML, "UTF-8");
        writer1.println(body);
        writer1.close();

        // step 1
        Document document = new Document();
        // step 2
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(file));
        writer.setInitialLeading(12);
        // step 3
        document.open();
        // step 4
        InputStream is = new ByteArrayInputStream(body.getBytes(StandardCharsets.UTF_8));
        // step 5

        XMLWorkerHelper.getInstance().parseXHtml(writer, document,
                is, Charset.forName("UTF-8"));
        document.close();
        System.out.println("done create createChangeProfileTemplate");
    }
    //
    public void createDepositTemplate(String file) throws IOException,DocumentException{
        UserDTO us = new UserDTO();
        String body = new CreateDeposit(us.createDefaultUserDTO(),us.createDefaultUserDTO()).render();
        System.out.println(body);
        //
        /*PrintWriter writer1 = new PrintWriter(DEST_HTML, "UTF-8");
        writer1.println(body);
        writer1.close();*/

        // step 1
        Document document = new Document();
        // step 2
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(file));
        writer.setInitialLeading(12);
        // step 3
        document.open();
        // step 4
        InputStream is = new ByteArrayInputStream(body.getBytes(StandardCharsets.UTF_8));
        // step 5

        XMLWorkerHelper.getInstance().parseXHtml(writer, document,
                is, Charset.forName("UTF-8"));
        document.close();
        System.out.println("done create createChangeProfileTemplate");
    }
    //
    public void createWithdrawForm(String file) throws IOException,DocumentException{
        UserDTO us = new UserDTO();
        String body = new CreateWithdrawForm(us.createDefaultUserDTO()).render();
        System.out.println(body);
        //
        /*PrintWriter writer1 = new PrintWriter(DEST_HTML, "UTF-8");
        writer1.println(body);
        writer1.close();*/

        // step 1
        Document document = new Document();
        // step 2
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(file));
        writer.setInitialLeading(12);
        // step 3
        document.open();
        // step 4
        InputStream is = new ByteArrayInputStream(body.getBytes(StandardCharsets.UTF_8));
        // step 5

        XMLWorkerHelper.getInstance().parseXHtml(writer, document,
                is, Charset.forName("UTF-8"));
        document.close();
        System.out.println("done create createChangeProfileTemplate");
    }
    //
    public void createdetailReport(String file) throws IOException,DocumentException{
        UserDTO us = new UserDTO();
        MoneyBag mnb = new MoneyBag();
        mnb.createDefaultListMoney();
        mnb.getTotalMoneyOfBag();
        String body = new CreateDetailsReport(us.createDefaultUserDTO(),mnb.createDefaultListMoney()).render();
        System.out.println(body);
        //
        /*PrintWriter writer1 = new PrintWriter(DEST_HTML, "UTF-8");
        writer1.println(body);
        writer1.close();*/

        // step 1
        Document document = new Document();
        // step 2
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(file));
        writer.setInitialLeading(12);
        // step 3
        document.open();
        // step 4
        InputStream is = new ByteArrayInputStream(body.getBytes(StandardCharsets.UTF_8));
        // step 5

        XMLWorkerHelper.getInstance().parseXHtml(writer, document,
                is, Charset.forName("UTF-8"));
        document.close();
        System.out.println("done create createChangeProfileTemplate");
    }
}
