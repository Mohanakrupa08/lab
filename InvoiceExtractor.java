import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InvoiceExtractor {
    public static void main(String[] args) {
        String input = "date :12/09/2025\n"
                     + "no:INB-782536\n"
                     + "ITEMS:2\n"
                     + "Amount=500\n"
                     + "msg:Sucessfully completed";

        String regexInvoice = "no:([A-Z]{3}-\\d{6})";
        String regexAmount = "Amount=(\\d+)";

        Matcher m1 = Pattern.compile(regexInvoice).matcher(input);
        String invoiceNo = "";
        if (m1.find()) {
            invoiceNo = m1.group(1);
        }

        Matcher m2 = Pattern.compile(regexAmount).matcher(input);
        String amount= "";
        if (m2.find()) {
            amount = m2.group(1);
        }

        System.out.println("Invoice no: " + invoiceNo);
        System.out.println("Total amount: " + amount);
    }
}