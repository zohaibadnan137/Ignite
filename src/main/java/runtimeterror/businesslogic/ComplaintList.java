package runtimeterror.businesslogic;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ComplaintList {
    private final ArrayList<Complaint> complaints;

    ComplaintList() {
        complaints = new ArrayList<>();
    }

    public void addComplaint(int customer_id, String complaint_content) throws FileNotFoundException {
        complaints.add(new Complaint(customer_id, complaint_content));
    }

    public ArrayList<Complaint> getComplaints() {
        return complaints;
    }
}
