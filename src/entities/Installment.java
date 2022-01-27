package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Installment {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

    private Date dueDate;
    private Double amount;

    public Installment(Date dueDate, Double amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }

    public static SimpleDateFormat getSdf() {
        return sdf;
    }

    public static void setSdf(SimpleDateFormat sdf) {
        Installment.sdf = sdf;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return sdf.format(dueDate) + " - " + String.format("%.2f", amount);
    }

}
