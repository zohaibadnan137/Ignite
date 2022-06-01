package runtimeterror.businesslogic;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class QueryList {
    private final ArrayList<Query> queries;

    public QueryList() {
        queries = new ArrayList<>();
    }

    public void addQuery(int customer_id, String query_content) throws FileNotFoundException {
        queries.add(new Query(customer_id, query_content));
    }

    public ArrayList<Query> getQueries() {
        return queries;
    }
}
