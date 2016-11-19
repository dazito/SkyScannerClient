# SkyScannerClient
A Java client for the [SkyScanner](https://www.skyscanner.com) REST API

Current roadmap:

1. Support for the [Flights Live Pricing API](https://support.business.skyscanner.net/hc/en-us/articles/211308489-Flights-Live-Pricing)

2. Support for the [Hotels Price List and Hotels Details service](https://support.business.skyscanner.net/hc/en-us/articles/212098705-Hotels-Price-List-and-Hotels-Details-service)

3. Support for the [Car Hire Live Pricing](https://support.business.skyscanner.net/hc/en-us/articles/211488489-Car-Hire-Live-Pricing)

Dependencies:
- Gson
- Retrofit 2

Simple example:

```
// Create the session object with the request data
SessionRequest sessionRequest = SessionRequest.SessionRequestBuilder.aSessionRequest()
        .withAdults(1)
        .withDestinationPlace("MAD")
        .withInboundDate("2016-12-20")
        .withLocale("pt-PT")
        .withLocationSchema(LocationSchema.iata)
        .withOriginPlace("OPO")
        .withOutboundDate("2016-12-15")
        .withCurrency("EUR")
        .withCountry("PT")
        .build();

// Create session
Response session = client.createSession(sessionRequest);

// Get the polling session URL from the response headers
String pollSessionUrl = session.headers().get("location");

// Get the polling session id from the pollSessionUrl

// Start polling
Response<PollingResponse> response = client.pollSession(sessionId);
```

This is a work in progress.

Pull requests are welcome.
