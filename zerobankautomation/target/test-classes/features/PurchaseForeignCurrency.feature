Feature: Purchase Foreign Currency
  Background: login
    Given the user is logged in
@wip
  Scenario: Available currencies
    Given the user accesses the Purchase foreign currency cash tab
    Then following currencies should be available
      |Australia (dollar)      |
      |Canada (dollar)         |
      |Switzerland (franc)     |
      |China (yuan)            |
      |Denmark (krone)         |
      |Eurozone (euro)         |
      |Great Britain (pound)   |
      |Japan (yen)             |
      |Mexico (peso)           |
      |Norway (krone)          |
      |New Zealand (dollar)    |
      |Singapore (dollar)      |

