# onionoo

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>me.learmonth.iain</groupId>
    <artifactId>onionoo</artifactId>
    <version>4.2.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "me.learmonth.iain:onionoo:4.2.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/onionoo-4.2.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import me.learmonth.iain.onionoo.*;
import me.learmonth.iain.onionoo.auth.*;
import me.learmonth.iain.onionoo.*;
import me.learmonth.iain.onionoo.DocumentsApi;

import java.io.File;
import java.util.*;

public class DocumentsApiExample {

    public static void main(String[] args) {
        
        DocumentsApi apiInstance = new DocumentsApi();
        String type = "type_example"; // String | Return only relay (parameter value relay) or only bridge documents (parameter value bridge). Parameter values are case-insensitive.
        String running = "running_example"; // String | Return only running (parameter value true) or only non-running relays and/or bridges (parameter value false). Parameter values are case-insensitive.
        String search = "search_example"; // String | Return only (1) relays with the parameter value matching (part of a) nickname, (possibly $-prefixed) beginning of a hex-encoded fingerprint, any 4 hex character block of a space-separated fingerprint, beginning of a base64-encoded fingerprint without trailing equal signs, or beginning of an IP address (possibly enclosed in square brackets in case of IPv6), (2) bridges with (part of a) nickname or (possibly $-prefixed) beginning of a hashed hex-encoded fingerprint, and (3) relays and/or bridges matching a given qualified search term. Searches by relay IP address include all known addresses used for onion routing and for exiting to the Internet. Searches for beginnings of IP addresses are performed on textual representations of canonical IP address forms, so that searches using CIDR notation or non-canonical forms will return empty results. Searches are case-insensitive, except for base64-encoded fingerprints. If multiple search terms are given, separated by spaces, the intersection of all relays and bridges matching all search terms will be returned. Complete hex-encoded fingerprints should always be hashed using SHA-1, regardless of searching for a relay or a bridge, in order to not accidentally leak non-hashed bridge fingerprints in the URL. Qualified search terms have the form \"key:value\" (without double quotes) with \"key\" being one of the parameters listed here except for \"search\", \"fingerprint\", \"order\", \"limit\", \"offset\", and \"fields\", and \"value\" being the string that will internally be passed to that parameter. If a qualified search term for a given \"key\" is specified more than once, only the first \"value\" is considered.
        String lookup = "lookup_example"; // String | Return only the relay with the parameter value matching the fingerprint or the bridge with the parameter value matching the hashed fingerprint. Fingerprints should always be hashed using SHA-1, regardless of looking up a relay or a bridge, in order to not accidentally leak non-hashed bridge fingerprints in the URL. Lookups only work for full fingerprints or hashed fingerprints consisting of 40 hex characters. Lookups are case-insensitive.
        String fingerprint = "fingerprint_example"; // String | Return only the relay with the parameter value matching the fingerprint or the bridge with the parameter value matching the hashed fingerprint. Fingerprints must consist of 40 hex characters, case does not matter. This parameter is quite similar to the lookup parameter with two exceptions: (1) the provided relay fingerprint or hashed bridge fingerprint must not be hashed (again) using SHA-1; (2) the response will contain any matching relay or bridge regardless of whether they have been running in the past week.
        String country = "country_example"; // String | Return only relays which are located in the given country as identified by a two-letter country code. Filtering by country code is case-insensitive.
        String as = "as_example"; // String | Return only relays which are located in the given autonomous system (AS) as identified by the AS number (with or without preceding \"AS\" part). Filtering by AS number is case-insensitive.
        String flag = "flag_example"; // String | Return only relays which have the given relay flag assigned by the directory authorities. Note that if the flag parameter is specified more than once, only the first parameter value will be considered. Filtering by flag is case-insensitive.
        BigDecimal firstSeenDays = new BigDecimal(); // BigDecimal | Return only relays or bridges which have first been seen during the given range of days ago. A parameter value \"x-y\" with x <= y returns relays or bridges that have first been seen at least x and at most y days ago. Accepted short forms are \"x\", \"x-\", and \"-y\" which are interpreted as \"x-x\", \"x-infinity\", and \"0-y\".
        BigDecimal lastSeenDays = new BigDecimal(); // BigDecimal | Return only relays or bridges which have last been seen during the given range of days ago. A parameter value \"x-y\" with x <= y returns relays or bridges that have last been seen at least x and at most y days ago. Accepted short forms are \"x\", \"x-\", and \"-y\" which are interpreted as \"x-x\", \"x-infinity\", and \"0-y\". Note that relays and bridges that haven't been running in the past week are not included in results, so that setting x to 8 or higher will lead to an empty result set.
        String contact = "contact_example"; // String | Return only relays with the parameter value matching (part of) the contact line. If the parameter value contains spaces, only relays are returned which contain all space-separated parts in their contact line. Only printable ASCII characters are permitted in the parameter value, some of which need to be percent-encoded (# as %23, % as %25, & as %26, + as %2B, and / as %2F). Comparisons are case-insensitive.
        String family = "family_example"; // String | Return only the relay whose fingerprint matches the parameter value and all relays that this relay has listed in its family by fingerprint and that in turn have listed this relay in their family by fingerprint. If relays have listed other relays in their family by nickname, those family relationships will not be considered, regardless of whether they have the Named flag or not. The provided relay fingerprint must consist of 40 hex characters where case does not matter, and it must not be hashed using SHA-1. Bridges are not contained in the result, regardless of whether they define a family.
        String version = "version_example"; // String | Return only the relay whose fingerprint matches the parameter value and all relays that this relay has listed in its family by fingerprint and that in turn have listed this relay in their family by fingerprint. If relays have listed other relays in their family by nickname, those family relationships will not be considered, regardless of whether they have the Named flag or not. The provided relay fingerprint must consist of 40 hex characters where case does not matter, and it must not be hashed using SHA-1. Bridges are not contained in the result, regardless of whether they define a family.
        try {
            SummaryDocument result = apiInstance.getSummary(type, running, search, lookup, fingerprint, country, as, flag, firstSeenDays, lastSeenDays, contact, family, version);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentsApi#getSummary");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://onionoo.torproject.org*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DocumentsApi* | [**getSummary**](docs/DocumentsApi.md#getSummary) | **GET** /summary | Fetch a summary document


## Documentation for Models

 - [BridgeSummaryObject](docs/BridgeSummaryObject.md)
 - [RelaySummaryObject](docs/RelaySummaryObject.md)
 - [SummaryDocument](docs/SummaryDocument.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



