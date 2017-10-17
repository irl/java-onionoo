/*
 * Onionoo
 * Onionoo
 *
 * OpenAPI spec version: 4.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package me.learmonth.iain.onionoo;

import me.learmonth.iain.onionoo.ApiException;
import java.math.BigDecimal;
import me.learmonth.iain.onionoo.SummaryDocument;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DocumentsApi
 */
@Ignore
public class DocumentsApiTest {

    private final DocumentsApi api = new DocumentsApi();

    
    /**
     * Fetch a summary document
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSummaryTest() throws ApiException {
        String type = null;
        String running = null;
        String search = null;
        String lookup = null;
        String fingerprint = null;
        String country = null;
        String as = null;
        String flag = null;
        BigDecimal firstSeenDays = null;
        BigDecimal lastSeenDays = null;
        String contact = null;
        String family = null;
        String version = null;
        SummaryDocument response = api.getSummary(type, running, search, lookup, fingerprint, country, as, flag, firstSeenDays, lastSeenDays, contact, family, version);

        // TODO: test validations
    }
    
}