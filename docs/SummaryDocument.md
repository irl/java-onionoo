
# SummaryDocument

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version** | **String** | Onionoo protocol version string. | 
**nextMajorVersionScheduled** | **String** | UTC date (YYYY-MM-DD) when the next major protocol version is scheduled to be deployed. Omitted if no major protocol changes are planned. |  [optional]
**buildRevision** | **String** | Git revision of the Onionoo instance&#39;s software used to write this response, which will be omitted if unknown. |  [optional]
**relaysPublished** | **String** | UTC timestamp (YYYY-MM-DD hh:mm:ss) when the last known relay network status consensus started being valid. Indicates how recent the relay objects in this document are. | 
**relaysSkipped** | [**BigDecimal**](BigDecimal.md) | Number of skipped relays as requested by a positive \&quot;offset\&quot; parameter value. Omitted if zero. |  [optional]
**relaysTruncated** | [**BigDecimal**](BigDecimal.md) | Number of truncated relays as requested by a positive \&quot;limit\&quot; parameter value. Omitted if zero. |  [optional]
**relays** | [**List&lt;RelaySummaryObject&gt;**](RelaySummaryObject.md) |  | 
**bridgesPublished** | **String** | UTC timestamp (YYYY-MM-DD hh:mm:ss) when the last known bridge network status consensus started being valid. Indicates how recent the relay objects in this document are. | 
**bridgesSkipped** | [**BigDecimal**](BigDecimal.md) | Number of skipped bridges as requested by a positive \&quot;offset\&quot; parameter value. Omitted if zero. |  [optional]
**bridgesTruncated** | [**BigDecimal**](BigDecimal.md) | Number of truncated bridges as requested by a positive \&quot;limit\&quot; parameter value. Omitted if zero. |  [optional]
**bridges** | [**List&lt;BridgeSummaryObject&gt;**](BridgeSummaryObject.md) |  | 



