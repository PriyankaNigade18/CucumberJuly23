Feature: Test amazon application

  Background: 
    Given Open Amazon application

  @BestSeller
  Scenario: Test title of BestSellers page
    When User click on best sellers link
    And user captured the actual title of Best sellers
    Then Title should be match with best sellers page title

  @TodaysDeal
  Scenario: Test title of Todays Deal page
    When User click on Todays deal link
    And user captured the actual title of Todays deal page
    Then Title should be match with Todays deal page title

  @Mobile
  Scenario: Test title of Mobile
    When User click on Mobile link
    And user captured the actual title of Mobile
    Then Title should be match with Mobile page title

  @GiftIdeas
  Scenario: Test title of Gift ideas
    When User click on Gift ideas link
    And user captured the actual title of Gifr ideas
    Then Title should be match with Gift ideas page title
