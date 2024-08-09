package org.agoncal.fascicle.quarkus.load;

// tag::adocSnippet[]
public class BookStoreLoad {

  public static void main(String[] args) {
    Thread bookScenario = new Thread(new ScenarioBook());
    bookScenario.start();
    Thread numberScenario = new Thread(new ScenarioNumber());
    numberScenario.start();
  }
}

/*
curl -H "Accept:application/json" http://localhost:8081/metrics/application
{
}
"NumberResource.countGenerateBookNumber": 23,
"NumberResource.timeGenerateBookNumber": {
"p99": 2.552359,
"min": 2.351004,
"max": 4.142853,
"mean": 2.4475338218611054,
"p50": 2.459645,
"p999": 2.552359,
"stddev": 0.059644582615724376,
"p95": 2.552359,
"p98": 2.552359,
"p75": 2.475044,
"fiveMinRate": 0.0427305308960399,
"fifteenMinRate": 0.018611613176138856,
"meanRate": 0.005087646702440494,
"count": 23,
"oneMinRate": 0.1733913276585504
}
 */


// end::adocSnippet[]
