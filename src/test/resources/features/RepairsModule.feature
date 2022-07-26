Feature: Work on Repair Order
 USER STORY
  As the FinWorks Repair application allows you to manage a complete after-sales process, but also to simply repair products you have manufactured, if they present a defect. Once in the application:
  1- User should be able to access the existing Repair Orders.
  2- User should be able to create a new Repair Order, when a customer sends a product for repair. User fills in the Repair Order with all the information s/he may need such as the product, the customer, if it has to be invoiced after or before the repair, the parts needed, etc.

  Acceptance Criteria:
  1- User first lands on Repairs Orders page

 Background: user is on the login page
  Given  user is on the login page
 @smoke @wip
 Scenario Outline: AC1 - User first lands on the Repairs Order page.

  When user enters username "<userName>"
  And user enters password "<password>"
  And user clicks the login button
  And user should see the dashboard
  Then user clicks the Repair Module



  Examples: valid credentials
   | userType               | userName                   | password         |
   | Sales manager          | salesmanager15@info.com    | salesmanager     |
   | Point of Sales Manager | posmanager10@info.com      | posmanager       |
   | Inventory Manager      | imm10@info.com             | inventorymanager |
   | Expenses Manager       | expensesmanager10@info.com | expensesmanager  |
   | Manufacturing User     | Manufacturing User         | manufuser        |

 @wip
  Scenario: AC2: User can access the existing Repair Orders

   When user is on the Repair Orders Page
   And user clicks on a repair reference
   Then the repair order reference oppens
